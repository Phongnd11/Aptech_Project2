package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import common.DatabaseConnect;
import entity.Assignment;
import entity.AssignmentUser;
import entity.Position;
import modal.ResultsMessage;

public class DaoAssignment {
	ResultsMessage rsmess = new ResultsMessage();
	List<Assignment> list = new ArrayList<Assignment>();
	List<AssignmentUser> list1 = new ArrayList<AssignmentUser>();
	
	public Assignment getfromId(String id) {
		Assignment ass = new Assignment();
		String sql = "SELECT * FROM Assignment WHERE id ='"+ id + "'";
		try (
				Connection con = DatabaseConnect.getConnection();
				var stmt = con.createStatement();
				var resultSet = stmt.executeQuery(sql);
				)
		{
			ass.setId(resultSet.getInt("id"));
			ass.setProject_id(resultSet.getString("project_id"));
			ass.setEmployee_id(resultSet.getNString("employee_id"));
			ass.setDatejoin(resultSet.getTimestamp("datejoin"));
			ass.setStatus(resultSet.getBoolean("status"));
			ass.setDone(resultSet.getBoolean("done"));
		} catch (Exception e) {
			rsmess = new ResultsMessage(-1,e.getMessage());
		}
		return ass;
	}
	
	public List<Assignment> getAll(boolean getall){
		try (
				Connection con = DatabaseConnect.getConnection();
				CallableStatement cs = con.prepareCall("{call sproc_get_assignment(?)}")
				)
		{
			cs.setBoolean(1, getall);
			cs.executeQuery();
			ResultSet resultSet = cs.getResultSet();
			while(resultSet.next()) {
				list.add(new Assignment(
						resultSet.getInt("id"), resultSet.getNString("project_id"), resultSet.getString("employee_id"), resultSet.getTimestamp("datejoin"), resultSet.getBoolean("status"), resultSet.getBoolean("done")
				));
			}
		} catch (Exception e) {
			rsmess = new ResultsMessage(-1,e.getMessage());
		}
		return list;
	}
	
	public List<AssignmentUser> getAssignmentUser(String id){
		
		try (
				Connection con = DatabaseConnect.getConnection();
				CallableStatement cs = con.prepareCall("{call sproc_get_assignment_user(?)}")
				)
		{
			cs.setString(1, id);
			cs.executeQuery();
			ResultSet rs = cs.getResultSet();
			while(rs.next()) {
				list1.add(new AssignmentUser(
						rs.getInt("id"), rs.getNString("name_project"),  rs.getTimestamp("datejoin"), rs.getInt("done"), rs.getBoolean("status")
				));
			}
		} catch (Exception e) {
			rsmess = new ResultsMessage(-1,e.getMessage());
		}
		return list1;
	}
	
	public ResultsMessage insert(Assignment obj) {
		try (
				Connection con = DatabaseConnect.getConnection();
				CallableStatement cs = con.prepareCall("{call sproc_assignment_insert(?,?,?,?,?)}")
			)
		{
			cs.setString(1, obj.getProject_id());
			cs.setString(2, obj.getEmployee_id());
			cs.setTimestamp(3, obj.getDatejoin());
			cs.setBoolean(4, obj.getStatus());
			cs.setBoolean(5, obj.getDone());
			
			rsmess = new ResultsMessage(cs.executeUpdate(),"Success!");
		} catch (Exception e) {
			rsmess = new ResultsMessage(-1,e.getMessage());
		}
		return rsmess;
	}
	
	public ResultsMessage update(Assignment obj) {
		try (
				Connection con = DatabaseConnect.getConnection();
				CallableStatement cs = con.prepareCall("{call sproc_assignment_update(?,?,?,?,?,?)}")
			)
		{
			cs.setInt(1, obj.getId());
			cs.setString(2, obj.getProject_id());
			cs.setString(3, obj.getEmployee_id());
			cs.setTimestamp(4, obj.getDatejoin());
			cs.setBoolean(5, obj.getStatus());
			cs.setBoolean(6, obj.getDone());
			
			rsmess = new ResultsMessage(cs.executeUpdate(),"Success!");
		} catch (Exception e) {
			rsmess = new ResultsMessage(-1,e.getMessage());
		}
		return rsmess;
	}

	public ResultsMessage delete(int id) {
		try (
				Connection con = DatabaseConnect.getConnection();
				CallableStatement cs = con.prepareCall("{call sproc_assignment_detele(?,?)}")
			)
		{
			cs.setInt(1, id);
			cs.registerOutParameter(2, Types.BIT); 
			cs.executeUpdate();
			
			
			if(cs.getBoolean(2)) {
				rsmess.setNum(1);
				rsmess.setMessage("Deleted!");
			}	
			else {
				rsmess.setNum(2);
				rsmess.setMessage("Set status is false!");
			}
            
		} catch (Exception e) {
			rsmess.setNum(-1);
			rsmess.setMessage(e.getMessage());
		}
		return rsmess;
	}
	
}

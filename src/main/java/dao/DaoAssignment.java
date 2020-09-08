package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DatabaseConnect;
import entity.Assignment;
import entity.Position;
import modal.ResultsMessage;

public class DaoAssignment {
	ResultsMessage rsmess = new ResultsMessage();
	List<Assignment> list = new ArrayList<Assignment>();
	
	public Assignment getfromId(String id) {
		Assignment ass = new Assignment();
		String sql = "SELECT * FROM Position WHERE id ='"+ id + "'";
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
				CallableStatement cs = con.prepareCall("{call sproc_assignment_detele(?)}")
			)
		{
			cs.setInt(1, id);
			
			rsmess = new ResultsMessage(cs.executeUpdate(),"Success!");
		} catch (Exception e) {
			rsmess = new ResultsMessage(-1,e.getMessage());
		}
		return rsmess;
	}
	
}

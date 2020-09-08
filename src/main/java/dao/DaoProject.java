package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import common.DatabaseConnect;
import entity.GetProject;
import entity.Position;
import entity.Project;
import modal.ResultsMessage;

public class DaoProject {
	ResultsMessage rsmess = new ResultsMessage();
	List<GetProject> list = new ArrayList<GetProject>();
	
	public GetProject getGetProject(String id, boolean getall){
		GetProject getPro = new GetProject();
		try (
				Connection con = DatabaseConnect.getConnection();
				CallableStatement cs = con.prepareCall("{call sproc_get_project1(?,?)}")
			)
		{
			cs.setString(1, id);
			cs.setBoolean(2, getall);
			cs.executeQuery();
			ResultSet rs = cs.getResultSet();
			rs.next();
			
			getPro.setId(rs.getString("id"));
			getPro.setName(rs.getString("name"));
			getPro.setDate(rs.getDate("datenew") == null ? null : rs.getDate("datenew").toLocalDate());
			getPro.setDescription(rs.getString("description"));
			getPro.setStatus(rs.getBoolean("status"));
			getPro.setType_name(rs.getString("type_name"));
			getPro.setDepartment_name(rs.getString("department_name"));
			getPro.setBranch_name(rs.getString("branch_name"));
			
		} catch (Exception e) {
			e.getMessage();
			JOptionPane.showMessageDialog(null, "Fail: "  +e.toString(),"Error",JOptionPane.ERROR_MESSAGE);
		}
	
		return getPro;
	}
	
	public List<GetProject> getAllProject(String id, boolean getall){
		try (
				Connection con = DatabaseConnect.getConnection();
				CallableStatement cs = con.prepareCall("{call sproc_get_project1(?,?)}")
			)
		{
			cs.setString(1, id);
			cs.setBoolean(2, getall);
			cs.executeQuery();
			ResultSet rs = cs.getResultSet();
			while(rs.next()) {
				list.add(new GetProject(rs.getString("id"), rs.getString("name"),  rs.getDate("datenew") == null ? null : rs.getDate("datenew").toLocalDate(), rs.getString("description"), rs.getBoolean("status"), 
						rs.getString("type_name"), rs.getString("department_name"), rs.getString("branch_name")));
				
			}
		} catch (Exception e) {
			e.getMessage();
			JOptionPane.showMessageDialog(null, "Fail: "  +e.toString(),"Error",JOptionPane.ERROR_MESSAGE);
		}
	
		return list;
	}
	
	public List<GetProject> getAllProject(String id, String name, String project_type_id, LocalDate newdate1, LocalDate newdate2, String department_id, String branch_id,  boolean getall){
		try (
				Connection con = DatabaseConnect.getConnection();
				CallableStatement cs = con.prepareCall("{call sproc_get_project(?,?,?,?,?,?,?,?)}")
			)
		{
			Date date1 = java.sql.Date.valueOf(newdate1);
			Date date2 = java.sql.Date.valueOf(newdate2);
			
			cs.setString(1, id);
			cs.setNString(2, name);
			cs.setString(3, project_type_id);
			cs.setDate(4, (java.sql.Date) date1);
			cs.setDate(5, (java.sql.Date) date2);
			cs.setNString(6, department_id);
			cs.setNString(7, branch_id);
			cs.setBoolean(8, getall);
			cs.executeQuery();
			ResultSet rs = cs.getResultSet();
			while(rs.next()) {
				list.add(new GetProject(rs.getNString("id"), rs.getNString("name"), rs.getDate("datenew") == null ? null : rs.getDate("datenew").toLocalDate(), rs.getString("description"), rs.getBoolean("status"), 
						rs.getString("type_name"), rs.getString("department_name"), rs.getString("branch_name")));
				
			}
		} catch (Exception e) {
			e.getMessage();
			JOptionPane.showMessageDialog(null, "Fail: "  +e.toString(),"Error",JOptionPane.ERROR_MESSAGE);
		}
		return list;
	}
	
	public Project getFromID(String id){
		Project project = new Project();
		String sql = "SELECT * FROM project WHERE id ='"+ id + "'";
		try (
				Connection con = DatabaseConnect.getConnection();
				var stmt = con.createStatement();
				var resultSet = stmt.executeQuery(sql);
				)
		{
			while(resultSet.next()) {
				project.setId(resultSet.getString("id"));
				project.setName(resultSet.getString("name"));
				project.setDepartment_id(resultSet.getString("department_id"));
				project.setDescription(resultSet.getString("description"));
				project.setPart(resultSet.getInt("part"));
				project.setProject_type_id(resultSet.getString("project_type_id"));
				project.setDatenew(resultSet.getDate("datenew") == null ? null : resultSet.getDate("datenew").toLocalDate());
				project.setStatus(resultSet.getBoolean("status"));
			}
			
		} catch (Exception e) {
			rsmess = new ResultsMessage(-1,e.getMessage());
		}
		return project;
	}
	
	public ResultsMessage insert(Project obj) {
		try (
				Connection con = DatabaseConnect.getConnection();
				CallableStatement cs = con.prepareCall("{call sproc_project_insert(?,?,?,?,?,?,?,?)}")
			)
		{
			Date date = java.sql.Date.valueOf(obj.getDatenew());
			
			cs.setString(1, obj.getId());
			cs.setString(2, obj.getName());
			cs.setString(3, obj.getDepartment_id());
			cs.setString(4, obj.getDescription());
			cs.setInt(5, obj.getPart());
			cs.setString(6, obj.getProject_type_id());
			cs.setDate(7, (java.sql.Date) date);
			
			cs.setBoolean(8, obj.isStatus());
			rsmess = new ResultsMessage(cs.executeUpdate(),"Success!");
		} catch (Exception e) {
			rsmess = new ResultsMessage(-1,e.getMessage());
		}
		return rsmess;
	}
	
	public ResultsMessage update(Project obj) {
		try (
				Connection con = DatabaseConnect.getConnection();
				CallableStatement cs = con.prepareCall("{call sproc_project_update(?,?,?,?,?,?,?,?)}")
			)
		{
			
			Date date = java.sql.Date.valueOf(obj.getDatenew());
			
			cs.setString(1, obj.getId());
			cs.setString(2, obj.getName());
			cs.setString(3, obj.getDepartment_id());
			cs.setString(4, obj.getDescription());
			cs.setInt(5, obj.getPart());
			cs.setString(6, obj.getProject_type_id());
			cs.setDate(7, (java.sql.Date) date);
			cs.setBoolean(8, obj.isStatus());
			rsmess = new ResultsMessage(cs.executeUpdate(),"Success!");
		} catch (Exception e) {
			rsmess = new ResultsMessage(-1,e.getMessage());
		}
		return rsmess;
	}
	
	public ResultsMessage delete(String id) {
		try (
				Connection con = DatabaseConnect.getConnection();
				CallableStatement cs = con.prepareCall("{call sproc_project_delete(?)}")
			)
		{
			cs.setString(1, id);
			rsmess = new ResultsMessage(cs.executeUpdate(),"Success!");
		} catch (Exception e) {
			rsmess = new ResultsMessage(-1,e.getMessage());
		}
		return rsmess;
	}
}

package dao;

import java.sql.CallableStatement;
import java.sql.Connection;

import common.DatabaseConnect;
import entity.Employee;
import modal.ResultsMessage;

public class DaoEmployee {
	ResultsMessage rsmess = new ResultsMessage();
	
	public ResultsMessage insert(Employee obj) {
		try (
				Connection con = DatabaseConnect.getConnection();
				CallableStatement cs = con.prepareCall("{call sproc_employee_insert(?,?,?,?,?,?)}")
			)
		{
			cs.setString(1, obj.getId());
			cs.setString(2, obj.getPassword());
			cs.setString(3, obj.getName());
			cs.setString(4, obj.getDepartment_id());
			cs.setString(5, obj.getPosition_id());
			cs.setBoolean(6, obj.isStatus());
			rsmess = new ResultsMessage(cs.executeUpdate(),"Success!");
		} catch (Exception e) {
			rsmess = new ResultsMessage(-1,e.getMessage());
		}
		return rsmess;
	}
	
	public ResultsMessage update(Employee obj) {
		try (
				Connection con = DatabaseConnect.getConnection();
				CallableStatement cs = con.prepareCall("{call sproc_employee_update(?,?,?,?,?,?)}")
			)
		{
			cs.setString(1, obj.getId());
			cs.setString(2, obj.getPassword());
			cs.setString(3, obj.getName());
			cs.setString(4, obj.getDepartment_id());
			cs.setString(5, obj.getPosition_id());
			cs.setBoolean(6, obj.isStatus());
			rsmess = new ResultsMessage(cs.executeUpdate(),"Success!");
		} catch (Exception e) {
			rsmess = new ResultsMessage(-1,e.getMessage());
		}
		return rsmess;
	}
	
	public ResultsMessage delete(String id) {
		try (
				Connection con = DatabaseConnect.getConnection();
				CallableStatement cs = con.prepareCall("{call sproc_employee_delete(?)}")
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

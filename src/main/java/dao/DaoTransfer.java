package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import common.DatabaseConnect;
import entity.GetProject;
import entity.Project;
import entity.Transfer;
import entity.TransferView;
import modal.EmployeeView;
import modal.ResultsMessage;

public class DaoTransfer {
	ResultsMessage rsmess = new ResultsMessage();
	List<Transfer> list = new ArrayList<Transfer>();
	List<TransferView> listView = new ArrayList<TransferView>();
	
	public List<Transfer> getTransfer(String id){
//		try (
//				Connection con = DatabaseConnect.getConnection();
//				CallableStatement cs = con.prepareCall("{call sproc_get_transfer(?)}")
//			)
//		{
//			cs.setString(1, id);
//			cs.executeQuery();
//			ResultSet rs = cs.getResultSet();
//			while(rs.next()) {
//				list.add(new Transfer(rs.getString("id"), "", "", rs.getNString("old_project"),rs.getNString("new_project"), rs.getNString("reason"),
//						rs.getBoolean("censorship"), rs.getBoolean("admin_watch"), rs.getBoolean("status")
//						));
//				
//			}
//		} catch (Exception e) {
//			e.getMessage();
//			JOptionPane.showMessageDialog(null, "Fail: "  +e.toString(),"Error",JOptionPane.ERROR_MESSAGE);
//		}
	
		return list;
	}
	
	public List<Transfer> getTransferAdmin(String branch, int status){
//		try (
//				Connection con = DatabaseConnect.getConnection();
//				CallableStatement cs = con.prepareCall("{call sproc_get_transfer_admin(?,?)}")
//			)
//		{
//			cs.setString(1, branch);
//			cs.setInt(2, status);
//			cs.executeQuery();
//			ResultSet rs = cs.getResultSet();
//			while(rs.next()) {
//				list.add(new Transfer(rs.getString("id"), rs.getString("id_user"), rs.getNString("name_user"), rs.getNString("old_project"),rs.getNString("new_project"), rs.getNString("reason"),
//						rs.getBoolean("censorship"), rs.getBoolean("admin_watch"), rs.getBoolean("status")
//						));
//			}
//		} catch (Exception e) {
//			e.getMessage();
//			JOptionPane.showMessageDialog(null, "Fail: "  +e.toString(),"Error",JOptionPane.ERROR_MESSAGE);
//		}
		return list;
	}
	
	public ResultsMessage insert(String username, String oldProject, String newProject, String reason) {
		try (
				Connection con = DatabaseConnect.getConnection();
				CallableStatement cs = con.prepareCall("{call sproc_transfer_insert(?,?,?,?)}")
			)
		{
			cs.setString(1,	username);
			cs.setString(2, oldProject);
			cs.setString(3, newProject);
			cs.setString(4, reason);
			rsmess = new ResultsMessage(cs.executeUpdate(),"Success!");
		} catch (Exception e) {
			rsmess = new ResultsMessage(-1,e.getMessage());
		}
		return rsmess;
	}

	public List<TransferView> getTranferView(String userLoginId, boolean getAll) {
		try (
				Connection con = DatabaseConnect.getConnection();
				CallableStatement cs = con.prepareCall("{call sproc_get_transferView()}")
			)
		{
//			cs.setString(1, id);
			cs.executeQuery();
			ResultSet rs = cs.getResultSet();
			while(rs.next()) {
				listView.add(
						new TransferView(rs.getString("id"), rs.getString("type"), rs.getString("employee_id"), rs.getString("department_old"), rs.getString("department_new"),
							rs.getString("project_old"), rs.getString("project_new"), rs.getString("description"), rs.getBoolean("check"), rs.getBoolean("status"),
							rs.getString("department_name_old"), rs.getString("department_name_new"),rs.getString("project_name_old"), rs.getString("project_name_new"),
							rs.getString("employee_name"), rs.getString("type_name"), rs.getDate("date") ==null ? null : rs.getDate("date").toLocalDate())
						);
				
			}
		} catch (Exception e) {
			e.getMessage();
			JOptionPane.showMessageDialog(null, "Fail: "  +e.toString(),"Error",JOptionPane.ERROR_MESSAGE);
		}
	
		return listView;
	}
	
	public ResultsMessage insertDepartment(TransferView obj) {
		try (
				Connection con = DatabaseConnect.getConnection();
				CallableStatement cs = con.prepareCall("{call sproc_transfer_department_insert(?,?,?,?)}")
			)
		{
			
			cs.setString(1, obj.getEmployee_id());
			cs.setString(2, obj.getDepartment_name_old());
			cs.setString(3, obj.getDepartment_name_new());
			cs.setString(4, obj.getDescription());
					
					
			rsmess = new ResultsMessage(cs.executeUpdate(),"Success!");
		} catch (Exception e) {
			rsmess = new ResultsMessage(-1,e.getMessage());
		}
		return rsmess;
	}
	
	public ResultsMessage delete(String id) {
		
		try (
				Connection con = DatabaseConnect.getConnection();
				CallableStatement cs = con.prepareCall("{call sproc_transfer_delete(?,?)}")
			)
		{
			cs.setString(1, id);
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

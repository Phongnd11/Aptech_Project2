package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import common.DatabaseConnect;
import entity.GetProject;
import entity.Project;
import entity.Transfer;
import modal.ResultsMessage;

public class DaoTransfer {
	ResultsMessage rsmess = new ResultsMessage();
	List<Transfer> list = new ArrayList<Transfer>();
	
	public List<Transfer> getTransfer(String id){
		try (
				Connection con = DatabaseConnect.getConnection();
				CallableStatement cs = con.prepareCall("{call sproc_get_transfer(?)}")
			)
		{
			cs.setString(1, id);
			cs.executeQuery();
			ResultSet rs = cs.getResultSet();
			while(rs.next()) {
				list.add(new Transfer(rs.getString("id"), "", "", rs.getNString("old_project"),rs.getNString("new_project"), rs.getNString("reason"),
						rs.getBoolean("censorship"), rs.getBoolean("admin_watch"), rs.getBoolean("status")
						));
				
			}
		} catch (Exception e) {
			e.getMessage();
			JOptionPane.showMessageDialog(null, "Fail: "  +e.toString(),"Error",JOptionPane.ERROR_MESSAGE);
		}
	
		return list;
	}
	
	public List<Transfer> getTransferAdmin(String branch, int status){
		try (
				Connection con = DatabaseConnect.getConnection();
				CallableStatement cs = con.prepareCall("{call sproc_get_transfer_admin(?,?)}")
			)
		{
			cs.setString(1, branch);
			cs.setInt(2, status);
			cs.executeQuery();
			ResultSet rs = cs.getResultSet();
			while(rs.next()) {
				list.add(new Transfer(rs.getString("id"), rs.getString("id_user"), rs.getNString("name_user"), rs.getNString("old_project"),rs.getNString("new_project"), rs.getNString("reason"),
						rs.getBoolean("censorship"), rs.getBoolean("admin_watch"), rs.getBoolean("status")
						));
			}
		} catch (Exception e) {
			e.getMessage();
			JOptionPane.showMessageDialog(null, "Fail: "  +e.toString(),"Error",JOptionPane.ERROR_MESSAGE);
		}
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
}

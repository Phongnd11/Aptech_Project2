package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import common.DatabaseConnect;
import entity.SystemInfo;

public class DaoSystemInfo {
	public static int get(String name) {
		int result = 0;
		try (
				Connection con = DatabaseConnect.getConnection();
				CallableStatement cs = con.prepareCall("{call getSystemInfoByName(?)}")
				)
		{
			cs.setString(1, name);
			cs.executeQuery();
			ResultSet rs = cs.getResultSet();
			rs.next();
			result = rs.getInt("value");
		} catch (Exception e) {
			 JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return result;
	}
}

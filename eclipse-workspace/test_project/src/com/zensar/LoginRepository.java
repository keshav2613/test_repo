package com.zensar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.zensar.utility.DBUtil;

public class LoginRepository {
	
public boolean Login(String username, String password) {
		
		boolean result= false;
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "select * from login where user_name=?";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, username);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				
				String passwordFromdb = rs.getString("password");
				if(password.equals(passwordFromdb)) {
					result = true;
					
				}
				
				}
			}
		catch(Exception e) {
			System.out.println("Exception occured:"+e);
			
			
		}
		return result;
		
		
		
		
		
	}
	

}

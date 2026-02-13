package com.shubhampandey.dao;

import java.sql.*;

public class LoginDao {
	
	public boolean checkCredential(String uname, String pass) {
		String url = "jdbc:mysql://localhost:3306/DB_NAME";
		String username = "root";
		String password = "YOUR_PASSWORD";
		
		String query = "Select * from login where uname = ? and password = ?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1,uname);
			st.setString(2,pass);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				return true;
			}
			
			rs.close();
			st.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
}

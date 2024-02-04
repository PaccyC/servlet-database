package com.servlet.register;
import java.sql.*;

public class DbConnection {

	private String dbUrl="jdbc:mysql://localhost:3306/user_db";
	private String dbUsername="root";
	private String dbPassword="";
	private String dbDriver="com.mysql.jdbc.Driver";
	
	
	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con= null;
		try {
			con=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
			
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public String insert(Member member) {
		loadDriver(dbDriver);
		Connection con= getConnection();
		String sql= "insert into user_db.member values(?,?,?,?)";
		String result="Data entered succcessfully";
		
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,member.getName());
			ps.setString(2, member.getMobile());
			ps.setString(3, member.getCity());
			ps.setString(4, member.getDob());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result= "Data not entered";
		}
		
		return result;
		
	}
}

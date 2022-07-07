package com.varxyz.jv300.mod010;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.varxyz.jv300.mod009.User;

public class UserDao {
	private DataSource datasource;
	public UserDao() {
		NamingService ns = NamingService.getInstance();
		datasource = (DataSource)ns.getAttribute("dataSource");
	}
	
	public void plusUser(User user) {
		String sql = "INSERT INTO Player (userId, passwd, userName, ssn, email, addr)"
				 + " VALUES (?, ?, ?, ?, ?, ?)";
		try {		
			Connection con = null;
			PreparedStatement pstmt = null;	
			try {
				con = datasource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, user.getUserId());
				pstmt.setString(2, user.getPasswd());
				pstmt.setString(3, user.getUserName());
				pstmt.setString(4, user.getSsn());
				pstmt.setString(5, user.getEmail());
				pstmt.setString(6, user.getAddr());
				pstmt.executeUpdate();
			} finally {
				datasource.close(pstmt, con);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<User> findUser() {
		String sql = "SELECT * FROM Player";
		List<User> userList = new ArrayList<User>();
		
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = datasource.getConnection();
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					User user = new User();
					user.setUserId(rs.getString("userId"));
					user.setPasswd(rs.getString("passwd"));
					user.setUserName(rs.getString("userName"));
					user.setSsn(rs.getString("ssn"));
					user.setEmail(rs.getString("email"));
					user.setAddr(rs.getString("addr"));
					userList.add(user);
				}
			} finally {
				datasource.close(rs, pstmt, con);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return userList;
	}
	
	public boolean isValidUser(String userId, String passwd) {
		String sql = "SELECT * FROM Player WHERE userId=? AND passwd=?";
		boolean test = true;
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = datasource.getConnection();
				pstmt = con.prepareStatement(sql);			
				pstmt.setString(1, userId);
				pstmt.setString(2, passwd);
				rs = pstmt.executeQuery();
				if(!rs.next()) {
					test = false;
				}
			} finally {
				datasource.close(rs, pstmt, con);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return test;
	}
	
}

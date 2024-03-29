package com.varxyz.jv300.mod009;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	public List<User> findAllUser() {
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
					User c = new User();
					c.setUserId(rs.getString("userId"));
					c.setPasswd(rs.getString("passwd"));
					c.setUserName(rs.getString("userName"));
					c.setSsn(rs.getString("ssn"));
					c.setEmail(rs.getString("email"));
					c.setAddr(rs.getString("addr"));
					userList.add(c);
				}
			}finally {
				datasource.close(rs, pstmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}
	
	public void UserUpdate(String userId, String passwd) {
		String sql = "UPDATE Player SET passwd=? WHERE userId=?";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				con = datasource.getConnection();; 
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, passwd);
				pstmt.setString(2, userId);
				pstmt.executeUpdate();
				
			} finally {
				datasource.close(pstmt, con);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void UserDelete(String userId, String passwd) {
		String sql = "DELETE FROM Player WHERE userId = ? ";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				con = datasource.getConnection();; 
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, userId);
				pstmt.executeUpdate();
				
			} finally {
				datasource.close(pstmt, con);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}

package com.varxyz.jv300.mod010;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.varxyz.jv300.mod009.User;

public class UserService{
	private static UserService service = new UserService();
	public UserDao userDao;
	
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public UserService() {
		
	}
	
	public void addUser(User user) {
		userDao.plusUser(user);
	}
	
	public List<User> findUser() {
		return userDao.findUser();
	}
	
	public static UserService getInstance() {
		return service;
	}

	public boolean isValidUser(String userId, String passwd) {
		return userDao.isValidUser(userId, passwd);
	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}

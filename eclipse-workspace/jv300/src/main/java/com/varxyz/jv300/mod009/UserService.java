package com.varxyz.jv300.mod009;

import java.util.List;

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
		return userDao.findAllUser();
	}

	public static UserService getService() {
		return service;
	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void userUpdate(String userId, String passwd) {
		userDao.UserUpdate(userId, passwd);
	}

	public void userDelete(String userId, String passwd) {
		userDao.UserDelete(userId, passwd);
	}

}

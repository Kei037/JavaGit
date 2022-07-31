package com.varxyz.banking2.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.varxyz.banking2.command.CustomerCommand;
import com.varxyz.banking2.dao.CustomerDao;
import com.varxyz.banking2.domain.Customer;

public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerDao customerDao;
	
	@Override
	public void addCustomer(CustomerCommand customerCommand) {
		customerDao.addCustomer(customerCommand);
	}
	
	public boolean isValidUser(String userId, String passwd) {
		return customerDao.isValidUser(userId, passwd);
	}
	
	public Customer getCustomerByUserId(String userId) {
		return customerDao.getCustomerByUserId(userId);
	}
	
	public Customer getCustomerByAccountNum(String accountNum) {
		return customerDao.getCustomerByAccountNum(accountNum);
	}
}




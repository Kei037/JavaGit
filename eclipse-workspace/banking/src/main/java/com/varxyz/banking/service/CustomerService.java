package com.varxyz.banking.service;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.banking.DataSourceConfig;
import com.varxyz.banking.command.CustomerCommand;
import com.varxyz.banking.dao.CustomerDao;
import com.varxyz.banking.domain.Customer;

public class CustomerService {
	
	private CustomerDao customerDao;
	
	public CustomerService() {
		
	}
	
	public CustomerService(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	public void addCustomer(CustomerCommand customerCommand) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DataSourceConfig.class);
		CustomerDao dao = context.getBean("customerDao", CustomerDao.class);
		dao.addCustomer(customerCommand);
		context.close();
	}
	
	public boolean loginCustomer(String email, String passwd) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DataSourceConfig.class);
		CustomerDao dao = context.getBean("customerDao", CustomerDao.class);
		boolean result = dao.loginCustomer(email, passwd);
		System.out.println("서비스의 log" + result);
		context.close();
		
		return result;
	}
	
	public Customer findCustomerBySsn(String ssn) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DataSourceConfig.class);
		CustomerDao dao = context.getBean("customerDao", CustomerDao.class);
		Customer customer = dao.findCustomerBySsn(ssn);
		return customer;
	}
	
	
	/*
	public Customer getCustomerBySsn(String ssn) {
		return customerDao.findCustomerBySsn(ssn);
	}
	
	public List<Customer> getAllCustomers(){
		return customerDao.findAllCustomers();
	}*/
}

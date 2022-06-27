package com.varxyz.banking.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.varxyz.banking.domain.Customer;

public class CustomerServiceImpl implements CustomerService {
	private static CustomerServiceImpl service = new CustomerServiceImpl(); // 2.객체생성
	private Map<String, Customer> map = new HashMap<String, Customer>();	
	
	private CustomerServiceImpl() {  // 1. 생성자를 private로 생성
		super();  // 생략가능
	}
	
	public static CustomerServiceImpl getInstance() {  // 객체 리턴
		return service;
	}
	
	public void addCustomer(Customer customer) {
		if(!map.containsKey(customer.getSsn())) {
			map.put(customer.getSsn(), customer);			
		}	
	}
	
	public Customer getCustomerBySsn(String ssn) {
		if(map.containsKey(ssn)) {
			return map.get(ssn);
		}
		return null;
	}

	public Collection<Customer> getAllCustomers() {
		return map.values();
	}

	public int getNumOfCustomers() { 
		return map.size();
	}
	
}
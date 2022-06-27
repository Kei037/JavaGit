package com.varxyz.banking.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.varxyz.banking.domain.Customer;

public class CustomerServiceImpl2 implements CustomerService{
	private List<Customer> customerList = new ArrayList<Customer>();
	
	public void addCustomer(Customer customer) {
		if(getCustomerBySsn(customer.getSsn()) == null ) {
			customerList.add(customer);
		}
	}

	public Customer getCustomerBySsn(String ssn) {
		for(Customer c : customerList) {
			if(ssn.equals(c.getSsn())) {
				return c;
			}
		}
		return null;
	}

	public Collection<Customer> getAllCustomers() {
		return customerList;
	}

	public int getNumOfCustomers() {		
		return customerList.size();
	}
	
}
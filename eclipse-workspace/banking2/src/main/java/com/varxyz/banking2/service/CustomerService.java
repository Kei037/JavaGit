package com.varxyz.banking2.service;

import com.varxyz.banking2.command.CustomerCommand;
import com.varxyz.banking2.domain.Customer;

public interface CustomerService {
	public void addCustomer(Customer customer);

	void addCustomer(CustomerCommand customerCommand);
}

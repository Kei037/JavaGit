package com.varxyz.banking.service;

import com.varxyz.banking.command.CustomerCommand;
import com.varxyz.banking.domain.Customer;

public interface CServiceInterface {
	void addCustomer(CustomerCommand customerCommand);
	boolean loginCustomer(String email, String passwd);
	Customer findCustomerBySsn(String ssn);
}

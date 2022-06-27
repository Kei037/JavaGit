package com.varxyz.banking.domain;

import java.util.List;

import com.varxyz.banking.Service.CustomerServiceImpl;
import com.varxyz.banking.Service.CustomerServiceImpl2;

public class CustomerServiceTest {
	public static void main(String[] args) {
		CustomerServiceImpl2 test = new CustomerServiceImpl2();
		Customer testC = new Customer();
		testC.setName("홍길동");
		testC.setSsn("123456-1652312");
		testC.setPhone("010-1234-5678");
		testC.setCustomerID("juneway");
		testC.setPassword("1234");
		System.out.println(testC.getName());
		
		test.addCustomer(testC);
		System.out.println(test.getCustomerBySsn("123456-1652312"));
		System.out.println(test.getAllCustomers());
		System.out.println(test.getNumOfCustomers());
		
	}
}

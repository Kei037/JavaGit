package com.varxyz.banking2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.banking2.domain.Customer;
import com.varxyz.banking2.domain.CustomerCommand;
import com.varxyz.banking2.service.CustomerServiceImpl;

@Controller
public class CustomerController {
	@Autowired
	CustomerServiceImpl customerService;
	
	@GetMapping("login/add_customer")
	public String addCustomerForm() {
		return "/login/add_customer";
	}
	
	@PostMapping("login/add_customer")
	public String addCustomer(CustomerCommand customerCommand, Model model) {
		model.addAttribute("customerCommand", customerCommand);	
		Customer customer = new Customer();
		customer.setEmail(customerCommand.getEmail());
		customer.setPasswd(customerCommand.getPasswd());
		customer.setName(customerCommand.getName());
		customer.setSsn(customerCommand.getSsn());
		customer.setPhone(customerCommand.getPhone());
		customerService.addCustomer(customer);
		return "login/add_success_customer";
	}
	
	
	
}

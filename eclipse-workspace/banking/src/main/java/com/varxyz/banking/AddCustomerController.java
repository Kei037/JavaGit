package com.varxyz.banking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.banking.command.CustomerCommand;
import com.varxyz.banking.domain.Customer;
import com.varxyz.banking.service.CustomerService;

@Controller("addCustomerController")
public class AddCustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/banking/add_customer")
	public String addCustomerForm() {
		return "banking/add_customer";
	}
	
	@PostMapping("/banking/add_customer")
	public String addCustomer(CustomerCommand customerCommand, Model model) {
		model.addAttribute("customerCommand", customerCommand);
		
		customerService.addCustomer(customerCommand);
		System.out.println("-inserted-");
		
		return "banking/success_add_customer";
	}
	
	
	@GetMapping("/banking/find_customer")
	public String findCustomerForm() {
		return "banking/find_customer";
	}
	
	@PostMapping("/banking/find_customer")
	public String findCustomer(CustomerCommand customerCommand, Model model) {
		model.addAttribute("customerCommand", customerCommand);
		Customer customer = customerService.findCustomerBySsn(customerCommand.getSsn());
		model.addAttribute(customer);
		return "banking/success_find_customer";
	}
}

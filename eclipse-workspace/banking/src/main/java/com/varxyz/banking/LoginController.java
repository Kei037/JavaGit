package com.varxyz.banking;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.banking.service.CustomerService;

@Controller("loginController")
public class LoginController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/banking/login")
	public String loginForm() {
		return "banking/login";
	}
	
	@GetMapping("/banking/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		session.invalidate();
		return "banking/login";
	}
	
	@PostMapping("/banking/login")
	public String login(HttpServletRequest request, Model model) {
		String email = request.getParameter("email");
		String passwd = request.getParameter("passwd");
		
		if(!customerService.loginCustomer(email, passwd)) {
			return "banking/login";
		}
		
		HttpSession session = request.getSession(true);
		session.setAttribute("email", email);
		
		return "banking/index";
	}
}

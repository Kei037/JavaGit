package com.varxyz.banking;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.banking.command.AccountCommand;
import com.varxyz.banking.service.AccountService;

@Controller("transferController")
public class TransferController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/banking/transfer")
	public String transferForm(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String email = (String)session.getAttribute("email");
		
		List<AccountCommand> accountList = accountService.getAccounts(email);
		request.setAttribute("accountList", accountList);
		return "banking/transfer";
	}
	
	@PostMapping("/banking/transfer")
	public String transfer(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		String email = (String)session.getAttribute("email");
		
		String withdrawAccNum = request.getParameter("withdrawAccNum");
		double amount = Double.parseDouble(request.getParameter("amount"));
		String depositAccount = request.getParameter("depositAccount");
		
		List<AccountCommand> accountList = accountService.getAccounts(email);
		request.setAttribute("accountList", accountList);
		
		session.setAttribute("withdrawAccNum", withdrawAccNum);
		session.setAttribute("amount", amount);
		session.setAttribute("depositAccount", depositAccount);
		
		return "banking/transfer2";
	}
	
	@PostMapping("/banking/transfer2")
	public String transfer2(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		String email = (String)session.getAttribute("email");
		
		String withdrawAccNum = request.getParameter("withdrawAccNum");
		double amount = Double.parseDouble(request.getParameter("amount"));
		String depositAccount = request.getParameter("depositAccount");
		
		List<AccountCommand> accountList = accountService.getAccounts(email);
		request.setAttribute("accountList", accountList);
		
		session.setAttribute("withdrawAccNum", withdrawAccNum);
		session.setAttribute("amount", amount);
		session.setAttribute("depositAccount", depositAccount);
		
		return "banking/transfer3";
	}
	
}

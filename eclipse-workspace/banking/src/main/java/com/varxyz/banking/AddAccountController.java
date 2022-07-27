package com.varxyz.banking;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.banking.command.AccountCommand;
import com.varxyz.banking.dao.AccountDao;
import com.varxyz.banking.dao.CustomerDao;
import com.varxyz.banking.domain.Account;
import com.varxyz.banking.domain.CheckingAccount;
import com.varxyz.banking.domain.Customer;
import com.varxyz.banking.domain.SavingsAccount;
import com.varxyz.banking.service.AccountService;

@Controller("addAccountController")
public class AddAccountController {
	/**
	 * 대공사중 - 관련 Class (Account, AccountCommand, AccountDao, AccountService)
	 * + add_account.jsp
	 */
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/banking/add_account")
	public String addAccountForm() {
		return "banking/add_account";
	}
	
	@PostMapping("/banking/add_account")
	public String addAccount(HttpServletRequest request ,
			AccountCommand accountCommand, Model model) {
		HttpSession session = request.getSession();
		String email = (String)session.getAttribute("email");
		double balance = Double.valueOf(request.getParameter("balance"));
		model.addAttribute("accountCommand", accountCommand);
		
		accountCommand.setAccountNum("123-45-6789");	// 임의 계좌번호 set
		accountCommand.setEmail(email);
		//	계좌생성
		accountCommand.setBalance(balance);
		accountService.addAccount(accountCommand);
		System.out.println("-inserted-");
		
		return "banking/success_add_account";
	}
	
	
	@PostMapping("/banking/find_account")
	public String findAccount(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		String email = (String)session.getAttribute("email");
		System.out.println("find_account = " + accountService.findAccountByCustomerId(email));
		List<AccountCommand> accountList = accountService.findAccountByCustomerId(email);
		request.setAttribute("accountList", accountList);
		return "banking/success_find_account";
	}
}

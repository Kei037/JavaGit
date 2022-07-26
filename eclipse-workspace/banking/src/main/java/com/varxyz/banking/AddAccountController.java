package com.varxyz.banking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
//	private AccountService accountService;
	
	@GetMapping("/banking/add_account")
	public String addCustomerForm() {
		return "banking/add_account";
	}
	/*
	@PostMapping("/banking/add_account")
	public String addCustomer(AccountCommand accountCommand, Customer customer, Model model) {
		model.addAttribute("accountCommand", accountCommand);
		model.addAttribute("customer", customer);
		accountCommand.setCustomer(customer);			// customer의 이메일을 set
		accountCommand.setAccountNum("123-45-6789");	// 임의 계좌번호 set
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DataSourceConfig.class);
		
		//  Customer테이블에 email이 존재하면 그 row값들을 가져온다.
		CustomerDao cdao = context.getBean("customerDao", CustomerDao.class);
		Customer customer2 = cdao.findCustomerByEmail(accountCommand.getCustomer().getEmail());
		
		System.out.println(cdao.findCustomerByEmail(accountCommand.getCustomer().getEmail()));
		System.out.println(customer2.getCid());
		accountCommand.setCustomer(customer2);		// 가져온 row값을 새롭게 set
		
		//  예금인지 저축인지 구분
		if (accountCommand.getAccountType() == 'C') {
			accountCommand = new CheckingAccount();
		}else if(accountCommand.getAccountType() == 'S') {
			accountCommand = new SavingsAccount();
		}
		
		//	계좌생성
		accountService.addAccount(account);
		System.out.println("-inserted-");
		context.close();
		
		return "banking/success_add_account";
		
	} */
}

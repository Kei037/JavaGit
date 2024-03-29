package com.varxyz.jvx330.mvc.example6;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller("example6/addAccountController")
@RequestMapping("/example6/add_account")
public class AddAccountController {
	
	@GetMapping
	public String addAccountForm(Model model) {
		model.addAttribute("account", new AccountCommand());
		return "example6/add_account";
	}
	
	@PostMapping
	public String addAccount(@ModelAttribute("account") 
			AccountCommand account, Model model) {
		
		account.setAccountNum(generateAccount());
		
		model.addAttribute("account", account);
		return "example6/success_add_account";
	}
	
	public static String generateAccount() {
		String numStr = String.valueOf((int)(Math.random() * 1000000000));
		StringBuilder sb = new StringBuilder();
		sb.append(numStr.substring(0, 3));
		sb.append("-");
		sb.append(numStr.substring(3, 5));
		sb.append("-");
		sb.append(numStr.substring(5));
		
		return sb.toString();
	}
}

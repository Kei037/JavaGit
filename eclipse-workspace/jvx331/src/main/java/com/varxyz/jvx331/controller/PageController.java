package com.varxyz.jvx331.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.jvx331.command.FindMenuItemCommand;
import com.varxyz.jvx331.service.MenuItemServiceImpl;


@Controller("controller/pageController")
public class PageController {
	
	@Autowired
	public MenuItemServiceImpl menuItemService;
	
	@GetMapping("/admin_page/admin_page")
	public String adminForm() {
		return "admin_page/admin_page";
	}
	
	@GetMapping("/kiosk/main")
	public String menuForm(HttpServletRequest request) {
		menuItemService.allFindMenu();
		List<FindMenuItemCommand> findMenuList = menuItemService.allFindMenu();
		request.setAttribute("findMenuList", findMenuList);
		
		return "kiosk/main";
	}
	
	@PostMapping
	public String addCart() {
		return "";
	}
	
}

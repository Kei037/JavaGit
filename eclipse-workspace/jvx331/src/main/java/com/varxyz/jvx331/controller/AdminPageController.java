package com.varxyz.jvx331.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller("controller/adminPageController")
@RequestMapping("/admin_page/admin_page")
public class AdminPageController {
	
	@GetMapping
	public String addMenuForm() {
		return "admin_page/admin_page";
	}
	
}

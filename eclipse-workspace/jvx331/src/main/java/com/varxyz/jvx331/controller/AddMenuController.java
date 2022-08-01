package com.varxyz.jvx331.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.varxyz.jvx331.command.MenuItemCommand;
import com.varxyz.jvx331.menu.BeverageCategory;

@Controller("controller/addMenuController")
@RequestMapping("/admin_page/add_menu")
public class AddMenuController {
	
	@Autowired
	public BeverageCategory beverageCategory;
	
	@GetMapping
	public String addMenuForm(Model model) {
		model.addAttribute("menu", new MenuItemCommand());
		return "admin_page/add_menu";
	}
	
	@ModelAttribute("categoryProviderList")
	public List<CategoryProvider> getCategoryProviderList(){
		List<CategoryProvider> list = new ArrayList<CategoryProvider>();
		list.add(new CategoryProvider("음료", "beverage"));
		list.add(new CategoryProvider("음식", "food"));
		return list;
	}
	
	@PostMapping
	public String addMenu(@ModelAttribute("menu")
					MenuItemCommand menu, Model model) {
		model.addAttribute("menu", menu);
		return "admin_page/success_add_menu";
	}
}

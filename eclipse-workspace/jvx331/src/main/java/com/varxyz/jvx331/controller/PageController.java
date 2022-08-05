package com.varxyz.jvx331.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.varxyz.jvx331.cart.Cart;
import com.varxyz.jvx331.command.FindMenuItemCommand;
import com.varxyz.jvx331.command.MenuItemCommand;
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
		
		for (int i = 101; i < 103; i++) {
			String bigCategory = "bigCategory"+i;
			System.out.println(i);
			System.out.println(bigCategory);
			request.setAttribute(bigCategory, menuItemService.findMenuByCategory(i));
		}
		
		
		for (int i = 501; i < 512; i++) {
			request.setAttribute("subCategory" + i, menuItemService.findMenuBySubCategory(i));
		}
		
		List<FindMenuItemCommand> findMenuList = menuItemService.allFindMenu();
		request.setAttribute("findMenuList", findMenuList);
		
		return "kiosk/main";
	}
	
	@GetMapping("/kiosk/add_cart")
	public String addCartFrom(@RequestParam("id") long id, Cart cart, HttpServletRequest request) {
		FindMenuItemCommand menuItem = menuItemService.findMenu(id);
		request.setAttribute("menuItem", menuItem);
		return "kiosk/add_cart";
	}
	
	// 장바구니 담기 미제작
	@PostMapping("/kiosk/add_cart")
	public String addCArt(@RequestParam("id") long id, Cart cart, HttpServletRequest request) {
		FindMenuItemCommand menuItem = menuItemService.findMenu(id);
		request.setAttribute("menuItem", menuItem);

		HttpSession session = request.getSession();
		session.setAttribute("cart", cart);
		
		cart.setMenuItem(menuItem);
		System.out.println(cart.getQuantity());
		System.out.println();
		return "kiosk/add_cart";
	}
	
}

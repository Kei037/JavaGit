package com.varxyz.jvx331.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.varxyz.jvx331.command.FindMenuItemCommand;
import com.varxyz.jvx331.command.MenuItemCommand;
import com.varxyz.jvx331.dao.MenuItemDao;

public class MenuItemServiceImpl implements MenuItemService {
	
	@Autowired
	MenuItemDao menuItemDao;
	
	@Override
	public void addMenuItem(MenuItemCommand menuItemCommand) {
		menuItemDao.addMenuItem(menuItemCommand);
	}
	
	@Override
	public List<FindMenuItemCommand> allFindMenu(){
		return menuItemDao.allFindMenu();
	}
	
	@Override
	public FindMenuItemCommand findMenu(long id) {
		return menuItemDao.findMenu(id);
	}
	
	@Override
	public void updateMenuItem(MenuItemCommand menuItemCommand, long id) {
		menuItemDao.updateMenuItem(menuItemCommand, id);
	}
	
	public void dropMenuItem(long id) {
		menuItemDao.dropMenuItem(id);
	}
}

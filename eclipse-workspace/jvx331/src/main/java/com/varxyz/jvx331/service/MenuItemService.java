package com.varxyz.jvx331.service;

import java.util.List;

import com.varxyz.jvx331.command.FindMenuItemCommand;
import com.varxyz.jvx331.command.MenuItemCommand;

public interface MenuItemService {
	void addMenuItem(MenuItemCommand menuItemCommand);
	List<FindMenuItemCommand> allFindMenu();
	FindMenuItemCommand findMenu(long id);
	void updateMenuItem(MenuItemCommand menuItemCommand, long id);
}

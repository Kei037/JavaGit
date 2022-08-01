package com.varxyz.jvx331.command;

import com.varxyz.jvx331.menu.MenuCategory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MenuItemCommand {
	private String name;
	private String balance;
	private String size;
	private boolean ice;
	private String quantity;
	private MenuCategory menuCategory;
	
	public MenuItemCommand() {
		super();
	}
}

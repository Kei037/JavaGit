package com.varxyz.jvx331.menu;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuItem {
	private String name;
	private String balance;
	private String size;
	private boolean ice;
	private String quantity;
	private MenuCategory menuCategory;
}

package com.varxyz.jvx331.cart;

import com.varxyz.jvx331.command.FindMenuItemCommand;
//메롱김준영
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cart {
	private FindMenuItemCommand menuItem;
	private int quantity;
	private boolean takeout;
	
	public Cart() {
		super();
	}
}

























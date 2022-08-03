package com.varxyz.jvx331.menu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MenuItem {
	private long subCategoryId;
	private String nameKor;
	private String nameEng;
	private double balance;
	private boolean ice;
	
	public MenuItem() {
		super();
	}
}

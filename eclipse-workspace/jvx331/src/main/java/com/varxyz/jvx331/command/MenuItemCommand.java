package com.varxyz.jvx331.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MenuItemCommand {
	private long categoryId;
	private long subCategoryId;
	private String nameKor;
	private String nameEng;
	private double balance;
	private boolean ice;
	private String img;
	
	public MenuItemCommand() {
		super();
	}
}

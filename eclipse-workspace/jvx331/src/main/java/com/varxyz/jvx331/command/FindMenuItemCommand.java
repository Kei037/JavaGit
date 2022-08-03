package com.varxyz.jvx331.command;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FindMenuItemCommand {
	private long mid;
	private long sub_categoryId;
	private String name_kor;
	private String name_eng;
	private double balance;
	private boolean ice;
	private String img;
	private Date regDate;
	private long sid;
	private long categoryId;
	private String sub_name;
	private long cid;
	private String name;
	
	public FindMenuItemCommand() {
		super();
	}
}

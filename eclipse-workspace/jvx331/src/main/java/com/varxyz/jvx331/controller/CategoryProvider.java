package com.varxyz.jvx331.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CategoryProvider {
	private long menuHost;		// 선택되면 들어오는 값
	private String menuCode;		// 화면에 보여지는 값
}

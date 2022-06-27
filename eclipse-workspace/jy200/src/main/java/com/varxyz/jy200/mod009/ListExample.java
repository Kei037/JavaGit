package com.varxyz.jy200.mod009;

import java.util.ArrayList;
import java.util.List;

/**
 * List <--- ArrayList
 * 중복O, 순서O
 * 
 * ex)
 * ArrayList<Interger> = new ArrayList<Integer>();
 * list.add(0, new Integer(42));
 * int total = list.get(0).intValue();
 */

public class ListExample {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("one");
		list.add("second");
		list.add("3rd");
		list.add(new Integer(4));
		list.add(new Float(5.0F));
		list.add("second");
		list.add(new Integer(4));
		
		System.out.println(list);
	}
}
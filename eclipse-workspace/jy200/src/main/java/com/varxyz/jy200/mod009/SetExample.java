package com.varxyz.jy200.mod009;

import java.util.HashSet;
import java.util.Set;

/**
 * Set <--- HashSet
 * 중복X, 순서X
 */

public class SetExample {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("one");
		set.add("second");
		set.add("3rd");
		set.add(new Integer(4));
		set.add(new Float(5.0F));
		set.add("second");
		set.add(new Integer(4));
		
		System.out.println(set);
	}
}
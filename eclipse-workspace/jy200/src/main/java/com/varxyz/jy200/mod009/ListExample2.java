package com.varxyz.jy200.mod009;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample2 {
	public static void main(String[] args) {
		ArrayList<Integer> listInt = new ArrayList<Integer>();
		listInt.add(0, new Integer(32));
		System.out.println(listInt.get(0));
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add(0, new String("one"));
		list.add(1, new String("two"));
		list.add(2, new String("3rd"));
		
		for ( String s : list ) {
			System.out.println(s);
		}
		
	}
}

package com.varxyz.jy200.mod009;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(new Integer(1), "유비");  // java 9 부터 Inger.valueOf로 권고
		map.put(2, "관우");  // java 5 부터 autoboxing지원
		map.put(Integer.valueOf(3), "장비");
		
		System.out.println(map.get(Integer.valueOf(1)));
		System.out.println(map.get(2));
		System.out.println(map.get(new Integer(3)));
		
		Set<Integer> set = map.keySet();
		
		for(Integer integer : set) {
			System.out.print(integer);
			System.out.println(" = " + map.get(integer));
		}
		
		
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("one", "원");
		map2.put("two", "투");
		map2.put("three", "쓰리");
		
		Set<String> set2 = map2.keySet();
		
		for(String string : set2) {
			System.out.print(string);
			System.out.println(" = " + map2.get(string));
		}
		
		System.out.println(map2);
 	}

}

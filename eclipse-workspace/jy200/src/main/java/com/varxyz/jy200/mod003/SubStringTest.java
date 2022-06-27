package com.varxyz.jy200.mod003;

public class SubStringTest {
	String result = "";
	String item;
	String line;
	
	public void isSubString(String item, String line) {
		String a1;
	    String a2;
	    a1 = item;
		a2 = line;

//		for ( int i = 0; i < a1.length() ; i++ ) {
//			for ( int j = 0; j < a2.length(); j++ ) {
//				if ( a1.charAt(i) == a2.charAt(j) ) {
//					System.out.print(a1.charAt(i));
//					result += a1.charAt(i);
//					if ( result.length() == a2.length() ) {
//						break;
//					}
//                }
//			}
//		}
//		System.out.print(result);
		
		a2.charAt(0);
		System.out.println(a2.charAt(0));
		System.out.println(a2.charAt(a2.length()-1));
		
		for (int i = 0; i < a1.length(); i++) {
			if ( a1.charAt(i) == a2.charAt(0) ) {
				result += a1.charAt(i);
			}
			System.out.println(result);
		}
	}
	
	public static void main(String[] args) {
		SubStringTest txt = new SubStringTest();
		txt.isSubString("The cat in the hat", "cat");
	}
	
}
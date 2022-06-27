package com.varxyz.jy200.mod003;

public class RandomEmoji {
	
	public void percent() {
		String[] emoji = new String[] {"동그라미", "사각형", "삼각형", "타원형", "역삼각형", "별", "다각형"};
//		{70, 50, 30, 20, 10, 0.5, 0.1}
		int randomInt = (int)(Math.random() * 100) + 1;
		double randomdoulbe = (double)(Math.random() * 10) + 1;
		System.out.println(randomInt);
		
		if ( randomInt >= 0 && randomInt <= 10 ) {
//			if ( randomdouble ) {
//				
//			}
			System.out.println(emoji[4]);
		}else if ( randomInt > 10 && randomInt <= 20 ) {
			System.out.println(emoji[3]);
		}else if ( randomInt > 20 && randomInt <= 30 ) {
			System.out.println(emoji[2]);
		}else if ( randomInt > 30 && randomInt <= 50 ) {
			System.out.println(emoji[1]);
		}else if ( randomInt > 50 && randomInt <= 70 ) {
			System.out.println(emoji[0]);
		}
	}
	
	public static void main(String[] args) {
		RandomEmoji btn = new RandomEmoji();
		btn.percent();
	}

}
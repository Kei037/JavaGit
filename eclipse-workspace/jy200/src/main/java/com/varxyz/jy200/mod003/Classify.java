package com.varxyz.jy200.mod003;

public class Classify {
	
	static int count;
	int [] nums = new int[10];
	int [] target = new int[5];
	
	public void isClassify() {
//		배열 만드는 부분
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int target[] = { 11, 12, 13, 6, 15 };
		
//		nums 배열과 target 배열을 비교
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < target.length; j++) {
				if ( nums[i] == target[j] ) {
					count++;
				}
			}
		}
		
//		count변수로 분류
		if ( count == target.length ) {
			System.out.println("target배열은 nums 배열 안에 포함되어 있다.");
		}else if ( count < target.length && count > 0 ) {
			System.out.println("target배열은 nums 배열에 걸쳐져 있다.");
		}else if ( count == 0 ) {
			System.out.println("target배열은 nums 배열 밖에 있다.");
		}
		
	}

	public static void main(String[] args) {
		Classify a = new Classify();
		a.isClassify();
	}

}

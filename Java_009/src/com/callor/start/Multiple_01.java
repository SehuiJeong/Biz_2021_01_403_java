package com.callor.start;

public class Multiple_01 {

	public static void main(String []args) {
		
		int sum = 0;
		// 1 ~ 100 까지 범위에서 찾아 3과 9의 배수의 합을 찾아라
		for(int i = 0 ; i < 100 ; i++) {
			int num1 = i + 1;
			boolean bYes3M = num1 % 3 == 0;
			boolean bYes9M = num1 % 9 == 0;
			
			// 3의 배수이면서 (and) 9의 배수
			if(bYes3M && bYes9M) {
				sum += num1; // i를 더하지 않는다
				System.out.println(num1 + "는 3과 9의 배수합");
			
			}
		
		

		}
		
		
	System.out.println("========================");	
	}

}

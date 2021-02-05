package com.callor.start.logic;

public class Logic_02 {
	
	public static void main(String[] args) {
		
		// 불값, 논리연산결과를 담는 변수
		// boolean, Boolean
		// 3과 3의 값이 같다는 말을 bYes라는 변수에 담아라
		boolean bYes = 3 == 3;
		bYes = 3 > 3;
		System.out.println(bYes);
		
		bYes = 3 >= 3;
		
		// 변수에 값을 담아서 증명하는 법도 있다
		int num1 = 55;
		int num2 = 65;
			
		bYes = num1 >= num2;
			
		bYes = num1 * 2 >= num2;
		bYes = (num1 * 2) >= num2;
		
			
		
	}

}

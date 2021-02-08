package com.callor.start;

public class Multiple_02_01 {

	public static void main(String[] args) {
		
		// ~ 범위의 값을 덧셈(합산, 누적)용 변수선언
		int sum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			int num = i + 7;
			boolean bYes = num % 3 == 1;
			if(bYes) {
				sum += num;
			}
			
			boolean bYes2 = num % 3 == 2;
			if(bYes2) {
				sum += num;
			}
		}
		System.out.println("3의 배수가 아닌 수의 합 : " + sum);
		
		sum = 0;
		for(int i =0 ; i < 100 ; i ++) {
			
			int num = i + 7;
			
			boolean bYes = num % 3 > 0;
			if(bYes) {
				sum += num;
			}
		}
		System.out.println(sum);
	
		
		sum = 0;
		for(int i =0 ; i < 100 ; i ++) {
			
			int num = i + 7;
			
			boolean bYes = num % 3 == 0;
			if( !bYes ) {
				sum += num;
			}
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i =0 ; i < 100 ; i ++) {
			
			int num = i + 7;
			
			boolean bYes = num % 3 != 0;
			if(bYes) {
				sum += num;
			}
		}
		System.out.println(sum);
	
	
		


	}

}

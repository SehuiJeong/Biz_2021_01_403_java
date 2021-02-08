package com.callor.start;

public class Multipe_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 7 ~ 106
		
		int sum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			int num = i + 7;
			boolean bYes = num % 3 == 0;
			
			// if(num % 3 == 0) {
			// if(bYes == true)
			if(bYes) {
				sum += num; 
				System.out.println(num + "는 3의 배수");
			}
		}
		System.out.println(sum);
		
		
		

	}

}

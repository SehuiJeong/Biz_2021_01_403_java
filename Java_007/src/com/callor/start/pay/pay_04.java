package com.callor.start.pay;

public class pay_04 {
	public static void main(String[] args) {


		
		int paper = 50_000;
		int count = 0;
		
		int sw = -1;
		for (int pay = 4_789_800 ; pay > 0; pay -= (paper * count)  ) {
		    
			
			count = pay / paper;
			System.out.println(paper + "원권 : " + count);
			if(sw <0 ) { // sw가 0보다 작으면
			  paper = paper / 5;
			} else { // 그렇지 않으면
			   paper = paper / 2;
			}
			
			sw *= (-1);
			
		}
	}
}

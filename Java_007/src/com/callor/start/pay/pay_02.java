package com.callor.start.pay;

/*
 * 이 코드는 for() 반복문의 코드 실행순서를
 * 참조하는 용도이며
 * pay 계산에는 오류가 있다.
 */
public class pay_02 {
	public static void main(String[] args) {

		int pay = 4_789_800;
		int paper = 50_000;
		
		int sw = -1;
		for (  ; pay > 0;  ) {
			int count = pay / paper;
			pay -= (paper * count);
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

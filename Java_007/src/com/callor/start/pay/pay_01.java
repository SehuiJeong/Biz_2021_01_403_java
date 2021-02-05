package com.callor.start.pay;

public class pay_01 {
	public static void main(String[] args) {


		// 5만원권 계산
		
		int pay = 4_789_800;
		int paper = 50_000;
		
		// for() 반복문이 무한 반복된다.
		// for() 문을 종료하는 조건을 부여해야 한다
		int sw = -1;
		/*
		 * 일반적으로 for() 반복문은
		 *  반복되는 횟수가 명확할 때 사용
		 * while(조건문) 반복문은
		 *    반복되는 횟수가 경우에 따라 다를 떄
		 *    조건에 부여하여 반복 수행을 결정
		 *    조건문이 true 일때만 반복하고 
		 *    조건문이 false가 되면 종료한다.
		 */
		while ( pay > 0 ) {
			int count = pay / paper;
			pay -= (paper * count);
			System.out.println(paper + "원권 : " + count);
			if(sw <0 ) {
			paper = paper / 5;
			}
			if(sw > 0) {
				paper = paper / 2;
			}
			// 최초에는 sw기 -1 이다가
			// 두번째 for() 반복문을 시작하기 전에
			// -1을 곱하여 sw 를 1로 만든다
			sw *= (-1);

		}

	}

}

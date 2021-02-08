package com.callor.start;

public class Odd_Even_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intSum = 0;
		int i = 0;
		// 1 2 , 6 5
		for (; i < 101; i += 1) {
			// 3
			boolean bYes = (i + 1) % 2 == 0; // 결과적으로 구하려는 게 (i + 1)이 짝수인가

			// 만약 1 ~ 100까지 범위 수 중에서 짝수가 아닌 경우 더하지 말고 짝수의 합만 더해라
			if (bYes) {

				// 4
				intSum += (i + 1);

			}
		}

		System.out.println(intSum); // 짝수를 제외한

		intSum = 0;

		// intSum을 연습하기 위해 for에 i값을 0으로, i < 100으로 설정 (나중엔 바꿔도 되지만 우선 기본기 연습)
		// 0 ~ 99
		for (i = 0; i < 100; i += 1) {

			boolean bYes = (i + 1) % 2 == 1; // 결과적으로 구하려는 게 (i + 1)이 홀수인가

			if (bYes) {

				intSum += (i + 1);
			}
		}

		System.out.println(intSum);

		// 위에서 선언하고 사용했던 변수를 "재사용" 하기
		// 반드시 초기화(clear) 해야 한다.

		// 변수 첫번째 자리는 소수(잊지말자)
		int intSumOdd = 0;
	    for(i = 0 ; i < 100 ; i++) {
	    	int num = i + 1;
	    	boolean bYes = num % 2 == 0;
	    	
	    	// if (bYes == false) {
	    	
	    	// bYes가 true가 아니면
	    	if (!bYes) {
	    		intSumOdd += num;
	    		
	    	}
	    			
	    }
	    System.out.println("홀수의 합 : " + intSumOdd);
	} 

	}



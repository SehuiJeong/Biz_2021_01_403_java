package com.callor.start.logic;

public class Logic_04 {

	public static void main(String[] args) {
		
		// i : 0 ~ 9 ++ 하면서 변화
		// i : 0,1,2,3 ,4 , 5, 6,7,8,9
		for (int i = 0; i < 10; i++) {
			
			//  i % 2 : 0, 1, 0, 1, 0, 1, 0, 1
			boolean bYes = i % 2 == 0;
			
			//bYes : true 이면 System ... 명령문 실행
			//bYes : true가 아니면 무시
			if (bYes) {
				System.out.println(i + "는 짝수!");
			}
		}
		int num = 0;

		//
		// num 값이 어떤 연산결과를 저장하는 코드

		boolean bYes = num % 2 == 0;
		if (bYes) {
			System.out.println(num + "는 짝수");
		}
	}

}

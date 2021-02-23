package com.callor.applications.primeservice;

import java.util.Scanner;

public class PrimeServiceV1 {

	public void prime(int num1) { // <-- prime 메서드에 매개변수에 넣으라는 말,
									// 지문만 볼 떈 이해못했는데 이렇다

		int pos = 0;
		for (pos = 2; pos < num1; pos++) { // pos는 2에서 시작해서 for문 안에선 계속 증가하니까 연이어*
			if (num1 % pos == 0) {
				break;
			}
		}
		if (pos < num1) {
			// * pos가 입력된 값 num1보다 크면 소수가 안 된다
			System.out.println(num1 + "소수 아님");
		} else { // * pos가 입력된 값 num1보다 작으면 소수가 된다 예시를 들어주마!
			System.out.println(num1 + "소수");
		}

		// 예시를 들어주마! 영역
		// 저기 for문 안에서 if문 해결된 후에
		// num1에 입력된 값이 5면
		// pos는 num1보다 작기만 하면 되는 수 : 2, 3, 4가 있다
		// 그럼 봅시다
		// num1 % pose
		// 5 % 2 == 0; false
		// 5 % 3 == 0; false
		// 5 % 4 == 0; false
		// 5 % 5 == 0; true
		// 근데 5 % 6 은 안 되니까 소수 아님으로 나온다

	}

}

package com.callor.hello;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HomeWork");

		// for문 예제 연습
		// 1. 1 ~ 10 까지 숫자의 합은?

		int sum = 0;
		// 초기 ; 조건 ; 증감
		// 초기값은 생략이 가능하다( for문 밖에다 int i 입력했으면)
		for (int i = 1; i <= 10; i++) {

			sum += i;
		}
		System.out.println("1 ~ 10 까지의 합은?" + sum); // 여전히 헷갈리는 부분, 결과값을 보려면 for문 밖에 sysout을 놔둬야함.

		// 2.1 ~ 10 까지 홀수값의 합은?

		int sum1 = 0;
		for (int i = 0; i < 10; i++) {
			/*
			 * if문 쓴 후에 홀수값을 구하라 하면 i(그냥 변수) % 2 == 1이고 짝수값을 구하라 하면 i % 2 == 0이고 n의 배수값을 구하라
			 * 하면 i % n == 0 하면 된다.
			 */
			if (i % 2 == 1) {
				sum1 += i;
			}
		}
		System.out.println("1 ~ 10 까지 홀수값의 합은?" + sum1);

		// 3. 1 ~ 10 까지 짝수값의 합은?

		int sum2 = 0;
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				sum2 += i;
			}
		}
		System.out.println("1 ~ 10 까지 짝수의 핪은?" + sum2);

		// 4. 구구단 75단을 나타내자

		int num = 75;
		// int sum3 = 0;
		// 이건 처음에 붙여서 썼는데 알고 보니 곱하기에선
		// 필요없어서 제외함
		int i = 0;
		for (i = 1; i < 10; i++) {
			// sum3 += i;
			// 왜냐하면 sum은 다 합친걸 말하는데
			// 곱하기는 다 합칠 필요없음

			System.out.println(num + "*" + i + "=" + (num * i));
			// 이거는 i 값을 반복해서 나열해야 하니까 sysout이 for문 안에 들어가야 한다.
			// 1번 문제에선 합을 구하라 했으니까 나열할 필요가 없기에 sysout을 for문 밖에다 입력
		}

		// 5. 재미있는 거 하나. 1 ~ 10과 5 ~ 14를 곱해라
		// for 방금 새로 본 규칙을 적용하기 위함(for문은 초기와 증감만 여러 개 포함 가능)

		int num1 = 0;
		int num2 = 0;
		for (num1 = 1, num2 = 5; num1 <= 10; num1++, num2++) {

			System.out.println(num1 + "*" + num2 + "=" + num1 * num2);

		}

	}

}

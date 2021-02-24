package com.callor.applications;

import java.util.Random;

import com.callor.applications.primeservice.PrimeServiceV2;

public class HomeWork_01 {

	/*
	 * 2 이상의 임의의 정수 100를 만들고 PriseServiceV2의 prime() method 호출하여 임의 정수 100개중 소수인 수들의
	 * 리스트를 출력 소수인 수들의 합
	 */	

	public static void main(String[] args) {

		Random rnd = new Random();
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		int sum = 0;

		// 이 두개의 변수는 for() 반복문에서 수행한 연산
		// 덧셈, 개수세기를 수행한 후
		// 결과를 출력하는 곳에서 사용해야할 변수이다
		// 따라서 for() 반복문이 시작되기 전에
		// 변수를 선언해야 한다

		System.out.println("임의의 정수 100 중 소수만 출력");
		for (int i = 0; i < 100; i++) {
			int rndNum = rnd.nextInt(500) + 2;
			// 0 ~ 500까지의 난수를 생성후
			// + 이후는 ~부터 시작한다
			// + 2는 2부터 501까지를 의미한다

			// psV2 클래스의 prime() method는
			// rndNum가 소수이면 그 수를 그대로 return
			// 아니면 -1을 return
			int result = psV2.prime(rndNum);
			if (result > 0) {
				System.out.print(rndNum + ","); // 이건 리스트출력
				sum += rndNum;
			} // end if
		} // end for
		System.out.println("합은 : " + sum);
		// for 반복문 안에서 합을 해버리면 합도 반복되므로
		// for문 밖에서 사용해준다

	}

}

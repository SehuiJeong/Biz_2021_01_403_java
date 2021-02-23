package com.callor.applications;

import java.util.Random;

import com.callor.applications.primeservice.PrimeServiceV2;

public class HomeWork_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		int sum = 0;

		System.out.println("임의의 정수 100 중 소수만 출력");
		for (int i = 0; i < 100; i++) {
			int rndNum = rnd.nextInt(500) + 2;
			// + 이후는 ~부터 시작한다
			// + 2는 2부터 501까지

			int result = psV2.prime(rndNum);
			if (result > 0) {
				System.out.println(rndNum); // 이건 리스트출력
				sum += rndNum;
			}
		}
		System.out.println("합은 : " + sum);

	}

}

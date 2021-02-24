package com.callor.applications;

import java.util.Random;

import com.callor.applications.primeservice.PrimeServiceV2;

public class HomeWork_01_01 {

	public static void main(String[] args) {

		// HomeWork_01 숙제, 이건 정수형 배열을 이용해서 하는 것
		// 정수형 배열을 쓸 때는 for문을 각각 나눠 만드는 편이 낫다

		Random rnd = new Random();
		int[] rndNum = new int[100];
		PrimeServiceV2 psV2 = new PrimeServiceV2();

		for (int i = 0; i < rndNum.length; i++) {
			rndNum[i] = rnd.nextInt(500) + 2;
			// 저 + 2가 2이상의 임의의 정수를 나타내는 부분
		}
		int sum = 0;
		System.out.println("임의의 정수 100중 소수리스트");
		for (int i = 0; i < rndNum.length; i++) {
			int result = psV2.prime(rndNum[i]);
			if (result > 0) {
				System.out.println(result);
				sum += result;
			}
		} System.out.println("리스트의 합" + sum);

	}

}

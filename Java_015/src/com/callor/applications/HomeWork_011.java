package com.callor.applications;

import java.util.Random;

import com.callor.applications.primeservice.PrimeServiceV2;

public class HomeWork_011 {

	/*
	 * 2 이상의 임의의 정수 100를 만들고 PriseServiceV2의 prime() method 호출하여 임의 정수 100개중 소수인 수들의
	 * 리스트를 출력 소수인 수들의 합
	 */

	public static void main(String[] args) {

		// HomeWork_01 숙제, 이건 정수형 배열을 이용해서 하는 것
		// 정수형 배열을 쓸 때는 for문을 각각 나눠 만드는 편이 낫다

		// java에서는 변수, 객체를 선언할 때
		// 사용하기 직전에 선언 및 초기화를 한다
		// 통상적으로 코딩을 할 때
		// 변수, 객체 등의 선언코드는
		// 가급적 코드의 시작부분(클래스 선언 명령문 아래, method 선언문 아래)에 작성한다
		Random rnd = new Random();
		PrimeServiceV2 psV2 = new PrimeServiceV2();

		int intPrimeSum = 0;
		int intPrimeCount = 0;

		// int rndNum[] = new int[100];
		int[] rndNum = new int[100];
		int sum = 0;

		// 생성된 rndNums 배열에 임의 정수 100개를 저장해 두었따
		// 이처럼 배열을 만들어두면
		// 이후의 코드에서 한 번 생성된 임의 정수 100개를
		// 자유롭게 활용할 수 있다
		for (int i = 0; i < rndNum.length; i++) {
			rndNum[i] = rnd.nextInt(500) + 2;
			// 저 + 2가 2이상의 임의의 정수를 나타내는 부분
		}

		System.out.println("임의의 정수 100중 소수리스트");

		// rndNums 배열에 담겨있는 정수들을
		// PsV2.prime() method에게 보내서
		// 소수인가를 검사하자

		// 다음처럼 prime() method에 배열을 통째로 전달하여
		// 코드를 수행할 수 없는 이유
		// psV2.prime(rndNum);
		// psV2.prime() method는 매개변수가 (int num)로
		// 선언되어 있다
		// 즉 이 method는 전달받을 수 있는 값이 정수 1개이다
		// 그런데 배열(100개의 정수)를 한꺼번에 전달하려고
		// 시도하기 때문에 안된다
		// 그렇다면 PsV2.prime() method를 사용하기 위해서는
		// rndNum의 요소들을 한개씩 전달해야 한다.
		// 결론은 for() 반복문을 사용해야 한다.
		for (int i = 0; i < rndNum.length; i++) {
			int num = rndNum[i];

			int result = psV2.prime(rndNum[i]);
			if (result > 0) {
				System.out.print(num + ",");

			}
		}
		for (int i = 0; i < rndNum.length; i++) {
			int num = rndNum[i];
			int result = psV2.prime(num);
			if (result > 0) {
				sum += result;
			}
		}
		System.out.println("리스트의 합 : " + sum);
	}

}

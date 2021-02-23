package com.callor.applications;

import java.util.Random;

public class Array_05 {

	public static void main(String[] args) {

		int[] intNums = new int[100];

		Random rnd = new Random();
		// i는 1 ~ 100 까지 정수를 생성하라 했을 때
		// 단순히 i < 100 으로 설정해도 되지만
		// 벌써 intNums의 배열이 100으로 설정되었으므로
		// 'intNums의 배열'이라는 의미의 intNums.length를 대신 입력해도 된다
		for(int i = 0; i < intNums.length; i++) {
			int num = rnd.nextInt(100) + 1;
			intNums[i] = num;
		}

		int sum = 0;
		System.out.println("3의 배수이면서 5의 배수인 값들의 리스트");
		for (int position = 0; position < intNums.length; position++) {
			boolean bYes = (intNums[position] % 3 == 0) && (intNums[position] % 5 == 0);
			// position 배열에 intNums라는 숫자가 3이면서 5인 배수
			
			if (bYes) {
				System.out.println(intNums[position]);
				sum += intNums[position];
			}
		}
		System.out.println("3의 배수이면서 5의 배수인 값들의 합");
		System.out.println("합은 : " + sum);

	}

}

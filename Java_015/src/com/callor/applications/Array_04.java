package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_04 {

	public static void main(String[] args) {

		int[] intNums = new int[100];
		Random rnd = new Random();

		for (int i = 0; i < intNums.length; i++) {
			int num = rnd.nextInt(10) + 1;
			intNums[i] = num;
			// intNums[i]에서 i가 intNums라는 배열의 i번째 요소에 랜덤값 num을 저장한 것
			// intNums[i]라는 말을 풀자면 i번에 위치한 intNums의 값
			
		}
		Scanner scan = new Scanner(System.in);
		System.out.print("1 ~ 10 중 하나의 수만 입력하라 >> ");
		int num2 = scan.nextInt();

		int lastPosition = 0;
		
		for (int position = 0; position < intNums.length; position++) {
			if (intNums[position] == num2) {
				// 키보드로 입력한 값이 일치할 때마다
				// 그 위치를 lastPosition에 저장한다.
				lastPosition = position;
			}
		}
		// 여기 오면 lastPosition에 저장된 값은
		// 가장 마지막으로 lastPosition = position이 실행된
		// 결과만 담고 있다
		System.out.println("가장 마지막으로 나타나는 위치 번호는\t" + lastPosition);
		
		// 번외 설명
		/*
		 * 변수는 앞에서 어떤 값을 저장했던 상관없이
		 * 가장 마지막에 저장한 값만 가지고 있다(성질)
		 */
		int num = 0;
		num = 100;
		num = 101;
		num = - 1;
		num = - 1000;
		System.out.println(num);
	}


}

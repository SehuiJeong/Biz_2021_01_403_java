package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_01 {

	public static void main(String[] args) {

		// Random 클래스를 사용하여 rnd 객체를 선언하고
		// = new Random() 명령을 사용하여
		// rnd 객체를 인스턴스화(化...으로 만든다) 시킨다
		// rnd : Random 클래스의 인스턴스
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		// num 변수에는 1 ~ 100까지 중 1개의 숫자가
		// 저장될 것이다
		// num = rnd.nextInt(100) + 1;

		// 정수 100개를 저장할 배열변수를 선언
		// 생성(초기화 : 사용할 준비를 하라) 하라
		int[] intNums = new int[100];
		

		// rnd 인스턴스의 nextInt() method를 호출(실행)하라
		// 매개변수값으로 100을 전달하라
		// Random 클래스의 nextInt() method에
		// 정수 100을 전달하고 실행하여
		// return하는 결과를 num변수에 저장하라
		// num 변수에는 0 ~ 99까지 중 1개의 숫자가 저장될 것이다.

		int i = 0;
		// 0 ~(intNums.length - 1) 횟수만큼 반복문을 실행하겠다
		
		/*
		 * 정수 0 ~ intNums.length 까지의 정수를 만들어서
		 * intNums의 위치값으로 정하고
		 * 
		 * 1 ~ 10 까지의 임의 숫자를 생성하여
		 * intNums의 배열에 채워라
		 */
		for (i = 0; i < intNums.length; i++) {
			// intNums의 i번째 위치에 정수 100을 저장하라

			
			int num = rnd.nextInt(10) + 1;
			// Random 클래스의 nextInt() method를
			// 호출하면서 정수 10을 전달하고
			// return된
			
			intNums[i] = num;

		} // for end

		int m = 0; // scanner 에서 받은 정수는 i와 차별해야 하므로 새로운 정수를 입력
		int count = 0;
		System.out.print("1에서 10까지 정수 중 하나를 입력하라 >>"); // 얘가 정수를 입력 
		m = scan.nextInt();
		for (i = 0; i < intNums.length; i++) {
			// random값인 intNums[i]와 scan으로 입력받은 값 m이 같다면
			if (intNums[i] == m) {

				count++; // 카운트에 1을 계속더한다
				/*
				 * i가 배열이니까 100까지 반복했다면 
				 * intNums[i] == Random인 1 ~ 10까지 정수가 저장된 배열 입력받은 m과 같다면
				 * 
				 */

			} // if end

		} // for end
		System.out.println(count);
	}
}

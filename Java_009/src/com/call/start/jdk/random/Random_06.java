package com.call.start.jdk.random;

/*
 * Copy & Understand , Paste
 * 복사 붙이기 (ctrl C, ctrl V) 
 */

import java.util.Random;

public class Random_06 {

	public static void main(String[] args) {

		int num = 0;
		int count = 0;
		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {
			num = rnd.nextInt(100) + 1;
			count++;

			if (num > 34) {
				break;
				// ...... 절대 실행되지 않는다.
			}
		}
		System.out.println(count + "번째 숫자 " + num + "는 34보다 크다");

		int intEnd = 100;
		for (count = 0; count < intEnd; count++) {
			num = rnd.nextInt(100) + 1;
			if (num > 50) {
				break;
			}
		}
		System.out.println(count);
		// count 변수값을 읽을 수 있다.
		// 만약 for() 반복문이 중단되지 않고
		// 모두 정상적으로 수행되고 나면
		// count와 intEnd는 count == intEnd 가 된다
		if (intEnd <= count) {
			// for()가 정상 종료되었다
		}
		if (intEnd > count) {
			// for()가 어떤 이유로 중간에 break 되었다
			System.out.println("for 중단");
			System.out.println((count + 1) + "번째에서 값 발견");
		} else {
			System.out.println("for 모두 반복 수행 완료");
			System.out.println("값을 찾을수 없음");
		}

	}

}

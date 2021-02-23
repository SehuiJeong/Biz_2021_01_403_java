package com.callor.applications;

import java.util.Scanner;

public class Prime_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("2 이상의 정수를 입력하세요 >> ");
		int num = scan.nextInt();

		// num == 5
		// 5 % 2 == 0; --> false
		// 5 % 3 == 0; --> false
		// 5 % 4 == 0; --> false

		for (int index = 2; index < num; index++) {
			boolean bYes = num % index == 0;
			if (bYes) {
				System.out.println(num + "은 소수가 아니다");
				break;
			}
			System.out.println(num + "는 소수다");
		}

		int pos = 0;
		for (pos = 2; pos < num; pos++) {
			if (num % pos == 0) {
				break;
			}
		}
		// pos의 값은?
		System.out.println(pos);
		// for 반복문이 중간에 break 되면
		// 항상 pos < num 관계가 된다

		// if(pos == num) {소수인 경우}

		if (pos < num) {
			System.out.println(num + "는 소수가 아님");
			// for 반복문이 break 없이 모두 완료되었으면
		} else {
			System.out.println(num + "는 소수임");
		}
		
		// return 값을 사용시
		for (int index = 2; index < num; index++) {
			boolean bYes = num % index == 0;
			if (bYes) {
				System.out.println(num + "은 소수가 아니다");
				return; 
				// 여기에 break대신 return이 들어가면 지역변수 위로 올라가기 때문에
				// 아래는 전부 무효화된다
			}
		}
		// 그래서 return 값을 사용하면 sysout을 for문이라는 지역변수 바깥쪽에 입력해야한다
		System.out.println(num + "는 소수다");

	}

}

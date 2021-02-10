package com.callor.applications;

import java.util.Scanner;

public class App_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자입력 >>");
		int keyNum = scan.nextInt();

		System.out.println("========================");
		System.out.println("구구단" + keyNum + "단");
		System.out.println("------------------------");

		for (int i = 0; i < 8; i++) {
			// i를 0으로 그대로 둔다고 했을 때 2 ~ 9 까지 계산해야 할 때,
			// 변수 num2 를 설정하고 i + 2를 추가하고
			// i는 8로 설정해줘야 한다.

			int num2 = i + 2;

			System.out.print(keyNum);
			System.out.print(" X ");
			System.out.print(num2);
			System.out.print(" = ");
			System.out.println(keyNum * num2);

		}
		System.out.println("========================");

	}

}

package com.callor.applications;

import java.util.Scanner;

public class App_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.print("숫자입력 ( 2 ~ 9) >>");
			int keyNum = scan.nextInt();

			boolean bYes = (keyNum > 1) && (keyNum < 10);
			if (bYes) {

				System.out.println("========================");
				System.out.println("구구단" + keyNum + "단");
				System.out.println("------------------------");

				for (int i = 0; i < 8; i++) {

					int num2 = i + 2;
					System.out.print(keyNum);
					System.out.print(" X ");
					System.out.print(num2);
					System.out.print(" = ");
					System.out.println(keyNum * num2);
				} 
				System.out.println("========================");

			} else {
				System.out.println("경고");
			}
		}
	}

}

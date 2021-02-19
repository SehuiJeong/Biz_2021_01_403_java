package com.callor.applications;

import java.util.Scanner;

public class ScannerEX_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("두 개의 정수를 입력하세요");
		System.out.print("숫자1 >>");
		int num1 = scan.nextInt();

		System.out.print("숫자2 >>");
		int num2 = scan.nextInt();

		System.out.print("이름 >>");
		String strName = scan.nextLine();
		
		// Scanner 특성상 숫자를 먼저 오게 하고 나중에 문자가 오면 숫자 이후 enter 치면 문자열은 입력 못함
		// 반대의 경우 가능
		// 그걸 해결하려면 scan.nextInt 밑에 nextLine 써줘야 함

		System.out.println(num1 + num2);
		System.out.println("30" + "40");
		System.out.println(strName);
	}

}

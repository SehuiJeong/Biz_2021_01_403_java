package com.callor.applications;

import java.util.Scanner;

public class Score_03 {
	public static void main(String[] args) {

		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향" };

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < intKor.length; i++) {

			System.out.println(strName[i] + "의 성적을 입력");
			System.out.print("국어>>");
			intKor[i] = scan.nextInt();
			System.out.print("영어>>");
			intEng[i] = scan.nextInt();
			System.out.print("수학>>");
			intMath[i] = scan.nextInt();

		}

		System.out.println("===========================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("---------------------------");
		for (int i = 0; i < intKor.length; i++) {

			System.out.printf("%s\t%d\t%d\t%d\n",
					strName[i], intKor[i], intEng[i], intMath[i]);
		}
		System.out.println("---------------------------");
	}

}

package com.callor.applications;

import java.util.Scanner;

public class Score_02 {

	public static void main(String[] args) {

		String[] strName = new String[3];
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		Scanner scan = new Scanner(System.in);
		for (int index = 0; index < strName.length; index++) {

			System.out.println("학생이름을 입력하세요");
			System.out.print("이름");
			strName[index] = scan.nextLine();
			// 문자열 올 때 nextLine

			System.out.println("과목점수를 입력하세요");
			System.out.print("국어 >> ");
			String kor = scan.nextLine();
			intKor[index] = Integer.valueOf(kor);
			// 문자열 먼저 오면 정수형도 
			// 전부 String 변수 = scan.nextLine(); 으로 변경
			// 어쨌든 정수형이기 때문에 정수형으로 다시 바꿔줘야함
			// 그러므로 Integer.vaLueOf(String 변수이름);로 바꿔야한다.
			// Java_013의 ScannerEx 시리즈를 참고
			// 복습하고 유념하기!

			System.out.print("영어 >> ");
			String eng = scan.nextLine();
			intEng[index] = Integer.valueOf(eng);

			System.out.print("수학 >> ");
			String math = scan.nextLine();
			intMath[index] = Integer.valueOf(math);
		}
		System.out.println("=====================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("----------------------");
		
		for(int i = 0; i < intKor.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d", strName[i], intKor[i], intEng[i], intMath[i]);
			
		}
		
				
		

	}

}

package com.callor.applications;

import java.util.Scanner;

public class Score_06 {

	public static void main(String[] args) {

		String[] strSubject = new String[3];
		strSubject[0] = "국어";
		strSubject[1] = "수학";
		strSubject[2] = "영어";

		int[] intScore = new int[3];
		Scanner scan = new Scanner(System.in);

		System.out.println("각 과목의 성적을 입력하세요");
		for (int i = 0; i < 3; i++) {
			System.out.print(strSubject[i] + " >> ");
			intScore[i] = scan.nextInt();
		}
		
		int allSubject = 0;
		for(int i = 0 ; i < 3; i++) {
			allSubject += intScore[i];
		}System.out.println("과목 합계 : " + allSubject);
	}
}

package com.callor.applications;

import java.util.Scanner;

public class Score_011 {

	public static void main(String[] args) {
		
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		Scanner scan = new Scanner(System.in);
		
		// 방법 2. 학생별로 과목전체 점수 입력받기
		// for문 이용하여 만들기(학생 수가 많은 경우 이용가능)
		for(int index = 0; index < intKor.length ; index++) {
			// 변수.length 는 배열수
			
			int num = index + 1;
			// index는 학생수
			
			System.out.println(num + "번 학생 성적 입력");
			System.out.print("국어 >> ");
			intKor[index] = scan.nextInt();
			
			System.out.print("영어 >> ");
			intEng[index] = scan.nextInt();
			
			System.out.print("수학 >> ");
			intMath[index] = scan.nextInt();
			System.out.println("=========================");
			
		}

	}

}

package com.callor.applications;

import java.util.Random;

// 문제. 학생 3명의 국어, 영어, 수학 점수를 랜덤으로 돌린 후 각각 해라
// 해결법.과목을 기준으로 잡고 점수를 증가시키기
public class Score_04 {
	
	public static void main(String[] args) {
		
		int[] intKor = new int[3]; // 1.여기 배열이 3까지이므로
		int[] intEng = new int[3];
		int[] intMath = new int[3];
		String[] strName = new String[] {"홍길동", "이몽룡", "성춘향"};
		
		Random rnd = new Random();
		// random값과 별개로 저 for문은 배열을 증가시키기 위함
		for(int i = 0; i < intKor.length; i++) {
		// 2. i는 3인 배열보다 작으니까 i는 0, 1, 2까지 증가
		System.out.println(strName[i]);	
		intKor[i] = rnd.nextInt(100) + 1;
		System.out.println("국어 >> " + intKor[i]);
		
		intEng[i] = rnd.nextInt(100) + 1;
		System.out.println("영어 >> "+ intEng[i]);
		
		intMath[i] = rnd.nextInt(100) + 1;
		System.out.println("수학 >> " + intMath[i]);
		
		}
		
		System.out.println("=================================");
		System.out.print("이름\t국어\t영어\t수학\n");
		System.out.println("---------------------------------------------------");
		for(int i = 0; i < intKor.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\n", strName[i], intKor[i], intEng[i], intMath[i]);
		}
		System.out.println("----------------------------------------------------");
	}

}

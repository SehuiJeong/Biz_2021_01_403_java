package com.callor.score;

import java.util.Random;

public class Score_01 {

	public static void main(String[] args) {

		Random rnd = new Random();
		
		int[] num = new int[5];
		// 문자열형은 String 넣어준다
		String[] name = new String[] {"홍길동","이몽룡","성춘향","장녹수","임꺽정"};
		String[] address = new String[] {"서울시","익산시","남원시","한양시","함흥시"};
		String[] subject = new String[] {"국어","영어","수학"};
		
		// 각 과목의 점수는 정수형 배열로 구한다
		int arrLen = name.length;
		
		int[] intKor = new int[arrLen];
		int[] intEng = new int[arrLen];
		int[] intMath = new int[arrLen];
		
		int[] intSum = new int[arrLen];
		float[] floatAvg = new float[arrLen];
		
		// 점수는 Random클래스
		for (int i = 0; i < name.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		
			System.out.print(intKor[i] + "\t");
			System.out.print(intEng[i] + "\t");
			System.out.println(intMath[i] + "\t");
		}
		// 총점
		for(int i = 0; i < name.length; i++) {
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];
		}
		// 평균 점수
		for(int i = 0; i < name.length; i++) {
			floatAvg[i] = (float)intSum[i] / 3;
			// 유념할 것.
			// float 값을 구해야 하니까 int변수 앞에 (float) 입력해줘야 나중에 소수점 나온다
		}
		
		System.out.println("===========================================================");
		System.out.println("이름\t주소\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------------------");
		
		for(int i = 0; i <name.length; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%3.2f\n",
					name[i], address[i], intKor[i], intEng[i], intMath[i], intSum[i], floatAvg[i]);
		}
		
	}
	

}

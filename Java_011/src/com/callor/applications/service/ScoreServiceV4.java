package com.callor.applications.service;

public class ScoreServiceV4 {
	
	
	// 총점과 평균을 전달받는 2개의 매개변수가 있는 score() 메서드
	
	// 총점과 평균을 매개변수로 전달받아서 Console에 총점과 평균 출력
	
	
	public void score(int intSum, float floatAvg) {
		System.out.print("총점 :");
		System.out.println(intSum);
		System.out.print("평균 :");
		System.out.println(floatAvg);
		
		//System.out.print("총점 :" + intSum);
		//System.out.print("평균 :" + floatAvg);
	}
	
	public void print(int intKor, int intEng , int intMath) {
		// 연산, 계산부분을 처리
		// 출력부분처리
		int intSum = intKor + intEng + intMath;
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		float floatAvg = (float)intSum / 3;
		
		// double = (float)intSum1 / 3; 
		
		System.out.println("======================================================");
		System.out.println("국어\t 영어\t 수학\t 총점\t 평균\t");
		System.out.println("---------------------------------------------------------");
		System.out.println(intKor + "\t" + intEng + "\t" + intMath + "\t" + intSum + "\t" + floatAvg);
		
		
		System.out.print(intKor + "\t");
		System.out.print(intEng + "\t");
		System.out.print(intMath + "\t");
		System.out.print(intSum + "\t");
		System.out.println(floatAvg + "\t");
		
		System.out.println("======================================================");
	}
	


}

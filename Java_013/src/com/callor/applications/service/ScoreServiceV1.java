package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	// 클래스 영역에 선언된 변수들
	// 클래스 영역 : 멤버 영역
	// 인스턴스 변수
	// ScoreServiceV1 ssV1; : 클래스를 객체로 선언하고
	// = new SSV1() : 객체의 초기화
	// 인스턴스 : 객체가 초기화 되면
	// 자동으로 사용할 준비가 되는 변수들
	// 인스턴스 변수는 자동으로 되니까 = 0; 할 필요도 없음
	private Scanner scan = new Scanner(System.in);
	private int intKor;
	private int intEng;
	private int intMath;
	private int intSum;
	private float floatAvg;

	// input() method가 호출되면
	// 키보드를 통해서 국어, 영어, 수학 점수를 입력받고
	// intKor, intEng, intMath에 저장
	public void input() {

		// input() method의 멤버변수, 지역변수
		int intNum = 0;

		// input 메서드는 입력만 받는 역
		System.out.print("국어 >>"); // 순서는 sysout 먼저 그 다음이 scan.nextInt();
		intKor = scan.nextInt();
		System.out.print("영어 >>");
		intEng = scan.nextInt();
		System.out.print("수학 >>");
		intMath = scan.nextInt();
	}

	public void sum() {
		intSum = (intKor + intEng + intMath);
		
		/*
		 * intSum = intKor;
		 * intSum += intEng;
		 * intSum += intMath;
		 */
	}

	public void avg() {
		floatAvg = (float) intSum / 3;
	}

	// intKor, intEng, intMath 인스턴스 변수에
	// 저장된 값을 출력
	public void print() {
		// print 메서드는 출력만 하는 역
		System.out.println("국어:" + intKor);
		System.out.println("영어:" + intEng);
		System.out.println("수학:" + intMath);
		System.out.println("총점:" + intSum);
		
		// %3.2f : 실수값을 출력하는데
		// 정수부분 세자리, 소수점이하 두자리 출력
		// 소수점이하 세번째에서 반올림
		System.out.printf("평균: %3.2f\n", floatAvg);
	}

}

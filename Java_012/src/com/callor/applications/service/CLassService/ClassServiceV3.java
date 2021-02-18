package com.callor.applications.service.CLassService;

import java.util.Scanner;

public class ClassServiceV3 {

	// java에서는 인스턴스 변수를 private로 제한한다
	private int intNum1 = 0;
	private int intNum2 = 0;
	private Scanner scan = new Scanner(System.in);

	/*
	 * scope()에서는 1개의 숫자를 키보드에서 입력받아
	 *  변수 intNum1에 저장한다 
	 *  하지만 여기에서 선언된 intNum1은 클래스 영역에서
	 * 선언된 인스턴스변수와는 이름만 같지 완전히 다른 변수다 
	 * 따라서 scope() method가 종료된 이후에는 변수값에 접근할 수 없다.
	 * scope() method에서 선언된 intNum1변수를 지역변수라고 한다.
	 */
	public void scope() {
		System.out.print("숫자를 입력하세요");
		int intNum1 = scan.nextInt();
	}

	public void input() {
		System.out.println("숫자 1 입력하세요 >>"); // ---> 이게 프롬프트
		intNum1 = scan.nextInt();
		System.out.println("숫자 2를 입력하세요 >>"); // ---> 이게 꼭 있어야 Console 보이니까 꼭 넣어라
		intNum2 = scan.nextInt();
	}

	// 그러니까 input 안에 있는 int intNum1, 2은 자기 것만 사용하고 끝나니까 int 빼고 변수만 써서 이어줘야함

	public void algebra() {

		System.out.print(intNum1);
		System.out.print(" + ");
		System.out.print(intNum2);
		System.out.print(" = ");
		System.out.println(intNum1 + intNum2);

		System.out.printf(" %d X %d = %d \n", intNum1, intNum2, intNum1 * intNum2);
		System.out.printf(" %d - %d = %d \n", intNum1, intNum2, intNum1 - intNum2);
		System.out.printf(" %d / %d = %d \n", intNum1, intNum2, intNum1 / intNum2);

		/*
		 * print formatting 명령문 "" 안에 문자열을 작성하여 출력문을 만드는 명령문 %d(Decimal) 위치에 정수값을 대신
		 * 부착하여 출력문 생성
		 */
		System.out.printf(" %d x %d = %d \n", intNum1, intNum2, intNum1 * intNum2);
		// 그니까 첫번째 %d에 intNum1, 두번째 %d에 intNum2, 세번째 %d에 intNum1 * intNum2 입력
		// \n은 println과 같다
		// 이게 저거 sysout 사칙연산 그대로 한 것보다 간단하니 좋다

	}
}

package com.callor.start.jdk.keyinput;

import java.util.Scanner;

public class KeyInput_01 {

	// 키보드로 숫자 2개를 입력받고
	// 두 숫자의 덧셈을 계산
	public static void main(String[] args) {
		
		System.out.println(); // Console 출력문
		
		// 키보드를 사용하기 위한 객체 생성
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번쨰 숫자를 입력 >> ");
		int intNum1 = scan.nextInt(); // 이곳에 코드가 다다르면 멈춰서 사용자가 숫자를 console에 입력하기를 기다리고 있음 (그럼 enter 치고 다시 입력해야함)
		//nextInt 는 임의의 알 수 없는 정수값을 만들어 왼쪽의 변수에 저장시켜주는 역할
		
		System.out.print("두번쨰 숫자를 입력 >> ");
		int intNum2 = scan.nextInt();
		
		System.out.println( intNum1 + intNum2 );
		
	

	}

}

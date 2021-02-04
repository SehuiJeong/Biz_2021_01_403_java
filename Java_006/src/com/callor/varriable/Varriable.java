package com.callor.varriable;

public class Varriable {

	public static void main(String[] args) {
		
		/*
		 * 앞에 int는 선언하는 것
		 * 뒤에는 result나 intsum 등 이름을 붙이는 것뿐
		 * 예를 들면 mouse, mountain 이런식으로 명명하는 것
		 */
		
		// 연산하고자 하는 원래값이 저장되는 변수
		int Num1 = 0;
		int Num2 = 0;
		
		// 변수에 연산할 값을 저장하기
		Num1 = 30;
		Num2 = 40;
		
		
		// 연산결과를 저장할 변수 선언과 초기화
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		int result4 = 0;
		int result5 = 0;
		
		// 연산결과를 변수에 저장하기
		result1 = Num1 + Num2;
		result2 = Num1 * Num2;
		result3 = Num2 - Num1;
		result4 = Num2 / Num1;
		result5 = Num2 % Num1;
		
		// 변수에 저장된 결과를 Console에 출력
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		
		
	}
}

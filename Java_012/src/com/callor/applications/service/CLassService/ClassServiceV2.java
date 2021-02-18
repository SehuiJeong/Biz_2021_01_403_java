package com.callor.applications.service.CLassService;

import java.util.Random;
import java.util.Scanner;

public class ClassServiceV2 {
	
	// 클래스차원에서 선언된 변수
	// 인스턴스 변수
	//		ClassServiceV2 클래스를 사용하여
	//		(어디선가) 객체를 선언하고
	//		초기화하여
	//		인스턴스화 되었을 때부터
	//		자동으로 생성되는 변수
	//	- 현재 클래스의 모든 method에서
	//		공용으로 읽고 쓰기가 가능한 변수
	private Random rnd = new Random();
	private int sum = 0; // rnd와 sum을 인스턴스 변수라 부른다
	private Scanner scan = new Scanner(System.in);
	
	public void for_1() {
		
		// sum1 : (메서드) 지역변수, 중간가로{}까지만 있는 변수를 '(메서드)지역변수'라 부른다
		// for_1 이라는 메서드가 끝나면 이 변수(sum1)는 사라진다 (sysout까지만)
		int sum1 = 0 ; 
		// i : (for반복문) 지역변수
		// for(int...) 명령문이 끝나면 소멸
		for(int i= 0 ; i < 10 ; i++) {
			
			// num : (for 반복문) 지역변수
			// for()
			int num = i + 1; // 이건 for문의 영역을 벗어나면 사용불가능, 사라진다
			sum1 += num;
		}
		System.out.println(sum1);
	}	
		public void sum() {
			System.out.println("sum method에서의 sum =" + sum);
		}
	
	
	// 덧셈
	public void add() { // add라는 method를 선언
		// num1과 num2이 0에서 100까지 숫자 중 아무거나 입력해라
		int num1 = rnd.nextInt(100);
		int num2 = rnd.nextInt(100);
		
		sum = num1 + num2;
		System.out.print(num1);
		System.out.print(" + ");
		System.out.print(num2);
		System.out.print(" = ");
		System.out.println(sum);
	}
	// 곱셈
	public void times() {
		/*
		 * num1과 num2는 add() method에도 선언되어 있지만
		 * 선언된 method가 다르므로
		 * 이름만 같을뿐 전혀 다른 변수다
		 */
		int num1 = rnd.nextInt(100) + 1;
		int num2 = rnd.nextInt(100) + 1;
		int result = num1 * num2;
		
		System.out.print(num1);
		System.out.print("X");
		System.out.print(num2);
		System.out.print("=");
		System.out.print(result);
		
	}
	
	public void input() {
		/*
		 * Scanner를 지역변수로 선언시
		 * 
		 * input() method가 호출될 떄마다
		 * 키보드 입력을 받기 위해
		 * Scanner 클래스를 객체 만들고
		 * 사용이 끝나면 연결을 해제(끊는)하는
		 * 과정이 반복된다
		 */
		Scanner scan1 = new Scanner(System.in);
		int num1 = scan.nextInt();
	}
	
	// 나눗셈
	public void division() {
		/*
		 * Scanner를 scan 인스턴스변수로 선언
		 * 
		 * 현재 클래스(Css..V2)가 객체로 선언되고
		 *	인스턴스로 만들어질 때 한 번만
		 *  키보드에 연결된다 
		 *  (한 번만 연결하면 중간에 끊고 다시 시작했다가 연결하는 input과 다르게 연결하고 연결하고 쭉 연결된 상태)
		 *  필요에 따라 키보드 입력을 기다리는
		 *  nextInt() 메서드를 자유롭게 사용가능하다
		 *  
		 *  비용적인 측면에서 input() method보다는
		 *  효율적이다(번잡성X)
		 */
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.print(num1);
		System.out.print(" / ");
		System.out.print(num2);
		System.out.print(" = ");
		System.out.println(num1/ num2);
	}
	// 뺄셈
	public void substraction( ) {
		
	}

}

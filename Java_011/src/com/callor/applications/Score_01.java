package com.callor.applications;

import java.util.Scanner;

public class Score_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Prompt
		// scanner의 nextInt()를 사용하여
		// 키보드 입력을 받는 코드가 실행되면
		// 화면에 아무것도 없이
		// 멈춘것처럼 보이는 현상이 있는데
		// 미리 어떤 일을 할 것인지 알려주는 메시지
		System.out.print("국어 >> ");

		// Blocking 되었다. Code Blocking
		// scan.nextIn() 메서드를 호출하면
		// 코드 동작이 멈추고, 사용자가 키보드로 
		// 무엇인가 입력한 후 Enter를 누를때까지
		// 이후 코드가 실행되지 않는다.
		int kor = scan.nextInt();

		System.out.print("영어 >> ");
		int eng = scan.nextInt();

		System.out.print("수학 >> ");
		int math = scan.nextInt();

		int sum = (kor + eng + math);
		// 혹은 위의 문장을 아래와 같은 방식으로 쓸 수도 있다
		// int sum = kor;
		// sum += eng;
		// sum += math;

		// fAvg 변수는 실수형이지만
		// sum은 정수형, 3도 정수형이기 때문에
		// fAvg 변수에 저장되는 값은
		// 소수점 이하가 무조건 0으로 세팅된다.
		float fAvg = sum / 3;

		// 결과값을 실수형(float)으로 하고자 할때는
		// sum 변수 값이나,
		//		숫자 3을 실수형으로 만들어줘야 한다
		
		// 1. sum을 실수형으로 변경하고 계산하기
		// 	정수형 sum에 담긴 값을
		//			float 형 값으로 강제 형변환하여
		//			나눗셈 준비
		fAvg = (float) sum / 3; //(double)sum / 3
		
		// 2. 숫자 3을 실수형으로 만들어서 나눗셈
		// sum을 실수 3.0f로 나눗셈을 지시하면
		// sum 변수에 담긴 값은
		// 자동형변환(자동으로 실수형으로 변환된다)
		fAvg = sum / 3.0f;  //    / 3.0d
		fAvg = sum / (float)3;

		System.out.println("==================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------");
		System.out.println(kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" +  + fAvg);
		System.out.println("==================================");

	}

}

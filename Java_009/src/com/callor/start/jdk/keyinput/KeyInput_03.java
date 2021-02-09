package com.callor.start.jdk.keyinput;

import java.util.Random;
import java.util.Scanner;

public class KeyInput_03 {

	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		int num1 = rnd.nextInt(100) + 1;

		System.out.print(" 숫자입력 >> ");
		int keyNum = scan.nextInt();
		
		// 1. KeyNum < num1 이냐?
		// 		맞으면 "크다" 표시하고 종료
		if (num1 > keyNum) {
			System.out.println(num1 + "은(는)" + keyNum + "보다 크다");
		// 2. 그렇지 않으면 keyNum == num1 이냐?
		// 		맞으면 "같다" 표시하고 종료	
		} else if (num1 == keyNum) {
			System.out.println(num1 + "은(는)" + keyNum + "과 같다");
			
		// 3. 그렇지 않으면 keyNum > num1 이냐?
		// 		맞으면 "작다" 표시하고 종료	
		} else if (num1 < keyNum) {
			System.out.println(num1 + "은(는)" + keyNum + "보다 작다");
		}
	}

}

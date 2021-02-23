package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_02 {

	public static void main(String[] args) {

		int[] intNums = new int[100];
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < intNums.length; i++) {
			int num = rnd.nextInt(10) + 1;
			intNums[i] = num;
		}
		int g = 0;
	
		System.out.print("1에서 10까지 중 하나만 입력하세요 >> ");
		g = scan.nextInt();
		
		for(int position = 0; position < intNums.length; position++) {
			if (intNums[position] == g) {
				System.out.println( position + "번째에 저장되어있다");
				// 이미 배열이 있으니까
			}
		}
	}

}

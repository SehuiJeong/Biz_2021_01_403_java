package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_03 {
	
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
			if(intNums[position] == g) {
				System.out.println("최초로 나타나는 위치 번호는\t" + position);
				
				break;
				// for문 사용해서 반복되었지만
				// 최초로 나타나는 위치 번호만 보고 싶으므로
				// 무언가를 사용하여 멈추어야 해
				// 그럼 break;를 24행의 sysout을 처음 실행한 이후에 멈춰야 하니
				// sysout 이후에 break 쓰면 된다
			}
		}
	}
}

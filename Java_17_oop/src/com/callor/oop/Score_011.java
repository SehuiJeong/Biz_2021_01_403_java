package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

public class Score_011 {
	
	public static void main(String[] args) {
		
		ScoreVO scVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("학생이름을 입력하세요");
			System.out.print(">> ");
			String strName = scan.nextLine();
			scVO.strName = strName;
			
			while(true) {
				System.out.println("국어점수를 입력하세요");
				System.out.print(">> ");
				String strKor = scan.nextLine();
				try {
					int intKor = Integer.valueOf(strKor);
					scVO.intKor = intKor;
					break;
				} catch (Exception e) {
					System.out.println("국어점수는 숫자만 입력하세요");
					continue;
				}
			}
			System.out.println("영어점수를 입력하세요");
			System.out.print(">> ");
			String strKor = scan.nextLine();
			
			System.out.println("수학점수를 입력하세요");
			System.out.print(">> ");
			String strKor = scan.nextLine();
		}
	}

}

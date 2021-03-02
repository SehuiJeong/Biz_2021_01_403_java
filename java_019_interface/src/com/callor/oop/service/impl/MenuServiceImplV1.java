package com.callor.oop.service.impl;

import java.util.Scanner;

import com.callor.oop.service.MenuService;

public class MenuServiceImplV1 implements MenuService{

	/*
	 * 인스턴스 객체변수 선언 생성자에서 객체변수 초기화하여 사용할 준비
	 */
	private Scanner scan;
	public MenuServiceImplV1() {
		scan = new Scanner(System.in);
	}

	public void selectMenu() {

		while (true) {

			System.out.println("======================");
			System.out.println("카트 Menu System v1");
			System.out.println("----------------------");
			System.out.println("1. addCart");
			System.out.println("2. 카트삭제 ");
			System.out.println("3. 카트리스트 ");
			System.out.println("QUIT. 끝내기");
			// 숫자와 문자가 같이 나올 땐 나누어 처리해야함
			System.out.println("------------------------------");
			System.out.println("선택 >> ");
			String strselect = scan.nextLine();
			// 1. Q를 입력하면 끝내기
			if (strselect.equals("QUIT")) {
				System.out.println("끝내기");
				break;
			}

			// 2. Q가 아니면 숫자로 변경하여 메뉴 선택 처리
			try {
				int select = Integer.valueOf(strselect);
				if (select == 1) {
					System.out.println("1. 카트 추가");
				} else if (select == 2) {
					System.out.println("2. 카트 삭제");
				} else if (select == 3) {
					System.out.println("3. 카트 리스트");
				} else {
					System.out.println("메뉴는 1 ~ 3까지만 입력");
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println("메뉴는 QUIT(끝내기), " + " 1 ~ 3까지만 입력하라");

			}
		} // end while
	}

}

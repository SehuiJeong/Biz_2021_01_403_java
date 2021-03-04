package com.callor.shop.service;

import java.util.Scanner;

import com.callor.shop.service.impl.MenuService;

public class MenuServiceV1 implements MenuService {

	private Scanner scan;

	public MenuServiceV1() {
		scan = new Scanner(System.in);
	}

	@Override
	public Integer selectMenu() {

		while (true) {
			System.out.println("========================================");
			System.out.println("빛나라 쇼핑몰 2021");
			System.out.println("----------------------------------------");
			System.out.println("1. 장바구니 상품 담기");
			System.out.println("2. 장바구니 전체 리스트 보기");
			System.out.println("3. 구매자별 장바구니 리스트 보기");
			System.out.println("QUIT. 끝내기");
			System.out.println("========================================");
			System.out.println("선택 >> ");
			String strMenu = scan.nextLine(); // 스캔에 입력을 하면 그 순간 그 글자가 String의 변수에 저장이 된다
			if (strMenu.equals("QUIT")) {
				break;
			}
			try {

				Integer menu = Integer.valueOf(strMenu);
				if (menu >= 1 && menu <= 3) {
					return menu;
				} else {
					System.out.println("업무 선택은 1 ~ 3까지 중에 선택하세요");
				}
			} catch (Exception e) {
				System.out.println("업무 선택은 QUIT(끝내기), 1 ~ 3까지 정수만 입력할 수 있습니다");
			}

		}
		return null;
	}

}

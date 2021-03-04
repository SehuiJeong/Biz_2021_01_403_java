package com.callor.shop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.ShopVO;

public class ShopServiceV2 {

	private List<ShopVO> shoppingList;
	private Scanner scan;

	public ShopServiceV2() {
		shoppingList = new ArrayList<ShopVO>();
		scan = new Scanner(System.in);
	}

	public void inputShop() {

		System.out.println("손님이름 >> ");
		String userName = scan.nextLine();
		System.out.println("상품이름 >> ");
		String productName = scan.nextLine();

		int qty = 0;
		while (true) {
			System.out.println("수량 >> ");
			String strqty = scan.nextLine();

			try {
				qty = Integer.valueOf(strqty);
				if (qty < 1) {
					System.out.println("1개 이상 입력");
					continue;
				} else {

				}
				break;
			} catch (Exception e) {
				System.out.println("수량은 숫자로 입력");
			}

		} // end while

		int price = 0;
		while (true) {
			System.out.println("단가 >> ");
			String strPrice = scan.nextLine();
			try {
				price = Integer.valueOf(strPrice);
				if (price < 100) {
					System.out.println("100원 이상 입력");
				} else {
				}
				break;
			} catch (Exception e) {
				System.out.println("숫자로만 입력하시오.");
			}

		} 
		ShopVO sVO = new ShopVO();
		sVO.setUserName(userName);
		sVO.setProductName(productName);
		sVO.setQty(qty);
		sVO.setPrice(price);
		sVO.setTotal(qty * price);
		
		
		shoppingList.add(sVO);
	}

	// 출력하기 위한 것
	public void printShop() {

		System.out.println("* 전체 장바구니 리스트");
		System.out.println("==========================");
		System.out.println("구매인\t상품명\t단가\t수량\t합계");
		System.out.println("------------------------------------------------");

		int nSize = shoppingList.size(); // 카트리스트에 있는 물건 개수를 저장시켜서 nSize에 입력
		int count = 0;
		int sum = 0;
		for (int i = 0; i < nSize; i++) {
			System.out.printf("%s\t%7s\t%d\t%d\t%d\n", 
					shoppingList.get(i).getUserName(), 
					shoppingList.get(i).getProductName(),
					shoppingList.get(i).getPrice(),
					shoppingList.get(i).getQty(),
					shoppingList.get(i).getTotal());

			count++;
			sum += shoppingList.get(i).getTotal();

		}
		System.out.println("------------------------------------------------");
		System.out.println("합계\t" + count + "가지\t\t\t" + sum);

	}

	// 특정 손님만 계산한 것

	public void printSameName() {
		System.out.println("======================================");
		System.out.println("출력할 구매자 이름을 입력하세요");
		System.out.println("------------------------------------------------");
		System.out.print("이름 >> ");
		String userName = scan.nextLine();
		int nSize = shoppingList.size();
		int count = 0;
		int sum = 0;
		for (int i = 0; i < nSize; i++) {
			if (shoppingList.get(i).getUserName().equals(userName)) {
				System.out.printf("%s\t%7s\t%d\t%d\t%d\n",
						shoppingList.get(i).getUserName(),
						shoppingList.get(i).getProductName(),
						shoppingList.get(i).getPrice(),
						shoppingList.get(i).getQty(),
						shoppingList.get(i).getTotal());
				// %7s를 사용하는 이유 : 미리 빈칸을 만들어놓고 정렬을 가지런히 하려고, 대신 한글은 사용 못하고, 영어는 사용가능

				count++;
				sum += shoppingList.get(i).getTotal();

			}
		}
		System.out.println("------------------------------------------------");
		System.out.println("합계\t" + count + "가지\t\t\t" + sum);

	}

}

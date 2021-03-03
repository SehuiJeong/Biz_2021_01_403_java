package com.callor.shop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.ShopVO;
import com.callor.shop.service.impl.ShopService;

public class ShopServiceV1 implements ShopService {

	// 선언과 초기화를 따로 한 이유 : 컴퓨터의 효율성을 높이기 위함
	private List<ShopVO> shoppingList;
	private Scanner scan;
	
	public ShopServiceV1() {
		shoppingList = new ArrayList<ShopVO>();
		scan = new Scanner(System.in);
	}

	// 객체 협력
	// 전체 손님 수 계산한 것
	@Override
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
				if (qty <= 0) {
					System.out.println("1개 이상 입력");
					continue;
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
				if (price <= 100) {
					System.out.println("100원 초과 입력");
					continue;
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
	@Override
	public void printShop() {

		System.out.println("* 전체 장바구니 리스트");
		System.out.println("==========================");
		System.out.println("구매인\t상품명\t단가\t수량\t합계");
		System.out.println("------------------------------------------------");
		
		int nSize = shoppingList.size();
		int count = 0;
		int sum = 0;
		for (int i = 0; i < nSize; i++) {
			System.out.print(shoppingList.get(i).getUserName() + "\t");
			System.out.print(shoppingList.get(i).getProductName()+ "\t");
			System.out.print(shoppingList.get(i).getPrice()+ "\t");
			System.out.print(shoppingList.get(i).getQty()+ "\t");
			System.out.println(shoppingList.get(i).getTotal());
			
			count++;
			sum += shoppingList.get(i).getTotal();
			
			
		}
		System.out.println("------------------------------------------------");
		System.out.println("합계\t" + count + "가지\t\t\t" + sum);

	}

	// 특정 손님만 계산한 것
	@Override
	public void sameNameShop() {
		System.out.println("======================================");
		System.out.println("출력한 구매자 이름을 입력하세요");
		System.out.println("------------------------------------------------");
	
		System.out.print("이름 >> ");
		String userName = scan.nextLine();
		int nSize = shoppingList.size();
		int count = 0;
		int sum = 0;
		for (int i = 0; i < nSize; i++) {
			if(shoppingList.get(i).getUserName().equals(userName)) {
			System.out.print(shoppingList.get(i).getUserName() + "\t");
			System.out.print(shoppingList.get(i).getProductName()+ "\t");
			System.out.print(shoppingList.get(i).getPrice()+ "\t");
			System.out.print(shoppingList.get(i).getQty()+ "\t");
			System.out.println(shoppingList.get(i).getTotal());
			
			count++;
			sum += shoppingList.get(i).getTotal();
			
			}
		}
		System.out.println("------------------------------------------------");
		System.out.println("합계\t" + count + "가지\t\t\t" + sum);

	}

}

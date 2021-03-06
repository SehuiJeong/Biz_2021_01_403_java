package com.callor.shop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.ShopVO;
import com.callor.shop.service.impl.ShopService;

public class ShopServiceV1 implements ShopService {

	// 선언과 초기화를 따로 한 이유 : 컴퓨터의 효율성을 높이기 위함(메모리 관리때문에)
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
				if (qty < 1) {
					System.out.println("1개 이상 입력");
					continue;
				} else {
					
				} break;
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
				// Integer.valueOf(문자형) : 문자형을 숫자형으로 바꿔주는 용도 / 정수형을 실수형으로 만들 때도 쓰고 다양
				if (price < 100) {
					System.out.println("100원 이상 입력");
				} else {
					// else{} 대신에 continue;를 입력해도 되지만 되도록 명령어를 쓰지말자는 말이 있음
				}
				break;
			} catch (Exception e) {
				System.out.println("숫자로만 입력하시오.");
			}

		} // 1. 변경된 값을 setter로 저장하고
			ShopVO sVO = new ShopVO();
			sVO.setUserName(userName);
			sVO.setProductName(productName);
			sVO.setQty(qty);
			sVO.setPrice(price);
			sVO.setTotal(qty * price);
			
			// 2. shoppingList에 저장
			shoppingList.add(sVO);
	}

	// 출력하기 위한 것
	@Override
	public void printShop() {

		System.out.println("* 전체 장바구니 리스트");
		System.out.println("==========================");
		System.out.println("구매인\t상품명\t단가\t수량\t합계");
		System.out.println("------------------------------------------------");
		
		int nSize = shoppingList.size(); // 카트리스트에 있는 물건 개수를 저장시켜서 nSize에 입력
		int count = 0;
		int sum = 0;
		for (int i = 0; i < nSize; i++) {
			System.out.print(shoppingList.get(i).getUserName() + "\t"); // 3. getter로 아까 저장된 값을 불러옴
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
	public void printSameName() {
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
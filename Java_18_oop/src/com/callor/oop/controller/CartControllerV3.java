package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV3 {

	public static void main(String[] args) {
		
		List<CartVO> cartList = new ArrayList<CartVO>(); // CartVO가 담긴 cartList 선언
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			
		// 제목보이기	
		System.out.println("======================");
		System.out.println("장바구니");
		System.out.println("----------------------");
			
		// 입력받기
		System.out.print("구매자 성함 >> ");
		String cartUserName = scan.nextLine();
		
		System.out.print("상품명 >> ");
		String cartPName = scan.nextLine();
		
		System.out.print("수량 >> ");
		String cartQty = scan.nextLine();
		int intcartQty = Integer.valueOf(cartQty);
	
			
		System.out.print("가격 >> ");
		// 3000 이라고 입력하면 "3000"으로 입력되어
		// 문자열이다
		String cartPrice = scan.nextLine();
		// "3000" 문자열형 숫자를 정수 3000으로 변경하여
		// intPrice 변수에 저장
		int intcartPrice = Integer.valueOf(cartPrice);
		
		System.out.println("단가>> ");
		String strPrice = scan.nextLine();
		int intPrice = Integer.valueOf(strPrice);
		
		
		// 카트정보 생성
		CartVO cartVO = new CartVO(); 
		cartVO.setCartUserName(cartUserName); // 여기는 Integer.valueOf 할 필요없음(오류남)
										// 왜냐하면 Integer.valueOf는 문자열형은 숫자형으로 바꿔주는 용도
		cartVO.setCartPName(cartPName);
		cartVO.setCartQty(intcartQty);
		cartVO.setCartPrice(intcartPrice);
		
		// 카트정보 리스트에 추가하기
		cartList.add(cartVO);
		} // end for
		
		System.out.println("=======================");
		System.out.println("구매자\t상품명\t단가\t수량");
		System.out.println("-----------------------");
		
		// 배열에서는 배열.length 값을 참조하면
		//		배열의 개수를 알 수 있었다
		// List에서는 list.size() method를 호출하면
		// 		list 개수를 return 해준다
		// List의 개수가 수시로 변하기 때문에 크기가 달라진다.
		// size를 하면 List안에 개수를 세며 실행된다.
		// 그래서 int 변수에 list.size() method를 저장하고
		// 그 다음에 그 변수를 for문 안에 입력한다
		int nSize = cartList.size();
		for(int i = 0; i < nSize; i++) {
			
			System.out.printf("%s\t%s\t%d\t%d\t\n", 
					cartList.get(i).getCartUserName(),
					cartList.get(i).getCartPName(),
					cartList.get(i).getCartPrice(),
					cartList.get(i).getCartQty());
		}
		System.out.println("==========================");
	}

}

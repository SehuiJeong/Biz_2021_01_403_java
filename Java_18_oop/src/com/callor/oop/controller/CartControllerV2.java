package com.callor.oop.controller;

import com.callor.oop.model.CartVO;

public class CartControllerV2 {

	public static void main(String[] args) {

		// CartVO 클래스를 사용하여 객체배열 3개 선언
		CartVO[] cartVO = new CartVO[3]; // 클래스인 CartVO를 CartVO로 객체화시키고,
										// cartVO는 객체를 인스턴스화시킨 변수 
										// Array 형식 : ArrayYA[] arrayYA = new ArrayYA[배열 갯수];

		cartVO[0] = new CartVO();
		cartVO[0].setCartPName("초코파이");
		cartVO[0].setCartDate("2018-12-31");
		cartVO[0].setCartUserName("김똘구");
		cartVO[0].setCartPrice(5000);
		cartVO[0].setCartTotal(5000);

		System.out.println(cartVO[0].toString());

		cartVO[1] = new CartVO();
		cartVO[1].setCartPName("키치스티커");
		cartVO[1].setCartDate("2035-12-31");
		cartVO[1].setCartUserName("박은빈");
		cartVO[1].setCartPrice(6000);

		System.out.println(cartVO[1].toString());

		cartVO[2] = new CartVO();
		cartVO[2].setCartPName("캠프");
		cartVO[2].setCartDate("2021-2-29");
		cartVO[2].setCartUserName("수민");
		cartVO[2].setCartPrice(9000);

		System.out.println(cartVO[2].toString());

		// === cartVO의 개수가 3개인 상태
		// === 상품 한가지를 더 카트에 더 넣고 싶다
		cartVO = new CartVO[4]; // 배열의 크기를 말하는 명령문을 사용하면, 위의 카트와는
								// 별개로 새로운 카트를 생성함
								// 위의 코드 싹 다 날아가니 배열은 처음에 딱 입력한 코드까지만 입력가능

		cartVO[3] = new CartVO();
		cartVO[3].setCartUserName("홍길동");
		cartVO[3].setCartPName("바나나우유");

		System.out.println("===================");
		System.out.println("카트 내용");
		System.out.println("--------------------");
		for (int i = 0; i < cartVO.length; i++) {

			System.out.println(cartVO[i].toString());
		}
	}
}

package com.callor.oop.service.impl;

import com.callor.oop.service.CartService;

/*
 * 1. CartServicImplV1 클래스에서
 * 		CartService interface를 implements 했다
 * 2. 클래스이름에 오류가 발생한다.
 * 3. 해결방법으로 Add Unimpl.. methods를 실행한다
 * 4. CartService interface에 정의해둔 method가 자동으로 만들어진다.
 * 5. CartService interface를 implements 하므로써 
 * 		반드시 구현해야 할 method가 무엇인지 명확히 알 수 있다.
 * 6. CartService** 클래스에서 반드시 구현해야할 method들이 무엇인지 알 수 있고
 * 		그 method들은 이름까지 정해지는 상태가 된다.
 */
public class CartServiceImplV1 implements CartService{
 
	
	@Override
	public void inputCart() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printCart() {
		// TODO Auto-generated method stub
		
	}
	

}

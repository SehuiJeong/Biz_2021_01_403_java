package com.callor.oop;

import com.callor.oop.service.CartService;
import com.callor.oop.service.impl.CartServiceImplV2;

public class CartEx_03 {
	
	public static void main(String[] args) {
		
		// java 클래스의 장점
		// 기존의 코드를 최소한으로 변경하면서, 새 클래스를 만들어 기존의 클래스에 
		// 갖다 붙이기만 하면 된다
		CartService cServ = new CartServiceImplV2();
		cServ.inputCart();
		cServ.printCart();
		
	}

}

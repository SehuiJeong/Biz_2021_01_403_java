package com.callor.oop;

import com.callor.oop.service.CartService;
import com.callor.oop.service.impl.CartServiceImplV3;

public class CartEx_04 {
	
	public static void main(String[] args) {
		
		CartService csService = new CartServiceImplV3();
		csService.inputCart();
		csService.printCart();
	}

}

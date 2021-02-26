package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;

import com.callor.oop.model.CartVO;
import com.callor.oop.service.CartServiceV1;

public class CartControllerV5 {
	
	public static void main(String[] args) {
		
		CartServiceV1 csV1 = new CartServiceV1();
		List<CartVO> cartList = new ArrayList<CartVO>();
		
	
		csV1.inputCart();
		csV1.printCartList();
		
	}

}

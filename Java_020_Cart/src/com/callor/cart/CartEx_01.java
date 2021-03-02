package com.callor.cart;

import com.callor.cart.service.CartService;
import com.callor.cart.service.MenuService;
import com.callor.cart.service.impl.CartServiceV1;
import com.callor.cart.service.impl.MenuServiceV1;

public class CartEx_01 {
	
	public static void main(String[] args) {
		
		MenuService mService = new MenuServiceV1();
		CartService cService = new CartServiceV1();
		
		while(true) {
			Integer menu = mService.selectMenu(); // int 선언하면 if문 못쓰니까 Integer사용
			if(menu == null) {
				break;
			} else if (menu == 1) {
				cService.inputCart();
			} else if (menu == 3) {
				cService.printCart();
			} // 코드는 작고 분산시켜야 좋은 코드
		}
	}

}

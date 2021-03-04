package com.callor.shop;

import com.callor.shop.service.CartServiceV2;
import com.callor.shop.service.MenuService;
import com.callor.shop.service.Impl.CartServiceImplV2;
import com.callor.shop.service.Impl.MenuServiceImplV1;
import com.callor.shop.values.Values;

public class CartEx_03 {
	
	public static void main(String[] args) {
	
		MenuService mService = new MenuServiceImplV1();
		CartServiceV2 cService = new CartServiceImplV2();
		
		while(true ) {
			Integer menuItem = mService.selectMenu();
			if(menuItem == null) {
				break;
			} else if (menuItem == Values.MENU_INPUT) {
	
				cService.inputCart();
			}  else if (menuItem == Values.MENU_ALL_LIST) {
				
				cService.printAllCart();
			}  else if (menuItem == Values.MENU_USER_LIST) {
				cService.printUserCart();
			} else if(menuItem == Values.MENU_SAVE_CART_LIST) {
				cService.saveCartToFile();
			}
		}
		System.out.println("업무종료 퇴근이다 야호!");
	}

}

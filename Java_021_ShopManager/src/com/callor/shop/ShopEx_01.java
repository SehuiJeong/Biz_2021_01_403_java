package com.callor.shop;

import com.callor.shop.service.MenuServiceV1;
import com.callor.shop.service.ShopServiceV1;
import com.callor.shop.service.impl.MenuService;
import com.callor.shop.service.impl.ShopService;

public class ShopEx_01 {
	
	public static void main(String[] args) {
		
		MenuService mService = new MenuServiceV1();
		ShopService sService = new ShopServiceV1();
		
		while(true) {
			Integer menu = mService.selectMenu();
			if(menu == null) {
				break;
			} else if (menu == 1) {
				sService.inputShop();
			} else if (menu == 2) {
				sService.printShop();
			} else if (menu == 3) {
				sService.sameNameShop();
			} 
		}
			
		
	}

}

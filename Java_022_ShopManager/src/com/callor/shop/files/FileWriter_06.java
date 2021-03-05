package com.callor.shop.files;

import com.callor.shop.service.Impl.RndServiceImplV2;

public class FileWriter_06 {
	
	public static void main(String[] args) {
		
		// 이렇게 하면 파일 이름을 바꾸지 않고 그대로 사용할 수 있게 된다.
		String fileName = "src/com/callor/shop/files/nums_rnd.txt";
		RndServiceImplV2 rService = new RndServiceImplV2(fileName);

		rService.makeRnd();
		// rService.saveFileRnd(fileName);
		rService.saveFileRnd();
		
		
	}

}

package com.callor.shop.files;

import com.callor.shop.service.Impl.RndServiceImplV1_Answer;

public class FileWriter_07 {
	
	public static void main(String[] args) {
		
		String fileName = "src/com/callor/shop/files/score.txt";
		
		RndServiceImplV1_Answer rV1 = new RndServiceImplV1_Answer();
		rV1.makeRnd();
		rV1.saveFileRnd(fileName);
	}

}

package com.callor.applications.myclass;

public class MyGuGuWhile {
	
	public void gugu() {
		
		// 같은 클래스 안에 있으니 MyGuGuDan 써도 import 할 필요없음(자매같은 존재다)
		MyGuGuDan myGu = new MyGuGuDan();
		
		while(true) {
			myGu.gugu();
		}
	}

}

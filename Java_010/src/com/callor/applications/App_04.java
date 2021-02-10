package com.callor.applications;

import com.callor.applications.myclass.MyGuGuDan;

public class App_04 {

	public static void main(String[] args) {

		// MyGuGuDan이라는 class를 데리고 와서
		// myGu라는 객체를 선언하고
		// 암튼 이러면 gugu라는 코드를 실행할 수 있음
		// 변수와는 성질이 다름
		// 복잡한 명령문을 다른 클래스 파일에 만들어놓으면
		// 아무리 복잡한 코드도 쉽게 가져다 사용가능(이걸보고 모듈을 만든다)

		// 내가 프로젝트에 선언(정의, 만든다)한
		// MyGuGuDan 클래스에 있는 어떤 기능들을
		// 사용하기 위하여
		// 클래스를 객체로 선언하고
		// 초기화하여 준비를 하는 절차
		//
		// 이후에는 myGu 객체를 사용하여
		// 메서드들을 실행하는 코드를 사용할 수 있다
	
		MyGuGuDan myGu = new MyGuGuDan();

		// MyGuGuDan 클래스에 선언(정의, 만들기)된
		// gugu() 메서드를 실행하라
		// myGu 객체(Object, instance, 인스턴스)의
		// gugu() method를 호출한다(실행한다)
		myGu.gugu();
	}

}

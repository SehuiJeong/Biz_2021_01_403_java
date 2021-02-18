package com.callor.applications.service.CLassService;

public class ClassServiceV1 {

	/*
	 * Java 코딩을 할때
	 * 	{} 내에서 같은 이름의 변수는 2번 이상 선언 불가
	 *  class {} 내에서 같은 이름의 메서드를 2번 이상 선언불가
	 * 하지만, java에서는 
	 * 		메서드의 매개변수 개수, 타입이 다르면
	 * 		같은 이름의 메서드를 중복하여 선언할 수 있다
	 */
	public void add(int num1, int num2) { // add가 메서드야 //매개변수는 () 안에 있는거
		System.out.println(num1 + num2);
	}

	public void add(int num1, float fnum) {
		System.out.println(num1 + fnum);
	}

	public void add(double dnum, float fnum) {
		System.out.println(dnum + fnum);
		System.out.println(dnum - fnum);
		System.out.println(dnum * fnum);
		System.out.println(dnum / fnum);

	}

}

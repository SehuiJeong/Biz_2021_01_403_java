package com.callor.shop.values;

public class Values {
	
	
	/*
	 * 정적(static) 변수
	 * class의 인스턴스 변수에 static 키워드가 추가되면
	 * 클래스를 사용하여 객체를 선언, 생성하지 않고
	 * 변수에 직접 접근할 수 있다.
	 * 
	 * 이 프로젝트가 Run 될 때 JVM에 의해서
	 * 자동으로 생성되고 사용할 준비가 된다.
	 * 
	 * 프로젝트 전체에서 한 번만 생성되고
	 * 공유할 수 있다.
	 */
	public final static String dLine = "==============================================================";
	public final static String sLine = "--------------------------------------------------------------";

	/*
	 * Menu System에서 사용할 각 항목의 item 값을
	 * static 변수로 선언을 해 두었다.
	 * 
	 *  각 항목의 item 값에 따라 여러 기능을 선택해야 하는
	 *  코드가 여기저기 나타난다면 코드를 작성하면서
	 *  item값을(숫자) 일일 이 기억해야만 한다.
	 *  이러한 상황은 item값을 잘못 지정하여
	 *  논리적 오류가 발생할 소지가 많다.
	 *  
	 *  이 때 item 값들을 static 변수로 미리 만들어두고
	 *  필요한 곳에 적용을 하면
	 *  코드를 작성하는 도중에 문법적인 검사가 이루어져
	 *  논리적 오류를 피할 수 있다.
	 */
	public final static Integer MENU_START = 1;
	public final static Integer MENU_LAST = 4;
	
	public final static Integer MENU_INPUT = 1;
	public final static Integer MENU_ALL_LIST = 2;
	public final static Integer MENU_USER_LIST = 3;
	public final static Integer MENU_SAVE_CART_LIST = 4;
	public final static Integer MENU_SAVE = 4;
	
	
}

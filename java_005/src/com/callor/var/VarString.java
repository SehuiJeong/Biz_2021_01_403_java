package com.callor.var;

/*
 * 문자열형 변수
 * String
 * 
 * 코드를 변경해야할 경우
 * 최소한으로 변경하여 원하는 결과를 얻자
 * 변수를 선언하는 곳만 변경하면 된다
 */
public class VarString {
	
	public static void main(String[] args) {
		
		String str1 = "Korea";
		String str2 = "대한민국";
		
		String str3 = "Of";
		String str4 = "Korea";
		String str5 = "우리나라";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 + str3 + str4);
		System.out.println(str2 + str5);
		
			
	}

}

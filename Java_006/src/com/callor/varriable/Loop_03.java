package com.callor.varriable;

public class Loop_03 {
	public static void main(String[] args) {
		
		int num1 = 0;
		for(; num1 < 10 ;) {
			num1 += 1;
			System.out.println(num1);
		}
		System.out.println("나는 for 이후의 코드");
		
		// 1에서 100까지 처음부터 반복시키고 싶을 떄, 초기화해준다
		num1 = 0;
		for(; num1 < 100 ;) {
			num1 += 1;
			System.out.println(num1);
		}
	}

}

package com.callor.applications;

import com.callor.applications.service.CLassService.ClassServiceV5;

public class Class_07 {

	public static void main(String[] args) {

		ClassServiceV5 csV5 = new ClassServiceV5();
		float result = csV5.sum(55.2F, 33.7F); // ---> float 쓸거면 실수인 숫자 뒤에 F 꼭 붙이기

		int num1 = 3;
		long num2 = 3;

		float num3 = (float) 3.0;
		double num4 = 3.0;
	}

}

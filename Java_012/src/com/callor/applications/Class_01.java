package com.callor.applications;

import com.callor.applications.service.CLassService.ClassServiceV1;

public class Class_01 {
	
	/*
	 * == 변수 선언문, 생성(초기화)==
	 * 1. 정수형변수 num1을 선언하고
	 * 		정수 30을 할당하라
	 * 2. 앞으로 num1이라는 변수를 사용하여
	 * 		정수값을 저장하고,
	 * 		여러가지 기능을 수행할 터이니
	 * 		변수를 준비해달라 
	 */
	
	// int num1 = 0;
	// num1 = 30;
	
	public static void main(String[] args) {
	
	/*
	 *
	 * (프로젝트에) 선언되어 있는
	 * ClssServiceV1의 method들을 사용하여
	 * 코드를 실행하려고 하니
	 * 사용할 준비를 해달라
	 * 
	 * csV1 : "객체(Object)" 라고 한다.
	 * = new Css..() : 객체를 사용할 수 있도록 초기화 하기
	 * 
	 * csV1 = new Css..() : 객체를 초기화하고
	 * 		사용할 준비를 하는 상태
	 * 		이 명령이 수행된 후에는
	 * 		csv1을 인스턴스(instance)라고 한다.
	*/
	ClassServiceV1 csv = new ClassServiceV1();
	ClassServiceV1 csv_1; // 이 코드는 아직까진 실행 안 됐으나 객체상태임
	
	csv.add(9, 8);
	csv.add(9, 5F);// 혹은 (float)5
	
	double dnum = 30D; // 혹은 (double)30
	float fnum2 = 21F; // 혹은 (float)21
	csv.add(dnum, fnum2);

	
	}
}

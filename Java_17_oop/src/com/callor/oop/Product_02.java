package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_02 {

	public static void main(String[] args) {
		
		
		// VO 클래스를 배열로 선언하고
		// 사용(데이터 저장, 읽기)하려면
		// 선언된 객체배열 요소요소를 모두
		// 다시 초기화(생성)하는 과정이 필요하다
		// 이 과정이 생략되면
		// 이후 코드에서 NullPointerException이 발생한다
		ProductVO[] pVO = new ProductVO[5];
		for (int i = 0; i < pVO.length; i++) {
			pVO[i] = new ProductVO(); 

		}
		Scanner scan = new Scanner(System.in);
	
		System.out.println("=======================");
		System.out.println("쇼핑몰 상품관리 V1");
		System.out.println("-----------------------");
		
		String strN = 3 + ""; // "3"이라는 문자열로 저장
		int intN = Integer.valueOf(strN); // 문자열이 먼저 나오고 나중에 정수형 배열을 사용할 때 꼭 변경시켜야 함
		
		for (int i = 0; i < pVO.length; i++) {
			
			// 연속된 값으로 상품코드 생성
			String pCode = (i + 1) + "";
			pVO[i].strPCode = pCode;
			
			System.out.println(pCode + "번 상품정보 입력");
			pVO[i].strPCode = scan.nextLine();
			
			System.out.print("상품명 >> ");
			pVO[i].strPName = scan.nextLine();
			
			System.out.print("거래처 >> ");
			pVO[i].strDName = scan.nextLine();
			
			System.out.print("품목 >> ");
			pVO[i].strItem = scan.nextLine();
			
			System.out.print("매입단가 >> ");
			String iPrice = scan.nextLine();
			pVO[i].iPrice = Integer.valueOf(iPrice);
			
			System.out.print("매출단가 >> ");
			String oPrice = scan.nextLine();
			pVO[i].oPrice = Integer.valueOf(oPrice);
			
			pVO[i].toString();
		}

	}
}

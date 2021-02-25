package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
	
		ProductVO[] pVO = new ProductVO[5];
		for (int i = 0; i < pVO.length; i++) {
			pVO[i] = new ProductVO();

		}
	
		System.out.println("=======================");
		System.out.println("쇼핑몰 상품관리 V1");
		System.out.println("-----------------------");

		String strN = 3 + ""; // "3" 이라는 문자열로 저장
		int intN = Integer.valueOf(strN);

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

			while (true) {
				System.out.print("매입단가 >> ");
				String strIPrice = scan.nextLine();
				int intIPrice = Integer.valueOf(strIPrice);
				if (intIPrice < 0) {
					System.out.println("매입단가는 0이상 입력하세요");
				} else {
					pVO[i].iPrice = intIPrice;
					break;
				}
			}

			while(true) {
				System.out.print("매출단가 >> ");
				String oPrice = scan.nextLine();
				int intOprice = Integer.valueOf(oPrice);
				if (intOprice < 0) {
					System.out.println("매출단가는 0 이상 입니다");
				} else {
					// 정상처리되었으면
					// 단가가 0이상 입력되었으면
					// vo에 값을 저장하고
					// 다음단계로 진행
					// 현 시점의 while()은 중단하라
					pVO[i].oPrice = intOprice;
					break;
				}
			}
			pVO[i].toString();
		}
	}
}

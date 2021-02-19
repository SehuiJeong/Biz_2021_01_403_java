package com.callor.applications;

public class Score_03 {
	public static void main(String[] args) {

		// 학생 5명의 이름을 저장할 변수
		String strName_1 = "홍길동";
		String strName_2 = "이몽룡";
		String strName_3 = "성춘향";
		String strName_4 = "장녹수";
		String strName_5 = "이산";

		// 학생 5명의 국어점수를 저장할 변수
		int kor_1 = 90;
		int kor_2 = 88;
		int kor_3 = 65;
		int kor_4 = 43;
		int kor_5 = 12;

		int eng_1 = 56;
		int eng_2 = 48;
		int eng_3 = 35;
		int eng_4 = 15;
		int eng_5 = 98;

		System.out.printf("%s\t%d\t%d\n", strName_1, kor_1, eng_1);
		System.out.printf("%s\t%d\t%d\n", strName_2, kor_2, eng_2);
		System.out.printf("%s\t%d\t%d\n", strName_3, kor_3, eng_3);
		System.out.printf("%s\t%d\t%d\n", strName_4, kor_4, eng_4);
		System.out.printf("%s\t%d\t%d\n", strName_5, kor_5, eng_5);

	}

}

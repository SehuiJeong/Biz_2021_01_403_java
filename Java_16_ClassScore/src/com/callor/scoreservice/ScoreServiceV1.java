package com.callor.scoreservice;

public class ScoreServiceV1 {

	private int[] intKor;
	private int[] intEng;
	private int[] intMath;

	private int[] intSum;
	private float[] floatAvg;

	/*
	 * 3과목의 점수를 전달받아서 합산을 하고 결과를 return하는 method
	 */
	public int scoreSum(int num1, int num2, int num3) { // sum 매개변수를 Score_02와 연결해야함
		int sum = 0;
		sum = num1;
		sum += num2;
		sum += num3;
		return sum;
	}

	/*
	 * 총점 점수를 전달받고 과목수(과목수 3개라고 가정)로 나누어 return
	 */
	public float scoreAvg(int intSum) {
		return (float) intSum / 3;

	}

	/*
	 * 한 학생의 성적 데이터를 한줄에 출력
	 */
	public void scorePrint(String strName, int intKor, int intEng, int intMath, int intSum, float floatAvg) {

		System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n", strName, intKor, intEng, intMath, intSum, floatAvg);

	}

	// 이름, 국어, 영어, 수학, 총점, 평균 배열을
	// 통째로 매개변수로 전달하고
	// ssV1.print()method에서 리스트를 출력하도록

	public void print(String[] strName, int[] intKor, int[] intEng, int[] intMath, int[] intSum, float[] flaotAvg) {

		System.out.println("======================================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------------------------");
		for (int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%3.2f\n", strName[i], intKor[i], intEng[i], intMath[i], intSum[i],
					floatAvg[i]);
		}
	}
}

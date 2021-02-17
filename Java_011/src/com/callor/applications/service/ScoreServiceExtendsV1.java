package com.callor.applications.service;

import java.util.Scanner;

/*
 * 클래스의 extends(확장, 상속)
 * 
 * ScoreServiceV4 : Parent(부모) 클래스
 * ScoreServiceExtendsV1 : child (자식) 클래스
 * 
 * 단순한 extends
 * 		부모 클래스에 정의된 모든 method를
 * 		코드 한줄 추가, 수정없이 그대로 사용할 수 있다
 * 
 * 추가 extends
 * 		부모 클래스에 정의된 method와
 * 		새롭게 추가된 method가 있는
 * 		확장된 클래스의 생성
 */
public class ScoreServiceExtendsV1 // ScoreServiceExtendsV1이라는 클래스를 선언한다는 말
		extends ScoreServiceV4 {

	/*
	 * 문자열형변수 1개를 매개변수로 갖는 input() method
	 */
	
	// input이라는 변수를 메서드로 선언한 후, 다른 실행하는 파일에 보기 쉽게 적용시키기 위해 사용함
	public int input(String subject) {
		// 원래 public void 였는데 맨 밑에 return 하려고 void 지우고 int 로 수정함

		// Scanner는 키보드로부터 값을 입력받을 때 사용한다
		// 객체선언한거
		Scanner scan = new Scanner(System.in);

		// intScore라는 변수를 0(초기화)으로 선언한다.
		// intScore는 그냥 이름임 다른걸 할 땐 다른 이름 쓰면 된다.
		// 예를 들면 나이일 땐 intage나 age 이런식으로
		int intScore = 0;
		
		// while은 무제한 반복문으로서 () 안의 값이 true이면 계속 반복한다. false면 종료
		while (true) {

			// 저기 Scanner scan이 나온 이유가 바로 sysout 해서 Console에 직접 숫자를 입력할 수 있도록 도와주기 위함
			// 밑에 = scan.nextInt();는 키보드에서 숫자를 입력하고 엔터치기 전까지 기다린다
			System.out.print( subject + "점수입력 >> ");
			intScore = scan.nextInt();

			// 조건문인 if문 안에는 if, if else, else가 있다
			// 보통 조건식이 두 가지 이하일 땐 if와 if else를 사용하나 3개 이상일 땐
			// 계속 else if를 붙여준다
			// if문 안에서 해당 결과값이 나와야 하므로 if() { 안에 sysout } 을 해주어야 한다.
			// if문은 주어진 조건에 따라 다른 문장을 선택하기 위해 존재한다.
			// (뭘 맞게 입력했는지, 어떤 부분에서 오류가 났는지 선택된 문장이 알려줌)

			if (intScore < 0) {
				System.out.println( subject + "점수는 0점 이상 입력 !");
			} else if (intScore > 100) {
				System.out.println( subject + "점수는 100점 이하 입력!");
			} else {
				break; // intScore가 0 미만이며 100 초과일시엔 해당값을 멈추게 한다
			}
		}
		// System.out.println("입력한 점수 : " + intScore);
		// 최종 점수를 환산하려면 System.out.println("입력한 점수 : " + intScore);가
		// 	while 반복문 밖에 있어야 한다. 그렇게 안 하면 계속 점수가 반복해서 나오는 오류가 발생
		// intScore만 입력해도 되지만 나중에 출력시에 본인이 무슨 숫자를 입력했는지 알기위해 "입력한 점수 :" 이런 것들 설명 첨부
		// ""는 숫자가 아닌 문자를 출력하기 위해 사용
		// + 는 나란히 입력하기 위해 사용
		
		return intScore;

		// 호출한 코드에서
		// return 30; ==> int intKor에 30을 담아라
		// return 100; ==> int intKor에 100을 담아라

	}

}

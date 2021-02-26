package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

// 매번 헷갈리는 부분
// 클래스를 객체로 만들고 객체의 인스턴스 변수 부분
// 헷갈릴 경우엔 cremazer.github.io/java-Class-and-Object/ 설명참고

/*
 * 문제는 이렇다.
 * 1. ScoreVO 클래스를 객체(Object : 실재實在하는 것)로 만들고
 * 2. 키보드에서 학생 이름, 국어, 영어, 수학 성적을 입력받은 후
 * 3. 객체의 인스턴스 변수에 저장 (인스턴스화해서 나오는 것이 인스터스(객체))
 * 4. 단, 국어, 영어, 수학 점수는 50 ~ 100점까지만 입력 가능
 * 5. 점수입력 유효성 검사와 exception처리를 수행
 */

public class Score_01 {
	public static void main(String[] args) {

		ScoreVO scVO = new ScoreVO(); // 클래스명 객체명 = new 클래스명(); 
		//--> 이걸 보고 객체를 생성한다고 말함 1의 부분에 해당
		// 뜻은 : 객체(ScoreVO에 해당) 클래스의 인스턴스 변수(scVO) = 초기화한다(new ScoreVO()) 
		// --> 그리고 저 scVO가 ScoreVO 클래스의 인스턴스에 해당
		
		Scanner scan = new Scanner(System.in);

		System.out.println("===========================================");
		System.out.println("성적입력 시스템 v1");
		System.out.println("-------------------------------------------");
		

		System.out.println("학생 이름을 입력하세요");
		System.out.print(">>");
		scVO.strName = scan.nextLine();
	

		System.out.println("===========================================");
		System.out.println("성적을 입력하시오(50 이상 100 이하만)");
		System.out.println("-------------------------------------------");

		
		while(true) {
		try {
			System.out.println("국어 성적을 입력하세요");
			System.out.println(">>");
			String strKor = scan.nextLine(); // 키보드를 통해 성적 받는 부분 2에 해당
											// 키보드로 문자를 받을 때 같이 선언해주면 됨
			scVO.intKor = Integer.valueOf(strKor); // --> 여기가 3번 객체의 인스턴스(scVO 부분에 해당) 변수에 저장한다는 부분
			boolean bYes_1 = scVO.intKor < 50;
			boolean bYes_2 = scVO.intKor > 100;
			if(bYes_1 || bYes_2) {
				System.out.println("50이상 100 이하의 숫자만 입력하세요");
				continue;
			} else {
				break;
			}
		} catch (NumberFormatException e) {
			System.out.println("반드시 숫자로 입력하세요");
			continue;
		}
		
		}
		System.out.println("---------------------------------------");
		
		// 4번 단, 국어 영어, 수학점수는 50 ~ 100점까지만 입력 가능
		// 점수가 50이나 100이 넘어가면 다시 실행해야 한다 (조건문 if와 boolean을 활용)
		// 틀리면 다시 날아가지 않고 빠꾸해야하니까, continue; 를 사용하고 반복해야하므로 while문을 맨 밖에 써줌
		// 이게 국어 영어 수학 각각 성적을 입력시 제한이 있으므로
		// 한과목당 하나의 while문 써준다
		while(true) {
			try {
			System.out.println("영어 성적을 입력하세요");
			System.out.println(">>");
			String strEng = scan.nextLine();
			scVO.intEng = Integer.valueOf(strEng);
			boolean bYes_1 = scVO.intEng < 50;
			boolean bYes_2 = scVO.intEng > 100;
			if(bYes_1 || bYes_2) {
				System.out.println("50이상 100이하의 숫자만 입력하세요");
				continue;
			} else {
				break;
			}
			} catch (NumberFormatException e) {
			System.out.println("반드시 숫자를 입력하세요");
			continue;
			}
		}
		System.out.println("-------------------------------------------------");
		
		while(true) {
			try {
			System.out.println("수학성적을 입력하세요");
			System.out.println(" >> ");
			String strMath = scan.nextLine();
			scVO.intMath = Integer.valueOf(strMath);
			boolean bYes_1 = scVO.intMath < 50;
			boolean bYes_2 = scVO.intMath > 100;
			if(bYes_1 || bYes_2) {
				System.out.println("50이상 100이하의 숫자만 입력하세요");
				continue;
			} else {
				break;
			}
			} catch (NumberFormatException e) {
				System.out.println("반드시 숫자를 입력하세요");
				continue;
			}
		}
		System.out.println("=============================================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("----------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\n", scVO.strName, scVO.intKor, scVO.intEng, scVO.intMath);
		}
	}

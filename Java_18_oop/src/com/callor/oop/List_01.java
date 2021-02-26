package com.callor.oop;

import java.util.ArrayList;
import java.util.List;

public class List_01 {

	public static void main(String[] args) {

		/*
		 * List
		 * 배열과 성질이 유사한 java의 클래스
		 * 개수가 정해지지 않은(최초는 0개) 배열을
		 * 		생성하는 것과 같다
		 */
		ArrayList<String> books = new ArrayList<String>(); // 기초 방식, 객체를 선언한 이름 = 초기화
		List<String> strNames = new ArrayList<String>(); // 세련된 방식
		// strNames 리스트 :
		// strNames라는 리스트를 만든다. 개수가 정해지지 않은 배열을 만드는 것과 같다
		
		// books 리스트에 저장된 데이터들 중에서
		// 0번 위치에 저장된 데이터를 Console에 출력하라
		try {
			System.out.println("여기는 add하기 전");
			System.out.println(books.get(0)); // arrayList하면 프롬프트시 getter 써줘야한다
		} catch (Exception e) {
			
		}
		
		// books 리스트에 도서명 "추가하기" :
		// List에 add() method를 사용하여 값을 "추가"하면
		// 자동으로 개수가 추가되면서 데이터가 저장된다
		// 저장시에는 add 써줘야하고 객체.add("내용물 이름")
		books.add("자바프로그래밍");
		books.add("자바의 정석");
		books.add("그리스로마신화"); // 여기까지는 books는 내용물을 3개 갖는 배열이된다. 추가하면 n개씩 늘어남.
		
		// books 리스트에 저장된 데이터들 중에서
		// 0번 위치에 저장된 데이터를 Console에 출력하라
		// System.out.println(books.get(0)); // arrayList하면 프롬프트시엔 getter 써줘야한다
											// 객체.get(저장위치 숫자)						
		try {
			 System.out.println("add 한 후");
			 System.out.println(books.get(0));
			 System.out.println(books.get(1));
			 System.out.println(books.get(2));
		} catch (Exception e) {
					
		}
	}

}

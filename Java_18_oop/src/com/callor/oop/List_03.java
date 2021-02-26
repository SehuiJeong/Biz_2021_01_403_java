package com.callor.oop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_03 {

	public static void main(String[] args) {
		
		// java 프로젝트에서 List 객체를 생성하기 
		// List 클래스를 사용하여 객체를 선언하고
		//			ArrayList() 생성자를 호출하여
		//			객체를 초기화 한다
		// 선언하는 클래스곳과 생성하는 클래스가 다르다
		List<String> strList1 = new ArrayList<String>();
		
		// list형은 바뀌어도 되는데 
		List<Integer> intList; // --> 저 상태는 선언만 하고 사용못함
		intList = new ArrayList<Integer>();
		intList = new LinkedList<Integer>();
		intList = new Vector<Integer>();
		
		// ArrayList는 Arraylist가 이름에 같으니 그것만 오류가 안 남(나머지 싹 다 오류)
		ArrayList<Integer> intArrayList;
		intArrayList = new ArrayList<Integer>();
		// intArrayList = new LinkedList<Integer>();
		// intArrayList = new Vector<Integer>();
		
		// 보통은 정수형으로 만들면 나중에 float형 사용 못해
		int[] num = new int[3];
		// num = float[3];
		
		
	}
}

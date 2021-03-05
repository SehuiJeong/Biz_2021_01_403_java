package com.callor.score.service.impl;


import com.callor.score.service.MenuService;
import com.callor.score.values.Values;

public class MenuScoreImpl implements MenuService{
	
	public static void main(String[] args) {
		
	}

	@Override
	public Integer selectMenu() {
		
		System.out.println(Values.dLine);
		System.out.println("빛나라 고교 성적처리 시스템");
		System.out.println(Values.sLine);
		System.out.printf("%d. 학생성적 점수생성\n", Values.MENU_INPUT);
		return null;
		
	}

}

package com.callor.shop.service;

/*
 * interface는 클래스를 선언하기 위한
 * 1. 설계도와 길잡이 역할을 한다
 * 2. 이후에도 클래스를 업그레이드 하기 위하여
 * 		새로 만들어 프로젝트에 적용할 때
 * 		기존 코드의 수정을 최소화 하기 위한 역할도 한다
 */
public interface MenuService {

	public Integer selectMenu();
}

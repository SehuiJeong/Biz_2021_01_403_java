package com.callor.applications.service.CLassService;

import java.util.Scanner;

public class ClassServiceV7 {
	
	/*
	 * 정수 1개를 매개변수 dan에 전달받아
	 * 구구단 출력
	 */
	public void multiple (int dan) {
		
		System.out.println("==========================");
		System.out.printf("%d단 구구단\n", dan);
		System.out.println("-------------------------");
	
				for(int i = 1; i < 10; i++) {
					System.out.printf("%d X %d = %d\n", dan, i, dan*i);
				}
			}
	}


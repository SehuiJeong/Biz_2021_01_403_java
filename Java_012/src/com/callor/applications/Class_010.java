package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.CLassService.ClassServiceV7;

public class Class_010 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClassServiceV7 csV7 = new ClassServiceV7();
		System.out.println("2단 ~ 9단까지");
		
		for(int i = 2; i < 10 ; i++) {
		csV7.multiple(i);
		}

	}

}

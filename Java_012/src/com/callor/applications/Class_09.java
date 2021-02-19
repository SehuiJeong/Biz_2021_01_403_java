package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.CLassService.ClassServiceV7;

public class Class_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClassServiceV7 csV7 = new ClassServiceV7();

		System.out.print("2 ~ 9까지 >>");
		int dan = scan.nextInt();

		csV7.multiple(dan);
	}

}

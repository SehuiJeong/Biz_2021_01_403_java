package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.primeservice.PrimeServiceV1;

public class Prime_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PrimeServiceV1 psV1 = new PrimeServiceV1();

		int keyNum = 0;
		System.out.println("숫자를 입력해보세요");
		System.out.print(" >> ");
		keyNum = scan.nextInt();

		psV1.prime(keyNum);

	}

}

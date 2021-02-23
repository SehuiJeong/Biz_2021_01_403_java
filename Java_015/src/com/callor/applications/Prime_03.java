package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.primeservice.PrimeServiceV2;

public class Prime_03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		
		System.out.println("2이상의 소수 입력");
		System.out.print(" >> ");
		int keyNum = scan.nextInt();
	
		int result = psV2.prime(keyNum);
		if(result < 0 ) {
			System.out.println(keyNum + "는 소수가 아님");
		} else {
			System.out.println(keyNum + "소수");
		}
	}

}

package boo;

import java.util.Random;

public class Remaster {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int intRndNum = rnd.nextInt();
		
		System.out.println(intRndNum);
		
		// 0 ~ ( 10 - 1 ) 중에서 한 개의 수를 만들어라
		intRndNum = rnd.nextInt(10);
		System.out.println(intRndNum);
		System.out.println("====================");
		
		// 100 까지 숫자를 5의 배수를 기점으로 나누어라
		for(int i = 0; i < 100 ; i++) {
			int num = i + 1;
			System.out.print(num + "\t");
			if( num % 5 == 0 ) {
				System.out.println();
			}
		}
		System.out.println("===========");
		for(int i = 0 ; i < 100 ; i++) {
			// 0 ~ 99 까지 중 임의 수 1개를 만들어
			// 변수 num에 저장하라
			// (+1) : 1 ~ 100 중 임의 수 한 개를 만들어
			//		변수 num에 저장해라
			
			int num = rnd.nextInt(100) + 1;
			System.out.println(num + "\t");
			if( ( i + 1) % 5 == 0 ) {
				System.out.println();
			}
		}
		
		
	}

}

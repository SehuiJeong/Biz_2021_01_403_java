package com.callor.applications.primeservice;

public class PrimeServiceV2 {

	// 정수형 매개변수 1개를 갖는 prime() method 생성
	public int prime(int num) { // <-- 얘가 매개변수  // return 값을 사용하려면 public void가 아니라 public 뒤에 int 달아야 함

		// num 값이 소수이면 return num
		// 아니면 return -1
		
		// if(소수이면) return num;
		// else return -1;
		for(int pos = 2; pos < num; pos++) {
			// true이면 소수가 아니다
			boolean bYes = num % pos == 0; // 이 말이 소수가 아니라는 말
			if (bYes) {
				// prime() method 실행을 중단하고
				// main() method에게 -1을 되돌려줘라
				return -1;
			}
		}
		// num값이 소수여서 for() 반복문을 모두 수행하고
		// 여기에 다다르면 num 값을 그대로 return하라
		return num;
		}
}

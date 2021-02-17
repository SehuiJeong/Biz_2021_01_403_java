package com.callor.start;

public class Loop_02 {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i += 1) {

		}

		int num = 0;
		num = num + 1;
		num += 1;
		num = +1; // 이 코드는 사용하지 말 것
		num++; // num 변수를 1증가 시켜라
		++num; // 단항연산자

		num = num - 1;
		num -= 1;
		num--;
		--num;
		for (int i = 0; i < 10; i++) {

		}
		// i값이 100부터 시작하여 i <0 까지
		// 1씩 감소하면서 반복한다.
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}

		// ★을 10행으로 나열하기

		for (int t = 0; t < 10; t++) {

			for (int j = 0; j < 10; j++) {
				System.out.print("★");
			}
			System.out.println("");
			// 여기에서 j는 ★에 해당하고 t는 행에 해당한다
			// 그러니까 t가 0으로 시작하면 t는 ★이 10까지 수행해야 한다.
			// 왜냐하면 ★은 for문 t 안에 있으니까
			// 그런식으로 t가 0에서 9가 될 때까지, ★도 함께 해준다.
			// 총 별은 100개가 된다.
		}

		// ★을 1로 시작해서 8행까지 늘어남에 따라 별의 갯수도 순차적으로 더해가라(난이도★★★)

		for (int t1 = 0; t1 < 8; t1++) {
			// 세로 8칸에 입력할 for문을 작성
			for (int j2 = 0; j2 <= t1; j2++) {
				System.out.print("★");
				// ★을 가로로 증가시키는 반복문(println이 아닌 print)
			}
			System.out.println("");
		}
		// ★을 이용해 거꾸로 삼각형 만들기
		
		for (int t2 = 8 ; t2 > 0 ; t2--) {
			for (int j3 = 0 ; j3 < t2 ; j3++) {
				System.out.print("★");
			}
			System.out.println();
		}

	}

}

package com.callor.applications;

public class Numbers_02 {
	
	public static void main(String[] args) {
		
		int num1 = 33;
		int num2 = 77;
		
		// temp라는 변수를 하나 초기화 시킨다
		int temp = 0;
		
		// 이게 뭐에 대한 개념을 정확하게 알아야 하냐면
		// '='의 성질을 파악하면 알 수 있음 
		// = 은 오른쪽 값을 왼쪽값에 백업
		// intNum2를 temp값에 복사하면 temp값이 77되고
		// 1. (임시)로 사용할 temp를 만들고
		// 2. num2 변수값을 복사해둔다(백업)
		temp = num2;
		
		// 3. num2변수에 num1의 값을 복사
		// num2 == num1 상태가 된다
		// 33을 num2에 복사
		// num2는 33으로 변경
		num2 = num1;
		
		// 4. 임시로(temp == 77)에 백업해둔 num2의 값을
		//		temp == 77
		//		num1에 복사
		//		num1 == 77
		num1 = temp;
		
		// 5. num1과 num2의 값이 서로 바뀐다
		//	변수값의 swap 코드
		
		System.out.println("intNum1 = " + num1);
		System.out.println("intNum2 = " + num2);
	
	}

}

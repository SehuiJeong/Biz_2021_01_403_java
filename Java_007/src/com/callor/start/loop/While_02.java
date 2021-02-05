package com.callor.start.loop;

public class While_02 {
	
	public static void main(String[] args) {
	
	int count = 0;
	
	while(count++ < 10 ) {
		// 일단 ++는 무시하고 count 우선 계산
		// sysout한 후 count 값에 ++ 를 붙여준다
		System.out.println(count);
	}
	
	count = 0;
	while(count < 10) {
		System.out.println(++count);
	}
	
	// 1
	System.out.println(count++);
	// 풀어쓰면
	System.out.println(count);
	count += 1;
	
	// 2
	System.out.println(++count);
	// 풀어쓰면
	count++;
	System.out.println(count);
	
	
	}

}

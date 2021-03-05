package com.callor.shop.service.Impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class RndServiceImplV1 { // service 클래스엔 서비스만 하니까 스스로 출력 못하도록 main() method 쓰지않기
	// 지역 변수만 사용하기

	String numsFile = "src/com/callor/shop/files/nums.txt";

	Random rnd = new Random();
	int[] nums = new int[100];
	
	// 생성자 method: return값, void 이런 거 다 필요없음
	public RndServiceImplV1() {
		
	}
	
	public void makeRnd() {
		// nums.txt에 numsFile을 집어넣겠다
		
		// 숫자들을 한 줄에 5개씩, 콜론으로 구분
		// if나 for문을 이용하여 5개씩 나올 때마다 줄 나누기
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(1000) + 1;
			
			if (nums.length % 5 == 0) {
				System.out.printf("%d:", nums[i]);
			}
		}
	}

	public void saveFileRnd() {

		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(numsFile);
			printer = new PrintWriter(fileWriter);

			for (int n : nums) {
				printer.println(n);
			}

			printer.close();
			fileWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

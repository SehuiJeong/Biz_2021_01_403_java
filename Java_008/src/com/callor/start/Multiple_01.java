package com.callor.start;

public class Multiple_01 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 0;
		for (i = 0; i < 100; i++) {

			boolean bYes = (i + 7) % 3 == 0;
			if (bYes) {

				sum += (i + 7);
				System.out.println(i + 7);

			}

		}
		System.out.println(sum);
	}

}

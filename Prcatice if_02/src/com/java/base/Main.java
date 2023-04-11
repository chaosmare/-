package com.java.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Declare
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		String message = "";
		
		// Input
		System.out.print("숫자를 입력하세요 :");
		number = scanner.nextInt();
		
		// Process
		
		if (number == 0 ) {
			message = "입력하신 숫자" + number + "(은)는 짝수입니다.";
		}else if (number != 0) {
			message = "입력하신 숫자" + number + "(은)는 홀수입니다.";
		}
		
		// Output
		
		System.out.println(message);
	}

}

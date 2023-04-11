package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// if 응용 연습. Declare
		Scanner scanner = new Scanner(System.in);
		int user = 0; // 사용자 금액 입력. 
		String message = ""; // 출력값 멘트 
		
		// Input 
		System.out.print("금액을 입력하세요! : ");
		user = scanner.nextInt();
		
		// Process
		
		
		if (user >= 8000) {
			message = "너무 비쌉니다.";
		}else if (user >= 5000) {
			message = "조금 비쌉니다.";
		}else if (user >= 3000) {
			message = "적당한 금액입니다.";
		}else {
			message = "싼 편입니다.";
		}
		
		// Output
		System.out.println(message);
		
	}

}

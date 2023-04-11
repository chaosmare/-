package com.java.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 선언문 
		Scanner scanner = new Scanner(System.in);
		int result = 0, 
		String message = "";
		
		System.out.println("점수를 입력하세요 : ");
		result = scanner.nextInt();
		
		
		if (result > 100 || result < 0) {
			System.out.println("잘못된 입력값입니다. ");
		}else if (result >= 90) {
			System.out.println("점수가 ");
		}else if (result >= 80 || result < 89) {
			
		}
		
		
	
		
		
		
		
		

	}

}

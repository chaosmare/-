package com.java.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		String grade = "";
		
		System.out.println("점수를 입력하세요 :");
		score = scanner.nextInt();
		
		if(score>100 || score<0) {
			System.out.println("점수를 잘못 입력하셨습니다.");
			return;}
		else {
			switch (score / 10) {
		case 10:
			grade = "A";
			break;
		case 9:
			grade = "B";
			break;
		case 8:
			grade = "C";
			break;
		default:
			grade = "D";
			break;
			}
		System.out.println("점수가" + score + "여서" + grade + "학점 입니다");
			}
//		if(num1 % 2 == 0) {
//			System.out.println("Even");
//		}else {
//			System.out.println("Odd");
//		} 
		 
//	switch(num1 % 2) {
//	case 0:
//		System.out.println("Even");
//		break;
//	case 1:
//		System.out.println("Odd");
//		break;
//		default:
//		break;
		
			
	}
}

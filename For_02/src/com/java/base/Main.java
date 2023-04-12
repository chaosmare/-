package com.java.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 사용자가 입력한 숫자로 구구단을 구성.

//		Scanner scanner = new Scanner(System.in);
//		int num = 0;
//		
//		System.out.println("숫자를 입력해주세요 :");
//		num = scanner.nextInt();
//		
//		for(int i=1; i<=9; i++) {
//			System.out.println(num + " X " + i = " = " (num*1));
//		}

		// 구구단 전체 출력
//		for(int dan = 2; dan <= 9; dan++) {
//			if(dan % 2 == 0) {
//				System.out.println("-----" + dan + "단-----");
//				for(int num = 1; num <=9; num++) {
//					if(num % 2 == 0) {
//					 
//					System.out.println(dan + "X" + num + "=" + (dan*num));
//					}else {
//						System.out.println(dan + "x*" + "=" + (dan*num));
//					// 구구단 전체 출력중 홀수인 경우에는 곱해지는 수를 * 로 표시하기

//		for(int dan=2; dan<=9; dan++) {
//			for(int num=1; num <= 9; num++) {
//				System.out.println(dan + "X" + (num % 2 == 0 ? num :  "*") + "=" + (dan*num));
//	
//				
//				
//				
//				}
		// 구구단 표기를 엑셀식으로 하기 
		
//		for (int dan = 2; dan <= 9; dan++) {
//			for (int num = 1; num <= 9; num++) {
//				System.out.print(dan + "x" + num + "=" + (dan * num));
//				System.out.print("\t");
//				if (num == 9) {
//					System.out.println();
//				}
//		for(int a = 2; a < 10; a++) {
//			System.out.print("2 X" + a + " = " + (2*a) + "\t");
//			System.out.print("3 X" + a + " = " + (3*a) + "\t");
//			System.out.print("4 X" + a + " = " + (4*a) + "\t");
//			System.out.print("5 X" + a + " = " + (5*a) + "\t");
//			System.out.print("6 X" + a + " = " + (6*a) + "\t");
//			System.out.print("7 X" + a + " = " + (7*a) + "\t");
//			System.out.print("8 X" + a + " = " + (8*a) + "\t");
//			System.out.println("9 X" + a + " = " + (9*a) + "\t");
//									{
//		for(int a = 2; a < 10; a ++) {
//			System.out.println(a + " x " + (2 *= ));
//		for(int a = 2; a <= 9; a ++) {
//			for(int b = 1; b <= 9; b++) {
//				if(b % 2 == 0) {
//					System.out.print(a + " x " + "*" + " = " + (a*b));
//				}else {
//					System.out.print(a + " x " + b + " = " + (a*b));
//				}	
//				
//				System.out.print("\t");
//				if(b==9) {
//					System.out.println();
//				}
//		for (int i = 2; i <= 9; i++) {
//            String line = "";
//            for (int j = 1; j <= 9; j++) {
//              
//            System.out.println(line);
//        }
		// 구구단 홀수의 값은 다 없애기 
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if((i*j) % 2 == 0) {
					System.out.println(i + " x " + j + " = " + (i*j)+ "\t");
				}else {
					System.out.print("\t");
				}
			
			}
			System.out.println();
		}
		
	}
	
}
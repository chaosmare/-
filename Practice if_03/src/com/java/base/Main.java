package com.java.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 선언문 
		Scanner scanner = new Scanner(System.in);
		int kor = 0, eng = 0, mat = 0, ave = 0;
		String reskor = "", reseng = "", resmat = "";
		
		System.out.print("국어 점수를 입력하세요. :");
		kor = scanner.nextInt();
		System.out.print("영어 점수를 입력하세요. :");
		eng = scanner.nextInt();
		System.out.print("수학 점수를 입력하세요. :");
		mat = scanner.nextInt();
		
		if (kor < 0 || eng < 0 || mat < 0) {
			System.out.println("다시 입력하세요. ");
		}else {
			ave = (kor + eng + mat) / 3;
		}
		if (kor > 100 || eng > 100 || mat > 100) {
			System.out.println("다시 입력하세요. ");
		}else {
			ave = (kor + eng + mat) / 3;
		}
		
		if (kor > ave) {
			reskor = "국어점수는 평균보다 높습니다. ";
		}else if (kor < ave) {
			reskor = "국어점수는 평균보다 낮습니다. ";
		}else {
			reskor = "국어점수는 평균입니다. ";
		}
		
		if (eng > ave) {
			reseng = "영어점수는 평균보다 높습니다. ";
		}else if (eng < ave) {
			reseng = "영어점수는 평균보다 낮습니다. ";
		}else {
			reseng = "영어점수는 평균입니다. ";
		}
		
		if (mat > ave) {
			resmat = "수학점수는 평균보다 높습니다. ";
		}else if (mat < ave) {
			resmat = "수학점수는 평균보다 낮습니다. ";
		}else {
			resmat = "수학점수는 평균입니다. ";
		}
		
		System.out.println("평균점수 : " + ave + "\n" + reskor + "\n" + reseng + "\n" + resmat);
		

			
	}}

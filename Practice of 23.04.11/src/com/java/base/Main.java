package com.java.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 선언문 
		
		Scanner scanner = new Scanner(System.in);
		int scoa = 0, scob = 0, scoc = 0, ave = 0;
		String resa = "", resb = "", resc = "";
		
		System.out.println("A의 점수를 입력하세요. ");
		scoa = scanner.nextInt();
		System.out.println("B의 점수를 입력하세요. ");
		scob = scanner.nextInt();
		System.out.println("C의 점수를 입력하세요. ");
		scoc = scanner.nextInt();
		
		if(scoa <= 100 || scoa <= 0 || scob <= 100 || scob <= 0 || scoc <= 100 || scoc <= 0) {
			System.out.println("잘못된 1~99 사이 숫자를 입력하세요. ");
		}
		else {
			ave = (scoa + scob + scoc) / 3;
			System.out.println("평균점수 :" + ave);}
		// A의 점수 if
		if ( scoa < ave ) {
			resa = "A점수는 평균 이하입니다. ";}
		else if ( scoa > ave) {
			resa = "A점수는 평균 이상입니다. ";}
		else {
			resa = "A점수는 평균 입니다. ";}
		// B의 점수 if
		if ( scob < ave ) {
			resb = "B점수는 평균 이하입니다. ";}
		else if ( scob > ave) {
			resb = "B점수는 평균 이상입니다. ";}
		else {
			resb = "B점수는 평균입니다 .";}
		// C의 점수 if
		if ( scoc < ave ) {
			resc = "C점수는 평균 이하입니다. ";}
		else if ( scoc > ave ) {
			resc = "C점수는 평균 이상입니다. ";}
		else {
			resc = "C점수는 평균입니다. ";}
		
		
		
		
				
		}
			
		
		
	

}

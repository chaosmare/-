package com.java.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// BMI 공식 = 몸무게(kg) / 신장(m) * 신장(m)
		Scanner scanner = new Scanner(System.in);
		double height = 0;      // 신장 
		double weight = 0;      // 몸무게 
		double bmi = 0;			// bmi 계산 결과 
		String result = "";   	// bmi 결과 
		
		System.out.println("신장(cm)을 입력하세요 :");
		height = scanner.nextDouble() / 100;
		
		System.out.println("몸무게(kg)을 입력하세요 :");
		weight = scanner.nextDouble();
		
		if(weight <= 0 || height <= 0 || (height * 100) < weight) {
			System.out.println("잘못 입력 되었습니다. ");
		}else {
			bmi = weight / (height * height);
			
			if (bmi >= 30) {
				result = "고도비만";
			}else if(bmi >=25) {
				result = "비만";
			}else if(bmi >= 18.5) {
				result = "정상";
			}else {
				result = "저체중";
			}
			
			System.out.println("귀하는 " + result + " 입니다.");
		}
		
	}
	}
		

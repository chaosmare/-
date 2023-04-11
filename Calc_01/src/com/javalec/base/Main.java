package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 연산자 
		int i = 10;
		int j = 2;
		int k = 5;
		
		// 자동 증감 연산자 
		i = i + 1;
		i += 1;
		i++;
		System.out.println("증강 :" + i);
		
		i = i - 1;
		i -= 1;
		i--;
		System.out.println("감소 :" + i);
		
		// 동등 비교 관계 연산자 
		System.out.println(i == j);
		System.out.println(i != j);
		System.out.println(i > j);
		System.out.println(i < j);
		System.out.println(i >= j);
		System.out.println(i <= j);
		
		// 논리 연산자 
		System.out.println((i > j) && (j > k));
		System.out.println((i > j) || (j > k));
		
		// 삼항 연산자 
		System.out.println(k == 5 ? "OK" : "None");
		System.out.println(i > 100 ? "OK" : "None");
		
		/*
		 7이 3의 배수인지 판단하는 문장을 작성하시오..
		 출력물)
		 7이 3의 배수인가? 3의배수 아님 
		 */
		String decision = (7 % 3 == 0 ? "3의 배수" : "3의 배수 아님");
		
		System.out.println("7이 3의 배수인가?" + decision);
		
		
	}

}

package com.java.base;

import java.net.MulticastSocket;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1에서 10까지를 출력 
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);
		
		// 위에서 반복되는것을 하나로 통합시켜주는게 for, 지역변수이다 전역변수와는 다르다
		// 전역변수는 위에 표기된것 , for는 { } 안에서만 출력되는 지역변
		// start  end stack
		// for 안에서 썻던 밑과같이 i 는 { } 를 벗어나면 뭔지 인지를 못한다.
		// 대표적으로 구구단이 예시가 될수가 있다.
		// 규칙만 파악하면 된다. 
		
//		for(int i=1; i<=100; i++) {
//			System.out.println(i);
//			}
		
//		for(int i=2; i<=9; i+=2) {
//			System.out.println("2 X " + i + " = " + (2*i));
//		}
		
		// 1부터 10까지의 합계
		// 1+2 = x + 3 = x + 4 / 여기서 x 는 sum 이 되는거다 
		// sum 은 0부터 시작하고 i는 1부터 시작이니 처음엔 1이고 그 이후에 
		// sum 은 1이되고 i는 그 다음인 2가 되어서 다음결과값은 3이된다
		// 지금은 전역변수에 sum을 입력 했으니 sum 의 값을 인지한다.
		
//		int sum = 0;
		
//		for(int i=1; i<=10; i++) {
//			sum += i;
//		}
		
//		System.out.println("1~10까지의 합계:" + sum);
		
		// 범위의 합계 구하기 
		
//		int sum = 0;
//		int startNum = 1;
//		int endNum = 10;
//		
//		for(int i=startNum; i<=endNum; i++) {
//			sum += i;
//		}
//		
//		System.out.println(startNum + "~" + endNum + "합계:" + sum);
	
		// 범위의 합
		
//		int sum = 0;
//		int startNum = 0;
//		int endNum = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("첫번째 숫자를 입력하세요 :");
//		startNum = scanner.nextInt();
//		
//		System.out.print("두번째 숫자를 입력하세요 :");
//		endNum = scanner.nextInt();
//		
//		for(int i=startNum; i<=endNum; i++) {
//			sum += i;
//		}
//		
//		System.out.println(startNum + "~" + endNum + "합계:" + sum);
//		
//	}		
		// 1부터 100까지의 홀수와 짝수의 합계 구하기
		
//		int evenSum = 0;
//		int oddSum = 0;
//		for(int i=1; i<=100; i++) {
//			if(i % 2 == 0) {
//				evenSum += i;
//			}
//			else if(i % 1 == 0) {
//				oddSum += i; 
//			}
//			
//		}
//		
//		System.out.println("1부터 100까지의 홀수와 짝수의 합은 " + evenSum + oddSum + " 입니다.");
//		
//	}	
		// 1부터 100까지의 수중 3의배수이거나  5의 배수인 수의 합 ? 
//		int thrSum = 0;
//		int fivSum = 0;
//		for (int i=1; i<=100; i++) {
//			if(i % 3 == 0) {
//				thrSum += i;
//			}
//			if(i % 5 == 0) {
//				fivSum += i;
//			}
//			
//			
//		}
//		System.out.println("3혹은 5의 배수의 합은 " + (thrSum + fivSum) + " 입니다 .");
//		
//	}
	
//		int sum =0;
//		for(int i=1; i<=100; i++) {
//			if((i % 3 == 0) || (i % 5 == 0)) {
//				sum += 1;
//			}
//		}
//		System.out.println("1부터 100까지의 수중 3의 배수이거나 5의배수인 수의 합은 " + sum);
	
		// 범위의 합계
		/*
		// Case #1
		첫번째 숫자를 입력하세요 :1
		두번째 숫자를 입력하세요 :100
		두수의 합계는 5050 입니다.
		
		// Case #2
		첫번째 숫자를 입력하세요 :100
		두번째 숫자를 입력하세요 : 1
		두수의 합계는 5050 입니다.
		*/
		
//		int sum = 0;
//		int startNum = 0;
//		int endNum = 0;
//		
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("첫번째 숫자를 입력하세요 :");
//		startNum = scanner.nextInt();
//		System.out.print("두번째 숫자를 입력하세요 :");
//		endNum = scanner.nextInt();
//		
//		for(int i=startNum; i<=endNum; i++) {
//			sum += i;
//		}if (startNum < endNum) {
//			int num = startNum;
//			startNum = endNum;
//			endNum = num;
//		}
//		
//		System.out.println("두수의 합계는 " + sum + "입니다. ");
		
		Scanner scanner = new Scanner(System.in);
		int tempStart = 0;   // 입력받은 첫번째 숫
		int tempEnd = 0;	 // 입력받은 두번째 숫
		int startNum = 0;    // 범위 계산 첫번쨰 숫
		int endNum = 0;      // 범위 계산 두번쨰 숫
		int sum = 0;		 // 범위의 합계 결과
		int oddsum = 0; 	 // 홀수의 합계 
		int evensum = 0;	 // 짝수의 합계
		double average = 0;  // 합계의 평균
		double oddave = 0; 	 // 홀수 합계의 평균 
		double evenave = 0;	 // 짝수 합계의 평균
		int oddCount = 0;	 // 홀수의 갯수
		int evenCount = 0; 	 // 짝수의 갯수
		
		// 숫자 입력 받기 
		System.out.print("첫번째 숫자를 입력하세요 :");
		tempStart = scanner.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 :");
		tempStart = scanner.nextInt();
		
		//시작 숫자와 끝숫자를 비교해서 작은수가 첫번째수로 큰수가 두번쨰수로 정리 
		if(tempStart > tempEnd) {
			startNum = tempEnd;
			endNum = tempStart;
		}else {
			startNum = tempStart;
			endNum = tempEnd;
		}
		for (int i = startNum; i <= endNum; i++) {
			if(i % 2 == 1) {
				oddsum += i;
				oddCount++;
			}else {
				evensum += i;
				evenCount++;
			}
		
			

			//범위 합계 구하기 
			
		// 평균구하기
			average = (double)sum / (endNum - startNum + 1);
			oddave = (double)oddsum / oddCount;
			evenave = (double)evensum / evenCount;
			
		//홀수의 합계 
			
		System.out.println("두수의 합계는 " + sum + "입니다. ");
		
		
			
		System.out.println("범위의 합계는 " + sum + "입니다.");	
		System.out.println("홀수의 합계는 " + oddsum + "입니다. ");
		System.out.println("짝수의 합계는 " + evensum + "입니다. ");
		System.out.println("합계의 평균은 " + average + "입니다. ");
		System.out.println("홀수합계의 평균은 " + oddave + "입니다. ");	
		System.out.println("짝수합계의 평균은 " + evenave + "입니다. ");
			
		// 출력하기 
		
		// 홀수의 합계
		// 짝수의 합계
		// 합계의 평균
		// 홀수 합계의 평균
		// 짝수 합계의 평균
		
	}
	
		
	
	}
	
	
	
}

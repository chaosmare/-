package com.java.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String id = "";    	  // ID 
		String passwd = "";   // PassWord
		
		System.out.println("** Log In Check **");
		
		System.out.println("User ID :");
		id = scanner.next();
		
		System.out.print("Password :");
		passwd = scanner.next();
		
		if(id.equals("root") && passwd.equals("1234")) {
			System.out.println("환영합니다.");
		}else {
			System.out.println("등록된 사용자가 아닙니다.");
		}
	}

}

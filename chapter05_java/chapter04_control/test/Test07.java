package org.joonzis.test;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
//		Test09.java (switch문)
//		Q. 월을 입력 받아 일을 출력하기
//			실행 예)
//			월 입력 >> 10
//			출력 : 10월은 31일 까지 있습니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수준 입력 >>");
		int mon = sc.nextInt();
		
		
		switch (mon) {
		case 2: System.out.println(mon + "월은 28일 까지 있습니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:System.out.println(mon + "월은 30일 까지 있습니다.");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:System.out.println(mon + "월은 31일 까지 있습니다.");
			break;
		}
		
		
		
	}
}

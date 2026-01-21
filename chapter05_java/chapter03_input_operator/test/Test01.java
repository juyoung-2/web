package org.joonzis.test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
//		Test01.java
//		Q. 두 정수를 입력받아 a, b에 저장한 뒤 두 변수의 값을 교환하는 프로그램 구현
//			* 임시 변수 필요
		
		Scanner sc = new Scanner(System.in);
		
		int a = 7;
		int b = 11;
		
		int tmp = a;	// 임시 변수
		a = b;
		b = tmp;
				
		System.out.println("a : " + a + ", b : " + b);
		
	}
}

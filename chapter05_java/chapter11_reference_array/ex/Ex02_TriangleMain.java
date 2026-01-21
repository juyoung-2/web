package org.joonzis.ex;

import java.util.Scanner;

public class Ex02_TriangleMain {
	public static void main(String[] args) {
		// 1. 크기 3의 참조 배열 arr 선언
		// (Ex02_Triangle.java)
		// 2. 반복문을 이용하여 객체를 생성함과 동시에
		// 값을 초기화( 스캐너 이용 )
		// 3. 반복문을 이용하여 각 객체의 정보 출력
		/*
		 * ex) 
		 * 입력-----------
		 * 너비 입력 >> 3
		 * 높이 입력 >> 5
		 * ...(반복)
		 * 
		 * 출력-----------
		 * 너비 : 3
		 * 높이 : 5
		 * 크기 : 7.5
		 * ...(반복)
		 */
		
		Ex02_Triangle[] arr = new Ex02_Triangle[3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력----------");
		// 입력 for문
		for (int i = 0; i < arr.length; i++) {
			System.out.print("너비 입력 >>");
			int width = sc.nextInt();
			System.out.print("높이 입력 >>");
			int height = sc.nextInt();
			arr[i] = new Ex02_Triangle(width, height);
		}
		
		System.out.println("출력----------");
		// 출력
		for (int i = 0; i < arr.length; i++) {
			arr[i].output();
		}
		
	}
}

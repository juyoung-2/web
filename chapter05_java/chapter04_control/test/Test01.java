package org.joonzis.test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
//		Test01.java
//		Q. 정수를 입력 받아 "짝수", "홀수" 구분해서 출력하기
//		   3의 배수는 "3의 배수"로 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		int num = sc.nextInt();
		
		if(num % 3 ==0) {
			System.out.println("3의 배수");
		}else if(num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		
		
		
	}
}






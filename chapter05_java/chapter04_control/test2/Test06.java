package org.joonzis.test2;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
//		Test06.java
//		Q. 1부터 입력 받은 양수 사이의 모든 정수의 합계 출력하기
//		      입력 받은 수가 2이상이 아니면 다시 입력 받도록 처리
		
		Scanner sc = new Scanner(System.in);
		
		int selNum = 0; // 2이상의 값을 입력하는 변수
		int sum = 0; // 합계 변수
		
		while(true) {
			System.out.print("2이상의 정수 입력>>");
			selNum = sc.nextInt();
			if(selNum >= 2) {
				break;
			}
		}
		
		for (int i = 1; i <= selNum; i++) {
			sum += i;
		}
		
		System.out.println("1부터 "+
				selNum +"까지의 합은 : " + sum);
		
	}
}





package org.joonzis.test2;

public class Test05 {
	public static void main(String[] args) {
//		Test05.java
//		Q. 1 ~ 100 사이의 모든 정수 합계 출력하기
		
		// 전체 합계 변수
		int sum = 0;
		
		// 1. while
		int num = 1;
		while(num <= 100) {
			sum = sum + num;
			num++;
		}
		System.out.println(sum);
		
		// 2. for
		for (int i = 1; i <= 100 ; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
	}
}

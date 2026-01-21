package org.joonzis.test2;

public class Test07 {
	public static void main(String[] args) {
//		Test07.java
//		Q.두 정수를 입력 받아 두 정수 사이의 모든 정수의 
		//합계 출력하기
//		    입력 순서와 무관하게 동일한 결과를 출력 
//		 	실행 예1)
//			첫 번째 정수 >> 1
//			두 번째 정수 >> 10
//			1부터 10까지 모든 정수의 합은 55입니다.
//			실행 예2)
//			첫 번째 정수 >> 10
//			두 번째 정수 >> 1
//			1부터 10까지 모든 정수의 합은 55입니다.
		
		int start = 10;	// 시작 값
		int end = 1; 	// 종료 값
		int sum = 0; 	// 합계 변수
		
		// 방법 1 - for문 2개
		if(start < end) {
			for (int i = start; i <= end; i++) {
				sum += i;
			}
		}else {
			for (int i = start; i >= end; i--) {
				sum += i;
			}
		}
		
		// 방법 2 - 값 치환
		int tmp = 0;
		if(start > end) {
			tmp = start;
			start = end;
			end = tmp;
		}
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		
		
		System.out.println(sum);
		
	}
}

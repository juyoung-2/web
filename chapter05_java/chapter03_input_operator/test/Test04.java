package org.joonzis.test;

public class Test04 {
	public static void main(String[] args) {
//		Test04.java 
//		Q. 성별을 의미하는 정수 값(1,3:남자, 2,4:여자)을 입력받아 "남자", "여자"출력하기
//			* 1~4 사이의 값으로 입력 받기 
//			* 홀수-남자 짝수-여자
		
		// 1. 1~4 숫자를 전부 검증
//		int num = 3;
//		String gender = (num==1 || num==3) ? "남자" : "여자";
//		System.out.println("성별 : " + gender);
		
		// 2. 홀수/짝수
		int num = 3;
		String gender = (num % 2 == 1) ? "남자" : "여자";
		System.out.println("성별 : " + gender);
		
		
	}
}

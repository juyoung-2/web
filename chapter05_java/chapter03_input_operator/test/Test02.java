package org.joonzis.test;

public class Test02 {
	public static void main(String[] args) {
//		Test02.java
//		Q. 나이를 입력받아 "성인" 또는 "미성년자" 출력
		
		int age = 15;	// 나이 데이터 변수
		
		String adult = age>=20 ? "성인" : "미성년자";
		System.out.println(adult);
		
	}
}

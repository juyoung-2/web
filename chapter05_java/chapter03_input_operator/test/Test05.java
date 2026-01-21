package org.joonzis.test;

public class Test05 {
	public static void main(String[] args) {
//		Test05.java
//		Q. 하이픈 없이 주민등록번호를 입력받아 (정수, 문자열) "남자","여자" 출력하기
//			* String의 메소드 이용하기
//			* ex) charAt(), substring() 등
		
		/*
		// 1. 문자열 방식
		String sn = "9999992111111";
		// 1-1 문자열 자르기 ( charAt )
		//String gender = sn.charAt(6) == '2' ? "여자" : "남자";
		// 1-2 문자열 자르기 ( substring )
		String gender = sn.substring(6,7).equals("2") ? "여자" : "남자";
		System.out.println("성별 : " + gender);
		*/
		
		// 2. 정수 방식 ( long 활용 )
		long sn = 9999992111111L;
		System.out.println( sn / 1000000 );
		System.out.println( sn / 1000000 % 10 );
		
		
		
		
		
		
	}
}

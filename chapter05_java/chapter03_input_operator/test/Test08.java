package org.joonzis.test;

public class Test08 {
	public static void main(String[] args) {
//		Test08.java
//		Q. 특정 년도를 입력 받아서 해당 년도가 윤년인지 판단하는 프로그램 구현
//			* 윤년의 조건 : 연도가 4로 나누어지고, 100으로 나누어 떨어지지 않거나 400으로 나누어 떨어짐.
		
		int year = 2024; // 연도
        boolean isLeapYear = 
        		(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0); // 윤년 여부 판단
        
        System.out.println( isLeapYear ? year + "년은 윤년입니다." : year + "년은 윤년이 아닙니다.");
        
	}
}

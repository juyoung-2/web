package org.joonzis.ex;
/*
 * Wrapper Class
 * 	1. primitiveType -> referenceType 변경해주는 클래스
 *  2. 종류
 *  	1) int		-> Integer
 *  	2) double	-> Double
 *  	3) boolean	-> Boolean
 *  	4) char		-> Character
 *  3. 변수를 "객체"로 변환해주는 클래스
 *  4. 반드시 referenceType을 사용해야 하는 경우에 사용
 */
public class Ex06_Wrapper {
	public static void main(String[] args) {
		Integer a = new Integer(10);	// 10을 저장한 객체 a
		Integer b = new Integer(10);
		
		// 동등 비교
		System.out.println("저장된 위치 비교 : " + (a==b));
		System.out.println("저장된 내용 비교 : " + (a.equals(b)));
		
		// Auto Boxing, Auto UnBoxing
		// 값 -> 객체로 변환 : Boxing
		// 객체 -> 값으로 변환 : UnBoxing
		
		// Auto Boxing
		Integer c = 100;
		Integer d = 100;
		
		// Auto UnBoxing
		int result = c + d;
		System.out.println(result);
		
		
		
		
	}
}






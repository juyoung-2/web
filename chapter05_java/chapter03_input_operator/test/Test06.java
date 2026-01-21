package org.joonzis.test;

public class Test06 {
	public static void main(String[] args) {
//		Test06.java
//		Q. 체질량 지수(BMI) = 몸무게(kg) / 키 (m) 제곱 
//		   BMI 25 이상이면 "과체중", 20 이상이면 "정상", 20 미만이면 "저체중"
		
		// 1. 몸무게, 키 입력
		// 2. 식을 이용하여 BMI 구하기
		// 3. BMI 값을 기준으로 상태 값 구하기
		
		double weight = 72;
		double height = 165 / 100.0;		// cm -> m
		
		double bmi = weight / (height * height);
		
		
		String result = (bmi >= 25) ? "과체중" : 
							(bmi >= 20) ? "정상" : "저체중";
		
		System.out.println("체질량 지수 : " + bmi + ", 체중 범위 : " + result);
		
		
	}
}

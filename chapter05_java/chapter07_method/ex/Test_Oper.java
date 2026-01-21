package org.joonzis.ex;

// 두 값을 이용하여 사칙연산을 하는 클래스
public class Test_Oper {
	double val1, val2;

	// 1. 두 값을 전달 받아 두 값의 합을 출력하는 plus메소드
	void plus(double num1, double num2) {
		System.out.println(num1 + num2);
	}
	// 2. 전역 변수 두 개의 차를 출력하는 minus메소드
	void minus() {
		System.out.println(val1 - val2);
	}
	// 3. 전역 변수 두 개의 곱를 출력하는 multi메소드
	void multi() {
		System.out.println(val1 * val2);
	}
	// 4. 전역 변수 두 개의 나눈 값을 리턴하는 div 메소드
	double div() {
		return val1 / val2;
	}
}







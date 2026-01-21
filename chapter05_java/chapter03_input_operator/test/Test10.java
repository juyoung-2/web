package org.joonzis.test;

public class Test10 {
	public static void main(String[] args) {
//		Test10.java
//		Q. 변수 num에 숫자 데이터를 입력 받고, 각 자리수를 더하여 출력하는 프로그램 구현
//			* ex) num = 1234
//				1 + 2 + 3 + 4

		int num = 1234; // 정수
		int sum = 0;

		sum += num % 10;
		num /= 10;
		sum += num % 10;
		num /= 10;
		sum += num % 10;
		num /= 10;
		sum += num % 10;

		System.out.println("정수 " + num + "의 각 자리수 합: " + sum);

	}
}

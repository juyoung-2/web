package org.joonzis.control1;

public class Test02 {
	public static void main(String[] args) {
//		Q2. 국어 99점, 영어 80점, 수학 96점의 평균 값을 실수형과 정수형으로 출력
		
		int kor = 99;
		int eng =80;
		int math = 96;
		
		//3으로 나누는 것과 3.0으로 나누는 것과 자료형 타입이 달라진다.
		double avg = (kor + eng + math)/3.0;
		
		System.out.println("평균점수(실수형) = " + avg);
		System.out.println("평균점수(정수형) = " + (int)avg);
		
	}
}

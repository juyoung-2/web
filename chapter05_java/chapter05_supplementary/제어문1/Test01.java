package org.joonzis.control1;

public class Test01 {
	public static void main(String[] args) {
//		Q1. 세개의 과목 국어 89점, 영어 99점, 수학 78점인 점수와 총 점을 출력
		
		int kor;
		int eng;
		int mat;
		
		kor = 89;
		eng = 99;
		mat = 78;
		
		int total = kor + eng + mat;
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (double)total/3);
	}
}

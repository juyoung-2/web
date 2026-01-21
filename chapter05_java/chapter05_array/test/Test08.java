package org.joonzis.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
//		Test08.java
//		Q. 성적 관리 프로그램 
//		5명의 int형 점수를 저장하는 scores 배열을 선언하고, 점수를 
//		입력받아 최대, 최소, 평균 점수를 출력하기
//		String형 배열 names를 선언하고, 학생 5명의 이름을 초기화 한 뒤 활용
//		실행 예)
//		바트의 점수 입력 >> 70
//		리사의 점수 입력 >> 100
		
		// ** 출력 내용 **
		// 최대 점수, 최소 점수, 평균 점수
		// 제일 높은 점수를 받은 학생의 점수와 이름 출력
		
		int[] scores = new int[5];
		Scanner sc = new Scanner(System.in);
		String[] names = {"김씨", "이씨", "박씨", "최씨", "정씨"};
		
		
		for(int i=0; i<scores.length; i++) {
			System.out.print(names[i] + "의 점수 입력 >> ");
			scores[i] = sc.nextInt();
		}
		
		int max = scores[0];
		int min = scores[0];
		int sum = 0;
		double avg = 0;
		int maxIdx = 0;
		
		for(int i=0; i<scores.length; i++) {
			// 최대 값
			if(max < scores[i]) {
				max = scores[i];
				maxIdx = i;
			}
			
			// 최소 값
			if(min > scores[i]) {
				min = scores[i];
			}
			
			sum += scores[i]; // 합계
		}
		avg = (double)sum/scores.length;	// 평균
		
		System.out.println("최고 점수 : " + max + ", 학생 : " + names[maxIdx]);
		System.out.println("최저 점수 : " + min);
		System.out.println("점수 평균 : " + avg);
		
		
	}
}

package org.joonzis.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
//		Test04.java
//		1) Q. 길이가 5인 int형 배열 선언 후, 
//		2) 사용자로부터 콘솔입력 받아 
//		3) 해당 데이터 값을 모두 더해서 합을 출력하기
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		// 값 입력 for문
		for(int i=0; i<arr.length; i++) {
			System.out.print(i +"번 인덱스 값 입력 >> ");
			arr[i] = sc.nextInt();
		}
		
		// System.out.println( Arrays.toString(arr) );
		
		// 합계 구하는 for
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("배열 내 값의 총 합 : " + sum);
		
		
		
		
		
	}
}

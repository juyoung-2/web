package org.joonzis.ex;

import java.util.Arrays;

public class Ex01_primitive_array {
	public static void main(String[] args) {
		/*
		 * 1. 배열 (Array)
		 * 	1) 선언 방법
		 * 		(1) int[] arr = new int[3];		// 길이가 3인 arr 배열 생성 (추천!)
		 * 		(2) int arr[] = new int[3];		
		 * 		(3)	int[] arr;			// 참조 변수 arr 선언
		 * 			arr = new int[3]; 	// int 3개 생성 후 주소를 arr에 저장! (쓰진말자!)
		 *  2) 초기화 방법
		 *  	(1) int[] arr = new int[]{10,20,30};
		 *  	(2) int[] arr = {10, 20, 30};	// 추천!
		 *  	(3) int[] arr;					// 선언
		 *  		arr = {10, 20, 30}			// 초기화 -> 이와 같은 방식(3)은 불가능 하다!
		 *  3) 배열의 특징
		 *  	(1) 배열의 인덱스는 0부터 시작한다.
		 *  	(2) 배열이 생성되면 자동으로 0으로 초기화 된다.(숫자 타입)
		 *  	(3)	배열이 생성되면 배열의 길이를 length 필드 값으로 사용할 수 있다.
		 *  		ex) int[] arr = new arr[3];
		 *  			배열의 길이 : arr.length == 3 
		 *  	(4) 배열의 인덱스 사용범위를 벗어나면 ArrayIndexOutOfBoundsException예외
		 *   클래스가 발생된다.
		 */
		
		
		// 정수형 arr1이라는 배열명, 크기는 3으로 선언
		int[] arr1 = new int[3];	// 인덱스 0, 1, 2
		
		// 정수형 arr2라는 배열명, 값은 10, 20, 30 으로 초기화
		int[] arr2 = {10, 20, 30};
		
		// 배열 내 데이터 확인
		// 1. Arrays.toString() 메소드 사용
		// 값만 확인 용도
		System.out.println(   Arrays.toString(arr1)    );
		
		// 2. 모든 인덱스 접근 ★★★ (반복문)
		// 값을 저장하거나, 가져오기 가능
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		// 인덱스 범위를 벗어난 요소(예외 발생)
		System.out.println(arr1[3]);
		
		
		
	}
}

package org.joonzis.array;

public class Test01 {
	public static void main(String[] args) {
//		Q1. 배열의 크기가 10인 배열을 선언하고 1~10까지 순서대로 값을 넣은 후 배열과 배열의 값의 합을 출력
		
		int[] num = new int[10];
		int sum = 0;
		
		// 값 입력
		for(int i = 0; i < num.length; i++) {
			num[i] = i+1;
		}
		
		// 값 출력
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
			sum += num[i];
		}
		System.out.println("\n배열전체 요소의 합 : " + sum);
	}
}

package org.joonzis.test;

public class Test06 {
	public static void main(String[] args) {
//		Test06.java
//		Q. Test05의 배열을 이용하여 배열 내 값들의 최소, 최대값을 출력
		int[] arr = {13, 22, 3, 92, 55, 5};
		
		int max = arr[0]; 
		int min = arr[0];// 0으로 초기화 하면 0보다 작은 값을 파악하지 못함
		for(int i=0; i<arr.length; i++) {
			// 최대 값
			if(max < arr[i]) {
				max = arr[i];
			}
			
			// 최소 값
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("최대 : " + max);
		System.out.println("최소 : " + min);
		
		
		
	}
}

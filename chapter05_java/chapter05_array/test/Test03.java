package org.joonzis.test;

public class Test03 {
	public static void main(String[] args) {
//		Test03.java
//		Q. Test02.java 의 값들을 모두 더하고, 총점과 평균을 출력
		
		int[] arr = {10, 20, 50, 60, 13, 25, 97};
		
		int sum = 0;	// 합계 변수 
		double avg = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i]; 
		}
		avg = (double)sum / arr.length;
		
		System.out.println("arr의 합계 : " + sum);
		System.out.println("평균 : " + avg);

		// 평균   ==    합계/개수
		//avg = (double)sum / arr.length;
		
		
		
		
		
		
	}
}

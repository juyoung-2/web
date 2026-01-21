package org.joonzis.test2;

public class Test02 {
	public static void main(String[] args) {
//		Test02.java
//		Q. 입력받은 구구단만 출력하기( 고정 단수 가능 )
//		ex) 4X1=4
//			4X2=8
//			4X3=12
//			4X4=16
//			...
		//  4X9=36
		
		int dan = 4; // 단수 지정
		
		// 1. for
		for(int i = 1; i < 10; i++) {
			System.out.println(dan+"X"+i+"="+(dan*i));
		}
		
		// 2. while
		int num = 1;
		while(num <= 9) {
			System.out.println(dan+"X"+num+"="+(dan*num));
			num++;
		}
		
		
		
		
		
		
	}
}

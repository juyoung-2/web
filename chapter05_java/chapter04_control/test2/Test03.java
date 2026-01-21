package org.joonzis.test2;

public class Test03 {
	public static void main(String[] args) {
//		Test03.java
//		Q. 전체 구구단 출력하기_1
//		ex) 2x1 = 2
//			2x2 = 4
//			...
//			9x9 = 81
		
		// 2~9단 까지 증가하는 반복문 
		for(int dan = 2; dan <= 9; dan++) {
			// 각 단수 내 1~9까지 증가하는 반복문
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan+"X"+i+"="+(dan*i));
			}
		}
		
			
		
		
		
		
		
		
	}
}

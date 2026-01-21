package org.joonzis.ex;

import java.util.Scanner;

public class Ex03_String_array {
	public static void main(String[] args) {
		
		// 크기 3의 문자열 배열 names를 생성한 뒤
		// 스캐너로 입력받아 (입력 for문, 출력 for문 따로)
		// "입력한 이름 : OO" 출력 -> 일반/향상 for
		
		String[] names = new String[3];
		Scanner sc = new Scanner(System.in);
		
		// 입력 for문
		for (int i = 0; i < names.length; i++) {
			System.out.print("이름 입력>>");
			names[i] = sc.next();
		}
		// 출력 for문
		// 일반for, 향상for, Arrays.toString()
		for(String name : names) {
			System.out.println("입력한 이름 : " + name);
		}
		
		// 첫 번째 사람과 두 번째 사람 이름이 같은지 판단
		if( names[0].equals(names[1]) ) {
			
		}
		
		
		
	}
}





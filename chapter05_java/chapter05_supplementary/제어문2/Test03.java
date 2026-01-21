package org.joonzis.control2;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
//		Q3. 정수 두개를 입력 받아 최소, 최대, 합계를 출력
//		ex)최대:100	최소:10: 합계:110
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("처음 정수를 입력해주세요 >> ");
		int a = sc.nextInt();
		System.out.print("다음 정수를 입력해주세요 >> ");
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println("최대 : " + a);
			System.out.println("최소 : " + b);
		}
		else {
			System.out.println("최대 : " + b);
			System.out.println("최소 : " + a);
		}
		 
		System.out.println("합계 : " + (a+b));
		
		sc.close();
		
	}

}

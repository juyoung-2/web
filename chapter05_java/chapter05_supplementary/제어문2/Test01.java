package org.joonzis.control2;

import java.util.Scanner;
public class Test01 {

	public static void main(String[] args) {
		//Q1. 특정 값(정수)을 입력 받아 입력 받은 값이 3의 배수인지 아닌지를 출력
		Scanner sc = new Scanner(System.in);
		
		int val = sc.nextInt();
		
		if(val % 3==0) {
			System.out.println("3의 배수 입니다.");
		}
		else {
			System.out.println("3의 배수가 아닙니다."); 
		}
			
		sc.close();
	}

}

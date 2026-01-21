package org.joonzis.test;

import java.util.Random;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		for (int i = 0; i < 100; i++) {
			System.out.print("10이상의 정수 입력 >>");
			int selNum = sc.nextInt();
			int ranNum = ran.nextInt(10);
			try {
				System.out.println(selNum / ranNum);
			} catch (Exception e) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
		
		
	}
}






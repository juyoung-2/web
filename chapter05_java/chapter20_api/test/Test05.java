package org.joonzis.test;

import java.util.Scanner;


public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		
		String lastName;
		String firstName;
		
		System.out.print("성(lastName) >> ");
		lastName = sc.next();
		System.out.print("이름(firstName) >> ");
		firstName = sc.next();
		sb1.append(lastName).append(firstName);
		
		System.out.print("성(lastName) >> ");
		lastName = sc.next();
		System.out.print("이름(firstName) >> ");
		firstName = sc.next();
		sb2.append(lastName).append(firstName);
		
		System.out.println("첫 사람의 이름 : " + sb1);
		System.out.println("첫 사람의 이름 : " + sb2);
		
		if(sb1.toString().equals(sb2.toString())) {
			System.out.println("같은 이름");
		}else {
			System.out.println("다른 이름");
		}
		
	}
}







package org.joonzis.test;

import java.util.Scanner;

public class Student {
	String name, dept, score1, score2;
	double average;
	boolean isPass;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 >> ");
		name = sc.next();
		System.out.print("학과 >> ");
		dept = sc.next();
		System.out.print("중간 점수 >> ");
		score1 = sc.next();
		System.out.print("기말 >> ");
		score2 = sc.next();
		int parseScore1 = Integer.parseInt(score1);
		int parseScore2 = Integer.parseInt(score2);
		average = (parseScore1+parseScore2) / 2.0;
		isPass = (average>=80) ? true : false;
	}
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("학과 : " + dept);
		System.out.println("평균 : " + average);
		System.out.println(isPass ? "합격" : "불합격");
	}
}






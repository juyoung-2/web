package org.joonzis.test;

import java.util.Scanner;

public class CircleMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Circle 객체를 담을 배열
		Circle[] circles = new Circle[3];
		
		// circles 배열에 객체 저장
		// 1. 개별로 담는 방법
		circles[0] = new Circle(3);
		circles[1] = new Circle(4);
		circles[2] = new Circle(5);
		
		circles[0].output();
		circles[1].output();
		circles[2].output();
		
		// 2. 반복문 이용 
		for(int i=0; i<circles.length; i++) {
			System.out.print("반지름 입력 >>");
			double r = sc.nextDouble();
			circles[i] = new Circle(r);
		}
		for(int i=0; i<circles.length; i++) {
			circles[i].output();
		}
		
		// 가장 큰 원... 가장 큰 원의 크기, 인덱스 번호
		// 최대 값 구하기
		double max = circles[0].calcArea();
		int idx = 0;	// 인덱스 변수
		for(int i=0; i<circles.length; i++) {
			if(max < circles[i].calcArea()) {
				max = circles[i].calcArea();
				idx = i;	// 가장 큰 원의 인덱스 번호 저장
			}
		}
		
		System.out.println("가장 큰 원의 인덱스 번호 : " + idx);
		System.out.println("가장 큰 원의 크기 : " + max);
		System.out.println("가장 큰 원의 정보 : " );
		circles[idx].output();
		
		
		
	}
}

package org.joonzis.ex;
/*
 * 필드
 * - int width, height
 * - boolean isSquare
 * 
 * 메소드
 * - 생성자()  	: 값 1 고정
 * - 생성자(side)
 * - 생성자(w, h)
 * - calcArea() : 크기 계산 후 리턴
 * - output() : 너비, 높이, 크기, 형태(직/정사각형) 출력
 * */

public class Ex02_Rect {
	// 필드
	int width, height;
	boolean isSquare;
	
	// 메소드
	public Ex02_Rect() {
		width = height = 1;
		isSquare = true;
	}
	public Ex02_Rect(int side) {
		width = height = side;
		isSquare = true;
	}
	public Ex02_Rect(int w, int h) {
		width = w;
		height = h;
		isSquare = (w==h) ? true : false;
	}
	int calcArea() {
		return width * height;
	}
	void output() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("크기 : " + calcArea() );
		System.out.println(isSquare ? "정사각형" : "직사각형");
	}
	
}








package org.joonzis.test;
//- 필드 : width, height
//- 메소드 : init(너비, 높이 입력), info(너비, 높이), 
//calcArea(w*h, 넓이계산(크기) 출력)
public class Rect {
	int width, height;
	
	void init() {
		width = 10;
		height = 15;
	}
	void info() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		calcArea();
	}
	void calcArea() {
		System.out.println("크기 : " + (width * height) );
	}
}

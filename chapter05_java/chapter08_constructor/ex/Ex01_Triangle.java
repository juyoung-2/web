package org.joonzis.ex;

public class Ex01_Triangle {
	int width, height;
	public Ex01_Triangle() {
		width = 1;
		height = 1;
	}
	public Ex01_Triangle(int w, int h) {
		width = w;
		height = h;
	}
	double calcArea() {
		return (width * height) / 2.0;
	}
	void output() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("크기 : " + calcArea());
	}
}

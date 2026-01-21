package org.joonzis.ex;

public class Ex01_Rect {
	private int width, height;
	private boolean isSquare;
	
	public Ex01_Rect() {
		this.width = this.height = 1;
		isSquare = true;
	}
	public Ex01_Rect(int side) {
		this.width = this.height = side;
		isSquare = true;
	}
	public Ex01_Rect(int width, int height) {
		this.width = width;
		this.height = height;
		isSquare = (width == height);
	}
	private int calcArea() {
		return width * height;
	}
	public void output() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("크기 : " + calcArea());
		System.out.println(isSquare ? "정사각형" : "직사각형");
	}
}







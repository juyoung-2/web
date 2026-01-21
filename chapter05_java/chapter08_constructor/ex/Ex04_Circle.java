package org.joonzis.ex;
/*
 * 필드
 * - int x, y : 좌표
 * - double radius : 반지름
 * 
 * 메소드
 * - 생성자() : 좌표 0,0 radius 값 1로 고정
 * - 생성자(radius) : 좌표 0,0
 * - 풀생성자
 * - calcArea() : 원의 크기 계산 후 리턴 (PI * radius * radius)
 * - calcCircum() : 원의 둘레 계산 후 리턴 (2 * PI * radius)
 * - output() : 원의 중심 좌표, 반지름, 크기, 둘레 출력
 * 
 * *** PI 구하기 -> Math.PI
 * 
 */
public class Ex04_Circle {
	int x, y;
	double radius;
	
	public Ex04_Circle() {
		x = y = 0;
		radius = 1;
	}
	public Ex04_Circle(double r) {
		x = y = 0;
		this.radius = r;
	}
	public Ex04_Circle(int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	double calcArea() {
		return radius * radius * Math.PI;
	}
	double calcCircum() {
		return 2 * radius * Math.PI;
	}
	void output() {
		System.out.println("좌표 : [" + x +"," + y + "]" );
		System.out.println("반지름 : " + radius);
		System.out.println("크기 : " + calcArea());
		System.out.println("둘레 : " + calcCircum());
	}
	
}












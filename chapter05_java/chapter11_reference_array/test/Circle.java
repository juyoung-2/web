package org.joonzis.test;
//Cricle.java 			- 필드 : double radius
//- 메소드 : Constructor, calcArea, output
public class Circle {
	double radius;
	
	public Circle() {}

	public Circle(double radius) {
		this.radius = radius;
	}
	
	double calcArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	void output() {
		System.out.println("반지름 : " + radius);
		System.out.println("크기 : " + calcArea());
	}
	
}

package org.joonzis.test;

public class Circle {
	double radius;
	Coordinate center;
	public Circle() {}
	public Circle(double radius, Coordinate center) {
		this.radius = radius;
		this.center = center;
	}
	void output() {
		System.out.println("반지름 : " + radius);
		center.output();
	}
}

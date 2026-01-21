package org.joonzis.test;

public class CoordinateCircleRingMain {
	public static void main(String[] args) {
		Coordinate coo = new Coordinate(1, 1);
		Circle inner = new Circle(10, coo);
		Circle outer = new Circle(120, coo);
		Ring ring = new Ring(inner, outer);
		ring.output();
	}
}

package org.joonzis.test;
class Coordinate{
	private int x, y;
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Coordinate) {
			Coordinate another = (Coordinate)obj;
			return  x == another.x &&
					y == another.y;
		}else {
			return false;
		}
	}
}
class Circle{
	private Coordinate center;
	private double radius;
	public Circle(Coordinate center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Circle) {
			Circle another = (Circle)obj;
			return  radius == another.radius &&
					center.equals(another.center);
		}else {
			return false;
		}
	}
}
public class Test03 {
	public static void main(String[] args) {
		
		Circle cir1 = 
				new Circle(new Coordinate(0, 0), 1.5);
		Circle cir2 = 
				new Circle(new Coordinate(0, 0), 1.5);
		
		if(cir1.equals(cir2)) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
		
	}
}









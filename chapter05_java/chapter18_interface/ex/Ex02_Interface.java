package org.joonzis.ex;
interface Shape{
	public double calcArea();
	public void output();
}
class Rect implements Shape{
	private int width, height;
	public Rect() {}
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public double calcArea() {
		return width * height;
	}
	@Override
	public void output() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("크기 : " + calcArea());
	}
}
class Circle implements Shape{
	private double radius;
	public Circle() {}
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double calcArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	@Override
	public void output() {
		System.out.println("반지름 : " + radius);
		System.out.println("크기 : " + calcArea());
	}
}
public class Ex02_Interface {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Rect(10, 20);
		shapes[1] = new Circle(3.3);
		
		shapes[0].output();
		shapes[1].output();
		
		
		
	}
}







package org.joonzis.ex;
class Shape{
	// 의미 없는 메소드(자식들 사용하려고 만듦)
	public double calcArea() {
		return 0;
	}
}
class Rect extends Shape{
	private int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public double calcArea() {
		return width * height;
	}
}
class Triangle extends Shape{
	private int width, height;
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public double calcArea() {
		return (width * height) / 2.0;
	}
}
class Circle extends Shape{
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double calcArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}
public class Ex02_polymorphism {
	public static void main(String[] args) {
		
		// 길이 3 짜리 부모 배열 선언(arr)
		// 각 인덱스에 사각형, 삼각형, 원형 클래스 객체 대입
		// 각 객체별 크기 출력
		Shape[] arr = new Shape[3];
		
		arr[0] = new Rect(10, 20);
		arr[1] = new Triangle(10, 20);
		arr[2] = new Circle(3.1);
		
		System.out.println( arr[0].calcArea() ); 
		System.out.println( arr[1].calcArea() ); 
		System.out.println( arr[2].calcArea() ); 
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println( arr[i].calcArea() ); 
		}
		
	}
}







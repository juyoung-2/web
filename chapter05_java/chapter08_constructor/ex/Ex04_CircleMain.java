package org.joonzis.ex;

public class Ex04_CircleMain {
	public static void main(String[] args) {
		Ex04_Circle c1 = new Ex04_Circle();
		c1.output();
		System.out.println("----------------");
		Ex04_Circle c2 = new Ex04_Circle(5);
		c2.output();
		System.out.println("----------------");
		Ex04_Circle c3 = new Ex04_Circle(7,8,3);
		c3.output();
		System.out.println("----------------");
		
		
	}
}

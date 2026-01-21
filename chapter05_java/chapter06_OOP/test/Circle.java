package org.joonzis.test;
//- 필드 : radius, PI, name
//- 메소드 : info
public class Circle {
	double radius;
	double PI = 3.14;
	String name;
	
	void info() {
		System.out.println("반지름 : " + radius);
		System.out.println("이름 : " + name);
		System.out.println("크기 : " + (PI*radius*radius) );
		System.out.println("둘레 : " + (2*PI*radius));
	}
}

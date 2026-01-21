package org.joonzis.test;

public class Dog {
	String name;
	String breed;
	int age;
	
	void setDog(String n, int a, String b) {
		name = n;
		age = a;
		breed = b;
	}
	void setDog(String n, int a) {
		setDog(n, a, "푸들");
//		name = n;
//		age = a;
//		breed = "푸들";
	}
	void info() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("품종 : " + breed);
	}
	
	
}

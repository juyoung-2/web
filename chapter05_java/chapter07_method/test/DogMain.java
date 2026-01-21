package org.joonzis.test;

public class DogMain {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setDog("김쿠키", 5, "말티즈");
		d1.info();
		
		System.out.println("-------");
		Dog d2 = new Dog();
		d2.setDog("개멍멍", 12);
		d2.info();
	}
}

package org.joonzis.test;

public class CarMain {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("자동차1", "흰색");
		Car car3 = new Car("자동차2", "빨강", 2023);
		
		car1.output();
		car2.output();
		car3.output();
		
		
	}
}

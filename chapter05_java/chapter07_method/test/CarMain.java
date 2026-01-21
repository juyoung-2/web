package org.joonzis.test;

public class CarMain {
	public static void main(String[] args) {
		Car myCar = new Car();
	
		myCar.setFields("봉고", "흰색", 2013);
		myCar.output();
		
		System.out.println("===========");
		
		Car myCar2 = new Car();
		myCar2.setFields("트럭", "빨강");
		myCar2.output();
		
	}
}

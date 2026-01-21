package org.joonzis.test;

import java.util.Calendar;

//필드 -String model, String color, 
//int year, boolean isNewCar
public class Car {
	String model, color;
	int year;
	boolean isNewCar;
	
	public Car() {}
	public Car(String model, String color, int year) {
		super();
		this.model = model;
		this.color = color;
		this.year = year;
		Calendar calendar = Calendar.getInstance();
		isNewCar = (year == calendar.get(Calendar.YEAR));
	}
	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
		Calendar calendar = Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);
		isNewCar = true;
	}
	
	void output() {
		System.out.println("------------");
		System.out.println("모델 : " + model);
		System.out.println("색상 :" + color);
		System.out.println("연식 : " + year);
		System.out.println(isNewCar ? "신차" : "중고차");
		System.out.println("------------");
	}
	
	
}

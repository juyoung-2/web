package org.joonzis.test;

import java.util.Calendar;

public class Car {
	String model;
	String color;
	int year;
	
	void setFields(String m, String c, int y) {
		model = m;
		color = c;
		year = y;
	}
	void setFields(String m, String c) {
		model = m;
		color = c;
		Calendar calendar = Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);
	}
	void output() {
		System.out.println("모델 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("연식 : " + year);
	}
	
	
	
	
}

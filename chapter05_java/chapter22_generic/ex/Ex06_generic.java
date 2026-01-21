package org.joonzis.ex;

import java.util.Arrays;

class Basket<T>{
	private T[] foods;
	@SuppressWarnings("unchecked")
	public Basket(int capacity) {
		foods = (T[])(new Object[capacity]);
	}
	public void add(T food) {	// setter의 역할
		for (int i = 0; i < foods.length; i++) {
			if(foods[i] == null) {
				foods[i] = food;
				break;
			}
		}
	}
	public T[] getFoods() {
		return foods;
	}
}
class Food{}
class Apple extends Food{}
class Banana extends Food{}
class Bread extends Food{}
class Computer{}
public class Ex06_generic {
	public static void main(String[] args) {
		Basket<Food> basket = new Basket<>(5);
		basket.add(new Apple());
		basket.add(new Banana());
		basket.add(new Bread());
		//basket.add(new Computer());
		
		System.out.println(Arrays.toString(basket.getFoods()));
	}
}









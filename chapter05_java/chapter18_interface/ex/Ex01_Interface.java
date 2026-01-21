package org.joonzis.ex;

interface Animal{
	// abstract public void move()로 처리된다.
	public void move();
	public void eat(String food);
}
class Dog implements Animal{
	@Override
	public void move() {
		System.out.println("강아지 산책");
	}
	@Override
	public void eat(String food) {
		System.out.println(food + "먹고");
	}
}
public class Ex01_Interface {
	public static void main(String[] args) {
		Animal a = new Dog(); 
		a.move();
		a.eat("사료");
	}
}





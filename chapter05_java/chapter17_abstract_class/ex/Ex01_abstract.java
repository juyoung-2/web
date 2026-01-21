package org.joonzis.ex;
abstract class Animal{	// 추상 클래스
	public void eat(String food) {
		System.out.println(food + "먹는다.");
	}
	abstract public void move(); // 추상 메소드
}
class Dog extends Animal{
	@Override
	public void move() {
		System.out.println("강아지 산책");
	}
}
public class Ex01_abstract {
	public static void main(String[] args) {
		//Animal a = new Animal();
		// 추상 클래스는 new 할 수 없다(객체 생성 불가 )
		Animal animal = new Dog();
		animal.eat("사료");
		animal.move();
	}
}




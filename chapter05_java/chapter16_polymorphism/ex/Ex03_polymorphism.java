package org.joonzis.ex;
class Animal{
	public void move() {}
}
class Dog extends Animal{
	@Override
	public void move() {
		System.out.println("강아지 달린다.");
	}
}
class Dolphin extends Animal{
	@Override
	public void move() {
		System.out.println("돌고래 헤엄치고");
	}
}
class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리 뛰댕기고");
	}
	public void fly() {
		System.out.println("난다");
	}
}
public class Ex03_polymorphism {
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[3];
		
		// 업캐스팅
		animals[0] = new Dog();
		animals[1] = new Dolphin();
		animals[2] = new Eagle();
		
		for (int i = 0; i < animals.length; i++) {
			animals[i].move();
		}
		
		//animals[2].fly(); 
		// 부모 클래는 fly()메소드가 없기 때문에 호출 X
		//((Eagle)animals[2]).fly(); 
		
		if(animals[2] instanceof Eagle) {
			// 다운 캐스팅
			// 1. Eagle 객체 생성
			Eagle eagle = (Eagle)animals[2];
			eagle.fly();
			
			// 2. Eagle 객체 생성 없이 자원 사용
			((Eagle)animals[2]).fly(); 
		}
		
		
		
	}
}









package org.joonzis.ex;
interface Eatable{
	public void eat();
}
class Pig{
	public void piggy() {
		System.out.println("다 먹는다.");
	}
}
class Apple extends Pig implements Eatable{
	@Override
	public void eat() {
		System.out.println("사과는 맛있어");
	}
}
class Banana extends Pig implements Eatable{
	@Override
	public void eat() {
		System.out.println("맛있는건 바나나");
	}
}
class Computer extends Pig{ }

public class Ex03_Interface {
	public static void main(String[] args) {
		
		Pig[] pigking = new Pig[3];
		
		pigking[0] = new Apple();
		pigking[1] = new Banana();
		pigking[2] = new Computer();
		
		for (int i = 0; i < pigking.length; i++) {
			pigking[i].piggy();
			
			if(pigking[i] instanceof Eatable) {
				((Eatable)pigking[i]).eat();
			}else {
				System.out.println("못 먹는다.");
			}
			
		}
		
	}
}








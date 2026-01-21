package org.joonzis.ex;
// <T> : 자료형 ex) int형 넣고 싶으면 Integer 사용
class Bag <T>{
	private T obj;
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
}
class Ball{}
class Pen{}
public class Ex02_generic {
	public static void main(String[] args) {
		Bag<Ball> bag = new Bag<Ball>();
		bag.setObj(new Ball());
		
		Ball ball = bag.getObj();
		System.out.println(ball);
		
	}
}






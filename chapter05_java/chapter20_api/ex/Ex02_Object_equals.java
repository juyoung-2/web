package org.joonzis.ex;
class Computer{
	private String model;
	private int price;
	public Computer(String model, int price) {
		this.model = model;
		this.price = price;
	}
	@Override
	public String toString() {
		return "모델 : " + model + ", 가격 : " + price;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Computer) {
			Computer another = (Computer)obj;
			return price==another.price && 
					model.equals(another.model);
		}else {
			return false;
		}
	}
}
public class Ex02_Object_equals {
	public static void main(String[] args) {
		Computer com1 = new Computer("LG", 100);
		Computer com2 = new Computer("LG", 101);
		
		// 1. == : 참조 비교( 주소 비교 )
		if(com1 == com2) {
			System.out.println("같은 컴퓨터");
		}else {
			System.out.println("다른 컴퓨터");
		}
		
		// 2. equals() : 값 비교
		if(com1.equals(com2)) {
			System.out.println("같은 컴퓨터");
		}else {
			System.out.println("다른 컴퓨터");
		}
		
		
		
		
	}
}









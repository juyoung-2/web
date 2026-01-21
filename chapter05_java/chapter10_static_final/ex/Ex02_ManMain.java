package org.joonzis.ex;

public class Ex02_ManMain {
	public static void main(String[] args) {
		Ex02_Man man = new Ex02_Man("김씨", 20);
		man.output();
		
		System.out.println("-----------------");
		
		System.out.println(man.name);
		System.out.println(man.age);
		// 인스턴스를 통한 접근 -> 비추천
		System.out.println(man.GENDER);
		// 클래스를 통한 접근 -> 추천
		System.out.println(Ex02_Man.GENDER);
		
		
	}
}

package org.joonzis.test;

public class Ring {
	Circle inner, outer;
	public Ring() {}
	public Ring(Circle inner, Circle outer) {
		this.inner = inner;
		this.outer = outer;
	}
	void output() {
		System.out.println("안쪽 원의 정보");
		inner.output();
		System.out.println("바깥쪽 원의 정보");
		outer.output();
	}
}

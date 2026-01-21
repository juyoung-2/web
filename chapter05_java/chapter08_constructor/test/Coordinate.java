package org.joonzis.test;

public class Coordinate {
	int x, y;
	
	public Coordinate() {}
	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	void output() {
		System.out.println(
			"좌표 : [" + x + ", " + y + "]"
		);
	}
}

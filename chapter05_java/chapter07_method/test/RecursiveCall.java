package org.joonzis.test;

public class RecursiveCall {
	
	static void recursive(int count) {
		if(count == 0) {
			return;
		}
		System.out.println("Hello");
		recursive(count-1);
	}
	
	public static void main(String[] args) {
		recursive(5);
	}
}

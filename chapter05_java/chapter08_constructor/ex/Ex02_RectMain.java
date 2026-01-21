package org.joonzis.ex;

public class Ex02_RectMain {
	public static void main(String[] args) {
		Ex02_Rect r1 = new Ex02_Rect();
		r1.output();
		
		System.out.println("------------");
		
		Ex02_Rect r2 = new Ex02_Rect(10);
		r2.output();
		
		System.out.println("------------");
		
		Ex02_Rect r3 = new Ex02_Rect(1, 2);
		r3.output();
	}
}

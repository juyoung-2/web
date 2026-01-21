package org.joonzis.ex;

public class Ex02_LocalMain {
	public static void main(String[] args) {
		Ex02_Local local1 = new Ex02_Local();
		local1.setLocalInfo("김씨", 70, "555555-1234567");
		local1.output();
		
		System.out.println("---------------------");
		
		Ex02_Local local2 = new Ex02_Local();
		local2.setLocalInfo("이씨", 30);
		local2.output();
		
		
	}
}

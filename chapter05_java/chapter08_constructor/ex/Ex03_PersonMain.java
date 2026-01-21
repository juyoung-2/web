package org.joonzis.ex;

public class Ex03_PersonMain {
	public static void main(String[] args) {
		Ex03_Person p1 = 
				new Ex03_Person(10, "김씨", 123.4, '남');
		p1.output();
		
		Ex03_Person p2 = new Ex03_Person();
		p2.output();
		
	}
}

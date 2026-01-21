package org.joonzis.ex;

public class Test_OperMain {
	public static void main(String[] args) {
		
		Test_Oper oper = new Test_Oper();
		oper.plus(10, 20);
		
		oper.val1 = 10;
		oper.val2 = 2;
		oper.minus();
		oper.multi();
		System.out.println( oper.div()  );
		
	}
}

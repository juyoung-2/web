package org.joonzis.ex;

public class Ex05_literal {
	public static void main(String[] args) {
		
		/*
		 * 출력할 내용
		 * 
		 * 1. A					-> char, String
		 * 2. 한					-> char, String
		 * 3. Hello World		-> String
		 * 4. 100				-> int
		 * 5. 3.141592			-> double
		 * 6. true				-> boolean
		 * 7. false
		 * 
		 * sysout 으로 값만 출력하지 말고,
		 * 변수에 담아서 해당 변수를 출력하도록
		 */
		
		
		char ch1 = 'A';
		String str1 = "A";
		String str2 = "Hello World";
		int num1 = 100;
		double num2 = 3.141592;
		boolean isTrue = true;
		boolean isCheck = ( 2 > 1);

		System.out.println(ch1);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(isTrue);
		System.out.println(isCheck);
		
	}
}

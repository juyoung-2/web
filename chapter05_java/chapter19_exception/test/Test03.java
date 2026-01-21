package org.joonzis.test;

import java.util.Scanner;

//Q3. Test03.java									   
//주민등록 번호 (하이픈 포함)를 입력 받아 출력하시오.
//주민등록번호가 14글자가 아니면 PerIDException 클래스를 이용하여 예외를 처리하시오.
//주민등록번호를 입력받기 위해 String getPerID() 메소드를 이용하시오.
class PerIDException extends Exception{
	private static final long serialVersionUID = 1L;
	public PerIDException(String message) {
		super(message);
	}
}
public class Test03 {
	static Scanner sc = new Scanner(System.in);
	
	public static String getPerID() throws PerIDException{
		System.out.print("주민등록번호 입력 (- 포함) >> ");
		String perID = sc.next();
		if(perID.length() != 14) {
			throw new PerIDException("올바른 주민등록번호가 아닙니다.");
		}
		return perID;
	}
	public static void main(String[] args) {
		try {
			String perID = getPerID();
			System.out.println("입력한 주민등록번호 : " + perID);
		} catch (PerIDException e) {
			System.out.println(e.getMessage());
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
	}
}

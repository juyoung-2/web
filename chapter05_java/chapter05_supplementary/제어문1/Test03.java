package org.joonzis.control1;

public class Test03 {
	public static void main(String[] args) {
//		Q3. num이라는 변수에 120이라는 숫자를 초기화 한 후에 이 숫자가
//		양수인지, 음수인지, 짝수인지, 홀수인지 출력
//		ex) 양수이면서 홀수입니다.
		
		int num = 120;
		
		if(num>0 && num%2==0) {
			System.out.println("양수이면서 짝수입니다.");
		}else if(num>0 && num%2!=0) {
			System.out.println("양수이면서 홀수입니다.");
		}else if(num<0 && num%2!=0) {
			System.out.println("음수이면서 홀수입니다.");
		}else {
			System.out.println("음수이면서 짝수입니다.");
		}
		
	}
}

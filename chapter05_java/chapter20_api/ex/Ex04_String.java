package org.joonzis.ex;

public class Ex04_String {
	public static void main(String[] args) {
		
		String a = "apple";
		String b = "apple";
		b = a;
		System.out.println(a==b ? "사과1개" : "사과2개");
		
		String c = new String("banana");
		String d = new String("banana");
		System.out.println(c==d ? "바나나1개" : "바나나2개");
		
		// .split()
		String sn = "000000-1234567";
		// 하이픈(-)으로 분리하여 각각 배열에 저장
		String[] snArr = sn.split("-");
		for(String s : snArr) {
			System.out.println(s); 
		}
		String today = "1980.10.21";
		String[] ymd = today.split("\\.");
		// 몇몇 특수문자는 사용 시 앞에 역슬래쉬2개(\\)를 붙여야 한다.
		// | ? * ( ) { } [ ] \ .
		for(String s : ymd) {
			System.out.println(s); 
		}
		
		// .join()
		String today2 = String.join("-", ymd);
		System.out.println(today2);
		
		// .substring()
		// .substring(시작인덱스) : 시작인덱스 부터 끝까지 출력
		// .substring(시작인덱스, 종료인덱스) : 
		//  	시작인덱스 부터 종료 인덱스 전 까지 출력
		String phone = "010-1234-5678";
		// 010  1234  5678 따로따로 출력
		String p1 = phone.substring(0,3);
		String p2 = phone.substring(4,8);
		String p3 = phone.substring(9);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		
	}
}





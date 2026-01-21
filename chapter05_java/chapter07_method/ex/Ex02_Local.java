package org.joonzis.ex;

public class Ex02_Local {
	// 필드 ( 초기 값 존재 )
	String name;		// null
	int age;			// 0
	String sn;			// null (주민등록번호)
	boolean isKorean;	// false
	
	// 메소드
	// 초기화 메소드
	void setLocalInfo(String _name, int _age, String _sn) {
		// 이름, 나이, 주민등록번호를 전달 받아 초기화
		// 주민등록번호 뒷 자리의 첫 번째 값이 1~4일 경우 한국인
		name = _name;
		age = _age;
		sn = _sn;
		// 1. charAt() => char 데이터 반환
		isKorean = sn.charAt(7) <= '4' ? true : false;
		// 2. subString() => String 데이터 반환
//		int tmp = Integer.parseInt(sn.substring(7, 8));
//		if(tmp <= 1 && tmp >= 4) {
//			isKorean = true;
//		}
	}
	void setLocalInfo(String _name, int _age) {
		// 이름, 나이를 전달 받아 초기화
		name = _name;
		age = _age;
	}
	// 출력 메소드
	void output() {
		// 이름, 나이, 주민등록번호, 한국인or외국인 출력
		// 주민등록번호가 없으면 "없음"으로 출력
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주민등록번호 : " + sn);
		System.out.println(isKorean ? "한국인" : "외국인");
	}
}






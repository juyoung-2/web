package org.joonzis.ex;

public class Ex01_RectMain {
	public static void main(String[] args) {
		
		// Rect 객체 2개 생성후 데이터 출력
		// 한 개는 width, height를 각각 입력하는 객체
		// 다른 한 개는 side 값만 입력하는 객체 
		
		// 다른 클래스를 사용하려면?
		// 1. 객체 생성 ( new~ )
		// 2. 객체.필드 , 객체.메소드()
		// 3. 객체.초기화메소드();
		// 4. 추가 적인 메소드 호출
		Ex01_Rect r1 = new Ex01_Rect();
		r1.setFields(10, 20);
		r1.output();
		
		System.out.println("--------------");
		
		Ex01_Rect r2 = new Ex01_Rect();
		r2.setFields(15);
		r2.output();
		
		
	}
}





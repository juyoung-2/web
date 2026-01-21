package org.joonzis.ex;
// StringBuffer나 StringBuilder나 똑같다
public class Ex05_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("apple");
		StringBuffer sb2 = new StringBuffer("apple");
		
		// 검색할 때 해시코드 비교 -> 같은 해시코드만 비교
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		StringBuffer sb = new StringBuffer();
		System.out.println("기본 버퍼 크기 : " + sb.capacity());
		// 버퍼 크기 확인 ( 기본 16문자 )
		
		// sb에 문자열 추가
		// .append(값)
		sb.append("Hello");
		sb.append(" Java").append(" World");
		System.out.println(sb.toString());
		
		// 삭제 .deleteCharAt(인덱스)
		StringBuffer phone = new StringBuffer();
		phone.append("010-1234-5678");
		phone.deleteCharAt(3);
		phone.deleteCharAt(7);
		System.out.println(phone.toString());
		
		
	}
}

package org.joonzis.test;

public class SingerSongMain {
	public static void main(String[] args) {
		
		// 1. Singer 객체 생성 -> 가수 이름, 배열 크기 전달
		// 2. Song 객체 생성 -> Sing 객체에 전달
		// 3. Singer 객체를 이용하여 정보 출력
		
		Singer singer = new Singer("IVE (아이브)", 2);
		
		// 노래 정보 삽입
		// 1.
		Song s1 = new Song("Kitsch", "대한민국");
		singer.setSong(s1);
		// 2.
		singer.setSong(new Song("LOVE DIVE","대한민국"));

		singer.output();
		
	}
}

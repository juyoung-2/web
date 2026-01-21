package org.joonzis.test;
//필드 - String title, String country
//메소드 - Constructor, output
public class Song {
	String title, country;
	public Song() {}
	public Song(String title, String country) {
		this.title = title;
		this.country = country;
	}
	void output() {
		System.out.println("노래 제목 : " + title);
		System.out.println("국가 : " + country);
	}
}

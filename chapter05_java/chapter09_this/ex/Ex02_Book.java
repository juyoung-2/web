package org.joonzis.ex;

public class Ex02_Book {
	String title, writer;
	int price, salesVolume;
	boolean isBestSeller;
	
	// 기본 생성자
	public Ex02_Book() {}
	// 제목, 가격 받는 생성자(저자는 "작자미상")
	public Ex02_Book(String title, int price) {
//		this(title, "작자미상", price);
		this.title = title;
		this.writer = "작자미상";
		this.price = price;
	}
	// 제목, 가격, 저자 받는 생성자
	public Ex02_Book(String title, String writer, int price) {
		this.title = title;
		this.writer = writer;
		this.price = price;
	}
	
	
}





package org.joonzis.ex;

public class Ex05_BookMain {
	public static void main(String[] args) {
		Ex05_Book book1 = new Ex05_Book();
		Ex05_Book book2 = new Ex05_Book("백설공주", 8000);
		Ex05_Book book3 = new Ex05_Book("백설공주", 8000, "디즈니");
		
		book1.setSalesVolume(100);
		book2.setSalesVolume(10000);
		book3.setSalesVolume(100);
		
		book1.output();
		System.out.println("---------------");
		book2.output();
		System.out.println("---------------");
		book3.output();
		
	}
}

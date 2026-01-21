package org.joonzis.test;
class Product{
	private String model;
	private int price;
	public Product() {}
	public Product(String model, int price) {
		this.model = model;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public int getPrice() {
		return price;
	}
}
class Tv extends Product{
	public Tv() {}
	public Tv(String model, int price) {
		super(model, price);
	}
}
class Computer extends Product{
	public Computer() {}
	public Computer(String model, int price) {
		super(model, price);
	}
}
class Customer{
	private int money;			// 체크 카드 개념
	private int startMoney;		// 처음 초기 금액
	private int numOfProduct;	// 인덱스 변수(배열에서 사용)
	private Product[] cart;		// 장바구니
	
	public Customer() {}
	public Customer(int money) {
		this.money = money;
		this.startMoney = money;
		this.cart = new Product[10];
	}
	public void buy(Product product) {
		if(money < product.getPrice()) {
			System.out.println("소지 금액이 부족합니다.");
			return;
		}
		
		money -= product.getPrice();
		cart[numOfProduct] = product;
		numOfProduct++;
	}
	public void output() {
		// 방법1
		int total = 0;
		for (int i = 0; i < numOfProduct; i++) {
			total += cart[i].getPrice();
		}
		
		// 방법2
		System.out.println("처음 소지 금액 : " + startMoney);
		System.out.println("총 구매 금액 : " + (startMoney - money));
		System.out.println("남은 금액 : " + money);
	}
}
public class Test02 {
	public static void main(String[] args) {
		Customer cus = new Customer(1000);
		cus.buy(new Tv("LG", 200));
		cus.buy(new Computer("삼성", 150));
		cus.output();
	}
}

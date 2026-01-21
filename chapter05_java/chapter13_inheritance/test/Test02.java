package org.joonzis.test;
class Computer{
	String model;
	int price;
	public Computer() {}
	public Computer(String model, int price) {
		this.model = model;
		this.price = price;
	}
	void output() {
		System.out.println("모델명 : " + model);
		System.out.println("가격 : " + price);
	}
}
class Notebook extends Computer{
	int battery;
	public Notebook() {}
	public Notebook(String model, int price, int battery) {
		super(model, price);
		this.battery = battery;
	}
	@Override
	void output() {
		super.output();
		System.out.println("배터리 파워 : " + battery);
	}
}
class Tablet extends Notebook{
	String pen;

	public Tablet(String model, int price, int battery, String pen) {
		super(model, price, battery);
		this.pen = pen;
	}
	@Override
	void output() {
		super.output();
		System.out.println("펜 정보 : " + pen);
	}
}
public class Test02 {
	public static void main(String[] args) {
		Notebook notebook = new Notebook("MSI", 2000000, 65);
		notebook.output();
		
		System.out.println("--------------------");
		
		Tablet tablet = new Tablet("갤럭시탭S8", 665000, 45, "그냥 펜");
		tablet.output();
	}
}

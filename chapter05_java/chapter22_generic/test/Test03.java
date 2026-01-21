package org.joonzis.test;

//Product 클래스를 구현하시오.
//필드 : T1 category, T2 model
class Product<T1, T2>{
	private T1 category;
	private T2 model;
	public void setCategory(T1 category) {
		this.category = category;
	}
	public void setModel(T2 model) {
		this.model = model;
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(category).append(", ").append(model);
		return sb.toString();
	}
}
class Elec{
	@Override
	public String toString() {
		return "전자제품";
	}
}
class Tv{
	private String model;
	public Tv(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return model + " TV";
	}
}
class Life{
	@Override
	public String toString() {
		return "생활용품";
	}
}
class Cup{
	private String model;
	public Cup(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return model;
	}
}
public class Test03 {
	public static void main(String[] args) {

		Product<Elec, Tv> product1 = new Product<>();
		Product<Life, Cup> product2 = new Product<>();

		product1.setCategory(new Elec());
		product1.setModel(new Tv("LG"));
		
		System.out.println(product1);			// 출력 예시) 전자제품, LG TV
		
		
		product2.setCategory(new Life());
		product2.setModel(new Cup("머그컵"));
		
		System.out.println(product2);
		
		
	}
}

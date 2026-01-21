package org.joonzis.ex;
class Sample{
	@Override
	public String toString() {
		return "SAMPLE";
	}
}
public class Ex01_Object {
	public static void main(String[] args) {
		Object object = new Object();
		System.out.println(object);
		
		object = 10;
		System.out.println(object);
		
		object = "Hello";
		System.out.println(object);
		
		object = new Sample();
		System.out.println(object.toString());
		System.out.println(object);
	}
}






package org.joonzis.test;


class Phone{
	private String owner;
	public Phone(String owner) {
		this.owner = owner;
	}
	public void sendCall() {
		System.out.println(owner + "에게 전화 걸기");
	}
	public void receiveCall() {
		System.out.println(owner + " 전화 받기");
	}
}
interface Computable{
	public void connectInternet();
	public void playApp();
}
class SmartPhone extends Phone implements Computable{
	public SmartPhone(String owner) {
		super(owner);
	}
	@Override
	public void connectInternet() {
		System.out.println("인터넷 연결");
	}
	@Override
	public void playApp() {
		System.out.println("앱 실행");
	}
}
public class Test01 {
	public static void main(String[] args) {
		
		//Phone phone = new SmartPhone("김씨");
		//Computable phone = new SmartPhone("김씨");
		SmartPhone phone = new SmartPhone("김씨");
		phone.sendCall();
		phone.receiveCall();
		phone.connectInternet();
		phone.playApp();
		
		
	}
}

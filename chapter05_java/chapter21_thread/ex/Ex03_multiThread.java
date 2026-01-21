package org.joonzis.ex;

class MyThread2 implements Runnable{
	private String str;
	public MyThread2(String str) {
		this.str = str;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			// 1초간 일시 정지
			try {
				Thread.sleep(1000);
				System.out.println(str);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Ex03_multiThread {
	public static void main(String[] args) {
		System.out.println("Main Thread Start");
		
		// 인터페이스를 구현한 구현 클래스 객체
		MyThread2 mt1 = new MyThread2("*");
		MyThread2 mt2 = new MyThread2("-");
		
		// start() 메소드를 사용하기 위해 Thread 클래스 객체 생성
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		
		t1.start();
		t2.start();
		
		System.out.println("Main Thread End");
	}
}







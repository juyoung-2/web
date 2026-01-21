package org.joonzis.ex;
class MyThread extends Thread{
	private String str;
	public MyThread(String str) {
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
public class Ex02_multiThread {
	public static void main(String[] args) {
		System.out.println("Main Thread Start");
		
		MyThread mt1 = new MyThread("*");
		MyThread mt2 = new MyThread("-");
		
		// run()을 호출하면 단순히 클래스에 속한 메소드를 호출
		// start()는 스레드 작업을 실행하는 데에 필요한 호출
		// 스택을 생성한 다음 run()을 호출
		mt1.start();
		mt2.start();
		
		System.out.println("Main Thread End");
	}
}











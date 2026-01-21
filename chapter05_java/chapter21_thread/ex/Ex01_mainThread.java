package org.joonzis.ex;

public class Ex01_mainThread {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			// 1초간 일시 정지
			try {
				Thread.sleep(1000);
				System.out.println("Main Thread 실행");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

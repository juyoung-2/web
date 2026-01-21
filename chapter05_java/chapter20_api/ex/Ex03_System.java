package org.joonzis.ex;

public class Ex03_System {
	public static void main(String[] args) {
		// 0~10까지의 데이터 순차적으로 출력
		// * 회차가 5가 되었을 때 시스템 종료
		
		for (int i = 0; i <= 10 ; i++) {
			if(i == 5) {
				System.exit(i);
			}
			System.out.println(i);
		}
		
	}
}

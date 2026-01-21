package org.joonzis.test;
import java.util.InputMismatchException;
import java.util.Random;
/*Q5. Test05.java		
Up-Down 게임
1 ~ 100 사이의 난수를 발생시켜 해당 값을 맞출때까지 게임을 진행하시오.
다음의 경우 예외를 발생시키시오.
1) 사용자가 1 ~ 100 이외의 값을 입력한 경우 NumberOutOfBoundsException 클래스를 이용하여 예외 처리
2) 정수대신 다른 데이터 (예: 실수, 문자) 등을 입력한 경우*/
import java.util.Scanner;
class Updown{
	private int answer;
	private int count;
	private Scanner sc = new Scanner(System.in);
	public Updown() {
		Random ran = new Random();
		answer = ran.nextInt(100)+1;
	}
	public int challenge() throws NumberOutOfBoundsException, InputMismatchException{
		count++;
		System.out.print("1~100 사이의 정수 입력 >> ");
		int user = sc.nextInt();
		if(user < 1 || user > 100) {
			throw new NumberOutOfBoundsException("1~100 사이의 정수를 입력하세요!!!!!");
		}
		return user;
	}
	public void play() {
		while(true) {
			try {
				int user = challenge();
				
				if(user > answer) {
					System.out.println("Down !!");
				}else if(user < answer) {
					System.out.println("Up !!");
				}else {
					System.out.println("정답 : " + answer + "(" + count + "회 만에 성공!)");
					break;
				}
				
			} catch (NumberOutOfBoundsException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("정수만 입력하세요!");
				sc.next();
			}
		}
	}
}
public class Test04 {
	public static void main(String[] args) {
		Updown game = new Updown();
		game.play();
	}
}
class NumberOutOfBoundsException extends Exception{
	private static final long serialVersionUID = 1L;
	public NumberOutOfBoundsException(String message) {
		super(message);
	}
}
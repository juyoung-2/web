package org.joonzis.ex;
class MusicBox{
	/*
	 * synchronized ( 동기화 )
	 * 1. 메소드에 붙여서 사용
	 * 	1) 여러 개의 Thread들이 공유 객체의 메소드를 사용할 때
	 * 		메소드에 synchronized가 붙어 있는 경우 먼저 호출한 메소드가
	 * 		객체의 사용권(Monitoring Lock)을 얻는다.
	 * 		락은 메소드가 종료되거나, wait() 같은 메소드를 만나기 
	 * 		전까지 유지된다.
	 * 2. synchronized 블럭 사용
	 */
	
	public synchronized void rock() {
		for(int i=0; i<5; i++) {
			System.out.println("play the rock");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void ballad() {
		for(int i=0; i<5; i++) {
			System.out.println("play the balld");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void dance() {
		for(int i=0; i<5; i++) {
			System.out.println("play the dance");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class MusicPlayer extends Thread{
	private int type;
	private MusicBox musicBox;
	public MusicPlayer(int type, MusicBox musicBox) {
		this.type = type;
		this.musicBox = musicBox;
	}
	@Override
	public void run() {
		switch (type) {
		case 1: musicBox.rock();
			break;
		case 2: musicBox.ballad();
			break;
		case 3: musicBox.dance();
			break;
		}
	}
}
public class Ex04_ObjectShare {
	public static void main(String[] args) {
		MusicBox box = new MusicBox();
		
		MusicPlayer p1 = new MusicPlayer(1, box);
		MusicPlayer p2 = new MusicPlayer(2, box);
		MusicPlayer p3 = new MusicPlayer(3, box);
		
		p1.start();
		p2.start();
		p3.start();
	}
}
















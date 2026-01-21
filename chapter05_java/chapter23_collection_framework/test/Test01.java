package org.joonzis.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Board{
	private String title, content;
	private Date register;
	public Board() {}
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
		this.register = new Date();
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("제목 : ").append(title).append("\n");
		sb.append("내용 : ").append(content).append("\n");
		
		SimpleDateFormat format = 
				new SimpleDateFormat("yyyy년 MM월 dd일");
		
		sb.append("등록 날짜 : ").append(format.format(register));
		return sb.toString();
	}
}
public class Test01 {
	public static void main(String[] args) {
		List<Board> list = new ArrayList<Board>();
		list.add(new Board("1. 공지사항", "모든 회원 필독"));
		list.add(new Board("2. 알림", "관리자만 필독"));
		list.add(new Board("3. 게시판", "모든 회원 필독"));
		
		for (Board board : list) {
			System.out.println(board);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 게시물 번호(1~3) >> ");
		int num = sc.nextInt();
		
		list.remove(num-1);
		
		for (Board board : list) {
			System.out.println(board);
		}
		
	}
}





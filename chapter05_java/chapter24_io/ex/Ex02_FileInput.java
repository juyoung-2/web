package org.joonzis.ex;

import java.io.*;

public class Ex02_FileInput {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream("alphabet.txt");
			bis = new BufferedInputStream(fis);
			
			int ch = 0;	// char ch가 아니고 읽을 때에는 int
			
			while(true) {
				ch = bis.read();	// read()의 리턴 타입이 int
				if(ch == -1) {		// 읽을 데이터가 없으면 -1 리턴
					break;
				}
				System.out.print((char)ch);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) {bis.close();}
				if(fis != null) {fis.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
	}
}







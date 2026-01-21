package org.joonzis.ex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex03_FileOutput {
	public static void main(String[] args) {
		
		// 문자 기반 스트림
		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		String msg = "가나다라마바사아자차카타파하";
		
		try {
			file = new File("hangeul.txt");
			fw = new FileWriter(file, false);
			// true : 이어쓰기, false : 덮어쓰기
			// 기본 값 : false ( 생략 가능 )
			bw = new BufferedWriter(fw);
			bw.write(msg);
			bw.flush();
			System.out.println("파일 생성!!!!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw!=null) {bw.close();}
				if(fw!=null) {fw.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
		
	}
}

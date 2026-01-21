package org.joonzis.ex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex06_FileCopy {
	public static void main(String[] args) throws Exception{
		
		File file = new File("cat.jpg");
		if(file.exists()) {
			FileInputStream fis = 
					new FileInputStream(file);
			BufferedInputStream bis = 
					new BufferedInputStream(fis);
			
			FileOutputStream fos = 
					new FileOutputStream("cat2.jpg");
			BufferedOutputStream bos =
					new BufferedOutputStream(fos);
			
			byte[] buffer = new byte[1024];
			
			long start = System.currentTimeMillis();
			while(bis.read(buffer) != -1) {
				bos.write(buffer);
			}
			long end = System.currentTimeMillis();
			System.out.println("복사 시간 : " + (end-start) + 
					"밀리초");
			
			// 사용 가능한 file 객체 메소드
			System.out.println("파일명 : " + file.getName());
			// 절대경로
			System.out.println("파일경로1 : " + file.getAbsolutePath());
			// 상대경로
			System.out.println("파일경로2 : " + file.getPath());
			
		}else {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
	}
}





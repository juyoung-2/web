package org.joonzis.ex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex05_FileCopy {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = 
				new FileInputStream("alphabet.txt");
		BufferedInputStream bis = 
				new BufferedInputStream(fis);
		
		
		FileOutputStream fos = 
				new FileOutputStream("alphabet2.txt");
		BufferedOutputStream bos =
				new BufferedOutputStream(fos);
		
		int data;
		while((data = bis.read()) != -1 ) {
			bos.write(data);
		}
		bis.close();
		bos.close();
		fis.close();
		fos.close();
		
		
	}
}




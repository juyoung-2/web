package org.joonzis.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Test02 {
	public static void main(String[] args) {
		// 1. 로또
		System.out.println("<LOTTO>");
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		// 로또 번호를 담을 객체
		Set<Integer> set = new HashSet<Integer>();
		while(set.size() < 6) {
			set.add(ran.nextInt(45)+1);
		}
		int[] selNum = new int[6];
		for (int i = 0; i < selNum.length; i++) {
			System.out.print((i+1)+"번 숫자 입력 >> ");
			selNum[i] = sc.nextInt();
		}
		System.out.println("로또 번호 : " + set);
		System.out.println("선택 번호 : " + Arrays.toString(selNum));
		
		int count = 0;
		String resultStr = "";
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			int lottoNum = itr.next();
			for (int i : selNum) {
				if(lottoNum == i) {
					count++;
					resultStr += i + " ";
				}
			}
		}
		System.out.println("맞은 개수 : " + count + "개");
		System.out.println("맞은 번호 : " + resultStr);
		
		
	}
}





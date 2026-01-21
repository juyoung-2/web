package org.joonzis.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Test03 {
	public static void main(String[] args) {
		
		// 빙고
		System.out.println("<BINGO>");
		Random ran = new Random();
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		while(set.size() < 25) {
			set.add(ran.nextInt(25)+1);
		}
		Iterator<Integer> itr = set.iterator();
		
		int[][] bingo = new int[5][5];
		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				bingo[i][j]  = itr.next();
				System.out.print(bingo[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}






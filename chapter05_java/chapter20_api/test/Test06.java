package org.joonzis.test;

import java.math.BigInteger;

public class Test06 {
	public static void main(String[] args) {
//		1! ~ 99!
		// 1. int
//		for (int i = 1; i <= 99 ; i++) {
//			int sum = 1;
//			for (int j = 1; j <= i; j++) {
//				sum *= j;
//			}
//			System.out.println(sum);
//		}
		
		// 2. long
//		for (int i = 1; i <= 99 ; i++) {
//			long sum = 1;
//			for (int j = 1; j <= i; j++) {
//				sum *= j;
//			}
//			System.out.println(sum);
//		}
		
		// 3. BigInteger
//		for (int i = 1; i <= 99 ; i++) {
//			BigInteger sum = new BigInteger("1");
//			for (int j = 1; j <= i; j++) {
//				sum = sum.multiply(BigInteger.valueOf(j));
//			}
//			System.out.println(sum);
//		}
		
		BigInteger sum = new BigInteger("1");
		for (int i = 1; i <= 99 ; i++) {
			sum = sum.multiply(BigInteger.valueOf(i));
			System.out.println(sum);
		}
		
	}
}

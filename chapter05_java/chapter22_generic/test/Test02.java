package org.joonzis.test;

public class Test02 {
	
	static <T extends Number> double sum(T[] arr) {
		double total = 0;
		for(int i=0; i<arr.length; i++) {
			total += arr[i].doubleValue();
		}
		return total;
	}
	
	public static void main(String[] args) {
		Integer[] arr1 = {123, 456, 789};
		Double[] arr2 = {1.5, 2.43, 3.14};
		String[] arr3 = {"hello", "java"};
		
		System.out.println(sum(arr1));
		System.out.println(sum(arr2));
		//System.out.println(sum(arr3));
		
		
		
	}
}

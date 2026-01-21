package org.joonzis.test;

import java.util.Arrays;

class TypeCheckClass<T>{
	private T[] arr;
	public String checkType(T[] arr) {
		this.arr = arr;
		if(arr instanceof String[]) {
			return "문자형 입니다";
		}else if(arr instanceof Integer[]) {
			return "정수형 입니다";
		}else {
			return "실수형 입니다";
		}
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("배열 데이터 : ").append(Arrays.toString(arr)).append("\n");
		sb.append("배열 형태 : ").append(checkType(arr));
		return sb.toString();
	}
}
public class Test01 {
	public static void main(String[] args) {
		
		String[] arr1= {"a", "b", "c"};
		Integer[] arr2 = {123, 456, 789};
		Double[] arr3 = {1.5, 2.43, 3.14};
		
		TypeCheckClass<String> ck1 = new TypeCheckClass<>();
		TypeCheckClass<Integer> ck2 = new TypeCheckClass<>();
		TypeCheckClass<Double> ck3 = new TypeCheckClass<>();
		
		ck1.checkType(arr1);
		ck2.checkType(arr2);
		ck3.checkType(arr3);
		
		System.out.println(ck1);
		System.out.println(ck2);
		System.out.println(ck3);
		
		
	}
}

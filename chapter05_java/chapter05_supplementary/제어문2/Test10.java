package org.joonzis.control2;

public class Test10 {
	public static void main(String[] args) {
		
//		Q10. 피보나치 수열 20개를 출력
//		ex) 1, 1, 2, 3, 5, 8, 13, 21, ...
		
		int[] fibo = new int[20];
		fibo[0] = 1;
		fibo[1] = 1;
		for(int i=2; i<fibo.length; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		
		String result = "";
		
		for(int i : fibo) {
			result += i + ", ";
			//System.out.print(i + ", ");
		}
		result = result.substring(0, result.length()-2); // 마지막 에서 ", " <- 2글자 제외
		System.out.println(result);
		
		
		
	}
}

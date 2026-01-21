package org.joonzis.ex;
/*
 * ArrayIndexOutOfBoundsException
 * 배열에서 인덱스 범위를 초과하는 경우 예외 발생
 */
public class Ex02_exception {
	public static void main(String[] args) {
		int[] arr = new int[3];
		try {
			arr[0] = 1;
			arr[1] = 2;
			arr[3] = 3;
			
			for(int n : arr) {
				System.out.println(n);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println("인덱스 가용 범위를 벗어났습니다.");
		}
		
	}
}







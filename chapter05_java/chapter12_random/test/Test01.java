package org.joonzis.test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int[] lotto = new int[6];	// 랜덤 값 배열
		int[] sel = new int[6];		// 선택 값 배열
		
		// 1. 랜덤 데이터 lotto 배열에 저장
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = ran.nextInt(45)+1;
			
			// 배열 내 값들과 비교하며 같을 시 중복 제거
			for(int m=0; m<i; m++) {
				if(lotto[i] == lotto[m]) {
					i--;
				}
			}
			
		}
		
		// 2. 선택 데이터 sel 배열에 저장
		System.out.print("6개 숫자 입력 >> ");
		for(int i=0; i<sel.length; i++) {
			sel[i] = sc.nextInt(); 
		}
		
		// 3. 각 배열 값 비교
		String resultStr = "";
		int count = 0;
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<sel.length; j++) {
				if(lotto[i]==sel[j]) {
					count++;
					resultStr += Integer.toString(lotto[i]) + " ";
				}
			}
		}
		
		System.out.println("로또 번호 : " + Arrays.toString(lotto));
		System.out.println("선택 번호 : " + Arrays.toString(sel));
		System.out.println("맞은 개수 : " + count);
		System.out.println("내용 나열 : " + resultStr);
		
//		3. 로또 번호 : 배열 내용 출력
//		4. 선택 번호 : 배열 내용 출력
//		5. 맞은 개수 : OO개
//		6. 맞은 번호 : 내용 나열 
		
		
		
		
	}
}

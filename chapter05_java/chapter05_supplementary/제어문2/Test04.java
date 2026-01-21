package org.joonzis.control2;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
//		Q4. 총 4개의 과목 성적을 입력하여 평균이 60점 이하면 과락, 60점 이상이면 합격을 출력
//		* 배열을 이용
		
		Scanner sc = new Scanner(System.in);
		
		int[] subjectArr = new int[4];
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<subjectArr.length; i++) {
			System.out.print((i+1) + "번째 과목 성적을 입력해주세요. >> ");
			subjectArr[i] = sc.nextInt();
			sum += subjectArr[i];
		}
		
		avg = (double)sum / subjectArr.length;
		
		if(avg <= 60) {
			System.out.println("과락");
		}
		else {
			System.out.println("합격");
		}
	}

}

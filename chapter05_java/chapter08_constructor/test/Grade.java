package org.joonzis.test;
//Constructor, 
//getAverage : 평균을 리턴, 
//getGrade : 학점을 리턴
//** 학점 : 90이상 A, 80이상 B, 70이상 C, 60이상 D, 60미만 F
public class Grade {
	int kor, eng, mat;
//	double average;
//	char grade;
	
	public Grade() {}
	public Grade(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	double getAverage() {
		return (kor + mat + eng) / 3.0;
	}
	char getGrade() {
		if(getAverage() >= 90) {
			return 'A';
		}else if(getAverage() >= 80) {
			return 'B';
		}else if(getAverage() >= 70) {
			return 'C';
		}else if(getAverage() >= 60) {
			return 'D';
		}else {
			return 'F';
		}
		
	}
	
	
	
}

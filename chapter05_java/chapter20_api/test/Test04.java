package org.joonzis.test;

import java.util.Arrays;
import java.util.Random;

class Student{
	private String no, name;
	private int[] scores;
    private double average;
    private char grade;
    public static final int COURSE_COUNT = 3;
    public Student() {}
	public Student(String no, String name) {
		this.no = no;
		this.name = name;
		scores = new int[COURSE_COUNT];
	}
	public void setScores(int kor, int eng, int mat) {
		scores[0] = kor;
		scores[1] = eng;
		scores[2] = mat;
		setAverage();
		setGrade();
	}
	public void setScores(int[] scores) {
		this.scores = scores;
		setAverage();
		setGrade();
	}
	private void setAverage() {
		int total = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		this.average = (double)total/COURSE_COUNT;
	}
	private void setGrade() {
		if(average >= 90) {grade = 'A';}
		else if(average >= 80) {grade = 'B';}
		else if(average >= 70) {grade = 'C';}
		else if(average >= 60) {grade = 'D';}
		else {grade = 'F';}
	}
    @Override
    public String toString() {
//    	학번, 성명, 평균, 학점 출력
    	return "학번 : " + no + ", 이름 : " + name + 
    			", 평균 : " + average + ", 학점 : " + grade;
    }
    @Override
    public boolean equals(Object obj) {
    	if(obj != null && obj instanceof Student) {
    		Student another = (Student)obj;
			return  no.equals(another.no);
		}else {
			return false;
		}
    }
}
public class Test04 {
	public static void main(String[] args) {
		Random ran = new Random();
		Student stu1 = new Student("11-11", "김씨");
		stu1.setScores(66, 77, 87);
		
		Student stu2 = new Student("11-11", "이씨");
		int[] scores = new int[Student.COURSE_COUNT];
		scores[0] = ran.nextInt(101);
		scores[1] = ran.nextInt(101);
		scores[2] = ran.nextInt(101);
		stu2.setScores(scores);
		
		System.out.println(stu1);
		System.out.println(stu2);
		
		if(stu1.equals(stu2)) {
			System.out.println("같은 학생");
		}else {
			System.out.println("다른 학생");
		}
		
	}
}









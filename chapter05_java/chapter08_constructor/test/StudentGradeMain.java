package org.joonzis.test;

public class StudentGradeMain {
	public static void main(String[] args) {
		Grade grade = new Grade(60, 77, 82);
		Student stu = new Student("김씨", "컴공", grade);
		stu.output();
		
	}
}

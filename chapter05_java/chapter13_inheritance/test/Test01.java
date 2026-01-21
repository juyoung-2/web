package org.joonzis.test;

class Human{
	String name;
	int age;
	public Human() {}
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
class Student extends Human{
	String school;
	
	public Student() {}

	public Student(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}
	@Override
	void output() {
		super.output();
		System.out.println("학교 : " + school);
	}
}
class Worker{
	
}
public class Test01 {
	public static void main(String[] args) {
		Student stu = new Student("김씨", 20, "대학교");
		stu.output();
	}
}

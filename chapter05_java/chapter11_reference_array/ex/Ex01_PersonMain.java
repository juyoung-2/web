package org.joonzis.ex;

public class Ex01_PersonMain {
	public static void main(String[] args) {
		Ex01_Person person1 = 
				new Ex01_Person("김씨", 10, 130, '남');
		Ex01_Person person2 = 
				new Ex01_Person("이씨", 20, 140, '여');
		Ex01_Person person3 = 
				new Ex01_Person("박씨", 30, 150, '남');
		
		person1.output();
		person2.output();
		person3.output();
		
		System.out.println("-----------------");
		
		Ex01_Person[] arr = new Ex01_Person[3];
		arr[0] = person1;
		arr[1] = person2;
		arr[2] = person3;
		for (int i = 0; i < arr.length; i++) {
			arr[i].output();
		}
		
		
		
		
		
		
		
		
		
	}
}

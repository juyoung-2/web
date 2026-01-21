package org.joonzis.ex;

public class Ex03_PersonMain {
	public static void main(String[] args) {
		
		Ex03_Person p1 = new Ex03_Person();
		
		//p1.name = "김씨";	private 처리가 되어서 모든 Field는 접근 불가
		// setter를 통한 데이터 입력
		
		p1.setName("김씨");
		p1.setAge(8);
		p1.setHeight(120.3);
		p1.setGender('여');
		
		System.out.println("이름 : " + p1.getName());
		System.out.println("나이 : " + p1.getAge());
		System.out.println("키 : " + p1.getHeight());
		System.out.println("성별 : " + p1.getGender());
		
		
		
		
		
		
	}
}

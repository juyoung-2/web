package org.joonzis.test;
//Q2. Test02.java
//User 클래스 					필드 : String id, password
//							메소드 : Constructor, toString(), equals()
//User 인스턴스를 2개 생성하고, 동등 비교(id, password 모두 같으면 동등) 결과 출력
//각 인스턴스 정보는 toString 메소드를 통해 출력	
class User{
	private String id, password;
	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}
	@Override
	public String toString() {
		return "아이디 : " + id + ", 비밀번호 : " + password;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof User) {
			User other = (User)obj;
			return id.equals(other.id) && password.equals(other.password);
		}else {
			return false;
		}
	}
}
public class Test02 {
	public static void main(String[] args) {
		
		User user1 = new User("admin", "1234");
		User user2 = new User("admin", "1236");
		
		System.out.println(user1);
		System.out.println(user2);
		
		if(user1.equals(user2)) {
			System.out.println("같은 유저입니다.");
		}else {
			System.out.println("다른 유저입니다.");
		}
	}
}

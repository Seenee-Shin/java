package edu.kh.oop.constructor.model.service;

import edu.kh.oop.constructor.model.vo.User;

public class ConstructorService {
	
	public void example1() {
		// 기본생성자를 이용한 User 객체생성
		
		User user1 = new User();
		
		// 기본생성자를 이용해 만들어진 User 객체의 필드를 초기화 
		user1.setUserId("user01");
		user1.setUserPassword("pass01");
		user1.setUserName("홍길동");
		user1.setUserAge(25);
		user1.setUserGender('남');
		
		System.out.println(user1.getUserId());
		System.out.println(user1.getUserPassword());
		System.out.println(user1.getUserName());
		System.out.println(user1.getUserAge());
		System.out.println(user1.getUserGender());
	
//		User user2 = new User();
//		user2.setUserId("user02");
//		user2.setUserPassword("pass02");
//		user2.setUserName("김삼순");
//		user2.setUserAge(20);
//		user2.setUserGender('여');
		
		User user2 = new User("user02", "pass02", "김삼순", 20, '여');
		//매개변수 있는 생성자 사용이유 == 코드 길이의 감소 
		//**매개변수가 여러개일 경우 순서에 맞춰 알맞은 값을 작성해야 한다 
		
		System.out.println(user2.getUserId());
		System.out.println(user2.getUserPassword());
		System.out.println(user2.getUserName());
		System.out.println(user2.getUserAge());
		System.out.println(user2.getUserGender());
		
		
		
		
		
	}

}

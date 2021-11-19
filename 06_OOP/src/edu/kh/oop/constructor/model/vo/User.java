package edu.kh.oop.constructor.model.vo;

public class User {
	
	// 클래스 구조 
	// public class 클래스 명{
//				
//		필드 
//		생성자
//		메소드 
//	//}
	
	//필드
	private String userId; //캡슐화 원칙에 의해 기본적으로 private로 작성
	private String userPassword;
	private String userName;
	private int userAge;
	private char userGender;
	
	//생성자
	// 생성된 객체의 필드값을 초기화 하고 지정된 기능을 수행하는 것이 목적
	// 생성자 작성 규칙 
	//1.생성자의 이름은 반드시 클래스명과 같아야 한다 
	//2.생성자는 반환형이 존재하지 않는다.
	//3. 생성자가 하나라도 존재하는 경우 기본생성자가 자동 추가되지 않는다
	//		매개변수 있는 생성자 작성시 , 기본생성자를 명시해 준다 .
	
	

	//기본 생성자 
	//[접근제한자] 클래스명() {
	// 코드
	// }
	
	public User() {
		//객체 생성시 수행될 코드 작성 
		System.out.println("기본 생성자에 의해 User객체가 생성되었씁니다.");
		
	}
	// 생성자가 *하나도 작성되지 않은 경우 객체를 생성할 수 없기 때문에 
	// 컴파일러가 자동으로 기본 생성자를 추가한다. 
	
//		매개변수 있는 생성자 == 세터 여러개를 한번에 수행하는 모양
//		객체 생성시 매개변수로 전달 받은 값을 이용, 객체 필드를 초기화하는 생성자
//		개체가 생성 되자 마자 필드에 값을 입력
	
	// 생산자 오버로딩 성립 조건
	// 1. 매개변수의 개수가 다를때
	// 2. 매개변수의 개수는 같지만 타입이 다를때
	// 3. 개수,타입이 같지만 순서가 다를때 
	
	// ***오버로딩시 주의사항
	// 변수명은 상관없음 ! 변수명이 달라도 타입이 같으면 오버로딩 성립xxx
//		
		public User(String userId, String userPassword, String userName,int userAge, char userGender) {
			// 매개변수가 5개 == 전달 받는 값이 5개 
			this.userId = userId;
			this.userPassword = userPassword;
			this.userName = userName;
			this.userAge = userAge;
			this.userGender = userGender;
		}
		
//	
//	
	//메소드 getter setter
	public String getUserId () {
		return userId;
		}
	
	public void setUserId( String userId) {
		this.userId = userId;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword( String userPassword) {
		this.userPassword = userPassword;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName( String UserName) {
		this.userName = userName;
	}
	
	public int getUserAge() {
		return userAge;
	}
	
	public void setUserAge (int userAge) {
		this.userAge = userAge;
	}
	
	public char getUserGender () {
		return userGender;
	}
	
	public void setUserGender (char userGender) {
		this.userGender = userGender;
	}
	
	
}

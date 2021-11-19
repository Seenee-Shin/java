package edu.kh.oop.encapsulation.model.vo;

public class Account {
	
	//public = 어디서든, 누구든 접근 가능
	//private = 해당 객체 안에서만 사용가능 
	
	private String name;
	private  String accountNumber;
	private  String password;
	private int money;
	private  int bankCode;
	
	
	public void deposit() {
		System.out.println("입금 기능 수행");

	}
	
	public void withdraw() {
		System.out.println("출금 기능 수행");
		
	}
	
	//private으로 직접 접근이 제한된 객체의 속성을 간접적으로 접근하는 기능
	//속성별 값은 셋팅하는 setter
	// 값을 얻어오는 getter
	
	
	//setter
	//	public void set속성명(속성자료형+속성명){
	// 			this.속성명 = 속성명;
	//	}

	
	public void setName( String name ) {
							//외부로부터 전달받은 값을 저장하는 매개체
							// 외부로 부터 전달받은 값을 해당기능 내부에서 name이라는 변수명으로 사용 
		this.name = name;
		
	}
	
	public void setAccountNumber ( String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setpassword( String password ) {
		this.password = password;
		
	}
	
	public void setMoney( int money) {
		this.money = money;
	}
	
	public void setBankCode ( int bankCode ) {
		this.bankCode = bankCode;
	}
	
	
	//getter 
	// public 속성 자료형 get속성명 (){
	// 		return 속성명;
	// }

	public String getName() {
		// 호출된 곳으로 반환할 자료형
		return name; 
		// 호출된 곳으로 반환 
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getMoney() {
		return money;
	}
	
	public int getBankCode() {
		return bankCode;
	}
	
}

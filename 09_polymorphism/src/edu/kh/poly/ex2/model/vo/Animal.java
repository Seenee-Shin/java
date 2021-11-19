package edu.kh.poly.ex2.model.vo;

public abstract class Animal {
	private String type;
	private String eatType;
	
	// 객체 생성이 불가능 하기에 생성자 필요없음 
	// but 상속받은 자식 클래스에 생성 될 수 있음 
	
	public Animal() { }
	
	public Animal(String type, String eatType) {
		super();
		this.type = type;
		this.eatType = eatType;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public String getEatType() {
		return eatType;
	}
	public void setEatType(String eatType) {
		this.eatType = eatType;
	}
	
	
	//동물 별로 수행 하는 기능이 다른 기능 
	public abstract void hunt();
	// 미완성 메소드 
	// 상속 받은 자식 클래스에서 구현 
	// 하위 클래스 측에서 오버라이딩해주기 안하면 에러 
	// 메소드 오버라이딩 강제화 
	
}

package edu.kh.inheritance.ex.model.vo;


//java.lang 패키지는 자동으로 import, 작성할 필요 x 
// 모든 클래스는 Object 클래스의 하위 클래스이다, extends 작성 필요 x 

public class Person {
	private String name;
	private int age;
	private String nationality;
	//private 필드의 상속은 가능하지만 직접적인 접근은 불가능 (getter , setter 사용 )
	
	public Person() {}
	// 부모 클래스의 생성자는 상속 불가능 
	
	public Person(String name, int age, String nationality) {
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		
		//this 참조변수 : 객체 생성시 내부에 같이 생성 , 객체시작 주소를 참조 
		//오버로딩 : 하나의 메서드명으로 여러 기능을 정의하는것 
	}
	
	//VO 클래스는 getter, setter + 필드 정보를 한번에 출력하는 용도의 메서드 
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	//필드정보를 한 번에 출력하느 메소드
	public String information() {
		return name + "/" + age+ "/" + nationality;
	}
	
	// 오버라이딩 성립조건 
	// 메소드명이 동일
	// 매개변수의 개수 ,타입, 순서가 모두 동일 
	// 리턴타입 동일 
	// 부모의 private 메소드는 접근이 불가하기 때문에 오버라이딩 할 수 없다
	// 접근 제한자의 범위가 같거나 더 넓어야 한다. 
	// 예외 처리 범위가 같거나 더 구체적이여야한다. 
	
	//Object.toString() 오버라이딩 
	//Objet는 모든 객체가 가지는 기능을 추상화하여 모아둔 클래스 
	// toString() : 객체의 모든 필드 정보를 문자열로 반환 
	
	//Object 의 toStirng 메소드 :
	// 클래스명 + @ +16진수 해시코드 
		
	@Override // 어노테이션 : 해당 메소드의 오버라이딩을 컴파일러에게 알리는 구문
	public String toString() {
		return name + " / " + age + " / " + nationality; 
	}
	//상속관계 내에서 더이상 오버라이딩 되지 않는 메소드 
	// 정의 될 수 있는 마지막 메소드 
	public final void breath () {
		System.out.println("사람은 코로 숨을 쉰다. ");
	}
	
	public String overridingTest() {
		return "Test";
	}
	}

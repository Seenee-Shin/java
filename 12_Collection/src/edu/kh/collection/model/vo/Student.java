package edu.kh.collection.model.vo;

import java.util.Objects;

public class Student extends Person {
	//클래스 : 객체를 만들기 위한 설계도 (필드, 메소드(+ 생성자))
	//필드 
	private String name; 
	private int age;
	private int grade;
	
	//- private : 접근제한자 (캡슐화 원칙)
	// + public : 같은 프로젝트 내부 
	// ~ (defalut) : 같은 패키지
	// #protected : 같은 패키지 + 상속 
	
	public Student() {}
	//생성자 : 객체 생성 시 호출되는 메소드 (객체생성 + 초기화)
	
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age; 
		this.grade = grade;
		//매개변수 : 전달 받은 값을 저장하는 변수 
	}

	public Student(char gender, double height, String name, int age, int grade) {
		super(gender, height);
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	//오버라이딩 :상속받은 메소드를 자식 쿨래스에서 제정의 
	//오버로딩 : 같은 이름의 메소드가 여러개 작성
	
	@Override
	public String toString() {
		return name + "/" + age + "/" + grade + " / " + super.toString();
	}
	
	//alt + shift + s - ganerate hashCode and equals 
	
	// object.equals 
	// 상속받아 오버라이딩 하는 용도. 두 객체가 서로 값은 값을 가지고 있는지 비교 
	
	@Override 
	public boolean equals(Object obj) {
		
		//매개변수로 입력 받은 객체 다운 캐스팅 
		Student other = (Student)obj;
		
		
		return Objects.equals(obj,other);
//		this.name.equals(other.name) &&
//		this.age == other.age &&
//		this.grade == other.grade;
	}
	
	//Object.HashCode 오버라이딩
	// 동등한 객체는 동일한 hashCode 값을 반환 해야한다.
	@Override
	public int hashCode() {
		//값이 같은 객체는 hashCode값도 같아야 한다.
		// ->값을 이용해 hasCode를 만들면 가능
		final int PRIME = 31;
		int result = 1;
		result = result * PRIME + (name == null ? 0 : name.hashCode());
		
		result = result * PRIME + age;
		
		result = result * PRIME + grade;
		
		return result;
		
	}
}

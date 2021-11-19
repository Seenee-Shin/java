package edu.kh.inheritance.ex.model.vo;

public final class Student extends Person {
	//상속 구문 : extends 사용 (상속을 통해 '확장'시킨다)
	
//	private String name;
//	private int age;
//	private String nationality;
	//Person과 중복된 필드, 제거후 Person 멤버 상속해 사용 
	
	private int grade;
	private int classRoom;
	
	//생성자
	public Student() {}
	public Student(int grade, int classRoom , String name, int age, String nationality ) {
		// person 이 private 필드이기 때문에 같은 방법으로 접근 불가능
		// 간접 접근인 setter 나 super() 생성자로 접근 
//		super 생성자를 이용해 코드의 재활용성 증가, 코드길이 감소 
		
//		super();  기본생성자 
		super(name,age,nationality);
//		super 매개 변수 생성자 
		
		this.grade = grade;
		this.classRoom =classRoom;
	}
	
	

	//getter, setter
//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public int getAge() {
//		return age;
//	}
//
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//
//	public String getNationality() {
//		return nationality;
//	}
//
//
//	public void setNationality(String nationality) {
//		this.nationality = nationality;
//	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public int getClassRoom() {
		return classRoom;
	}


	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	public String information() {
		return 
		super.information()+ "/" + grade + "/" + classRoom;
	}

	
	
	

}

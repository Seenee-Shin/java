package edu.kh.inheritance.ex.model.vo;

public final class Student extends Person {
	//��� ���� : extends ��� (����� ���� 'Ȯ��'��Ų��)
	
//	private String name;
//	private int age;
//	private String nationality;
	//Person�� �ߺ��� �ʵ�, ������ Person ��� ����� ��� 
	
	private int grade;
	private int classRoom;
	
	//������
	public Student() {}
	public Student(int grade, int classRoom , String name, int age, String nationality ) {
		// person �� private �ʵ��̱� ������ ���� ������� ���� �Ұ���
		// ���� ������ setter �� super() �����ڷ� ���� 
//		super �����ڸ� �̿��� �ڵ��� ��Ȱ�뼺 ����, �ڵ���� ���� 
		
//		super();  �⺻������ 
		super(name,age,nationality);
//		super �Ű� ���� ������ 
		
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

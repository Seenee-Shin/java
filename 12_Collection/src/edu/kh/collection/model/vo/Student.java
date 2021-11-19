package edu.kh.collection.model.vo;

import java.util.Objects;

public class Student extends Person {
	//Ŭ���� : ��ü�� ����� ���� ���赵 (�ʵ�, �޼ҵ�(+ ������))
	//�ʵ� 
	private String name; 
	private int age;
	private int grade;
	
	//- private : ���������� (ĸ��ȭ ��Ģ)
	// + public : ���� ������Ʈ ���� 
	// ~ (defalut) : ���� ��Ű��
	// #protected : ���� ��Ű�� + ��� 
	
	public Student() {}
	//������ : ��ü ���� �� ȣ��Ǵ� �޼ҵ� (��ü���� + �ʱ�ȭ)
	
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age; 
		this.grade = grade;
		//�Ű����� : ���� ���� ���� �����ϴ� ���� 
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
	//�������̵� :��ӹ��� �޼ҵ带 �ڽ� �𷡽����� ������ 
	//�����ε� : ���� �̸��� �޼ҵ尡 ������ �ۼ�
	
	@Override
	public String toString() {
		return name + "/" + age + "/" + grade + " / " + super.toString();
	}
	
	//alt + shift + s - ganerate hashCode and equals 
	
	// object.equals 
	// ��ӹ޾� �������̵� �ϴ� �뵵. �� ��ü�� ���� ���� ���� ������ �ִ��� �� 
	
	@Override 
	public boolean equals(Object obj) {
		
		//�Ű������� �Է� ���� ��ü �ٿ� ĳ���� 
		Student other = (Student)obj;
		
		
		return Objects.equals(obj,other);
//		this.name.equals(other.name) &&
//		this.age == other.age &&
//		this.grade == other.grade;
	}
	
	//Object.HashCode �������̵�
	// ������ ��ü�� ������ hashCode ���� ��ȯ �ؾ��Ѵ�.
	@Override
	public int hashCode() {
		//���� ���� ��ü�� hashCode���� ���ƾ� �Ѵ�.
		// ->���� �̿��� hasCode�� ����� ����
		final int PRIME = 31;
		int result = 1;
		result = result * PRIME + (name == null ? 0 : name.hashCode());
		
		result = result * PRIME + age;
		
		result = result * PRIME + grade;
		
		return result;
		
	}
}

package edu.kh.inheritance.ex.model.vo;


//java.lang ��Ű���� �ڵ����� import, �ۼ��� �ʿ� x 
// ��� Ŭ������ Object Ŭ������ ���� Ŭ�����̴�, extends �ۼ� �ʿ� x 

public class Person {
	private String name;
	private int age;
	private String nationality;
	//private �ʵ��� ����� ���������� �������� ������ �Ұ��� (getter , setter ��� )
	
	public Person() {}
	// �θ� Ŭ������ �����ڴ� ��� �Ұ��� 
	
	public Person(String name, int age, String nationality) {
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		
		//this �������� : ��ü ������ ���ο� ���� ���� , ��ü���� �ּҸ� ���� 
		//�����ε� : �ϳ��� �޼�������� ���� ����� �����ϴ°� 
	}
	
	//VO Ŭ������ getter, setter + �ʵ� ������ �ѹ��� ����ϴ� �뵵�� �޼��� 
	
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
	
	
	//�ʵ������� �� ���� ����ϴ� �޼ҵ�
	public String information() {
		return name + "/" + age+ "/" + nationality;
	}
	
	// �������̵� �������� 
	// �޼ҵ���� ����
	// �Ű������� ���� ,Ÿ��, ������ ��� ���� 
	// ����Ÿ�� ���� 
	// �θ��� private �޼ҵ�� ������ �Ұ��ϱ� ������ �������̵� �� �� ����
	// ���� �������� ������ ���ų� �� �о�� �Ѵ�. 
	// ���� ó�� ������ ���ų� �� ��ü���̿����Ѵ�. 
	
	//Object.toString() �������̵� 
	//Objet�� ��� ��ü�� ������ ����� �߻�ȭ�Ͽ� ��Ƶ� Ŭ���� 
	// toString() : ��ü�� ��� �ʵ� ������ ���ڿ��� ��ȯ 
	
	//Object �� toStirng �޼ҵ� :
	// Ŭ������ + @ +16���� �ؽ��ڵ� 
		
	@Override // ������̼� : �ش� �޼ҵ��� �������̵��� �����Ϸ����� �˸��� ����
	public String toString() {
		return name + " / " + age + " / " + nationality; 
	}
	//��Ӱ��� ������ ���̻� �������̵� ���� �ʴ� �޼ҵ� 
	// ���� �� �� �ִ� ������ �޼ҵ� 
	public final void breath () {
		System.out.println("����� �ڷ� ���� ����. ");
	}
	
	public String overridingTest() {
		return "Test";
	}
	}

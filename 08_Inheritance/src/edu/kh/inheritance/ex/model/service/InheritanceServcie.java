package edu.kh.inheritance.ex.model.service;

import edu.kh.inheritance.ex.model.vo.Person;
import edu.kh.inheritance.ex.model.vo.Student;

public class InheritanceServcie {
	
	public void example1() {
		// ��� Ȯ�� 
		// person ��ü ����

		Person p1 = new Person();
		
		p1.setName("�趺��");
		p1.setAge(5);
		p1.setNationality("�ѱ�");
		
		
		Student s2 = new Student(3,10,"��浿",16 ,"���ѹα�");
		
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getClassRoom());
		System.out.println(s2.getGrade());
		
		System.out.println(s2.information());
	}
	
	public void example2() {
		//�������̵� & �����ε� 
		
		//Object.toString() �������̵� �ϱ� �� 
		Person p1 = new Person("ȫ�浿",20,"���ѹα�");
		
		System.out.println(p1);
		// print �������� ���������� �ۼ��ϸ� �ش� ��ü�� toString()�� ��� 
		
		Student s1 = new Student();
		System.out.println();
		
		
	}
	
}

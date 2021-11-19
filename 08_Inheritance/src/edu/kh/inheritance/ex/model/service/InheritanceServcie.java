package edu.kh.inheritance.ex.model.service;

import edu.kh.inheritance.ex.model.vo.Person;
import edu.kh.inheritance.ex.model.vo.Student;

public class InheritanceServcie {
	
	public void example1() {
		// 상속 확인 
		// person 개체 생성

		Person p1 = new Person();
		
		p1.setName("김떵게");
		p1.setAge(5);
		p1.setNationality("한국");
		
		
		Student s2 = new Student(3,10,"고길동",16 ,"대한민국");
		
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getClassRoom());
		System.out.println(s2.getGrade());
		
		System.out.println(s2.information());
	}
	
	public void example2() {
		//오버라이딩 & 오버로딩 
		
		//Object.toString() 오버라이딩 하기 전 
		Person p1 = new Person("홍길동",20,"대한민국");
		
		System.out.println(p1);
		// print 구문에서 참조변수를 작성하면 해당 객체의 toString()을 출력 
		
		Student s1 = new Student();
		System.out.println();
		
		
	}
	
}

package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.Student;
import edu.kh.oop.encapsulation.model.vo.Book;

public class AbstractionService {
	
	public void example1() {
		
		// 학생객체를 만들어서 학교명, 이름, 번호 등 입력 &출력, 기능수행
		
		Student std = new Student();
		
		//참조변수 std 
		//heap 영역에 student 객체를 새로 생설 후 참조할 수 있도록 
		// 객체 시작 주소를 std변수로 저장 
		std.schoolName = "KH고등학교";
		std.grade = 3;
		std.room = 10;
		std.number =5;
		std.name = "홍길동";
		
		// new student 구문으로 객체 추상화
		// 객체에 속성을 대입하여 구체화 
		
		System.out.println("이름 : " + std.name);
		System.out.println("학년 : " + std.grade);
		
		System.out.printf("저는 %s에 다니는 %d학년 %d반 %d번 %s입니다.\n", 
							std.schoolName, std.grade, std.room, std.number, std.name);
	
		Student std2 = new Student();
		
		std2.schoolName = "KH고등학교";
		std2.grade = 1;
		std2.room = 2;
		std2.number = 3;
		std2.name = "김영희";
		
		System.out.printf("저는 %s에 다니는 %d학년 %d반 %d번 %s입니다.\n", 
				std2.schoolName, std2.grade, std2.room, std2.number, std2.name);
		
		std.study();
		std2.study();
		std.takeALesson();
		std2.takeALesson();
		std.introduce();
		std2.introduce();
	}
	
	
}

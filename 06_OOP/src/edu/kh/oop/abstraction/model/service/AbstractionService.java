package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.Student;
import edu.kh.oop.encapsulation.model.vo.Book;

public class AbstractionService {
	
	public void example1() {
		
		// �л���ü�� ���� �б���, �̸�, ��ȣ �� �Է� &���, ��ɼ���
		
		Student std = new Student();
		
		//�������� std 
		//heap ������ student ��ü�� ���� ���� �� ������ �� �ֵ��� 
		// ��ü ���� �ּҸ� std������ ���� 
		std.schoolName = "KH����б�";
		std.grade = 3;
		std.room = 10;
		std.number =5;
		std.name = "ȫ�浿";
		
		// new student �������� ��ü �߻�ȭ
		// ��ü�� �Ӽ��� �����Ͽ� ��üȭ 
		
		System.out.println("�̸� : " + std.name);
		System.out.println("�г� : " + std.grade);
		
		System.out.printf("���� %s�� �ٴϴ� %d�г� %d�� %d�� %s�Դϴ�.\n", 
							std.schoolName, std.grade, std.room, std.number, std.name);
	
		Student std2 = new Student();
		
		std2.schoolName = "KH����б�";
		std2.grade = 1;
		std2.room = 2;
		std2.number = 3;
		std2.name = "�迵��";
		
		System.out.printf("���� %s�� �ٴϴ� %d�г� %d�� %d�� %s�Դϴ�.\n", 
				std2.schoolName, std2.grade, std2.room, std2.number, std2.name);
		
		std.study();
		std2.study();
		std.takeALesson();
		std2.takeALesson();
		std.introduce();
		std2.introduce();
	}
	
	
}

package edu.kh.review.model.service;

import java.util.InputMismatchException;
import java.util.Scanner;

import edu.kh.review.model.vo.Student;

public class ReviewService {
	Scanner sc = new Scanner(System.in);
	/*���� ���� 1
	edu.kh.review.model.vo ��Ű���� Student Ŭ������ ����.
	
	�ʵ� : �й�, �̸�, �г�, ��, ����('��' �Ǵ� '��') 
	������ : �⺻ ������, �Ű����� �ִ� ������ (�ʵ� ���� �ʱ�ȭ)
	�޼ҵ� : getter / setter, toString() �������̵�
	
	*/

	
	/*���� ���� 2
	Student ��ü 2���� ���� �⺻ ������, �Ű����� �ִ� �����ڷ� �����ϰ�
	�ʵ带 �Ʒ��� ������ ������ �ʱ�ȭ �� ����� �ʵ� ������ ��� ���
	
	�л�1> �й�:21001, �̸�:�̵���, �г�:1, ��:5, ����:'��'
	�л�2> �й�:20345, �̸�:��μ�, �г�:2, ��:3, ����:'��'
	
	[����ȭ��]
	�л�1 : 21001 / �̵��� / 1 / 5 / ��
	�л�2 : 20345 / ��μ� / 2 / 3 / ��

	*/
	public void practice2() {
		Student s1 = new Student(21001, "�̵���", 1, 5, "��");
		Student s2 = new Student();
	  
		s2.setStudentId(20345); 
		s2.setName("��μ�");
		s2.setGrade(2);
		s2.setClassNum(3);
		s2.setGender("��");
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
	
	
	
	/*���� ���� 3
	�Է� ���� ���� �̿��Ͽ� �л� ��ü�� �����ϰ� �л� ������ ��� ���
	(�Է� ���� �� ����� Scanner ��ü�� ReviewService Ŭ������ �ʵ忡 ����.
	
	[���� ȭ��]
	�й� : 22453
	�̸� : ��ö��
	�г� : 1
	�� : 2
	���� : ��
	�Է� ���� �л� ���� : 22453 / ��ö�� / 1 / 2 / ��

	*/
	public void practice3() {
		int input1 = 0;
		String input2 = "";
		int input3 = 0; 
		int input4 = 0;
		String input5 = "";
		
		System.out.print("�й� : ");
		input1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�̸� : ");
		input2 = sc.nextLine();
		
		
		System.out.print("�г� : ");
		input3 = sc.nextInt();
		
		System.out.print("�� : ");
		input4 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� : ");
		input5 = sc.nextLine();
		
		
		Student s3 = new Student(input1, input2, input3, input4, input5);
		
		System.out.println(s3);
		
	}
	
	

	/* ���� ���� 4
	���� 3�� ó�� �л� �� ���� ������ �Է� �ް� ����ϱ�.
	��, �Է� �� �ڷ����� ���� �ʴ� ���� �Է� �ϴ� ���(InputMismatchException) 
	ó�� ���� �ٽ� �Է� �ޱ�
	
	[���� ȭ��]
	�й� : 22453
	�̸� : ��ö��
	�г� : ���г�
	�ڷ����� ���� �ʴ� ���� �ԷµǾ����ϴ�. �ٽ� �Է����ּ���.
	�й� : 22453
	�̸� : ��ö��
	�г� : 1
	�� : 2
	���� : ��
	�Է� ���� �л� ���� : 22453 / ��ö�� / 1 / 2 / ��
	*/
	public void practice4() {
		int input1 = 0;
		String input2 = "";
		int input3 = 0; 
		int input4 = 0;
		String input5 = "";
		
		while(true) {
		 try {
			 System.out.print("�й� : ");
			 input1 = sc.nextInt();
			 sc.nextLine();
			
			 System.out.print("�̸� : ");
			 input2 = sc.nextLine();
			
			 System.out.print("�г� : ");
			 input3 = sc.nextInt();
			
			 System.out.print("�� : ");
			 input4 = sc.nextInt();
			 sc.nextLine();
			
			 System.out.print("���� : ");
			 input5 = sc.nextLine();
			 break;
		 }
		 catch(InputMismatchException e) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			sc.nextLine();
		 }
			
		} 
		
		Student s3 = new Student(input1, input2, input3, input4, input5);
		System.out.println(s3);
	}
	
	
	/*���� ���� 5
	3���� �л� ������ �Է� �޾� Student ��ü �迭�� ������ �� ���
	
	[����ȭ��]
	1��° �л� ���� �Է�
	�й� : 100
	�̸� : �̹���
	�г� : 5
	�� : 5
	���� : ��
	2��° �л� ���� �Է�
	�й� : 200
	�̸� : �輺��
	�г� : 6
	�� : 6
	���� : ��
	3��° �л� ���� �Է�
	�й� : 300
	�̸� : ����
	�г� : 4
	�� : 4
	���� : ��
	1��° �л� : 100 / �̹��� / 5 / 5 / ��
	2��° �л� : 200 / �輺�� / 6 / 6 / ��
	3��° �л� : 300 / ���� / 4 / 4 / ��

	*/
	public void practice5() {
		
		Student students[] = new Student[3];
		
		int input1 = 0;
		String input2 = "";
		int input3 = 0; 
		int input4 = 0;
		String input5 = "";
		int count = 1;
		int i;
		
	
		for (i = 0; i<students.length; i++) {
			
			System.out.println(count + "��° �л� ���� �Է�");
			 System.out.print("�й� : ");
			 input1 = sc.nextInt();
			 sc.nextLine();
			
			 System.out.print("�̸� : ");
			 input2 = sc.nextLine();
			
			 System.out.print("�г� : ");
			 input3 = sc.nextInt();
			
			 System.out.print("�� : ");
			 input4 = sc.nextInt();
			 sc.nextLine();
			
			 System.out.print("���� : ");
			 input5 = sc.nextLine();
			 students[i] = new Student (input1, input2, input3, input4, input5);
			 
			 count++;
		}
		for(i = 0 ; i<students.length; i++) {
			int j = i+1;
			System.out.println(j + "��° �л� : "+ students[i]);
		}
		
	
	}
	
	/*���� ���� 6
	 	�Ʒ� ����ȭ�� ó�� �����ϴ� �ڵ带 �ۼ��Ͻÿ�. (�л� �迭�� ����)
		
		Student[] stdList = { new Student(21001, "�赿��", 1, 3, '��'),
							  new Student(21002, "������", 1, 7, '��'),
							  new Student(20003, "������", 2, 9, '��'),
							  new Student(19027, "�赿��", 3, 2, '��'),
							  new Student(19030, "�̻���", 3, 7, '��')
							};

		
		[���� ȭ��]
		==�˻� ���� ����==
		1. �̸�
		2. �г�
		3. ��
		4. ����
		0. ����
		�˻� ���� >> 8
		�߸� �Է��ϼ̽��ϴ�. �ٽ� �������ּ���.
		
		==�˻� ���� ����==
		1. �̸�
		2. �г�
		3. ��
		4. ����
		0. ����
		�˻� ���� >> 1
		�̸� �Է� : ������
		21002 / ������ / 1 / 7 / ��
		�˻� ��� : 1��
		
		==�˻� ���� ����==
		1. �̸�
		2. �г�
		3. ��
		4. ����
		0. ����
		�˻� ���� >> 2
		�г� �Է� : 1
		21001 / �赿�� / 1 / 3 / ��
		21002 / ������ / 1 / 7 / ��
		�˻� ��� : 2��
		
		==�˻� ���� ����==
		1. �̸�
		2. �г�
		3. ��
		4. ����
		0. ����
		�˻� ���� >> 3
		�� �Է� : 7
		21002 / ������ / 1 / 7 / ��
		19030 / �̻��� / 3 / 7 / ��
		�˻� ��� : 2��
		
		==�˻� ���� ����==
		1. �̸�
		2. �г�
		3. ��
		4. ����
		0. ����
		�˻� ���� >> 4
		���� �Է� : ��
		21002 / ������ / 1 / 7 / ��
		20003 / ������ / 2 / 9 / ��
		�˻� ��� : 2��
		
		
		==�˻� ���� ����==
		1. �̸�
		2. �г�
		3. ��
		4. ����
		0. ����
		�˻� ���� >> 0
		���α׷� ����
	*/
	public void practice6() {

		Student[] stdList = { 
			 new Student(21001, "�赿��", 1, 3, "��"),
			 new Student(21002, "������", 1, 7, "��"),
			 new Student(20003, "������", 2, 9, "��"),
			 new Student(19027, "�赿��", 3, 2, "��"),
			 new Student(19030, "�̻���", 3, 7, "��")
			};
			
	 System.out.println();
	 System.out.println("==�˻� ���� ����==");
	 System.out.println("1. �̸�");
	 System.out.println("2. �г�");
	 System.out.println("3. ��");
	 System.out.println("4. ����");
	 System.out.println("0. ����");
	 System.out.print("�޴� ���� >> ");
					

	
	}
	
}

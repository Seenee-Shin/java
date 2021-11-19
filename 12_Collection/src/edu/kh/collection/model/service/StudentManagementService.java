package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.model.vo.Student;

public class StudentManagementService {
	private Scanner sc = new Scanner(System.in);
	
	private List<Student> stdList = new ArrayList<Student>();
	
	public void displayMenu() {
		      
		int sel = 0;
	
		do {
			
			System.out.println("======== �л� ���� ���α׷� ========");
			System.out.println("1. �л� ��ü ��ȸ");
			System.out.println("2. �л� ���� �߰�"); // �̸�, ����, �г�
			System.out.println("3. �л� ���� ����"); // �̸�, ����, �г�
			System.out.println("4. �л� ���� ����");
			System.out.println("5. �̸� �˻�");
			System.out.println("6. �̸�,����,�г��� ��ġ�ϴ� �л� �ε��� ��ȸ");
			System.out.println("7. �̸�,����,�г��� ��ġ�ϴ� �л� �ε��� ��ȸ 2");
			System.out.println("0. ����");
			         
			System.out.print("�޴� ���� >> ");
			
			try {
				sel = sc.nextInt();
				sc.nextLine(); // ���๮�� ����
				
				switch(sel) {
				case 1 : selectAll(); break;
				case 2 : addStudent(); break;
				case 3 : updateStudent(); break;
				case 4 : deleteStudent(); break;
				case 5 : searchStudentName();break;
				case 6 : searchIndex(); break;
				case 7 : searchIndex_2(); break;
				case 0 : System.out.println("���α׷� ����"); break;
				default : System.out.println("�޴��� �ִ� ��ȣ�� �Է����ּ���.");
				
				}
	
				
			}catch (InputMismatchException e) {
				System.out.println("������ �Է����ּ���.");
				sel = -1; // �� ó�� sel == 0 �ΰ�� �ٷ� ����Ǵ� ���� ����
				sc.nextLine(); // �Է¹��ۿ� �����ִ� �߸� �Է��� ���� ����
			}
			
		}while(sel != 0);	
	}
	//1.�л� ��ü ��ȸ 
	public void selectAll() {
		System.out.println("[�л� ��ü ��ȸ]");
		
		// �л������� ���� ��� 
		// n�� �̸� ���� �г� ���
		
		// ���� ��� "�Էµ� �л� ������ �����ϴ�." ��� 
		
		//boolean isEmpty() �޼ҵ� : �÷����� ���(����)������ true, �ƴϸ� false��ȯ
		
		if ( stdList.isEmpty()) {
			System.out.println("�Էµ� �л� ������ �����ϴ�.");
		}else {
			for(int i=0; i<stdList.size(); i++ ) {
				
				Student s = stdList.get(i);
				// stdList�� i��° ��Ҹ� Student s �� ���� 
				
				System.out.printf("%d�� %s %d�� %d�г�\n",i+1,s.getName(),s.getAge(),s.getGrade());
			}
		}
		
	}
	//2,3�� �޴��� �л� �����Է� �޼ҵ� 
	
	private Student inputStudent() throws InputMismatchException {
		//���� �߻��� ������ ����ó�� ������ ������ throw�� �⺻
		System.out.print("�̸� : ");
		String name = sc.next();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print("�г� : ");
		int grade = sc.nextInt();
		
		return new Student(name, age, grade);	
	}
	
	
	//2.�л� ���� �߰�
	public void addStudent() throws InputMismatchException {
		System.out.println("[�л� ���� �߰�]");
		stdList.add(inputStudent());
	}
	
	//3. �л� ���� ���� 
	public void updateStudent() {
		System.out.println("[�л� ���� ����]");
		
		System.out.print("�л� ��ȣ �Է� : ");
		int inputNum = sc.nextInt();
		sc.nextLine();
		
		if(stdList.isEmpty()) {
			System.out.println("�Էµ� �л� ������ �����ϴ�.");
		}else {
			
			if(inputNum<0) {
				System.out.println("������ �Է��� �� �����ϴ�.");
			}else {
				
				if((inputNum-1) >= stdList.size()) {
					System.out.println("�л� ��ȣ�� �������� �ʽ��ϴ�.");	
				}else { 
					System.out.println("�������� �Է��ϱ�");
					stdList.set(inputNum-1, inputStudent());
				}	
			}	
		}
	}
	
	public void deleteStudent() {
		System.out.println("[�л� ���� ����]");
		
		System.out.print("�л� ��ȣ �Է� : ");
		int inputNum = sc.nextInt();
		sc.nextLine();
		
		if(!stdList.isEmpty()) {
			if((inputNum-1) >= 0) {
				if((inputNum-1)< stdList.size()) {
					stdList.remove(inputNum-1);
				}else {
					
					System.out.println("�л���ȣ�� �������� �ʽ��ϴ�.");
				}
			}else {
				System.out.println("������ �Էµ� �� �����ϴ�. ");
			}
		}else {
			System.out.println("�Էµ� �л� ������ �����ϴ�.");
		}
	}
	
	private void searchStudentName() {
		System.out.print("�˻��� �л� �̸� �Է� : ");
		String sName = sc.nextLine();
		
		boolean flag = true; 
		
		if (!stdList.isEmpty()) {
			for(int i=0; i < stdList.size(); i++) {
				
				if (sName.equals(stdList.get(i).getName())) {
					System.out.println("�ε��� ��ȣ : " + i);
					System.out.println("��ȸ �� ��¹�ȣ : " + (1+i));
					System.out.println(stdList.get(i));
					flag = false;
			}
		} 
			if(flag) {
				System.out.println("�������� �ʴ� �л��Դϴ�.");
			}
		}
		else {
			System.out.println("�Էµ� �л� ������ �����ϴ�.");
		}
	}
	
	private void searchIndex() {
		
		System.out.println("[�л� �ε��� ��ȸ]");
		Student std = inputStudent(); 
		
		boolean flag = true;
		
		for(int i=0; i<stdList.size(); i++) {
			
			Student s = stdList.get(i);
			if(std.getName().equals(s.getName()) &&
				s.getAge() == std.getAge()&&
				s.getGrade()== std.getGrade()){
				
				System.out.println("�ε��� ��ȣ : " + i );
				flag = false;
			}
				
			
		} if(flag) {
			System.out.println("��ġ�ϴ� �л��� �������� �ʽ��ϴ�.");
		}
	}
	
	private void searchIndex_2() {
		System.out.println("[�л� �ε��� ��ȸ_2]");
		Student std = inputStudent(); 
		
		// object.equals overriding
		//int List.indexOf(Object o)
		//����Ʈ���� �Է¹��� �� (�Ű����� o)�� ���� ��ü�� �����ϴ� index��ȯ, ������ -1
		//���� ��üȮ���ϴ� equals �������̵��� �ʼ������� ���� 
		
		if(stdList.indexOf(std)!= -1) {
			System.
			out.println("�ε��� ��ȣ : " + stdList.indexOf(std));
		}else {
			System.out.println("��ġ�ϴ� �л��� �������� �ʽ��ϴ�.");
		}
	}
}

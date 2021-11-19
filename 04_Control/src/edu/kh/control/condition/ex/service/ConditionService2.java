package edu.kh.control.condition.ex.service;

import java.util.Scanner;

public class ConditionService2 {

	public void example1() {
		// Ű����� ������ �Է� �޾�
		// 3�� ��� : ������
		// 4�� ��� : �Ķ���
		// 5�� ��� : �����  ���
		// ������ ��� : ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� : ");
		int input = sc.nextInt();
		
		String color;
		
		switch(input) {
		
		case 3 : color = "������"; break;
		case 4 : color = "�Ķ���"; break;
		case 5 : color = "�����"; break;
		default : color = "���";
	
		}
		
		System.out.println(color);
		
		//if�� ����
		
		if(input == 3) {
			color = "������";
		}else if(input == 4) {
			color = "�Ķ���";
		}else if(input == 5) {
			color = "�����";
		}else{
			color = "���";
		}
		System.out.println(color);
	}
	
	public void example2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� :");
		int input = sc.nextInt();
		
		String team;
		
		switch(input % 4) {
		
		case 1 : team = "�ѽ���"; break;
		case 2 : team = "�Ͻ���"; break;
		case 3 : team = "�߽���"; break;
		default : team = "���"; 
		}
		
		System.out.println(team);
	
	}
	public void example3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��(��) �Է� : ");
		int month = sc.nextInt();
		
		String result;
		
		switch(month) {
		case 3 : case 4 : case 5 : result = "��"; break;
		case 6 : case 7 : case 8 : result = "����"; break;
		case 9 : case 10 : case 11 : result = "����"; break;
		case 12 : case 1 : case 2 : result = "�ܿ�"; break;
		default : result = "�߸� �Է� �ϼ̽��ϴ�.";
		
		}
		
		System.out.println(result);
		
	}
	
	public void example4() {
		//����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� 1:");
		int input1 = sc.nextInt();
		
		System.out.print("���� �Է� 2:");
		int input2 = sc.nextInt();
		
		System.out.print("������ �Է� :");
		char op = sc.next().charAt(0);
		//*��Ʈ������ Ư�� ��ġ�� �ִ� �����ϳ��� ��ȯ�ϴ� �޼ҵ� 
		// = String.charAt(index); (index : ���ڿ� ����)
		// sc.next() = String

		int result = 0;
		
		boolean flag = true;
		// flag : ����� ������� �������� �����ϴ� ����
		// true == ����
		// false == ��� ������ 
		
		switch(op) {
		case'+' : result = input1 + input2; break;
		case'-' : result = input1 - input2; break;
		case'*' : result = input1 * input2; break;
		case'/' :
			if(input2 == 0) { 
				System.out.println("0���� ���� �� �����ϴ�.");
				flag = false; // flag �� false�� ����� ���� 125���� ��¹� ������ ����
			} else {
				result = input1 / input2;
			}
			break;

		case'%' : result = input1 % input2; break;
		default : 
			System.out.println("�ش� �����ϴ� �������� �ʽ��ϴ�.");
			flag = false;
		}	
		
		
		if (flag) { //flag�� ���� ���� == true ���� �ʾƵ� �� (flag �� boolean���̱� ����)
			System.out.printf("%d %c %d = %d\n",input1, op, input2, result);			
		}
		
	}
	
	
	
}

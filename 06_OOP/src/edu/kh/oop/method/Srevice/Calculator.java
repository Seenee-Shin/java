package edu.kh.oop.method.Srevice;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
	
	private Scanner sc = new Scanner(System.in);
	//�ʵ忡 Scanner ��ü���� > ��ü ���� ��� �޼ҵ忡�� sc ��밡�� 
	// ==�ν��Ͻ� ���� (���������� ���)
	
	//������ 
	public Calculator() { }
	// �⺻�����ڴ� �ȿ� ���� ��� �� // �� ��ü ������ �ַ� ��� // Ŀ���ҿ�

	//�޼ҵ� 
	
	// ���� �޴� ȭ�� ��� ��� 
	public void displayMenu() {
		
		int menuNum = 0; //�Է��Ѹ޴� ��ȣ ���� ���� 
		
		do {
			System.out.println("======���� ���α׷�======");
			System.out.println("1. ���� ���� ��� ");
			System.out.println("2. �� ���� �� ���ϱ�");
			System.out.println("3. �� ���� �� ���ϱ�");
			System.out.println("4. a^2 + b^2 = c^2 ���� c^2 ���ϱ�");
			System.out.println("5. �Է� ���� ���� ũ�⸦ ������ �迭 ����, 1���� ���ʴ�� �ʱ�ȭ");
			System.out.println("6. �迭 ���� �� �迭�� �հ� ���ϱ�");
			
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ �Է� �ޱ� : ");
			menuNum = sc.nextInt();
			sc.nextLine(); //�Է� ���ۿ� �����ִ� \n ����
			
			switch(menuNum) {
			
			case 1 : printVersion(); //���� Ŭ���� ������ �ٸ� �޼ҵ� ȣ�� 
					break;
					
			case 2 : // �μ��� �Է�, �Ű������� ���� 
				System.out.print("ù ��° �� �Է� : ");
				int num1 = sc.nextInt();
				
				System.out.print("�� ��° �� �Է� : ");
				int num2 = sc.nextInt();
				
				sum1(num1,num2); // �޼ҵ��� �Ű������� ���� 
				
				break;
			case 3 : 
				
				System.out.println(sum2()); break; 
			
			case 4 : pythagoras(); break;    
			
			case 5 : createArray(); break;    
			
			case 6 : arraySum(); break;    
			
			case 9 : System.out.println("���α׷� ����"); break;
			
			default : System.out.println("�޴� ��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
			
			}
			
		}while(menuNum != 9); 
		
		
	}
	// ���� ���� ��� ��� 
	private void printVersion() { // �Ű����� & ��ȯ�� ����
	// �ܺ� ���� ���� 
		System.out.println("���� ���� ���� : version 0.1");
		
	}
	
	private void sum1(int param1, int param2) {
	//2�� �����
		System.out.printf("%d + %d = %d\n", param1, param2, param1+param2);
		
		
	}
	private String sum2() { //�Ű����� x ��ȯ�� o
	//3�� �� ��� 
		String result = null;
		
		System.out.print("ù ��° �� �Է� : ");
		int num1 = sc.nextInt();
	
		System.out.print("�� ��° �� �Է� : ");
		int num2 = sc.nextInt();
		
		System.out.print("�� ��° �� �Է� : ");
		int num3 = sc.nextInt();
		
		int sum = num1+num2+num3;
		
		result = num1 + " + " + num2 + " + "+ num3 + " = " + sum; 
		
		return result; //���� ���� ������ ȣ���� ������ ��ȯ
	}
	
	private void pythagoras() {
		//�μ��� �Է�, ������ �� ���ϱ� 
		System.out.print("ù ��° �� �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° �� �Է� : ");
		int num2 = sc.nextInt();
		
		ApplicationSet as = new ApplicationSet();
		// �ٸ� Ŭ���� ����ͼ� ��ü ���� 
		
		int sum = as.squared(num1) + as.squared(num2);
		
		System.out.println("�� ���� ������ �� : " + sum);
		
	}
	
	private void createArray() {
		System.out.print("ũ�� �Է� : ");
		int size = sc.nextInt();
		
		ApplicationSet as = new ApplicationSet();
		System.out.println(Arrays.toString(as.createArray(size)));
	}
	
	private void arraySum() {
		System.out.print("ũ�� �Է� : ");
		int size = sc.nextInt();
		
		ApplicationSet as = new ApplicationSet();
		
		int[] arr = as.createArray(size); //�迭����� 
		
		int sum = as.arraySum(arr);//�迭 �� ���ϱ� 
		
		System.out.println("�迭 : " + Arrays.toString(arr));
		System.out.println("�迭 �� : " + sum);
		
	}
	
}

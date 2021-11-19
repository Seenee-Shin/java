package edu.kh.eh.model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import edu.kh.eh.model.exception.DivideByTwoException;

public class ExceptionService {

	public void example1() {
		// try - catch
		// try : ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 ���ο� �ۼ�, �õ���
		// catch : try �κп��� �߻��� ���ܱ����� ó����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ������ �Է¹޾� �������� �� ���ϱ� ");
		
		System.out.print("�Է� 1 : ");
		int num1 = sc.nextInt();

		System.out.print("�Է� 2 : ");
		int num2 = sc.nextInt();
		
		int devide = num1 / num2 ; 
//		try {
//			System.out.printf("%d / %d = %d\n", num1, num2, devide);
//			
//		}catch(ArithmeticException e) {
//			//try �������� �߻��� ���ܱ��� �� catch�� ���ܸ� �Ű����� �ۼ� 
//			System.out.println("0���� ���� �� �����ϴ�. ");
//			//ArithmeticException : ������� - 0���� ���������� �ַ� �߻� 
//			}
		
	}	
	
	public void example2() {
		//���� �ΰ� �Է� , ���� ���
		// ���� �Է� �޼ҵ� ���� �ۼ� 
		int num1 = inputNumber(1);
		int num2 = inputNumber(2);
		
		System.out.printf("%d x %d = %d\n", num1, num2, (num1*num2));
	}
	
	public int inputNumber(int i) {
		
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(i + "��° ���� �Է� : ");
			
			try {
				num = sc.nextInt();
				break;
				//���ܰ� �߻� �ϸ� �ٷ� catch������ �Ѿ�� ������ break�� ������� �ʴ´�.
			}catch(InputMismatchException e) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				sc.nextLine(); //�Է¹��ۿ� �����ִ� ���ڵ��� �����ش�. 
				// ���� : �߸� �Էµ� ���ڰ� sc.nextInt()�� ��� �����ֱ� ������ ���ѷ����� ���� �� �ִ�. 
			}
		}
		return num;
	}
	
	public void example3() {
		//finally : try -catch ���� �� �������� �ʼ��� �����Ͽ��� �ϴ� �ڵ屸�� 
		
		String str = null;
		// null �ƹ��͵� �����ϰ� ���� ���� ���� 
		try {
		System.out.println(str.length());
		//NullPointerException /; null ���� ���� 
		}catch(NullPointerException e) {
			System.out.println("��ü�� ���� �ϰ� ���� �ʽ��ϴ�.");
		}finally {
			System.out.println("������ ����");
		}
	}
	
	public void example4() {
		
		//throw : ���� ���� �߻� ���� ���ܸ� ���� 
		//Unchecked Exception������ ���� �߻� ���� 
		
//		throw new NullPointerException();
		
//		throw new IOException();
		// Checked Exception : ����ó�� �Ұ� 
		// if������ �ذ� �Ұ� 
		// ���ܻ�Ȳ�� �߻��� �� �ִ� ��찡 ���� ��� 
		
		BufferedReader br = null;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		//Ű����� ���� ���ڿ��� �Է� ���� 
		//Scanner�� ���� ��� - �ӵ��� ��ĳ�� ���� ������ 
	
		System.out.println("���ڿ� �Է� : ");
		try {
			String str = br.readLine(); 
			
			// IOException �߻� ���ɼ� ���� 
			// try - catch �� ó�� 
			
		}catch(IOException e) {
			System.out.println("���� �߻�");	
		}
	}
	
	public void example5() {
		// �� ������ �Է¹޾� ���� �� ��� 
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("�Է� 1 : ");
			int num1= sc.nextInt();
			
			System.out.print("�Է� 2 : ");
			int num2= sc.nextInt();
			
			System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
		} catch(InputMismatchException e) {
			
			System.out.println("������ �Է��� �ּ���.");
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
			//���� ó���� catch�� ������ ��� ���� 
			//try �������� ���� �߻��� catch���� ���������� �������� �ش�Ǵ� catch������ ó���� 
			// �߻��ϴ� ���ܿ� ���� ���������� ó�� ���� (if ~ else if ó��) 
		}catch(Exception e) { //Exception == ������ �ֻ��� Ŭ���� 
			// �������� ���� �Ǿ� �տ��� ó�� ���� ���� ���ܵ��� ó�� 
			System.out.println("�� �� ���� ���� �߻�");
			
			e.printStackTrace(); // ���� �߻��� ���� �߻� ���� �޼ҵ带 ���ʴ�� ȣ�� 
			//���� �ֻ��� Ŭ������ Exception�� catch�� ���ʿ� ��ġ�� ��� �ؿ� �κ� catch���� ���� �� �� ����.
		}
		
	}
	public void example6() {
		// method A, methodB ���� �߻��ϴ� ���ܸ� ��Ƽ� ó�� 
		try {
		methodA();
		}catch(IOException e) {
			System.out.println("���� ó����");
		}
	}
	
	public void methodA() throws IOException{
		methodB();
	}
	
	public void methodB() throws IOException {
	 throw new IOException();
	 // ���� ���� �߻� 
	}
	
	public void example7() {
		try {
			divide(10,2);
		} catch (DivideByTwoException e) {
			
		}
	}
	
	 public void divide(int num1, int num2) throws DivideByTwoException {
		if(num2 != 2) {
			System.out.println(num1 / num2);
		}else {
			// ���� �����߻� 
			throw new DivideByTwoException();
		}
	}
}


package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
		
	public void practice1() {
		// ��� ����� ������ ���� ������������ �Ѵ�. �ο� ���� ���� ������ Ű����� �Է� �ް�
		//1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ������ ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο��� : ");
		int ppl = sc.nextInt();
		System.out.print("���� ���� : ");
		int candy = sc.nextInt();
		
		System.out.println();
		
		int result1 = ( candy / ppl);
		System.out.println("1�δ� ���� ���� : " + result1);
		
		int result2 = (candy % ppl);
		System.out.println("���� ���� ���� : " + result2);
	
	}
	
	public void practice2() {
		//Ű����� �Է� ���� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϼ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�г� : ");
		int grade = sc.nextInt();		
		
		System.out.print("�� : ");
		int cNum = sc.nextInt();		
		
		System.out.print("��ȣ : ");
		int sNum = sc.nextInt();
		
		System.out.print("���� : ");
		double score = sc.nextDouble();
		
		System.out.println();
		
		System.out.println
		(grade + "�г� " + cNum + "�� "+ sNum + "�� " + name +"�� ������ "+ score + "�̴�." );
		
	}
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int kor = sc.nextInt();
		
		System.out.print("���� : ");
		int eng = sc.nextInt();
		
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		System.out.println();
		
		int total = kor + eng + math;
		double avg = (kor + eng + math)/3.0;
		
		System.out.println("�հ� : " + total);
		System.out.printf("��� : %.2f", avg);

	}
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�1 : ");
		int input1 = sc.nextInt();
		System.out.print("�Է�2 : ");
		int input2 = sc.nextInt();
		System.out.print("�Է�3 : ");
		int input3 = sc.nextInt();
		
		System.out.println();
		
		boolean result = (input1 == input2 && input2 == input3);
		System.out.println(result);
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.println();
		
		String result = age <= 13 ? "���": (age > 19 ? "����": "û�ҳ�");
		System.out.println(result);
	
	}
}

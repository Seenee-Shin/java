package edu.kh.control.condition.ex.service;

import java.util.Scanner;

public class ConditionSerivce {

	public void example1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		
		if(input > 0); {
			System.out.println("����Դϴ�.");	
		}
		if(input <= 0 ); {
			System.out.println("����� �ƴմϴ�.");
		}	
	}
	
	
	// if - else 
	public void example2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ϳ� �Է� : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("��� �Դϴ�.");
		}else {
			System.out.println("���� �Դϴ�.");
		}
	}
	
	// if - else if - else
	
	public void example3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		
		String result;
		
		if(input > 0) {
			result = "���";
		} else if(input < 0) {
			result = "����";
		} else {
			result = "0";
		}
		
		System.out.println(result + " �Դϴ�.");
	}

		public void example4() {
			Scanner sc = new Scanner(System.in);
			System.out.print("���� : ");
			int age = sc.nextInt();
			
			String result;
			
			if(age <= 13) {
				result = "���";
			} else if (age > 19) {
				result = "����";
			} else {
				result = "û�ҳ�";
			}
			System.out.println(result + " �Դϴ�.");
		}
	 public void example5() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("��(��) �Է� : ");
		 int month = sc.nextInt();
		 
		 String season;
		 
		 if(month == 12 || month == 1 || month == 2 ) {
			 season = "�ܿ�";
		 }else if (month >= 3 && month <= 5) {
			 season = "��";
		 }else if (month >= 6 && month <= 8) {
			 season = "����";
		 }else if (month >= 9 && month <= 11) {
			 season = "����";
		 }else {
			 season = "�߸� �Է��Ͽ����ϴ�.";
		 }
		 
		 System.out.println(season);
	 }
	 public void example6() {
		 
		 	// ������ �Է� �޾�
			// 90�� �̻��� ��� : A
			// 80�� �̻�, 90�� �̸��� ��� : B
			// 70�� �̻�, 80�� �̸��� ��� : C
			// 60�� �̻�, 70�� �̸��� ��� : D
			// 60�� �̸��� ��� : F
			// 100�� �ʰ� 0�� �̸��� ��� : �߸� �Է��ϼ̽��ϴ�

		 Scanner sc = new Scanner(System.in);
		 System.out.print("���� �Է� : ");
		 int score = sc.nextInt();
		 
		 String result;
		 if(score > 100 || score < 0 ) {
			 result = "�߸� �Է��ϼ̽��ϴ�.";
		 } else if (score >= 90) {
			 result = "A";
		 }else if (score >= 80 ) {
			 result = "B";
		 }else if (score >= 70) {
			 result = "C";
		 }else if (score >= 60) {
			 result = "D";
		 }else {
			 result = "F";
	 }
		 System.out.println(result);
	 }
	 
	 
	 //��ø if��
	 public void example7() {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("���� �Է� : ");
		 int age = sc.nextInt();
		 
		 System.out.print("Ű �Է�(cm):");
		 double height = sc.nextDouble();
		 
		 String result;
		 
		 if (age < 0 || age > 100) {
			 result = "�߸� �Է��ϼ̽��ϴ�.";
		 }else {
			 if (age < 12) {
				 result = "���� ������ �ƴմϴ�.";
			 }else {
				 if (height < 140.0) {
					 result = "���� Ű�� �ƴմϴ�.";
				 }else {
					 result = "ž�� ����";
				 }
			 }
		 }
		 System.out.println(result);
	 } 
	 public void example8() {
		 //���̱ⱸ ž�� ���� �˻�
		 //���� : ���� 12���̻� , Ű 140.0cm �̻�
		 
		 //���̸� 0~ 100���̷� �Է� ���� ���� ��� , "���̸� �߸� �Է�"
		 // Ű�� 0~250cm ���̷� �Է����� �������, "Ű�� �߸� �Է�"
		 // �� �׸��� �Է� ���ڸ��� �˻�, �߸��� ��� ���α׷� ����
		 
		 // ���� ����, Ű ������ : "���̴� ����, Ű�� ������"
		 // ���� ������ Ű ���� : "Ű�� ����, ���̴� ������"
		// ��� ������ : ������ 
		 // ��� ���� : ž�°��� 
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("���� �Է� : ");
		 int age = sc.nextInt();
		 
		 
		 String result;
		 
		 if(age < 0 || age > 100) {
			 System.out.println("���̸� �߸� �Է� �ϼ̽��ϴ�.");
		 } else {
			 		System.out.print("Ű �Է�(cm):");
			 		double height = sc.nextDouble();
			 		
			 		if(height < 0 || height > 250.0) {
			 			result = "Ű�� �߸� �ϼ̽��ϴ�";
			 		} else { 
			 			if (age >= 12 && height >= 140.0) {
			 				result = "ž�°���";
			 			} else if( age < 12 && height >= 140.0) {
			 				result = "Ű�� �����ϳ�  ���� ������";
			 			} else if (age >= 12 && height <= 140.0) {
			 				result = "���̴� �����ϳ� Ű ������";
			 			}else { 
			 				result = "������";
			 			}
			 			
			 		}
			 		System.out.println(result);
		 }
		 
	 }
	 
}


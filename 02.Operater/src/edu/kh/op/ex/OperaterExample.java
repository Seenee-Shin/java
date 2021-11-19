package edu.kh.op.ex;

import java.util.Scanner;

public class OperaterExample {
	
	public void example1() {
		//���� ������ - �� ���� ������ !
		//�� ���� �ݴ�� �����ϴ� ������ 
		
		boolean isTrue = true;
		
		System.out.println("is True : " + isTrue);
		System.out.println("is False : " + !isTrue);
		
	}
	//���� ������
	// �ǿ����ڸ� 1 ���� ��Ű�ų� ���� ��Ű�� ������ 
	// ���� ���� & ���� ���� 
	// �������� : �켱 ���� ����, �ٸ� ���� ���� ���� ó�� �Ѵ�
	// �������� : ������ ��� ���� �� ����ó��
	public void example2() {
		
		int num1 = 10;
		int num2 = ++num1;
		
		System.out.println("num1 : "+ num1);//11
		System.out.println("num2 : "+ num2);//11
		
		int num3 = 10;
		int num4 = num3++;
		System.out.println("num3 : "+ num3);//11
		System.out.println("num4 : "+ num4);//10
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		
		//3++ + --5
		//3++ + 4
		
		
		System.out.println(a + "/" + b + "/" + c);
	}
	
	public void example3() {
		//���������
		int num = 5; 
		System.out.printf("%d / %d = %d\n", num, 3, num/3);
		System.out.printf("%d %% %d = %d\n", num, 3, num%3);
		
		System.out.println(5 % 3 == 0);
		System.out.println(273 % 3 == 0);
		
	}
	public void example4() {
		//�񱳿����� �׻� �������� =
		//�񱳿������ �������� ������ ��,���� (true, false)
		
		int a =10;
		int b = 20;
		System.out.println(a == b);
		System.out.println(!(a == b));
		System.out.println(a != b);
		
		System.out.println("-----------------------");
		
		int c = 4;
		int d = 5;
		
		System.out.println(c < d);
		System.out.println(c+1 < d);
		System.out.println(c+1 <= d);
		System.out.println((++c != d) == ( --c != d));
							//(5 != 5) ==  (4 != 5)
		
		System.out.println("-----------------------");
		int num = 123;
		System.out.println("num�� ¦���ΰ�? " + (num%2 == 0));
		System.out.println("num�� ¦���ΰ�? " + (num%2 != 1));

		System.out.println("num�� Ȧ���ΰ�? " + (num%2 == 1));
		System.out.println("num�� Ȧ���ΰ�? " + (num%2 != 0));
		
		System.out.println("-----------------------");	
		
	}
	
	public void example5() {
		//�������� && 
		// &&(AND) : �Ѵ� true �϶��� true'
		//~�̸鼭, �̰�, ����, ����
		// ||(OR) :  �ϳ��� true�� true
		// �Ǵ� ~�ų� 
		
		int a = 100;
		//a�� 100�̻� �̸鼭 ¦���ΰ�?
		System.out.println(a >= 100 && a%2 == 0);
		if (a >= 100 && a%2 == 0) { 
			System.out.println("��");
		}	else { 
				System.out.println("�ƴϿ�");
		}
		
		System.out.printf("���� �Է� : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		boolean result = input >=1 && input <= 100;
		System.out.print("�Է� ���� ���� 1 �̻�, 100���� �ΰ�? " + result);
			
		
	}
	public void example6() {
		//���մ��Կ����� ( +=, -=, *=, /=, %=)
		//�ǿ����ڰ� ���� �� ����� �ٽ� �ڽſ��� ���� 
		// ���������� = 1�� ����, ����
		// ���մ��Կ����ڴ� ������������ ���� ����
		  int a = 5;
		  
		  a += 5;
		  System.out.println(a);
		  
		  a -= 5;
		  System.out.println(a);
		  
		  a *= 4; 
		  System.out.println(a);
		  
		  a /= 3;
		  System.out.println(a);

		  a %= 5;
		  System.out.println(a);
		 
	}
		public void example7() {
			//���� ������ (���ǽ� ? ��1 : �� 2)
			// ���϶� ��1 ���� , �����϶� ��2 ����
			// ���ǽ� : ���� ��, ������ ���� (��, ��, ������)
			
			Scanner sc = new Scanner(System.in);
			System.out.printf("���� �ϳ� �Է� : ");
			int input = sc.nextInt();
			String result = input%2 == 1 ?  "Ȧ��" : "¦��";
			System.out.println(result + " �Դϴ�.");
			
		}
		
		public void example8() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���� �ϳ� �Է� : ");
			int input = sc.nextInt();
			
			String result = input < 0 ? "����" : "���";
			System.out.println(input + "��/�� " + result + "�Դϴ�.");
			
			
		}
		
		// ��ø�ϱ�
		public void example9() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���� �ϳ� �Է� : ");
			int input = sc.nextInt();
			
			String result = input > 0 ? "���" : (input == 0 ? "0" : "����");
			System.out.println(input + "��/�� " + result + "�Դϴ�.");
			
		}
}

		

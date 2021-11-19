package edu.kh.control.branch.ex.service;

import java.util.Scanner;

public class BranchService {
	
	//�б⹮ break;
	// - �ݺ����� �����Ű�� ���� 
	
	public void example1() {
		//0�� �Է� �� �� ���� ������ �Է� �ް� 0�� �Է� �Ǹ� �Էµ� ��� ������ �� ��� �� ����
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while(true) { // �׻� true�� ���ѹݺ� (���ѷ���)
			System.out.print("���� �Է� : ");
			int input = sc.nextInt();
			
			if (input == 0) {	
				break;  // ����Ǹ� break���� �ڿ��ִ� �ڵ� ��� �Ǵ� �پ� ������ �̵� 
			} 
			sum += input;			
		}
		System.out.println("�հ� : "+ sum);
	}
	
	public void example2() {
		
		for (int i = 2 ; i<=9 ; i++ ) {
			for (int j =1 ; j <= 9 ; j++) {
				System.out.printf("%d x %d = %d ", i, j, i*j);
				
				if ( j == i ) {
					break;// �б⹮�� ��ø�Ǿ��ֽ� �ݺ��� �ȿ��� ���� ����� �ݺ����� �ۿ�
				}
			} 
			System.out.println();
		}
	}
	
	public void example3a() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�(����� !exit) : ");
		String str = "";
		while(true) {
			
			String input = sc.nextLine();
			
			if (input.equals("!exit")) {
				//�񱳿����� (==)�� ���ڿ����� ���� ����� �� ����.
				// == ��� String.equals ��� 
				break;
			} 
			str += input+"\n";
		} System.out.println(str);
	}

	public void example3b() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ� �Է�(����� !exit)");
		String str = "";
		String input = "!exit";
		
		do{ // ���� �������� �ʰ� ������ 1���� ���� �� ���� 
			input = sc.nextLine();
			if (!input.equals("!exit")) { 
				str = input + "\n";
			}
			
		}while (!input.equals("!exit"));
		
		System.out.println(str);	
	}
	
	public void example5() {
		// continue �ݺ��� �������� ��� ���� , �ݺ��� �ǳ� �� �� �ִ� ó�� ��� 
		
		// for �� : ������ �������� �̵� �� ���� �� ���� �� 
		// while �� : ���ǽ� �̵� 
		// 1~10������ �ִ� 3�� ����� �� ���ϱ� 
		
		int sum = 0;
		for (int i = 1 ; i<=10; i++) {
			
			if(i %3 != 0) {
			continue;
			}
			sum += i;
		}
	}
	
	public void example6() {
		// 1~100 �ݺ���� (1�� ����)
		// 5�� ����� �ǳʶٱ�
		// 40�϶� ���� 
		
		
		for (int i = 1 ; i<=100; i++) {
			
			if (i == 40) {
				break;
			}
			
			if(i % 5 == 0) {
			continue;
			}
			
		   System.out.println(i);
		}
	}
	
	public void example7() {
		// ����ڷ� ���� �Է� ���� ������ �Ҽ����� �Ǻ��ϴ� ���α׷� 
		//�� , �Է� ���� ���� 2���� ���� ��� "�߸� �Է� �ϼ̽��ϴ�."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		int input = sc.nextInt();
		
		if(input<2) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else {
			
			boolean flag = true;//�Ҽ� �Ǻ��� ����
			
			for(int i = 2; i<input ; i++) {
				if ( input % i == 0) { //�ڱ⺸�� ���� �� �� �������� 0�� ���� ������ �Ҽ��� �ƴ�
					flag = false; //�Ҽ��� �ƴ��� ���� 
					break;
				}
			} //for���� �������� �ѹ��� if ���� ������� �ʾ��� �� �Ҽ� 
			if(flag) {//�Ҽ��� ��� 
				System.out.println("�Ҽ��Դϴ�. ");
			}else {// �Ҽ��� �ƴѰ��
				System.out.println("�Ҽ��� �ƴմϴ�. ");				
			}
		}
	}
	
	public void example8() {

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("�Է� : ");
			int input = sc.nextInt();
			
			if(input < 2) {
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
				
			}else {
				
				boolean flag = true;
				for(int i = 2 ; i < input ; i++) {
					if(input % i == 0) {
						flag = false;
						break;
					}
				}
				
				if(flag) {
					System.out.println("�Ҽ��Դϴ�.");
				}else {
					System.out.println("�Ҽ��� �ƴմϴ�.");
				}			
				break;
			} 	
		}		
	}
	
	public void example9() {
		//369 ���� �����
		//10 ~ 99 ���� ����
		//10 ~ 99�� �ƴ� ��� "�ٽ� �Է��� �ּ���"
		// ���� 3,6,9,�� �� ���ڴ� "¦"ǥ��
		//33 ,36,39 �� �� "¦¦"
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�Է� : ");
			int input = sc.nextInt();
			
			if(input < 10 || input > 99) {
				System.out.println("�ٽ� �Է��� �ּ���.");
			} 
			else {
				for (int i = 1 ; i <= input; i++) {
					int ten = i / 10;
					int one = i % 10;
					
					if((one%3 == 0 && one!=0)&&(ten%3 == 0 && ten != 0)){
						System.out.print(" ¦¦");
					} if((one%3 == 0 && one!=0)||(ten%3 == 0 && ten != 0)){
						System.out.print(" ¦");
					} else { System.out.printf("%3d ",i);
					}	if (i %10 == 0) {
						System.out.println();	
				}
				}	
			}	break;	
		}
	}
}

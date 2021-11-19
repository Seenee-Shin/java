package edu.kh.control.loop.ex.service;

import java.util.Scanner;

public class LoopService {
		//�ݺ��� for 
	// for ( �ʱ��; ���ǽ�; ������){
	//  }
	// �ʱ�� : for�� �ȿ��� ����� ���� , �ݺ� ��� ���� ��� 
	// ���ǽ� : for���� �ݺ� ���θ� �����ϴ� ���ǽ� 
	 //			�ʱ� �Ŀ� ����� ������ �̿��Ͽ� ���ǽ� �ۼ� 
	// ������ : �ʱ���� �ݺ����� ������ ������ ���� �Ǵ� ���� 
	
	public void example1() {
		// 1~10���� 1�������ϸ� �ݺ����
		for(int i = 1; i <= 10 ; i++ ) {
			System.out.println(i + "���");
		}
	}
	
	public void example2() {
		for(int i = 5; i <= 15 ; ++i ) {
			System.out.println(i + "���");
		}
	}
	
	public void example3() {  // i += 2 == i = i+2 ���� ���� ������ 
		for(int i=1; i <= 20 ; i += 2) {
			System.out.println(i);
		}
	}
	// ====================== ���� ���� =============================
	public void example4() {
		for(int i = 10; i >= 1 ; i-- ) {
			System.out.println(i);
		}
	}
	
	public void example5() {
		for(double i = 1.0; i <= 5.0 ; i = i+0.5) {
			System.out.println(i);
		}
	}
	
	public void example6() {
//		for(int i = 65 ; i <= 90 ; i++) {
//			System.out.println((char)i);
//			
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.println(i);
		}
	}
	public void example7() {
		//���� ���� �Է¹޾� �ݺ��� ó�� 
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= 5 ; i++) {
			
			System.out.print(i + "�� �Է� : ");
			int input = sc.nextInt();	
			
			sum += input; // ���� ���� ��Ŵ 	
		} 
		
		System.out.println("���� : " +sum);
		// for �� �ȿ��� ��µǸ� �ǽð� �հ谡 ���� (�ѹ� �ݺ��� ������ )
	}
	
	public void example8() {
		for(int i =1 ; i <= 20; i ++) {
			
			if (i % 5 == 0) {
				System.out.print("("+ i +")");
			} else {
				System.out.print(i + " ");	
			}
		}
	}
	
	public void example9() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <=9 ) {
			for(int i =1 ; i <= 9 ; i++) {
				System.out.printf("%d x %d = %2d\n", dan,i,dan*i );
				//%2d : 2ĭ�� ������ ���� 
			}
		}else {
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		}
	}
	
	public void example10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� 1 :");
		int i1 = sc.nextInt();
		
		System.out.print("���� �Է� 2 :");
		int i2 = sc.nextInt();
		
		int sum = 0; 
		for( int i = i1 ; i <= i2 ; i1++ ) {
			if( i %3 != 0 ) {
			 sum += i;
			} 
		}	
		System.out.println("3�� ����� ������ �հ� : " + sum);
	}
	///////////////////////��ø�ݺ���////////////////////////////////
	public void example11() {
		for (int min = 0 ; min < 60 ; min++) {
			
			for (int sec= 0; sec < 60; sec++) {
				
				System.out.printf("%02d�� %02d��\n", min, sec);
			}
		}	
	}
	public void example12() {
		for (int dan=2 ; dan <= 9; dan++) {
			
			for (int su =1 ; su <=9 ; su++) {
				System.out.printf("%d x %d = %2d\n", dan, su , dan*su);
			} System.out.println();
		}
	}
	
	public void example13() {
		for (int dan = 2 ; dan <= 9; dan++) {
			
			for (int su = 1; su <= 9; su++) {
				System.out.printf("%dx%d=%2d  ", dan, su , dan*su);
			} System.out.println();
		} 
		
	}
	
	public void example14() {
		for(int i = 1 ; i <=5 ; i++) {
			for(int j = 1; j <=5 ; j++ ) {
				System.out.print(j);
			}System.out.println();
		}
	}
	
	public void example15(){
		for(int i = 1 ; i<= 4; i++) {
			
			for( int j = 5; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public void example16() {
		for (int dan = 9; dan >= 2; dan--) {
			System.out.println("\n" + "=== " + dan + " ��===");
			
			for (int su = 9; su >= 1; su-- ) {
				System.out.printf("%d x %d = %02d\n", dan, su, dan*su);
			}
			
		}
	}
	public void example17() {
		
		for(int i = 1; i<=4; i++) {
			for(int j = 1; j <= i ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void example18() {
		for(int i = 4; i >= 1; i--) {
			for(int j =1; j <= i ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public void example19() {
		
		int count = 1;
		for(int i = 1; i <= 3; i++ ) {
			for (int j = 1; j <= 4; j++ ) {
				System.out.printf("%3d", count);
				count++;
				
			}System.out.println();
		}
	}
	
	public void example20() {
		Scanner sc = new Scanner(System.in);
		
		int input = -1; //�ʱ� ���� 0�� ��� while�� ������ �ȵ� = �ʱⰪ�� 0�̾ƴ� ������ 
		
		int sum = 0;
		
		while(input != 0 ) {
			System.out.print("���� �Է� :");
			input = sc.nextInt();
			sum += input;
		}
		
		System.out.println("�հ� : " + sum);
	}
	
	public void example21() {
		int i = 1;
		while (1 <= 10) {
			System.out.println(i);
			
			i++;
		}
		
	}
}


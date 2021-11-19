package edu.kh.array.ex.service;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayService1 {
	//�迭 : ���� �ڷ��� ������ �ϳ��� �������� �ٷ�� ��
	// ������ ������ �ϳ��� �迭������ �θ��� ������ index�� ȣ��
	
	public void example1 () {
		// �迭 ���� �ϱ� 
		int arr1[];
		int[] arr2;
		// []�迭 ��ȣ 
		
		//�迭 �Ҵ� : �޸� ���� ������� Ȯ���ϴ� �� 
		arr1 = new int[3];
		//new : heap �޸� ������ ���ο� ���� �Ҵ� 
		// int[3]: ��Ʈ �ڷ��� ���� 3���� ��Ʈ �迭
		
		arr1[0] =1;
		arr1[1] =100;
		arr1[2] =9000;
		
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[1] : " + arr1[1]);
		System.out.println("arr1[2] : " + arr1[2]);
		
		System.out.println("arr1[3] : " + arr1[3]);
		
		for (int i = 0; i< 2; i++) {
			System.out.println(arr1[i]);
		}
		
	}
	
	public void example2() {
		
		int[] arr = new int[3];
		//�迭 : stack ������ int[]������ ���� arr�� �����ϰ� 
		//heap ������ int 3ĭ�ڸ� int[]�� �Ҵ�
		// int[] ������ ������ �Ҵ�� �ּҸ� arr�� ���� 
		
		//heap������ ��� ���� �� �����Ƿ� �����Ϸ��� ���� �ʱ�ȭ�Ǿ�����
		
		System.out.println("�����Ϸ��� ���� �ʱ�ȭ Ȯ�� : ");
		
		for(int i = 0 ; i <=2; i++) {
			System.out.print(arr[i] + " ");
			
		}
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		
		System.out.println();
		System.out.println();
	
		for(int i = 0; i < arr.length; i++ ) {
			
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("�迭 ���� : " + arr.length);
		
		
	}
	
	public void example3() {
		
		//�ε����� �̿��� �ʱ�ȭ
		int[] arr = new int[5];
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 6;
		arr[3] = 8;
		arr[4] = 10;
		
		
		// for���� �̿��� �迭 �ʱ�ȭ
		int[] arr2 = new int[5];
		
		for (int i = 0 ; i < arr2.length ; i++) {
			arr[i] = (i+1)*2;
		}
		
		// �迭 ����� ���ÿ� �ʱ�ȭ
		int[] arr3 = {2,4,6,8,10};
		
		System.out.println("arr �ʱ�ȭ Ȯ�� : " + Arrays.toString(arr));
		System.out.println("arr2 �ʱ�ȭ Ȯ�� : " + Arrays.toString(arr2));
		System.out.println("arr3 �ʱ�ȭ Ȯ�� : " + Arrays.toString(arr3));
		// *Arrays.toString : �ش� �迪�� ��� ��Ұ� ������� ��� 
	}
	
	public void example4() {
		// int�迭 5ĭ 
		// �迭�� �Է� ���� ��� �Է� 
		// �ѹ��� ��� 
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length ; i++) {
			
			System.out.println("�迭" + i 
					+ "�Է� : ");
			arr[i] = sc.nextInt(); 	
		}
		 System.out.println();
		 System.out.println(Arrays.toString(arr));
	}
	
	public void example5() {
		// 5�� Ű �Է�, �迭�� �ε��� �ʱ�ȭ
		//5���� Ű, ���Ű ���
		
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[5];
		
		for (int i = 0; i < arr.length ; i++) {
			// �ε����� �����̱� ������ i�� int�ڷ���
			System.out.println((i+1)+ "�� Ű(cm) �Է� : ");
			arr[i] = sc.nextDouble(); 	
		}
		System.out.println("�Է� ����Ű : " + Arrays.toString(arr));
		
		double sum = 0;
		for (int i = 0; i <arr.length ; i++) {
			sum += arr[i];
		}
		System.out.println("���Ű : " + (sum / arr.length));
	}
	
	public void example6() {
		// �Է� ���� Ű�� ��� ����� �� �Է¹��� �������� ��� 
		
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[5];
		//�Է�
		for (int i = 0; i < arr.length ; i++) {
			// �ε����� �����̱� ������ i�� int�ڷ���
			System.out.println((i+1)+ "�� Ű(cm) �Է� : ");
			arr[i] = sc.nextDouble(); 	
			
		} 
		// ���� ��� 
		System.out.print("�Է¹��� Ű : [");
		
		double sum = 0;
		for (int j = arr.length-1 ; j >= 0  ; j--) {
			
			System.out.print(arr[j]);
			sum += arr[j];
			
			
			if(j > 0) {
				System.out.print(",");
			}
		}
		System.out.println("]");
		System.out.println("���Ű : "+ (sum / arr.length));
	}
	
	public void example7() {
		// 5�� Ű �Է� / �����, �˴ܽ� ã��
		
		double[] arr = new double[5];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0 ; i < arr.length  ; i++) {
			
			System.out.println((i+1)+ "�� Ű(cm) �Է� : ");
			arr[i] = sc.nextDouble();
		}
		
//		 double max = 0.0; //�ִ밪 ���� ���� 
//		 double min = Double.MAX_VALUE; // 
		
		 double max = arr[0];
		 double min = arr[0];
		
		 // �ִ� = �ּҰ����� �ʱ�ȭ 
		 // �ּڰ� = �ִ밪���� �ʱ�ȭ 
		 //or
		 // �ּ� , �ִ밪�� �迭�� ù��° ��� ���� ����
		 
		 for(int i = 0 ; i < arr.length ; i++) {
			 
			if(arr[i] > max) {
				max = arr[i];
			} 
			
			if(arr[i] < min) {
				min = arr[i];
			}
				System.out.println("����� : "+ max);
				System.out.println("�ִܽ� : "+ min);
				
		 }
		
	}
	public void example8() {
		
		// �Է� ���� ���� ��ŭ�� int�迭�� ���� �� �Ҵ� 
		// �迭�� �� �ε����� 5�� ������� �ʱ�ȭ 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭 ũ�� �Է� : ");
		int size = sc.nextInt();
		
		//int �迭 ���� �� �Ҵ� 
		int[] arr = new int[size];
		
		 for(int i = 0 ; i < arr.length ; i++ ) {
			  
			 arr[i] = (i+1)*5; 
		 }
		 System.out.println(Arrays.toString(arr));		
	}
	
	public void example9() {
		int[] arr = {10, 20, 30, 40, 50};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� :");
		int input = sc.nextInt();
		
		boolean flag = true;
		for( int i = 0 ; i < arr.length; i++ ) {
			
			if( arr[i] == input) {
				System.out.println(i + "���� �ε����� ������ ");
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("��ġ�ϴ� ���� �����ϴ�.");
		}
	}
	
		public void example10 () {
			// �ܾ��Է�,  �迭�� ������� �ʱ�ȭ 
			// �Է� ���� �ܾ �迭 ���� �� �� ���� �ϴ��� ī��Ʈ 
			Scanner sc = new Scanner(System.in);
			System.out.print("�ܾ��Է� : ");
			
			String word = sc.next();
			
			char[] arr = new char[word.length()];
			for(int i = 0; i < arr.length ; i++ ) {
				
				arr[i] = word.charAt(i);
				
			}
			System.out.print("���� �Է� : ");
			char ch = sc.next().charAt(0);
			
			int count = 0;
			
			for (int i = 0 ; i < arr.length ; i++) {
				if(arr[i] == ch) {
					count++;	
				}
			}
			if(count == 0) {
				System.out.println(ch + "��/�� �������� �ʽ��ϴ�.");
			}else {
				System.out.println(ch + "��/�� �� "+ count + "���� �����մϴ�.");
			}
			
		}
	
	
}

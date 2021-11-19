package edu.kh.array2.ex.service;

import java.util.Scanner;

public class Array2Service {

	// 1���� �迭 : �ڷ����� ���� ������ ����
	// 2���� �迭 : �ڷ����� ���� �迭�� ����
	// 2���� �迭�� 2���� �ε��� �ο� arr[1][2]  - [1] �� �� [2]�� ��
	
	public void example1() {
		
		int [][] arr;
		//stack ������ 2���� �������� arr ���� 
		// ���� ���� ���� �ƴ� �ּҸ� ���� 
		
		arr = new int [2][3];
		
		//2���� �迭 �ʱ�ȭ
		//1.
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[0][2] = 30;
//		
//		arr[1][0] = 40;
//		arr[1][1] = 50;
//		arr[1][2] = 60;
		
		//2.
		
		int num = 10;
		
		for(int row = 0 ; row < arr.length ; row++ ){
								//arr.length : ���� ����
			for(int col = 0 ; col < arr[row].length ; col++) {
				
				arr[row][col] = num;
				num += 10;
			}
		}
		
		for ( int row = 0; row < arr.length ; row++){
			for(int col =0 ; col < arr[row].length ; col++){
				
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();	
		}
	}
	
	public void example2() {
		// 2���� �迭 ����� ���ÿ� �ʱ�ȭ 
		int[] temp1 = {10, 20, 30};
		int[] temp2 = {40, 50, 60};
		
		int[][] arr = {
						{10, 20, 30},
						{40, 50, 60}
					  };
		
		// ��½� �������� ��� 
		
		for(int row = arr.length -1 ; row >= 0 ; row--) {
			for (int col = arr[row].length-1 ; col >= 0 ; col--){
				System.out.print(arr[row][col]+ " ");
			}
			System.out.println();
		}
	}
	
	public void example3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ũ�� :");
		int rowSize = sc.nextInt();
		
		System.out.print("�� ũ�� :");
		int colSize = sc.nextInt();
		
		int[][] arr = new int[rowSize][colSize];
		
		int num = 1;
		for(int row = 0; row < arr.length ; row++) {
			for (int col = 0; col <arr[row].length; col++) {
				arr[row][col] = num++; //��������, ��� ������ ���� �� ���� 
				
				System.out.print(arr[row][col] + " ");
			} 
			
			System.out.println();
		} 
	}
	
	public void example4() {
		int[][]arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}	
				};
		
		for(int row=0; row<arr.length; row++) {
			
			int sum = 0 ; // ���� �ٲ�� ���� �հ踦 �ٽ� ����� �� �ֵ��� 
			
			for(int col = 0; col <arr[row].length; col++) {
				sum +=arr[row][col];
			}System.out.println(row + "��° �� �� : " + sum);
		}
		
		int temp = 0 ;
		
		for(int col =0; col < arr[temp].length; col++) {
			
			int sum = 0;
			for(int row = 0; row<arr.length; row++) {
				sum += arr[row][col]; 
			}
			
			System.out.println(col + "��° �� �� : "+ sum);
			if( temp < arr.length - 1) {
				temp++;	
			}
		}
	}
	public void example5() {
		//���� �迭 
		//���� ���� ����, ���� ������ �������� 2���� �迭 
		
		int[][] arr= new int[4][];
								//������ ������
		arr[0] = new int[3]; //0�� ���� 3�� ���� 
		arr[1] = new int[4]; 
		arr[2] = new int[5]; 
		arr[3] = new int[2]; 
		
		int num = 0;

		for(int row = 0 ; row < arr.length ; row++) {
			
			for (int col = 0 ; col <arr[row].length ;col++) {
				
				arr[row][col] = num++;
				
				System.out.printf("%4d",arr[row][col]);
			}
			System.out.println();
		}
	}
	
	
}
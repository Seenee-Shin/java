package edu.kh.array2.practice.service;

import java.util.Scanner;

public class PracticeService {

	public void practice1() {
		int[][] arr = new int [3][3];
		
		for(int i = 0 ; i <arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
			}
			
		}System.out.println();
	}
	
	
	public void practice2() {
		
		int[][] arr = new int[4][4];
		
		int num = 1;
		
		for(int row = 0; row < arr.length; row++ ) {
			for(int col = 0; col < arr[row].length; col++) {
				arr [row][col] = num;
				num += 1;
			}
		}
		
		for ( int row = 0; row < arr.length ; row++){
			for(int col =0 ; col < arr[row].length ; col++){
				System.out.printf("%3d" , arr[row][col]);
			}System.out.println();
		}
	}
	
	public void practice3() {
	
		int[][]arr = new int [4][4];
		int minus = arr.length * arr.length; 
		
		for (int row = 0 ; row < arr.length ; row++) {
			for(int col = 0 ; col < arr[row].length; col++) {
				arr[row][col] = minus;
				minus -= 1;
				
			}
		}
		for ( int row = 0; row < arr.length ; row++){
			for(int col =0 ; col < arr[row].length ; col++){
				System.out.printf("%3d" , arr[row][col]);
			}System.out.println();
		}	
	}
	
	public void practice4() {
		
		int arr[][] = new int[4][4];

		for(int row = 0 ; row < arr.length-1; row++) {
			for(int col = 0; col < arr[row].length-1; col++){
				
				arr[row][col] = (int)(Math.random()*10+1);
				
				arr[row][3] += arr[row][col];
				
				arr[3][col] += arr[row][col];
				
				arr[3][3] += arr[row][col];
			}
		}
		
		//��¹�
		
	}
	
	public void practice4b() {
		// �ʿ��� �͵� ���� �� �������ֱ�
		
		int[][] arr = new int [4][4];
		// ��� : ������ �ʴ� Ư�� ���� �̸��� �ٿ��ִ� �뵵
		final int ROW_LAST_INDEX = arr.length -1;
		final int COL_LAST_INDEX = arr[0].length -1;
		
		// arr�� �����ϰ��ִ� 2���� �迭�� ��Ҹ� ��� ���������� ����
		// ��������, ������, ������, ���� ,��� �ѹ��� ����
		
		for(int row= 0; row < arr.length; row++ ) {
			for(int col =0; col <arr[row].length; col++) {
				//������ ��, ���� �ƴ� ��츸 ���� ����
				if(row != ROW_LAST_INDEX && col != COL_LAST_INDEX) {
					
					arr[row][col] = (int)(Math.random()*10+ 1);
					
					arr[row][COL_LAST_INDEX] += arr[row][col];
					
					arr[ROW_LAST_INDEX][col] += arr[row][col];
					
					arr[ROW_LAST_INDEX][COL_LAST_INDEX] += arr[row][col];
				
				} 
				
				System.out.printf("%4d",arr[row][col]);
			}
			System.out.println(); 
		}
	}
	
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("�� ũ�� : ");
			int rowSize = sc.nextInt();
			
			if (rowSize < 1 || rowSize > 10 ) {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
				continue;
			} 
			
			System.out.print("�� ũ�� : ");
			int colSize = sc.nextInt();
			
			if (colSize < 1 || colSize > 10 ) {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
				continue;
			}
			
			char[][] arr= new char[rowSize][colSize];
			
			for(int row =0 ; row < arr.length ; row++) {
				for(int col = 0 ; col< arr[row].length ; col++) {
					arr[row][col] = (char)(Math.random()* 26 + 65);
					
					System.out.print(arr[row][col]+ " ");
				}
				
				System.out.println();
			}
			
			break;
		}
		
	}
	
	public void practice6 () {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ũ��");
		int rowSize = sc.nextInt();
		
		char[][] arr = new char[rowSize][];
		
		for(int row = 0; row< arr.length ; row ++) {
			
			System.out.println(row +"���� ���� ����");
			int colSize = sc.nextInt();
			
			arr[row] = new char[colSize];
		}
		// 2�� ���� �迭�� a ���� ���ʴ�� �ʱ�ȭ ��� 
		char value = 'a';
		for(int row = 0; row< arr.length ; row ++) {
			for(int col = 0 ; col <arr[row].length; col++) {
				
				arr[row][col] = value++;
				
				System.out.print(arr[row][col]+" ");
			}
			
			System.out.println();
		}
		
	}
	
	public void practice7() {
		
		String[][] group1 = new String[3][2];
		group1 [0][0] = "���ǰ�";
		group1 [0][1] = "������";
		group1 [1][0] = "�����";
		group1 [1][1] = "�����";
		group1 [2][0] = "���̹�";
		group1 [2][1] = "�ں���";
				
		String[][] group2 = new String[3][2];
		group2 [0][0] = "�ۼ���";
		group2 [0][1] = "������";
		group2 [1][0] = "������";
		group2 [1][1] = "��õ��";
		group2 [2][0] = "��ǳǥ";
		group2 [2][1] = "ȫ����";
		
		System.out.println("== 1�д� ==");
		
		for(int row = 0; row< group1.length ; row++) {
			for(int col = 0; col<group1[row].length; col++) {
				System.out.print(group1[row][col]+ " ");
			}System.out.println();
		}
		
		System.out.println("== 2�д� ==");
	
		for(int row = 0; row< group2.length ; row++) {
			for(int col = 0; col<group2[row].length; col++) {
				System.out.print(group2[row][col]+ " ");
			}System.out.println();
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		String[][] group1 = new String[3][2];
		group1 [0][0] = "���ǰ�";
		group1 [0][1] = "������";
		group1 [1][0] = "�����";
		group1 [1][1] = "�����";
		group1 [2][0] = "���̹�";
		group1 [2][1] = "�ں���";
		
		String[][] group2 = new String[3][2];
		group2 [0][0] = "�ۼ���";
		group2 [0][1] = "������";
		group2 [1][0] = "������";
		group2 [1][1] = "��õ��";
		group2 [2][0] = "��ǳǥ";
		group2 [2][1] = "ȫ����";
		
		System.out.println("== 1�д� ==");
		
		for(int row = 0; row< group1.length ; row++) {
			for(int col = 0; col<group1[row].length; col++) {
				System.out.print(group1[row][col]+ " ");
			}System.out.println();
		}
		
		System.out.println("== 2�д� ==");
		
		for(int row = 0; row< group2.length ; row++) {
			for(int col = 0; col<group2[row].length; col++) {
				System.out.print(group2[row][col]+ " ");
			}System.out.println();
		}
		
		String result = null;
		String part = null;
		int line = 0;
		System.out.println("===========================");
		System.out.print("�˻��� �л��� �̸��� �Է��ϼ��� : ");
		String input = sc.nextLine();
		
		for(int row = 0; row< group1.length ; row++) {
			for(int col = 0; col<group1[row].length; col++) {
				if(group1[row][col].equals(input)){	
					part = "1";
					line = row+1;
					
					if(col == 0) {
						result = "����";
					}else {
						result = "������";
					}
				}else {	
					for(int row2 = 0; row2< group2.length ; row2++) {
						for(int col2 = 0; col2<group2[row2].length; col2++) {
							
							if(group2[row2][col2].equals(input)){	
								
								part = "2";
								line = row2+1;
								if(col == 0) {
									result = "����";
								}else {
									result = "������";
								}
							}else {
								continue;
							}
						}
					}
				}
			} 
				
		} System.out.println("�˻��Ͻ� "+ input + " �л��� "+part+"�д� "+line + "��° �� "+ result+ "�� �ֽ��ϴ�.");
			
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �ε��� �Է� : ");
		int rowI = sc.nextInt();
		
		System.out.print("�� �ε��� �Է� : ");
		int colI = sc.nextInt();
		
		char arr[][] = new char[6][6];
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col< arr[row].length; col++) {
				
				if (row == 0 && col != 0) {
					arr[0][col] = (char)('0');
				}else if (col == 0 && row != 0) {
					arr[row][0] = (char)(col+'0');
				} else {
					arr[row][col] = (char)' ';  
				}
				
				System.out.print(arr[row][col]+ " ");
			}System.out.println();
		} 
	
	}
}

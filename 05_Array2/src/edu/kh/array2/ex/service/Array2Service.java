package edu.kh.array2.ex.service;

import java.util.Scanner;

public class Array2Service {

	// 1차원 배열 : 자료형이 같은 변수의 묶음
	// 2차원 배열 : 자료형이 같은 배열의 묶음
	// 2차원 배열은 2개의 인덱스 부여 arr[1][2]  - [1] 은 행 [2]는 열
	
	public void example1() {
		
		int [][] arr;
		//stack 영역에 2차원 참조변수 arr 선언 
		// 참조 변수 값이 아닌 주소를 저장 
		
		arr = new int [2][3];
		
		//2차원 배열 초기화
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
								//arr.length : 행의 개수
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
		// 2차원 배열 선언과 동시에 초기화 
		int[] temp1 = {10, 20, 30};
		int[] temp2 = {40, 50, 60};
		
		int[][] arr = {
						{10, 20, 30},
						{40, 50, 60}
					  };
		
		// 출력시 역순으로 출력 
		
		for(int row = arr.length -1 ; row >= 0 ; row--) {
			for (int col = arr[row].length-1 ; col >= 0 ; col--){
				System.out.print(arr[row][col]+ " ");
			}
			System.out.println();
		}
	}
	
	public void example3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 크기 :");
		int rowSize = sc.nextInt();
		
		System.out.print("열 크기 :");
		int colSize = sc.nextInt();
		
		int[][] arr = new int[rowSize][colSize];
		
		int num = 1;
		for(int row = 0; row < arr.length ; row++) {
			for (int col = 0; col <arr[row].length; col++) {
				arr[row][col] = num++; //후위연산, 모든 연산이 끝난 후 연산 
				
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
			
			int sum = 0 ; // 행이 바뀌는 점에 합계를 다시 계산할 수 있도록 
			
			for(int col = 0; col <arr[row].length; col++) {
				sum +=arr[row][col];
			}System.out.println(row + "번째 행 합 : " + sum);
		}
		
		int temp = 0 ;
		
		for(int col =0; col < arr[temp].length; col++) {
			
			int sum = 0;
			for(int row = 0; row<arr.length; row++) {
				sum += arr[row][col]; 
			}
			
			System.out.println(col + "번째 열 합 : "+ sum);
			if( temp < arr.length - 1) {
				temp++;	
			}
		}
	}
	public void example5() {
		//가변 배열 
		//행의 갯수 지정, 열의 갯수는 미지정인 2차원 배열 
		
		int[][] arr= new int[4][];
								//열갯수 미지정
		arr[0] = new int[3]; //0번 행의 3열 지정 
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
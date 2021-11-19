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
		
		//출력문
		
	}
	
	public void practice4b() {
		// 필요한 것들 먼저 다 선언해주기
		
		int[][] arr = new int [4][4];
		// 상수 : 변하지 않는 특정 값의 이름을 붙여주는 용도
		final int ROW_LAST_INDEX = arr.length -1;
		final int COL_LAST_INDEX = arr[0].length -1;
		
		// arr이 참조하고있는 2차원 배열의 요소를 모두 순차적으로 접근
		// 난수대입, 행의함, 열의합, 총합 ,출력 한번에 수행
		
		for(int row= 0; row < arr.length; row++ ) {
			for(int col =0; col <arr[row].length; col++) {
				//마지막 행, 열이 아닌 경우만 난수 대입
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
			
			System.out.print("행 크기 : ");
			int rowSize = sc.nextInt();
			
			if (rowSize < 1 || rowSize > 10 ) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			} 
			
			System.out.print("열 크기 : ");
			int colSize = sc.nextInt();
			
			if (colSize < 1 || colSize > 10 ) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
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
		System.out.println("행의 크기");
		int rowSize = sc.nextInt();
		
		char[][] arr = new char[rowSize][];
		
		for(int row = 0; row< arr.length ; row ++) {
			
			System.out.println(row +"행의 열의 개수");
			int colSize = sc.nextInt();
			
			arr[row] = new char[colSize];
		}
		// 2차 가변 배열의 a 부터 차례대로 초기화 출력 
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
		group1 [0][0] = "강건강";
		group1 [0][1] = "남나나";
		group1 [1][0] = "도대담";
		group1 [1][1] = "류라라";
		group1 [2][0] = "문미미";
		group1 [2][1] = "박보배";
				
		String[][] group2 = new String[3][2];
		group2 [0][0] = "송성실";
		group2 [0][1] = "윤예의";
		group2 [1][0] = "진재주";
		group2 [1][1] = "차천축";
		group2 [2][0] = "피풍표";
		group2 [2][1] = "홍하하";
		
		System.out.println("== 1분단 ==");
		
		for(int row = 0; row< group1.length ; row++) {
			for(int col = 0; col<group1[row].length; col++) {
				System.out.print(group1[row][col]+ " ");
			}System.out.println();
		}
		
		System.out.println("== 2분단 ==");
	
		for(int row = 0; row< group2.length ; row++) {
			for(int col = 0; col<group2[row].length; col++) {
				System.out.print(group2[row][col]+ " ");
			}System.out.println();
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		String[][] group1 = new String[3][2];
		group1 [0][0] = "강건강";
		group1 [0][1] = "남나나";
		group1 [1][0] = "도대담";
		group1 [1][1] = "류라라";
		group1 [2][0] = "문미미";
		group1 [2][1] = "박보배";
		
		String[][] group2 = new String[3][2];
		group2 [0][0] = "송성실";
		group2 [0][1] = "윤예의";
		group2 [1][0] = "진재주";
		group2 [1][1] = "차천축";
		group2 [2][0] = "피풍표";
		group2 [2][1] = "홍하하";
		
		System.out.println("== 1분단 ==");
		
		for(int row = 0; row< group1.length ; row++) {
			for(int col = 0; col<group1[row].length; col++) {
				System.out.print(group1[row][col]+ " ");
			}System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		
		for(int row = 0; row< group2.length ; row++) {
			for(int col = 0; col<group2[row].length; col++) {
				System.out.print(group2[row][col]+ " ");
			}System.out.println();
		}
		
		String result = null;
		String part = null;
		int line = 0;
		System.out.println("===========================");
		System.out.print("검색할 학생의 이름을 입력하세요 : ");
		String input = sc.nextLine();
		
		for(int row = 0; row< group1.length ; row++) {
			for(int col = 0; col<group1[row].length; col++) {
				if(group1[row][col].equals(input)){	
					part = "1";
					line = row+1;
					
					if(col == 0) {
						result = "왼쪽";
					}else {
						result = "오른쪽";
					}
				}else {	
					for(int row2 = 0; row2< group2.length ; row2++) {
						for(int col2 = 0; col2<group2[row2].length; col2++) {
							
							if(group2[row2][col2].equals(input)){	
								
								part = "2";
								line = row2+1;
								if(col == 0) {
									result = "왼쪽";
								}else {
									result = "오른쪽";
								}
							}else {
								continue;
							}
						}
					}
				}
			} 
				
		} System.out.println("검색하신 "+ input + " 학생은 "+part+"분단 "+line + "번째 줄 "+ result+ "에 있습니다.");
			
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 인덱스 입력 : ");
		int rowI = sc.nextInt();
		
		System.out.print("열 인덱스 입력 : ");
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

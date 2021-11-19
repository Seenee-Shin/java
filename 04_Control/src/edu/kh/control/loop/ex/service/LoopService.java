package edu.kh.control.loop.ex.service;

import java.util.Scanner;

public class LoopService {
		//반복문 for 
	// for ( 초기식; 조건식; 증감식){
	//  }
	// 초기식 : for문 안에서 사용할 변수 , 반복 제어를 위해 사용 
	// 조건식 : for문의 반복 여부를 지정하느 조건식 
	 //			초기 식에 사용한 변수를 이용하여 조건식 작성 
	// 증감식 : 초기식을 반복문을 종료할 때마다 증가 또는 감소 
	
	public void example1() {
		// 1~10까지 1씩증가하며 반복출력
		for(int i = 1; i <= 10 ; i++ ) {
			System.out.println(i + "출력");
		}
	}
	
	public void example2() {
		for(int i = 5; i <= 15 ; ++i ) {
			System.out.println(i + "출력");
		}
	}
	
	public void example3() {  // i += 2 == i = i+2 복합 대입 연산자 
		for(int i=1; i <= 20 ; i += 2) {
			System.out.println(i);
		}
	}
	// ====================== 기초 응용 =============================
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
		//직접 값을 입력받아 반복문 처리 
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= 5 ; i++) {
			
			System.out.print(i + "번 입력 : ");
			int input = sc.nextInt();	
			
			sum += input; // 값을 누적 시킴 	
		} 
		
		System.out.println("힙계 : " +sum);
		// for 문 안에서 출력되면 실시간 합계가 나옴 (한번 반복할 떄마다 )
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
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <=9 ) {
			for(int i =1 ; i <= 9 ; i++) {
				System.out.printf("%d x %d = %2d\n", dan,i,dan*i );
				//%2d : 2칸의 오른쪽 정렬 
			}
		}else {
			System.out.println("잘못 입력 하셨습니다.");
		}
	}
	
	public void example10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 1 :");
		int i1 = sc.nextInt();
		
		System.out.print("정수 입력 2 :");
		int i2 = sc.nextInt();
		
		int sum = 0; 
		for( int i = i1 ; i <= i2 ; i1++ ) {
			if( i %3 != 0 ) {
			 sum += i;
			} 
		}	
		System.out.println("3의 배수를 제외한 합계 : " + sum);
	}
	///////////////////////중첩반복문////////////////////////////////
	public void example11() {
		for (int min = 0 ; min < 60 ; min++) {
			
			for (int sec= 0; sec < 60; sec++) {
				
				System.out.printf("%02d분 %02d초\n", min, sec);
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
			System.out.println("\n" + "=== " + dan + " 단===");
			
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
		
		int input = -1; //초기 값이 0일 경우 while문 실행이 안됨 = 초기값은 0이아닌 랜덤수 
		
		int sum = 0;
		
		while(input != 0 ) {
			System.out.print("정수 입력 :");
			input = sc.nextInt();
			sum += input;
		}
		
		System.out.println("합계 : " + sum);
	}
	
	public void example21() {
		int i = 1;
		while (1 <= 10) {
			System.out.println(i);
			
			i++;
		}
		
	}
}


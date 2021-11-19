package edu.kh.control.loop.practice.service;

import java.util.Scanner;

public class LoopPracticeService {

	public void practice1(){
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input >= 1) {
			for( int i = 1; i <= input ; i++ ) {
				System.out.print(i + " ");
			}
		}else{
			System.out.println("1이상의 숫자를 입력해주세요");
		}
	}	
	
	public void practice2(){
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input >= 1) {
			for( int i = input ; i >= 1 ; i-- ) {
				System.out.print(i + " ");
			}
		}else{
			System.out.println("1이상의 숫자를 입력해주세요");
		}
	}	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		int sum = 0;
		for(int i = 1 ; i <= input ; i++) {
			sum += i;
			
			System.out.println(i );
			if (i < input) {
			System.out.print( " + ");
			} else if ( i == input ) {
				System.out.println(" = ");
			}
		}
		
		System.out.println(sum);
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();
		
		int num1;
		int num2;
		
		if(input1 < input2) {
			num1 = input1;
			num2 = input2;
		}else {
			num1 = input2;
			num2 = input1;
		}
		
		if(num1 <= 0 || num2 <= 0) {
			System.out.println("1 이상의 숫자를 입력해 주세요 ");
		}else {
			for(int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		System.out.println("==== " + input + "단 ====");
		for(int i = 1; i <= 9 ; i++ ) {
			System.out.printf("%d x %d = %d\n",input,i,input*i);
		} 	
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		if(input<=2 || input >= 9) {
			System.out.println("2~9사이 숫자만 입력해주세요.");
		}else {
			
			for (int i = input ; i <= 9; i++ ) {
				System.out.println("==== " + i + "단 ====");
				
				for(int j = 1; j <= 9 ; j++ ) {
					System.out.printf("%d x %d = %d\n",i,j,i*j);
				} 	
				System.out.println();
			} 
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1 ; i <= input; i++ ) {
			
			for(int j = 1 ; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = input ; i >= 1; i-- ) {
			
			for(int j = 1 ; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		int count = 0;
		for(int i = 1; i <= input; i++) {
			if(i%2 ==0 || i%3 == 0 ) {
				System.out.print(i+" ");
				
				if(i%2 == 0 && i%3 == 0) {
					count++;
				}
			}
		}
		System.out.println("\ncount : "+ count);
	} 
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i<=input ; i++) {
			//공백출력 
			for(int k = 1 ; k<= input - i ; k++ )
			System.out.println(" ");
			//별 출력 
			for(int j =1 ; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();	
		}
	}
	
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
	}
	
}

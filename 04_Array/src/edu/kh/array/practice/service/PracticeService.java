package edu.kh.array.practice.service;

import java.util.Scanner;

public class PracticeService {
	public void example1() {
		
		int[] arr = new int[9];
		int sum = 0;
		
		for (int i = 0 ; i < arr.length ; i++) {
			
			arr[i] = i+1;
			System.out.print(arr[i]);
			
			if(i % 2 == 0) {
				sum += arr[i];
			}
		} 
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum);
	}
	
	public void example2() {
		int[]arr = new int[9];
		int sum = 0;
		
		for (int i = 0 ; i < arr.length ; i++) {
			
			arr[i] = (arr.length - i);
			System.out.print(arr[i] + " ");
			
			if (i % 2 == 1) {
				sum += arr[i];		
			}
		}
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum);
	}
	
	public void example3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i = 0 ; i < size ; i++) {
			
			
			arr[i]= i+1;
			System.out.print(arr[i]+ " ");
		}
	}
	
	public void example4() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		for(int i = 0 ; i < arr.length; i++ ) {
			System.out.print("입력 " + i 
					+" : ");
			arr[i] = sc.nextInt(); 
		}	
		System.out.print("검색할 값 :  ");
		int input = sc.nextInt();
		
		boolean flag = true;
		
		for(int j = 0; j < arr.length ; j++ ) {
		if( arr[j] == input) {
				System.out.println("인덱스 : " + j);
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	public void practice5(){
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			arr[i] = input.charAt(i);
		}
		
		System.out.println("문자 : ");
		char ch = sc.next().charAt(0);
		int count = 0;
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] == ch) {
				
				System.out.println
				(input +"에 "+ ch+ "가 존재하는 위치 (인덱스) : "+ i + " ") ;
				count++;
			}
		}System.out.println(ch + "의 갯수 : " + count);	
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 :");
		int input = sc.nextInt();
		
		int sum = 0;
		int[] arr = new int[input];
		for(int i = 0 ; i < arr.length ; i++) {
			
			System.out.print("배열"+ i + "번째 인덱스에 넣을 값 :");
			arr[i] = sc.nextInt();
			
			sum += arr[i];
		}
		for(int j = 0 ; j < arr.length ; j++) {
			System.out.print( arr[j] + " ");	
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		
		for(int i = 0; i<arr.length; i++) {
			if(i<9) {
			arr[i] = input.charAt(i);
			}if(i>=8) {
			arr[i] = '*';
			}
			System.out.print(arr[i]);
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("정수 : ");
			int input = sc.nextInt();
			
			if(input %2 != 1 || input < 3 ) {
				System.out.println("다시 입력 하세요.");
				continue;
			}
			
			int[] arr = new int[input + (input -1)];
			
			int sum = 0;
		
			for(int i = 0; i < input ; i++) {
				arr[i] = ++sum;
				
				System.out.print(arr[i]+ ", ");
			}
			
			for(int j = input ; j < arr.length ; j++ ) {
				arr[j] = --sum;
				if(j == arr.length - 1) {
					System.out.println(arr[j]);
				}else {
					System.out.print(arr[j]+", ");
				}
				
			}
		break;
			
		} 
		
	}
	
	public void practice9() {
		int arr[] = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			
			System.out.print(arr[i]+ " ");
		}
	}
	
	public void practice10() {
		
		int arr[] = new int[10];
		
		System.out.println("발생한 난수 : ");
	
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int)(Math.random()*10+1);
			
			System.out.print(arr[i] + " ");
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int j = 0 ; j <arr.length ; j++) {
			if(arr[j] > max) {
				max = arr[j];
			}
			
			if(arr[j]<min) {
				min = arr[j];
			} 
		}System.out.println();
		System.out.print("최대값 : " + max);
		System.out.println();
		System.out.print("최소값 : " + min);
		
	}
	
	public void practice11() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length ; i++){
			
			arr[i] = (int)(Math.random()*10 +1);
			
			 for(int j = 0 ; j < i; j++) {
				 
				 if (arr[i] == arr[j]) {
					 i--;
					 break;
				 }
			 }
			} 	
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}	
}

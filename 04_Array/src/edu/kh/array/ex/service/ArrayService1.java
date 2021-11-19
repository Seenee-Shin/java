package edu.kh.array.ex.service;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayService1 {
	//배열 : 같은 자료형 변수를 하나의 묶음으로 다루는 것
	// 묶여진 변수는 하나의 배열명으로 부르고 구분은 index로 호명
	
	public void example1 () {
		// 배열 선언 하기 
		int arr1[];
		int[] arr2;
		// []배열 기호 
		
		//배열 할당 : 메모리 상의 저장공간 확보하는 것 
		arr1 = new int[3];
		//new : heap 메모리 영역에 새로운 공간 할당 
		// int[3]: 인트 자료형 변수 3개의 인트 배열
		
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
		//배열 : stack 영역에 int[]참조형 변수 arr를 선언하고 
		//heap 영역에 int 3칸자리 int[]를 할당
		// int[] 참조형 변수에 할당된 주소를 arr에 대입 
		
		//heap영역은 비어 있을 수 없으므로 컴파일러에 의해 초기화되어있음
		
		System.out.println("컴파일러에 의한 초기화 확인 : ");
		
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
		System.out.println("배열 길이 : " + arr.length);
		
		
	}
	
	public void example3() {
		
		//인덱스를 이용한 초기화
		int[] arr = new int[5];
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 6;
		arr[3] = 8;
		arr[4] = 10;
		
		
		// for문을 이용한 배열 초기화
		int[] arr2 = new int[5];
		
		for (int i = 0 ; i < arr2.length ; i++) {
			arr[i] = (i+1)*2;
		}
		
		// 배열 선언과 동시에 초기화
		int[] arr3 = {2,4,6,8,10};
		
		System.out.println("arr 초기화 확인 : " + Arrays.toString(arr));
		System.out.println("arr2 초기화 확인 : " + Arrays.toString(arr2));
		System.out.println("arr3 초기화 확인 : " + Arrays.toString(arr3));
		// *Arrays.toString : 해당 배역의 모든 요소가 순서대로 출력 
	}
	
	public void example4() {
		// int배열 5칸 
		// 배열에 입력 받은 요소 입력 
		// 한번에 출력 
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length ; i++) {
			
			System.out.println("배열" + i 
					+ "입력 : ");
			arr[i] = sc.nextInt(); 	
		}
		 System.out.println();
		 System.out.println(Arrays.toString(arr));
	}
	
	public void example5() {
		// 5명 키 입력, 배열의 인덱스 초기화
		//5명의 키, 평균키 출력
		
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[5];
		
		for (int i = 0; i < arr.length ; i++) {
			// 인덱스는 정수이기 떄문에 i는 int자료형
			System.out.println((i+1)+ "번 키(cm) 입력 : ");
			arr[i] = sc.nextDouble(); 	
		}
		System.out.println("입력 받은키 : " + Arrays.toString(arr));
		
		double sum = 0;
		for (int i = 0; i <arr.length ; i++) {
			sum += arr[i];
		}
		System.out.println("평균키 : " + (sum / arr.length));
	}
	
	public void example6() {
		// 입력 받은 키를 모두 출력할 떄 입력받은 역순으로 출력 
		
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[5];
		//입력
		for (int i = 0; i < arr.length ; i++) {
			// 인덱스는 정수이기 떄문에 i는 int자료형
			System.out.println((i+1)+ "번 키(cm) 입력 : ");
			arr[i] = sc.nextDouble(); 	
			
		} 
		// 역순 출력 
		System.out.print("입력받은 키 : [");
		
		double sum = 0;
		for (int j = arr.length-1 ; j >= 0  ; j--) {
			
			System.out.print(arr[j]);
			sum += arr[j];
			
			
			if(j > 0) {
				System.out.print(",");
			}
		}
		System.out.println("]");
		System.out.println("평균키 : "+ (sum / arr.length));
	}
	
	public void example7() {
		// 5명 키 입력 / 최장신, 죄단신 찾기
		
		double[] arr = new double[5];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0 ; i < arr.length  ; i++) {
			
			System.out.println((i+1)+ "번 키(cm) 입력 : ");
			arr[i] = sc.nextDouble();
		}
		
//		 double max = 0.0; //최대값 저장 변수 
//		 double min = Double.MAX_VALUE; // 
		
		 double max = arr[0];
		 double min = arr[0];
		
		 // 최댓값 = 최소값으로 초기화 
		 // 최솟값 = 최대값으로 초기화 
		 //or
		 // 최소 , 최대값을 배열의 첫번째 요소 값을 대입
		 
		 for(int i = 0 ; i < arr.length ; i++) {
			 
			if(arr[i] > max) {
				max = arr[i];
			} 
			
			if(arr[i] < min) {
				min = arr[i];
			}
				System.out.println("최장신 : "+ max);
				System.out.println("최단신 : "+ min);
				
		 }
		
	}
	public void example8() {
		
		// 입력 받은 정수 만큼의 int배열을 선언 및 할당 
		// 배열의 각 인덱스에 5의 배수들을 초기화 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 크기 입력 : ");
		int size = sc.nextInt();
		
		//int 배열 선언 및 할당 
		int[] arr = new int[size];
		
		 for(int i = 0 ; i < arr.length ; i++ ) {
			  
			 arr[i] = (i+1)*5; 
		 }
		 System.out.println(Arrays.toString(arr));		
	}
	
	public void example9() {
		int[] arr = {10, 20, 30, 40, 50};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int input = sc.nextInt();
		
		boolean flag = true;
		for( int i = 0 ; i < arr.length; i++ ) {
			
			if( arr[i] == input) {
				System.out.println(i + "번쨰 인덱스에 존재함 ");
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("일치하는 값이 없습니다.");
		}
	}
	
		public void example10 () {
			// 단어입력,  배열에 순서대로 초기화 
			// 입력 받은 단어가 배열 내에 몇 개 존재 하는지 카운트 
			Scanner sc = new Scanner(System.in);
			System.out.print("단어입력 : ");
			
			String word = sc.next();
			
			char[] arr = new char[word.length()];
			for(int i = 0; i < arr.length ; i++ ) {
				
				arr[i] = word.charAt(i);
				
			}
			System.out.print("문자 입력 : ");
			char ch = sc.next().charAt(0);
			
			int count = 0;
			
			for (int i = 0 ; i < arr.length ; i++) {
				if(arr[i] == ch) {
					count++;	
				}
			}
			if(count == 0) {
				System.out.println(ch + "은/는 존재하지 않습니다.");
			}else {
				System.out.println(ch + "은/는 총 "+ count + "개가 존재합니다.");
			}
			
		}
	
	
}

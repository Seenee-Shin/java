package edu.kh.oop.method.Srevice;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
	
	private Scanner sc = new Scanner(System.in);
	//필드에 Scanner 객체생성 > 객체 내부 모든 메소드에서 sc 사용가능 
	// ==인스턴스 변수 (전역변수와 비슷)
	
	//생성자 
	public Calculator() { }
	// 기본생성자는 안에 내용 없어도 됨 // 빈 객체 생성의 주로 사용 // 커스텀용

	//메소드 
	
	// 계산기 메뉴 화면 출력 기능 
	public void displayMenu() {
		
		int menuNum = 0; //입력한메뉴 번호 저장 변수 
		
		do {
			System.out.println("======계산기 프로그램======");
			System.out.println("1. 버전 정보 출력 ");
			System.out.println("2. 두 수의 합 구하기");
			System.out.println("3. 세 수의 합 구하기");
			System.out.println("4. a^2 + b^2 = c^2 에서 c^2 구하기");
			System.out.println("5. 입력 받은 수의 크기를 가지는 배열 선언, 1부터 차례대로 초기화");
			System.out.println("6. 배열 생성 후 배열의 합계 구하기");
			
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 입력 받기 : ");
			menuNum = sc.nextInt();
			sc.nextLine(); //입력 버퍼에 남아있는 \n 제거
			
			switch(menuNum) {
			
			case 1 : printVersion(); //같은 클래스 내부의 다른 메소드 호출 
					break;
					
			case 2 : // 두수를 입력, 매개변수로 전달 
				System.out.print("첫 번째 수 입력 : ");
				int num1 = sc.nextInt();
				
				System.out.print("두 번째 수 입력 : ");
				int num2 = sc.nextInt();
				
				sum1(num1,num2); // 메소드의 매개변수로 전달 
				
				break;
			case 3 : 
				
				System.out.println(sum2()); break; 
			
			case 4 : pythagoras(); break;    
			
			case 5 : createArray(); break;    
			
			case 6 : arraySum(); break;    
			
			case 9 : System.out.println("프로그램 종료"); break;
			
			default : System.out.println("메뉴 번호를 잘못 입력하셨습니다.");
			
			}
			
		}while(menuNum != 9); 
		
		
	}
	// 버전 정보 출력 기능 
	private void printVersion() { // 매개변수 & 반환값 없음
	// 외부 접근 차단 
		System.out.println("현재 버전 정보 : version 0.1");
		
	}
	
	private void sum1(int param1, int param2) {
	//2번 합출력
		System.out.printf("%d + %d = %d\n", param1, param2, param1+param2);
		
		
	}
	private String sum2() { //매개변수 x 반환값 o
	//3번 합 출력 
		String result = null;
		
		System.out.print("첫 번째 수 입력 : ");
		int num1 = sc.nextInt();
	
		System.out.print("두 번째 수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("세 번째 수 입력 : ");
		int num3 = sc.nextInt();
		
		int sum = num1+num2+num3;
		
		result = num1 + " + " + num2 + " + "+ num3 + " = " + sum; 
		
		return result; //리턴 값을 가지고 호출한 곳으로 반환
	}
	
	private void pythagoras() {
		//두수를 입력, 제곱의 합 구하기 
		System.out.print("첫 번째 수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 수 입력 : ");
		int num2 = sc.nextInt();
		
		ApplicationSet as = new ApplicationSet();
		// 다른 클래스 끌고와서 객체 생성 
		
		int sum = as.squared(num1) + as.squared(num2);
		
		System.out.println("두 수의 제곱의 합 : " + sum);
		
	}
	
	private void createArray() {
		System.out.print("크기 입력 : ");
		int size = sc.nextInt();
		
		ApplicationSet as = new ApplicationSet();
		System.out.println(Arrays.toString(as.createArray(size)));
	}
	
	private void arraySum() {
		System.out.print("크기 입력 : ");
		int size = sc.nextInt();
		
		ApplicationSet as = new ApplicationSet();
		
		int[] arr = as.createArray(size); //배열만들기 
		
		int sum = as.arraySum(arr);//배열 합 구하기 
		
		System.out.println("배열 : " + Arrays.toString(arr));
		System.out.println("배열 합 : " + sum);
		
	}
	
}

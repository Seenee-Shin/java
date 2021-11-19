package edu.kh.eh.model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import edu.kh.eh.model.exception.DivideByTwoException;

public class ExceptionService {

	public void example1() {
		// try - catch
		// try : 예외가 발생할 가능성이 있는 코드를 내부에 작성, 시도함
		// catch : try 부분에서 발생한 예외구문을 처리함
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수를 입력받아 나누기한 몫 구하기 ");
		
		System.out.print("입력 1 : ");
		int num1 = sc.nextInt();

		System.out.print("입력 2 : ");
		int num2 = sc.nextInt();
		
		int devide = num1 / num2 ; 
//		try {
//			System.out.printf("%d / %d = %d\n", num1, num2, devide);
//			
//		}catch(ArithmeticException e) {
//			//try 구문에서 발생한 예외구문 중 catch할 예외를 매개변수 작성 
//			System.out.println("0으로 나눌 수 없습니다. ");
//			//ArithmeticException : 산술예외 - 0으로 나누었을때 주로 발생 
//			}
		
	}	
	
	public void example2() {
		//정수 두개 입력 , 곱을 출력
		// 정수 입력 메소드 별도 작성 
		int num1 = inputNumber(1);
		int num2 = inputNumber(2);
		
		System.out.printf("%d x %d = %d\n", num1, num2, (num1*num2));
	}
	
	public int inputNumber(int i) {
		
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(i + "번째 정수 입력 : ");
			
			try {
				num = sc.nextInt();
				break;
				//예외가 발생 하면 바로 catch문으로 넘어가기 떄문에 break가 실행되지 않는다.
			}catch(InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				sc.nextLine(); //입력버퍼에 남아있는 문자들을 지워준다. 
				// 이유 : 잘못 입력된 문자가 sc.nextInt()에 계속 남아있기 때문에 무한루프에 빠질 수 있다. 
			}
		}
		return num;
	}
	
	public void example3() {
		//finally : try -catch 실행 후 마지막에 필수로 수행하여야 하는 코드구문 
		
		String str = null;
		// null 아무것도 참조하고 있지 않은 상태 
		try {
		System.out.println(str.length());
		//NullPointerException /; null 참조 예외 
		}catch(NullPointerException e) {
			System.out.println("객체를 참조 하고 있지 않습니다.");
		}finally {
			System.out.println("무조건 수행");
		}
	}
	
	public void example4() {
		
		//throw : 예외 장제 발생 구문 예외를 던짐 
		//Unchecked Exception에서만 강제 발생 가능 
		
//		throw new NullPointerException();
		
//		throw new IOException();
		// Checked Exception : 예외처리 불가 
		// if문으로 해결 불가 
		// 예외상황이 발생할 수 있는 경우가 많은 경우 
		
		BufferedReader br = null;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		//키보드로 부터 문자열을 입력 받음 
		//Scanner의 예전 방법 - 속도는 스캐너 보다 빠르다 
	
		System.out.println("문자열 입력 : ");
		try {
			String str = br.readLine(); 
			
			// IOException 발생 가능성 있음 
			// try - catch 로 처리 
			
		}catch(IOException e) {
			System.out.println("예외 발생");	
		}
	}
	
	public void example5() {
		// 두 정수를 입력받아 나눈 몫 출력 
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("입력 1 : ");
			int num1= sc.nextInt();
			
			System.out.print("입력 2 : ");
			int num2= sc.nextInt();
			
			System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
		} catch(InputMismatchException e) {
			
			System.out.println("정수만 입력해 주세요.");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			//예외 처리시 catch문 여러개 사용 가능 
			//try 구문에서 예외 발생시 catch문을 순차적으로 지나가며 해당되는 catch문에서 처리됨 
			// 발생하는 예외에 따라 선택적으로 처리 가능 (if ~ else if 처럼) 
		}catch(Exception e) { //Exception == 예외의 최상위 클래스 
			// 다형성이 적용 되어 앞에서 처리 되지 않은 예외들을 처리 
			System.out.println("알 수 없는 예외 발생");
			
			e.printStackTrace(); // 예외 발생과 예외 발생 원인 메소드를 차례대로 호출 
			//만약 최상위 클래스인 Exception이 catch문 앞쪽에 위치할 경우 밑에 부분 catch문에 도달 할 수 없다.
		}
		
	}
	public void example6() {
		// method A, methodB 에서 발생하는 예외를 모아서 처리 
		try {
		methodA();
		}catch(IOException e) {
			System.out.println("예외 처리됨");
		}
	}
	
	public void methodA() throws IOException{
		methodB();
	}
	
	public void methodB() throws IOException {
	 throw new IOException();
	 // 예외 강제 발생 
	}
	
	public void example7() {
		try {
			divide(10,2);
		} catch (DivideByTwoException e) {
			
		}
	}
	
	 public void divide(int num1, int num2) throws DivideByTwoException {
		if(num2 != 2) {
			System.out.println(num1 / num2);
		}else {
			// 예외 강제발생 
			throw new DivideByTwoException();
		}
	}
}


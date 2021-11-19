package edu.kh.control.condition.ex.service;

import java.util.Scanner;

public class ConditionService2 {

	public void example1() {
		// 키보드로 정수를 입력 받아
		// 3인 경우 : 빨간색
		// 4인 경우 : 파란색
		// 5인 경우 : 노란색  출력
		// 나머지 경우 : 흰색
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 : ");
		int input = sc.nextInt();
		
		String color;
		
		switch(input) {
		
		case 3 : color = "빨간색"; break;
		case 4 : color = "파란색"; break;
		case 5 : color = "노란색"; break;
		default : color = "흰색";
	
		}
		
		System.out.println(color);
		
		//if문 변경
		
		if(input == 3) {
			color = "빨간색";
		}else if(input == 4) {
			color = "파란색";
		}else if(input == 5) {
			color = "노란색";
		}else{
			color = "흰색";
		}
		System.out.println(color);
	}
	
	public void example2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 :");
		int input = sc.nextInt();
		
		String team;
		
		switch(input % 4) {
		
		case 1 : team = "한식팀"; break;
		case 2 : team = "일식팀"; break;
		case 3 : team = "중식팀"; break;
		default : team = "양식"; 
		}
		
		System.out.println(team);
	
	}
	public void example3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("달(월) 입력 : ");
		int month = sc.nextInt();
		
		String result;
		
		switch(month) {
		case 3 : case 4 : case 5 : result = "봄"; break;
		case 6 : case 7 : case 8 : result = "여름"; break;
		case 9 : case 10 : case 11 : result = "가을"; break;
		case 12 : case 1 : case 2 : result = "겨울"; break;
		default : result = "잘못 입력 하셨습니다.";
		
		}
		
		System.out.println(result);
		
	}
	
	public void example4() {
		//계산기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 1:");
		int input1 = sc.nextInt();
		
		System.out.print("정수 입력 2:");
		int input2 = sc.nextInt();
		
		System.out.print("연산자 입력 :");
		char op = sc.next().charAt(0);
		//*스트링에서 특정 위치에 있는 문자하나를 반환하는 메소드 
		// = String.charAt(index); (index : 문자열 순서)
		// sc.next() = String

		int result = 0;
		
		boolean flag = true;
		// flag : 결과를 출력할지 안할지를 저장하는 논리값
		// true == 실행
		// false == 깃발 내려감 
		
		switch(op) {
		case'+' : result = input1 + input2; break;
		case'-' : result = input1 - input2; break;
		case'*' : result = input1 * input2; break;
		case'/' :
			if(input2 == 0) { 
				System.out.println("0으로 나눌 수 없습니다.");
				flag = false; // flag 를 false로 만들어 밑의 125번줄 출력문 실행을 막음
			} else {
				result = input1 / input2;
			}
			break;

		case'%' : result = input1 % input2; break;
		default : 
			System.out.println("해당 연산하는 존재하지 않습니다.");
			flag = false;
		}	
		
		
		if (flag) { //flag가 참일 때는 == true 쓰지 않아도 됨 (flag 는 boolean값이기 때문)
			System.out.printf("%d %c %d = %d\n",input1, op, input2, result);			
		}
		
	}
	
	
	
}

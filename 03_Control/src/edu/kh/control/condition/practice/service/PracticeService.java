package edu.kh.control.condition.practice.service;

import java.util.Scanner;

public class PracticeService {

	public void practice1() {
		System.out.println("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n7. 수정");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 번호를 입력 하세요  : ");
		int num = sc.nextInt();
		
		String menu = null;
		boolean flag = true;
		
		switch (num) {
		case 1 : menu = "입력"; break;
		case 2 : menu = "수정"; break;
		case 3 : menu = "조회"; break;
		case 4 : menu = "삭제"; break;
		case 7 : 
			System.out.println("프로그램이 종료됩니다.");
			flag = false; 
			break;
		
		default :
			System.out.println("잘못 입력하셨습니다.");
			flag = false; 
		}
		
		if(flag == true) {
			System.out.println( menu + "메뉴입니다.");
		}
	}
	
	
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요  : ");
		int num = sc.nextInt();
		
		String result;
		if( 0 > num ) {
			result = ("양수만 입력해주세요");
		} else if (num % 2 == 0) {
			result = "짝수입니다";
		} else {
			result = "홀수입니다";
		}
		System.out.println(result);
	}
	
	
	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수   : ");
		int kor = sc.nextInt();
			
		System.out.print("수학점수   : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수   : ");
		int eng = sc.nextInt();
		
		int total = kor + math + eng ;
		double avg = (kor + math + eng)/3;
		
		String result;
		
		if(kor < 40 || math < 40 || eng < 40 ) {
			result = "불합격입니다.";
		} else if (avg >= 60) {
			result = 
				 "국어 : "+ kor + "\n"+
				 "수학 : "+ math + "\n"+
				 "영어 : "+ eng + "\n"+
				 "합계 : "+ total + "\n"+
				 "평균 : "+ avg + "\n"+
				 "축하합니다, 합격입니다!";
		}else {
			result = "불합격입니다.";
		}
		System.out.println(result);
	}
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		String result = " " ;
		
		boolean flag = true;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			result = "31일";
			break;
			
		case 4: case 6: case 9: case 11:
			result = "30일";
			break;
			
		case 2: 
			result = "28일";
			break;
		
		default : 
			flag = false;
		}
		
		if(flag) {
			System.out.println(month + "월은 " + result + "까지 있습니다.");
		} else {
			System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요: ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요: ");
		double weight = sc.nextDouble();
		
		double bmi = weight/(height*height);
		
		String result;
		
		if(bmi > 30) {
			result = "고도 비만";
		} else if (bmi >= 25) {
			result = "비만";
		} else if (bmi >= 23) {
			result = "과체중";
		} else if (bmi >= 18.5) {
			result = "정상체중";
		} else {
			result = "저체중";
		}
		
		System.out.println("BMI지수 : " + bmi + "\n" + result);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		double mid = sc.nextInt() * 0.2;
		
		System.out.print("기말 고사 점수 : ");
		double fin = sc.nextInt() * 0.3;
		
		System.out.print("과제 점수 : ");
		double report = sc.nextInt() * 0.3;
		
		System.out.print("출석 횟수 : ");
		double attend = sc.nextInt();
		
		double total = mid + fin + report + attend;
		
		String result;
		String score =
			"중간 고사 점수(20) : " + mid + "\n" + 
			"기말 고사 점수(30) : " + fin + "\n" + 
			"과제 점수   (30) : " + report + "\n" + 
			"출석 점수   (20) : " + attend + "\n" + 
			"총점 : "+ total +"\n";
		
		if(attend <= 20 -(20 * 0.3)) {
			result = "Fail [출석 횟수 부족 ("+ (int)attend + "/20)]";
		} else if (total >= 70) {
			
			result = score + "PASS";
			
		}else {
			result = score + "Fail [점수 미달]";
		}
		System.out.println("============결과==============");
		System.out.println(result);
	}
	
	public void practice7() {
		
		double result = 0;
//		boolean flag = true;
		int flag = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int input1 = sc.nextInt();
		
		System.out.print("연산자 입력 : ");
		char op = sc.next().charAt(0);
		
	    if (op != '+' && op != '-' && op != '/' && op != '%' && op != '*') {
	    	System.out.println("잘못 입력 하셨습니다.");
	    	flag = 2;
	    }
	   	else if ((op == '/' && input1 == 0)||op == '%' && input1 == 0) {
	    	System.out.println("0은 나눌수 없습니다.");
	    	flag = 3;
	    }
	   	else {
	    	System.out.print("피연산자2 입력 : ");
	    	int input2 = sc.nextInt();
	    	
	    	if (input1 < 0 || input2 < 0) {
	    		System.out.println("잘못 입력 하였습니다.");
	    		flag = 2;
	    	}
	    	
	    	switch (op) {
	    	case '+' : result = input1 + input2; break;
	    	case '-' : result = input1 - input2; break;
	    	case '*' : result = input1 * input2; break;
	    	case '%' : result = input1 % input2; break;
	    	case '/' : 
	    		if(input2 == 0) {
	    		System.out.println("0으로 나눌 수 없습니다.");
	    		flag = 3;
	    		} 
	    		else {
	    			result = (double)input1 / input2;
	    		}
	    		break;
	    		
		    default : System.out.println("잘못 입력 하였습니다."); 
		    		flag = 2;
	    	}
	    if(flag == 1) {
	    	System.out.printf("%d %c %d = %f",input1, op, input2, result);
	    }
		
	}
 }
}

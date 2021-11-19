package edu.kh.control.condition.ex.service;

import java.util.Scanner;

public class ConditionSerivce {

	public void example1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0); {
			System.out.println("양수입니다.");	
		}
		if(input <= 0 ); {
			System.out.println("양수가 아닙니다.");
		}	
	}
	
	
	// if - else 
	public void example2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수하나 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수 입니다.");
		}else {
			System.out.println("음수 입니다.");
		}
	}
	
	// if - else if - else
	
	public void example3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		
		String result;
		
		if(input > 0) {
			result = "양수";
		} else if(input < 0) {
			result = "음수";
		} else {
			result = "0";
		}
		
		System.out.println(result + " 입니다.");
	}

		public void example4() {
			Scanner sc = new Scanner(System.in);
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			String result;
			
			if(age <= 13) {
				result = "어린이";
			} else if (age > 19) {
				result = "성인";
			} else {
				result = "청소년";
			}
			System.out.println(result + " 입니다.");
		}
	 public void example5() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("달(월) 입력 : ");
		 int month = sc.nextInt();
		 
		 String season;
		 
		 if(month == 12 || month == 1 || month == 2 ) {
			 season = "겨울";
		 }else if (month >= 3 && month <= 5) {
			 season = "봄";
		 }else if (month >= 6 && month <= 8) {
			 season = "여름";
		 }else if (month >= 9 && month <= 11) {
			 season = "가을";
		 }else {
			 season = "잘못 입력하였습니다.";
		 }
		 
		 System.out.println(season);
	 }
	 public void example6() {
		 
		 	// 점수를 입력 받아
			// 90점 이상일 경우 : A
			// 80점 이상, 90점 미만일 경우 : B
			// 70점 이상, 80점 미만일 경우 : C
			// 60점 이상, 70점 미만일 경우 : D
			// 60점 미만인 경우 : F
			// 100점 초과 0점 미만인 경우 : 잘못 입력하셨습니다

		 Scanner sc = new Scanner(System.in);
		 System.out.print("점수 입력 : ");
		 int score = sc.nextInt();
		 
		 String result;
		 if(score > 100 || score < 0 ) {
			 result = "잘못 입력하셨습니다.";
		 } else if (score >= 90) {
			 result = "A";
		 }else if (score >= 80 ) {
			 result = "B";
		 }else if (score >= 70) {
			 result = "C";
		 }else if (score >= 60) {
			 result = "D";
		 }else {
			 result = "F";
	 }
		 System.out.println(result);
	 }
	 
	 
	 //중첩 if문
	 public void example7() {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("나이 입력 : ");
		 int age = sc.nextInt();
		 
		 System.out.print("키 입력(cm):");
		 double height = sc.nextDouble();
		 
		 String result;
		 
		 if (age < 0 || age > 100) {
			 result = "잘못 입력하셨습니다.";
		 }else {
			 if (age < 12) {
				 result = "적정 연령이 아닙니다.";
			 }else {
				 if (height < 140.0) {
					 result = "적정 키가 아닙니다.";
				 }else {
					 result = "탑승 가능";
				 }
			 }
		 }
		 System.out.println(result);
	 } 
	 public void example8() {
		 //놀이기구 탑승 제한 검사
		 //조건 : 나이 12세이상 , 키 140.0cm 이상
		 
		 //나이를 0~ 100사이로 입력 하지 않을 경우 , "나이를 잘못 입력"
		 // 키를 0~250cm 사이로 입력하지 않은경우, "키를 잘못 입력"
		 // 각 항목이 입력 되자마자 검사, 잘못된 경우 프로그램 종료
		 
		 // 나이 적합, 키 부적합 : "나이는 적합, 키가 부적합"
		 // 나이 부적합 키 적합 : "키는 적합, 나이는 부적합"
		// 모두 부적합 : 부적합 
		 // 모두 적합 : 탑승가능 
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("나이 입력 : ");
		 int age = sc.nextInt();
		 
		 
		 String result;
		 
		 if(age < 0 || age > 100) {
			 System.out.println("나이를 잘못 입력 하셨습니다.");
		 } else {
			 		System.out.print("키 입력(cm):");
			 		double height = sc.nextDouble();
			 		
			 		if(height < 0 || height > 250.0) {
			 			result = "키를 잘못 하셨습니다";
			 		} else { 
			 			if (age >= 12 && height >= 140.0) {
			 				result = "탑승가능";
			 			} else if( age < 12 && height >= 140.0) {
			 				result = "키는 적합하나  나이 부적합";
			 			} else if (age >= 12 && height <= 140.0) {
			 				result = "나이는 적합하나 키 부적합";
			 			}else { 
			 				result = "부적합";
			 			}
			 			
			 		}
			 		System.out.println(result);
		 }
		 
	 }
	 
}


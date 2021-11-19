package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
		
	public void practice1() {
		// 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
		//1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수 : ");
		int ppl = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println();
		
		int result1 = ( candy / ppl);
		System.out.println("1인당 사탕 개수 : " + result1);
		
		int result2 = (candy % ppl);
		System.out.println("남은 사탕 개수 : " + result2);
	
	}
	
	public void practice2() {
		//키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();		
		
		System.out.print("반 : ");
		int cNum = sc.nextInt();		
		
		System.out.print("번호 : ");
		int sNum = sc.nextInt();
		
		System.out.print("성적 : ");
		double score = sc.nextDouble();
		
		System.out.println();
		
		System.out.println
		(grade + "학년 " + cNum + "반 "+ sNum + "번 " + name +"의 성적은 "+ score + "이다." );
		
	}
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		System.out.println();
		
		int total = kor + eng + math;
		double avg = (kor + eng + math)/3.0;
		
		System.out.println("합계 : " + total);
		System.out.printf("평균 : %.2f", avg);

	}
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int input1 = sc.nextInt();
		System.out.print("입력2 : ");
		int input2 = sc.nextInt();
		System.out.print("입력3 : ");
		int input3 = sc.nextInt();
		
		System.out.println();
		
		boolean result = (input1 == input2 && input2 == input3);
		System.out.println(result);
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.println();
		
		String result = age <= 13 ? "어린이": (age > 19 ? "성인": "청소년");
		System.out.println(result);
	
	}
}

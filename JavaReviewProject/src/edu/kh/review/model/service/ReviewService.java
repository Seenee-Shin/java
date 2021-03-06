package edu.kh.review.model.service;

import java.util.InputMismatchException;
import java.util.Scanner;

import edu.kh.review.model.vo.Student;

public class ReviewService {
	Scanner sc = new Scanner(System.in);
	/*복습 문제 1
	edu.kh.review.model.vo 패키지에 Student 클래스를 생성.
	
	필드 : 학번, 이름, 학년, 반, 성별('남' 또는 '여') 
	생성자 : 기본 생성자, 매개변수 있는 생성자 (필드 전부 초기화)
	메소드 : getter / setter, toString() 오버라이딩
	
	*/

	
	/*복습 문제 2
	Student 객체 2개를 각각 기본 생성자, 매개변수 있는 생성자로 생성하고
	필드를 아래에 지정된 값으로 초기화 후 저장된 필드 정보를 모두 출력
	
	학생1> 학번:21001, 이름:이동준, 학년:1, 반:5, 성별:'남'
	학생2> 학번:20345, 이름:김민서, 학년:2, 반:3, 성별:'여'
	
	[실행화면]
	학생1 : 21001 / 이동준 / 1 / 5 / 남
	학생2 : 20345 / 김민서 / 2 / 3 / 여

	*/
	public void practice2() {
		Student s1 = new Student(21001, "이동준", 1, 5, "남");
		Student s2 = new Student();
	  
		s2.setStudentId(20345); 
		s2.setName("김민서");
		s2.setGrade(2);
		s2.setClassNum(3);
		s2.setGender("여");
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
	
	
	
	/*복습 문제 3
	입력 받은 값을 이용하여 학생 객체를 생성하고 학생 정보를 모두 출력
	(입력 받을 때 사용할 Scanner 객체는 ReviewService 클래스의 필드에 생성.
	
	[실행 화면]
	학번 : 22453
	이름 : 김철수
	학년 : 1
	반 : 2
	성별 : 남
	입력 받은 학생 정보 : 22453 / 김철수 / 1 / 2 / 남

	*/
	public void practice3() {
		int input1 = 0;
		String input2 = "";
		int input3 = 0; 
		int input4 = 0;
		String input5 = "";
		
		System.out.print("학번 : ");
		input1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("이름 : ");
		input2 = sc.nextLine();
		
		
		System.out.print("학년 : ");
		input3 = sc.nextInt();
		
		System.out.print("반 : ");
		input4 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별 : ");
		input5 = sc.nextLine();
		
		
		Student s3 = new Student(input1, input2, input3, input4, input5);
		
		System.out.println(s3);
		
	}
	
	

	/* 복습 문제 4
	문제 3번 처럼 학생 한 명의 정보를 입력 받고 출력하기.
	단, 입력 중 자료형에 맞지 않는 값을 입력 하는 경우(InputMismatchException) 
	처음 부터 다시 입력 받기
	
	[실행 화면]
	학번 : 22453
	이름 : 김철수
	학년 : 일학년
	자료형에 맞지 않는 값이 입력되었습니다. 다시 입력해주세요.
	학번 : 22453
	이름 : 김철수
	학년 : 1
	반 : 2
	성별 : 남
	입력 받은 학생 정보 : 22453 / 김철수 / 1 / 2 / 남
	*/
	public void practice4() {
		int input1 = 0;
		String input2 = "";
		int input3 = 0; 
		int input4 = 0;
		String input5 = "";
		
		while(true) {
		 try {
			 System.out.print("학번 : ");
			 input1 = sc.nextInt();
			 sc.nextLine();
			
			 System.out.print("이름 : ");
			 input2 = sc.nextLine();
			
			 System.out.print("학년 : ");
			 input3 = sc.nextInt();
			
			 System.out.print("반 : ");
			 input4 = sc.nextInt();
			 sc.nextLine();
			
			 System.out.print("성별 : ");
			 input5 = sc.nextLine();
			 break;
		 }
		 catch(InputMismatchException e) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			sc.nextLine();
		 }
			
		} 
		
		Student s3 = new Student(input1, input2, input3, input4, input5);
		System.out.println(s3);
	}
	
	
	/*복습 문제 5
	3명의 학생 정보를 입력 받아 Student 객체 배열에 저장한 후 출력
	
	[실행화면]
	1번째 학생 정보 입력
	학번 : 100
	이름 : 이미진
	학년 : 5
	반 : 5
	성별 : 여
	2번째 학생 정보 입력
	학번 : 200
	이름 : 김성연
	학년 : 6
	반 : 6
	성별 : 남
	3번째 학생 정보 입력
	학번 : 300
	이름 : 김사랑
	학년 : 4
	반 : 4
	성별 : 여
	1번째 학생 : 100 / 이미진 / 5 / 5 / 여
	2번째 학생 : 200 / 김성연 / 6 / 6 / 남
	3번째 학생 : 300 / 김사랑 / 4 / 4 / 여

	*/
	public void practice5() {
		
		Student students[] = new Student[3];
		
		int input1 = 0;
		String input2 = "";
		int input3 = 0; 
		int input4 = 0;
		String input5 = "";
		int count = 1;
		int i;
		
	
		for (i = 0; i<students.length; i++) {
			
			System.out.println(count + "번째 학생 정보 입력");
			 System.out.print("학번 : ");
			 input1 = sc.nextInt();
			 sc.nextLine();
			
			 System.out.print("이름 : ");
			 input2 = sc.nextLine();
			
			 System.out.print("학년 : ");
			 input3 = sc.nextInt();
			
			 System.out.print("반 : ");
			 input4 = sc.nextInt();
			 sc.nextLine();
			
			 System.out.print("성별 : ");
			 input5 = sc.nextLine();
			 students[i] = new Student (input1, input2, input3, input4, input5);
			 
			 count++;
		}
		for(i = 0 ; i<students.length; i++) {
			int j = i+1;
			System.out.println(j + "번째 학생 : "+ students[i]);
		}
		
	
	}
	
	/*복습 문제 6
	 	아래 실행화면 처럼 동작하는 코드를 작성하시오. (학생 배열은 제공)
		
		Student[] stdList = { new Student(21001, "김동현", 1, 3, '남'),
							  new Student(21002, "이혜정", 1, 7, '여'),
							  new Student(20003, "정은지", 2, 9, '여'),
							  new Student(19027, "김동현", 3, 2, '남'),
							  new Student(19030, "이상현", 3, 7, '남')
							};

		
		[실행 화면]
		==검색 주제 선택==
		1. 이름
		2. 학년
		3. 반
		4. 성별
		0. 종료
		검색 선택 >> 8
		잘못 입력하셨습니다. 다시 선택해주세요.
		
		==검색 주제 선택==
		1. 이름
		2. 학년
		3. 반
		4. 성별
		0. 종료
		검색 선택 >> 1
		이름 입력 : 이혜정
		21002 / 이혜정 / 1 / 7 / 여
		검색 결과 : 1명
		
		==검색 주제 선택==
		1. 이름
		2. 학년
		3. 반
		4. 성별
		0. 종료
		검색 선택 >> 2
		학년 입력 : 1
		21001 / 김동현 / 1 / 3 / 남
		21002 / 이혜정 / 1 / 7 / 여
		검색 결과 : 2명
		
		==검색 주제 선택==
		1. 이름
		2. 학년
		3. 반
		4. 성별
		0. 종료
		검색 선택 >> 3
		반 입력 : 7
		21002 / 이혜정 / 1 / 7 / 여
		19030 / 이상현 / 3 / 7 / 남
		검색 결과 : 2명
		
		==검색 주제 선택==
		1. 이름
		2. 학년
		3. 반
		4. 성별
		0. 종료
		검색 선택 >> 4
		성별 입력 : 여
		21002 / 이혜정 / 1 / 7 / 여
		20003 / 정은지 / 2 / 9 / 여
		검색 결과 : 2명
		
		
		==검색 주제 선택==
		1. 이름
		2. 학년
		3. 반
		4. 성별
		0. 종료
		검색 선택 >> 0
		프로그램 종료
	*/
	public void practice6() {

		Student[] stdList = { 
			 new Student(21001, "김동현", 1, 3, "남"),
			 new Student(21002, "이혜정", 1, 7, "여"),
			 new Student(20003, "정은지", 2, 9, "여"),
			 new Student(19027, "김동현", 3, 2, "남"),
			 new Student(19030, "이상현", 3, 7, "남")
			};
			
	 System.out.println();
	 System.out.println("==검색 주제 선택==");
	 System.out.println("1. 이름");
	 System.out.println("2. 학년");
	 System.out.println("3. 반");
	 System.out.println("4. 성별");
	 System.out.println("0. 종료");
	 System.out.print("메뉴 선택 >> ");
					

	
	}
	
}

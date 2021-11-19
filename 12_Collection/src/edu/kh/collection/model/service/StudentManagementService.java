package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.model.vo.Student;

public class StudentManagementService {
	private Scanner sc = new Scanner(System.in);
	
	private List<Student> stdList = new ArrayList<Student>();
	
	public void displayMenu() {
		      
		int sel = 0;
	
		do {
			
			System.out.println("======== 학생 관리 프로그램 ========");
			System.out.println("1. 학생 전체 조회");
			System.out.println("2. 학생 정보 추가"); // 이름, 나이, 학년
			System.out.println("3. 학생 정보 수정"); // 이름, 나이, 학년
			System.out.println("4. 학생 정보 제거");
			System.out.println("5. 이름 검색");
			System.out.println("6. 이름,나이,학년이 일치하는 학생 인덱스 조회");
			System.out.println("7. 이름,나이,학년이 일치하는 학생 인덱스 조회 2");
			System.out.println("0. 종료");
			         
			System.out.print("메뉴 선택 >> ");
			
			try {
				sel = sc.nextInt();
				sc.nextLine(); // 개행문자 제거
				
				switch(sel) {
				case 1 : selectAll(); break;
				case 2 : addStudent(); break;
				case 3 : updateStudent(); break;
				case 4 : deleteStudent(); break;
				case 5 : searchStudentName();break;
				case 6 : searchIndex(); break;
				case 7 : searchIndex_2(); break;
				case 0 : System.out.println("프로그램 종료"); break;
				default : System.out.println("메뉴에 있는 번호만 입력해주세요.");
				
				}
	
				
			}catch (InputMismatchException e) {
				System.out.println("정수만 입력해주세요.");
				sel = -1; // 맨 처음 sel == 0 인경우 바로 종료되는 것을 방지
				sc.nextLine(); // 입력버퍼에 남아있는 잘못 입력한 내용 제거
			}
			
		}while(sel != 0);	
	}
	//1.학생 전체 조회 
	public void selectAll() {
		System.out.println("[학생 전체 조회]");
		
		// 학생정보가 있을 경우 
		// n번 이름 나이 학년 출력
		
		// 없을 경우 "입력된 학생 정보가 없습니다." 출력 
		
		//boolean isEmpty() 메소드 : 컬렉션이 비어(공백)있으면 true, 아니면 false반환
		
		if ( stdList.isEmpty()) {
			System.out.println("입력된 학생 정보가 없습니다.");
		}else {
			for(int i=0; i<stdList.size(); i++ ) {
				
				Student s = stdList.get(i);
				// stdList의 i번째 요소를 Student s 에 대입 
				
				System.out.printf("%d번 %s %d세 %d학년\n",i+1,s.getName(),s.getAge(),s.getGrade());
			}
		}
		
	}
	//2,3번 메뉴용 학생 정보입력 메소드 
	
	private Student inputStudent() throws InputMismatchException {
		//예외 발생시 별도의 예외처리 구문이 없으면 throw가 기본
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		return new Student(name, age, grade);	
	}
	
	
	//2.학생 정보 추가
	public void addStudent() throws InputMismatchException {
		System.out.println("[학생 정보 추가]");
		stdList.add(inputStudent());
	}
	
	//3. 학생 정보 수정 
	public void updateStudent() {
		System.out.println("[학생 정보 수정]");
		
		System.out.print("학생 번호 입력 : ");
		int inputNum = sc.nextInt();
		sc.nextLine();
		
		if(stdList.isEmpty()) {
			System.out.println("입력된 학생 정보가 없습니다.");
		}else {
			
			if(inputNum<0) {
				System.out.println("음수는 입력할 수 없습니다.");
			}else {
				
				if((inputNum-1) >= stdList.size()) {
					System.out.println("학생 번호가 존재하지 않습니다.");	
				}else { 
					System.out.println("수정정보 입력하기");
					stdList.set(inputNum-1, inputStudent());
				}	
			}	
		}
	}
	
	public void deleteStudent() {
		System.out.println("[학생 정보 삭제]");
		
		System.out.print("학생 번호 입력 : ");
		int inputNum = sc.nextInt();
		sc.nextLine();
		
		if(!stdList.isEmpty()) {
			if((inputNum-1) >= 0) {
				if((inputNum-1)< stdList.size()) {
					stdList.remove(inputNum-1);
				}else {
					
					System.out.println("학생번호가 존재하지 않습니다.");
				}
			}else {
				System.out.println("음수는 입력될 수 없습니다. ");
			}
		}else {
			System.out.println("입력된 학생 정보가 없습니다.");
		}
	}
	
	private void searchStudentName() {
		System.out.print("검색할 학생 이름 입력 : ");
		String sName = sc.nextLine();
		
		boolean flag = true; 
		
		if (!stdList.isEmpty()) {
			for(int i=0; i < stdList.size(); i++) {
				
				if (sName.equals(stdList.get(i).getName())) {
					System.out.println("인덱스 번호 : " + i);
					System.out.println("조회 시 출력번호 : " + (1+i));
					System.out.println(stdList.get(i));
					flag = false;
			}
		} 
			if(flag) {
				System.out.println("존재하지 않는 학생입니다.");
			}
		}
		else {
			System.out.println("입력된 학생 정보가 없습니다.");
		}
	}
	
	private void searchIndex() {
		
		System.out.println("[학생 인덱스 조회]");
		Student std = inputStudent(); 
		
		boolean flag = true;
		
		for(int i=0; i<stdList.size(); i++) {
			
			Student s = stdList.get(i);
			if(std.getName().equals(s.getName()) &&
				s.getAge() == std.getAge()&&
				s.getGrade()== std.getGrade()){
				
				System.out.println("인덱스 번호 : " + i );
				flag = false;
			}
				
			
		} if(flag) {
			System.out.println("일치하는 학생이 존재하지 않습니다.");
		}
	}
	
	private void searchIndex_2() {
		System.out.println("[학생 인덱스 조회_2]");
		Student std = inputStudent(); 
		
		// object.equals overriding
		//int List.indexOf(Object o)
		//리스트에서 입력받은 값 (매개변수 o)와 같은 객체가 존재하는 index반환, 없으면 -1
		//같은 객체확인하는 equals 오버라이딩을 필수적으로 수행 
		
		if(stdList.indexOf(std)!= -1) {
			System.
			out.println("인덱스 번호 : " + stdList.indexOf(std));
		}else {
			System.out.println("일치하는 학생이 존재하지 않습니다.");
		}
	}
}

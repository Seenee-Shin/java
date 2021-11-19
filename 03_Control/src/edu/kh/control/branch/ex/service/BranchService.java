package edu.kh.control.branch.ex.service;

import java.util.Scanner;

public class BranchService {
	
	//분기문 break;
	// - 반복문을 종료시키는 구문 
	
	public void example1() {
		//0이 입력 될 떄 까지 점수를 입력 받고 0이 입력 되면 입력되 모든 정수의 합 출력 후 종료
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while(true) { // 항상 true는 무한반복 (무한루프)
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();
			
			if (input == 0) {	
				break;  // 수행되면 break구문 뒤에있는 코드 모두 건더 뛰어 끝으로 이동 
			} 
			sum += input;			
		}
		System.out.println("합계 : "+ sum);
	}
	
	public void example2() {
		
		for (int i = 2 ; i<=9 ; i++ ) {
			for (int j =1 ; j <= 9 ; j++) {
				System.out.printf("%d x %d = %d ", i, j, i*j);
				
				if ( j == i ) {
					break;// 분기문은 중첩되어있슨 반복문 안에서 가장 가까운 반복문에 작용
				}
			} 
			System.out.println();
		}
	}
	
	public void example3a() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력(종료시 !exit) : ");
		String str = "";
		while(true) {
			
			String input = sc.nextLine();
			
			if (input.equals("!exit")) {
				//비교연산자 (==)는 문자열에서 거의 사용할 수 없다.
				// == 대신 String.equals 사용 
				break;
			} 
			str += input+"\n";
		} System.out.println(str);
	}

	public void example3b() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력(종료시 !exit)");
		String str = "";
		String input = "!exit";
		
		do{ // 조건 생각하지 않고 무조건 1번은 실행 후 조건 
			input = sc.nextLine();
			if (!input.equals("!exit")) { 
				str = input + "\n";
			}
			
		}while (!input.equals("!exit"));
		
		System.out.println(str);	
	}
	
	public void example5() {
		// continue 반복문 내에서만 사용 가능 , 반복을 건너 뛸 수 있는 처리 방법 
		
		// for 문 : 증감식 구문으로 이동 후 증감 후 조건 비교 
		// while 문 : 조건식 이동 
		// 1~10사이의 있는 3의 배수의 합 구하기 
		
		int sum = 0;
		for (int i = 1 ; i<=10; i++) {
			
			if(i %3 != 0) {
			continue;
			}
			sum += i;
		}
	}
	
	public void example6() {
		// 1~100 반복출력 (1씩 증가)
		// 5의 배수는 건너뛰기
		// 40일때 종료 
		
		
		for (int i = 1 ; i<=100; i++) {
			
			if (i == 40) {
				break;
			}
			
			if(i % 5 == 0) {
			continue;
			}
			
		   System.out.println(i);
		}
	}
	
	public void example7() {
		// 사용자로 부터 입력 받은 정수가 소수인지 판별하는 프로그램 
		//단 , 입력 받은 수가 2보다 작을 경우 "잘못 입력 하셨습니다."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		if(input<2) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			
			boolean flag = true;//소수 판별용 변수
			
			for(int i = 2; i<input ; i++) {
				if ( input % i == 0) { //자기보다 작은 수 중 나머지가 0인 수가 있으면 소수가 아님
					flag = false; //소수가 아님을 저장 
					break;
				}
			} //for문이 끝났지만 한번도 if 문이 수행되지 않았을 때 소수 
			if(flag) {//소수인 경우 
				System.out.println("소수입니다. ");
			}else {// 소수가 아닌경우
				System.out.println("소수가 아닙니다. ");				
			}
		}
	}
	
	public void example8() {

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("입력 : ");
			int input = sc.nextInt();
			
			if(input < 2) {
				System.out.println("잘못 입력 하셨습니다.");
				
			}else {
				
				boolean flag = true;
				for(int i = 2 ; i < input ; i++) {
					if(input % i == 0) {
						flag = false;
						break;
					}
				}
				
				if(flag) {
					System.out.println("소수입니다.");
				}else {
					System.out.println("소수가 아닙니다.");
				}			
				break;
			} 	
		}		
	}
	
	public void example9() {
		//369 족보 만들기
		//10 ~ 99 사이 숫자
		//10 ~ 99가 아닐 경우 "다시 입력해 주세요"
		// 숫자 3,6,9,가 들어간 숫자는 "짝"표시
		//33 ,36,39 등 은 "짝짝"
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("입력 : ");
			int input = sc.nextInt();
			
			if(input < 10 || input > 99) {
				System.out.println("다시 입력해 주세요.");
			} 
			else {
				for (int i = 1 ; i <= input; i++) {
					int ten = i / 10;
					int one = i % 10;
					
					if((one%3 == 0 && one!=0)&&(ten%3 == 0 && ten != 0)){
						System.out.print(" 짝짝");
					} if((one%3 == 0 && one!=0)||(ten%3 == 0 && ten != 0)){
						System.out.print(" 짝");
					} else { System.out.printf("%3d ",i);
					}	if (i %10 == 0) {
						System.out.println();	
				}
				}	
			}	break;	
		}
	}
}

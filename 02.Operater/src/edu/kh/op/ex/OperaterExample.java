package edu.kh.op.ex;

import java.util.Scanner;

public class OperaterExample {
	
	public void example1() {
		//단항 연산자 - 논리 부정 연산자 !
		//논리 값을 반대로 변경하는 연산자 
		
		boolean isTrue = true;
		
		System.out.println("is True : " + isTrue);
		System.out.println("is False : " + !isTrue);
		
	}
	//증감 연산자
	// 피연산자를 1 증가 시키거나 감소 시키는 연산자 
	// 전위 연산 & 후위 연산 
	// 전위연산 : 우선 순위 높음, 다른 연산 보다 빨리 처리 한다
	// 후위연산 : 연산이 모두 끝난 후 연산처리
	public void example2() {
		
		int num1 = 10;
		int num2 = ++num1;
		
		System.out.println("num1 : "+ num1);//11
		System.out.println("num2 : "+ num2);//11
		
		int num3 = 10;
		int num4 = num3++;
		System.out.println("num3 : "+ num3);//11
		System.out.println("num4 : "+ num4);//10
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		
		//3++ + --5
		//3++ + 4
		
		
		System.out.println(a + "/" + b + "/" + c);
	}
	
	public void example3() {
		//산술연산자
		int num = 5; 
		System.out.printf("%d / %d = %d\n", num, 3, num/3);
		System.out.printf("%d %% %d = %d\n", num, 3, num%3);
		
		System.out.println(5 % 3 == 0);
		System.out.println(273 % 3 == 0);
		
	}
	public void example4() {
		//비교연산자 항상 오른쪽이 =
		//비교연산사의 연산결과는 무조건 참,거짓 (true, false)
		
		int a =10;
		int b = 20;
		System.out.println(a == b);
		System.out.println(!(a == b));
		System.out.println(a != b);
		
		System.out.println("-----------------------");
		
		int c = 4;
		int d = 5;
		
		System.out.println(c < d);
		System.out.println(c+1 < d);
		System.out.println(c+1 <= d);
		System.out.println((++c != d) == ( --c != d));
							//(5 != 5) ==  (4 != 5)
		
		System.out.println("-----------------------");
		int num = 123;
		System.out.println("num은 짝수인가? " + (num%2 == 0));
		System.out.println("num은 짝수인가? " + (num%2 != 1));

		System.out.println("num은 홀수인가? " + (num%2 == 1));
		System.out.println("num은 홀수인가? " + (num%2 != 0));
		
		System.out.println("-----------------------");	
		
	}
	
	public void example5() {
		//논리연산자 && 
		// &&(AND) : 둘다 true 일떼만 true'
		//~이면서, 이고, 사이, 까지
		// ||(OR) :  하나라도 true면 true
		// 또는 ~거나 
		
		int a = 100;
		//a는 100이상 이면서 짝수인가?
		System.out.println(a >= 100 && a%2 == 0);
		if (a >= 100 && a%2 == 0) { 
			System.out.println("예");
		}	else { 
				System.out.println("아니요");
		}
		
		System.out.printf("정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		boolean result = input >=1 && input <= 100;
		System.out.print("입력 받은 수는 1 이상, 100이하 인가? " + result);
			
		
	}
	public void example6() {
		//복합대입연산자 ( +=, -=, *=, /=, %=)
		//피연산자가 연산 후 결과를 다시 자신에게 대임 
		// 증감연산자 = 1씩 증가, 감소
		// 복합대입연산자는 증감연산자의 상위 개념
		  int a = 5;
		  
		  a += 5;
		  System.out.println(a);
		  
		  a -= 5;
		  System.out.println(a);
		  
		  a *= 4; 
		  System.out.println(a);
		  
		  a /= 3;
		  System.out.println(a);

		  a %= 5;
		  System.out.println(a);
		 
	}
		public void example7() {
			//삼항 연산자 (조건식 ? 식1 : 식 2)
			// 참일때 식1 수행 , 거짓일때 식2 수행
			// 조건식 : 값이 참, 거짓인 언산식 (비교, 논리, 논리부정)
			
			Scanner sc = new Scanner(System.in);
			System.out.printf("정수 하나 입력 : ");
			int input = sc.nextInt();
			String result = input%2 == 1 ?  "홀수" : "짝수";
			System.out.println(result + " 입니다.");
			
		}
		
		public void example8() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 하나 입력 : ");
			int input = sc.nextInt();
			
			String result = input < 0 ? "음수" : "양수";
			System.out.println(input + "은/는 " + result + "입니다.");
			
			
		}
		
		// 중첩하기
		public void example9() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 하나 입력 : ");
			int input = sc.nextInt();
			
			String result = input > 0 ? "양수" : (input == 0 ? "0" : "음수");
			System.out.println(input + "은/는 " + result + "입니다.");
			
		}
}

		

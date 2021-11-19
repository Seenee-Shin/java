package edu.kh.oarr.ex.model.service;

import java.util.Scanner;

import edu.kh.oarr.ex.model.vo.Book;

public class BookService {
	
	public void example1() {
		// 북 개체 배열 선언 및 할당 
		Book[] books = new Book[3];// 북 참조변수 3칸 생성 
		
		
		// 개체배열 초기화 
		books[0] = new Book("어린왕자", "생텍쥐페리", 8000);
		books[1] = new Book("자바의 정석", "남궁 성", 30000);
		books[2] = new Book("삼국지", "이문열", 100000);
		
		// for문으로 객체배열 모두 출려 
		
		for(int i= 0 ; i < books.length ; i++) {
			System.out.println(books[i].information());
		}
		
		//books 배열의 요소 중 부분적으로 출력 == 검색 
		// "자바의 정석" 의 "가격
		
		for(int i = 0; i < books.length ; i++) {
			if(books[i].getTitle().equals("자바의 정석")) {
				
			System.out.println("자바의 정석 가격 : "+ books[i].getPrice());	
			}
		}
	}
	
	public void example2() {
		
		//객체 배열 선언과 동시에 초기화 
		
		Book[] books = {
				new Book("그리스로마신화", "제우스", 10000),
				new Book("어린왕자", "생택쥐페리", 80000),
				new Book("자바의정석", "남궁 성", 30000),
		}; //book 객체 배열 성언 및 할당 & 초기화 
		
		//books 가 참조하는 책의 가격 합 구하기 
		int sum = 0 ;
		for(int i =0 ; i<books.length ; i++) {
			sum += books[i].getPrice();
		}
		System.out.println("가격 합 : "+ sum);
	}
	
	public void example3() {
		//book 객체 3개를 저장할 수 있는 배열 선언 및 할당 
		Book[] books = new Book[3];
		//책 3권의 정보를 입력받아 book 객체 배열에 순서대로 저장
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < books.length ; i++) {
			System.out.print(i + "번쨰 책 제목 : ");
			String title =sc.nextLine();
			
			System.out.print(i + "번쨰 책 저자 : ");
			String auther = sc.nextLine();
			
			System.out.print(i + "번쨰 책 가격 : ");
			int price = sc.nextInt();
			sc.nextLine(); // 입력버퍼에 남아있는 \n(개행문자 )제거 
			
			books [i] = new Book(title ,auther, price); //생성자 생성 후 대입
			
			System.out.println(books[i].information());
		}
		
		// +가격이 가장 비싼책, 가장 저렴한 책 두권의 정보 출력
		
		int maxIndex = 0;
		int minIndex = 0;
				// 인덱스 변수가 0으로 지정, 0끼리 비교할 필요 x -> i = 1부터
		for (int i = 1; i < books.length ; i++) {
			if(books[i].getPrice() > books[maxIndex].getPrice()) {
				maxIndex = i ;
			} else if(books[i].getPrice() < books[minIndex].getPrice()) {
				minIndex = i ;
			}
		}
		System.out.println("가장 비싼책 : " + books[maxIndex].information());
		System.out.println("가장 싼 책 : " + books[minIndex].information());
	}

}

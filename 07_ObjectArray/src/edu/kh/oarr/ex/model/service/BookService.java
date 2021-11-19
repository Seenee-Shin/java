package edu.kh.oarr.ex.model.service;

import java.util.Scanner;

import edu.kh.oarr.ex.model.vo.Book;

public class BookService {
	
	public void example1() {
		// �� ��ü �迭 ���� �� �Ҵ� 
		Book[] books = new Book[3];// �� �������� 3ĭ ���� 
		
		
		// ��ü�迭 �ʱ�ȭ 
		books[0] = new Book("�����", "�������丮", 8000);
		books[1] = new Book("�ڹ��� ����", "���� ��", 30000);
		books[2] = new Book("�ﱹ��", "�̹���", 100000);
		
		// for������ ��ü�迭 ��� ��� 
		
		for(int i= 0 ; i < books.length ; i++) {
			System.out.println(books[i].information());
		}
		
		//books �迭�� ��� �� �κ������� ��� == �˻� 
		// "�ڹ��� ����" �� "����
		
		for(int i = 0; i < books.length ; i++) {
			if(books[i].getTitle().equals("�ڹ��� ����")) {
				
			System.out.println("�ڹ��� ���� ���� : "+ books[i].getPrice());	
			}
		}
	}
	
	public void example2() {
		
		//��ü �迭 ����� ���ÿ� �ʱ�ȭ 
		
		Book[] books = {
				new Book("�׸����θ���ȭ", "���콺", 10000),
				new Book("�����", "�������丮", 80000),
				new Book("�ڹ�������", "���� ��", 30000),
		}; //book ��ü �迭 ���� �� �Ҵ� & �ʱ�ȭ 
		
		//books �� �����ϴ� å�� ���� �� ���ϱ� 
		int sum = 0 ;
		for(int i =0 ; i<books.length ; i++) {
			sum += books[i].getPrice();
		}
		System.out.println("���� �� : "+ sum);
	}
	
	public void example3() {
		//book ��ü 3���� ������ �� �ִ� �迭 ���� �� �Ҵ� 
		Book[] books = new Book[3];
		//å 3���� ������ �Է¹޾� book ��ü �迭�� ������� ����
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < books.length ; i++) {
			System.out.print(i + "���� å ���� : ");
			String title =sc.nextLine();
			
			System.out.print(i + "���� å ���� : ");
			String auther = sc.nextLine();
			
			System.out.print(i + "���� å ���� : ");
			int price = sc.nextInt();
			sc.nextLine(); // �Է¹��ۿ� �����ִ� \n(���๮�� )���� 
			
			books [i] = new Book(title ,auther, price); //������ ���� �� ����
			
			System.out.println(books[i].information());
		}
		
		// +������ ���� ���å, ���� ������ å �α��� ���� ���
		
		int maxIndex = 0;
		int minIndex = 0;
				// �ε��� ������ 0���� ����, 0���� ���� �ʿ� x -> i = 1����
		for (int i = 1; i < books.length ; i++) {
			if(books[i].getPrice() > books[maxIndex].getPrice()) {
				maxIndex = i ;
			} else if(books[i].getPrice() < books[minIndex].getPrice()) {
				minIndex = i ;
			}
		}
		System.out.println("���� ���å : " + books[maxIndex].information());
		System.out.println("���� �� å : " + books[minIndex].information());
	}

}

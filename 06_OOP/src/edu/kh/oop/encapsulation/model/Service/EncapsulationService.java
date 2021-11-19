package edu.kh.oop.encapsulation.model.Service;

import edu.kh.oop.encapsulation.model.vo.Account;
import edu.kh.oop.encapsulation.model.vo.Book;

public class EncapsulationService {
	
	public void example1() {
		Account ac = new Account();
//		ac.name = "신희연";
//		ac.accountNumber = "201-241936-32";
//		ac.password = "1211";
//		ac.bankCode = 10;
//		ac.money = 10000000;
//		
		// 외부로서 접근 위험 => 잘못된 사용으로 인한 객체손상 위험 
		// 캡슐화로 보안성 높임 > 객체 속성에 직접적인 접근이 불가능 해짐 
		// 
		
		//setter 를 이용한 값 세팅하기 
		ac.setName("홍길동");
		//Account 객체의 기능인 setName의 매개변수에 "홍길동" 값을 전달해줌 
		
		ac.setAccountNumber("12-4353453-23");
		ac.setpassword("2222");		
		ac.setMoney(1000000000);
		ac.setBankCode(12);
		
		//System.out.println( ac.getName() );
		
		
		// getter를 이용하여 값 출력하기 
		System.out.println(ac.getName());
		System.out.println(ac.getAccountNumber());
		System.out.println(ac.getPassword());
		System.out.println(ac.getMoney());
		System.out.println(ac.getBankCode());
		
		
	}
	
	public void example2() {
		Book book1 = new Book();
		
		book1.setTitle("어린왕자");
		book1.setAuther("생택쥐페리");
		book1.setPrice(8000);
		
		System.out.println("제목 : " + book1.getTitle());
		System.out.println("저자 : " + book1.getAuther());
		System.out.println("가격 : " + book1.getTitle());
		
	}

}

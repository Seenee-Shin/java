package edu.kh.oop.encapsulation.model.Service;

import edu.kh.oop.encapsulation.model.vo.Account;
import edu.kh.oop.encapsulation.model.vo.Book;

public class EncapsulationService {
	
	public void example1() {
		Account ac = new Account();
//		ac.name = "����";
//		ac.accountNumber = "201-241936-32";
//		ac.password = "1211";
//		ac.bankCode = 10;
//		ac.money = 10000000;
//		
		// �ܺημ� ���� ���� => �߸��� ������� ���� ��ü�ջ� ���� 
		// ĸ��ȭ�� ���ȼ� ���� > ��ü �Ӽ��� �������� ������ �Ұ��� ���� 
		// 
		
		//setter �� �̿��� �� �����ϱ� 
		ac.setName("ȫ�浿");
		//Account ��ü�� ����� setName�� �Ű������� "ȫ�浿" ���� �������� 
		
		ac.setAccountNumber("12-4353453-23");
		ac.setpassword("2222");		
		ac.setMoney(1000000000);
		ac.setBankCode(12);
		
		//System.out.println( ac.getName() );
		
		
		// getter�� �̿��Ͽ� �� ����ϱ� 
		System.out.println(ac.getName());
		System.out.println(ac.getAccountNumber());
		System.out.println(ac.getPassword());
		System.out.println(ac.getMoney());
		System.out.println(ac.getBankCode());
		
		
	}
	
	public void example2() {
		Book book1 = new Book();
		
		book1.setTitle("�����");
		book1.setAuther("�������丮");
		book1.setPrice(8000);
		
		System.out.println("���� : " + book1.getTitle());
		System.out.println("���� : " + book1.getAuther());
		System.out.println("���� : " + book1.getTitle());
		
	}

}

package edu.kh.oop.constructor.model.service;

import edu.kh.oop.constructor.model.vo.User;

public class ConstructorService {
	
	public void example1() {
		// �⺻�����ڸ� �̿��� User ��ü����
		
		User user1 = new User();
		
		// �⺻�����ڸ� �̿��� ������� User ��ü�� �ʵ带 �ʱ�ȭ 
		user1.setUserId("user01");
		user1.setUserPassword("pass01");
		user1.setUserName("ȫ�浿");
		user1.setUserAge(25);
		user1.setUserGender('��');
		
		System.out.println(user1.getUserId());
		System.out.println(user1.getUserPassword());
		System.out.println(user1.getUserName());
		System.out.println(user1.getUserAge());
		System.out.println(user1.getUserGender());
	
//		User user2 = new User();
//		user2.setUserId("user02");
//		user2.setUserPassword("pass02");
//		user2.setUserName("����");
//		user2.setUserAge(20);
//		user2.setUserGender('��');
		
		User user2 = new User("user02", "pass02", "����", 20, '��');
		//�Ű����� �ִ� ������ ������� == �ڵ� ������ ���� 
		//**�Ű������� �������� ��� ������ ���� �˸��� ���� �ۼ��ؾ� �Ѵ� 
		
		System.out.println(user2.getUserId());
		System.out.println(user2.getUserPassword());
		System.out.println(user2.getUserName());
		System.out.println(user2.getUserAge());
		System.out.println(user2.getUserGender());
		
		
		
		
		
	}

}

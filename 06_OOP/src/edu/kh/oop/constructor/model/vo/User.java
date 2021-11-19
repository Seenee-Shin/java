package edu.kh.oop.constructor.model.vo;

public class User {
	
	// Ŭ���� ���� 
	// public class Ŭ���� ��{
//				
//		�ʵ� 
//		������
//		�޼ҵ� 
//	//}
	
	//�ʵ�
	private String userId; //ĸ��ȭ ��Ģ�� ���� �⺻������ private�� �ۼ�
	private String userPassword;
	private String userName;
	private int userAge;
	private char userGender;
	
	//������
	// ������ ��ü�� �ʵ尪�� �ʱ�ȭ �ϰ� ������ ����� �����ϴ� ���� ����
	// ������ �ۼ� ��Ģ 
	//1.�������� �̸��� �ݵ�� Ŭ������� ���ƾ� �Ѵ� 
	//2.�����ڴ� ��ȯ���� �������� �ʴ´�.
	//3. �����ڰ� �ϳ��� �����ϴ� ��� �⺻�����ڰ� �ڵ� �߰����� �ʴ´�
	//		�Ű����� �ִ� ������ �ۼ��� , �⺻�����ڸ� ����� �ش� .
	
	

	//�⺻ ������ 
	//[����������] Ŭ������() {
	// �ڵ�
	// }
	
	public User() {
		//��ü ������ ����� �ڵ� �ۼ� 
		System.out.println("�⺻ �����ڿ� ���� User��ü�� �����Ǿ����ϴ�.");
		
	}
	// �����ڰ� *�ϳ��� �ۼ����� ���� ��� ��ü�� ������ �� ���� ������ 
	// �����Ϸ��� �ڵ����� �⺻ �����ڸ� �߰��Ѵ�. 
	
//		�Ű����� �ִ� ������ == ���� �������� �ѹ��� �����ϴ� ���
//		��ü ������ �Ű������� ���� ���� ���� �̿�, ��ü �ʵ带 �ʱ�ȭ�ϴ� ������
//		��ü�� ���� ���� ���� �ʵ忡 ���� �Է�
	
	// ������ �����ε� ���� ����
	// 1. �Ű������� ������ �ٸ���
	// 2. �Ű������� ������ ������ Ÿ���� �ٸ���
	// 3. ����,Ÿ���� ������ ������ �ٸ��� 
	
	// ***�����ε��� ���ǻ���
	// �������� ������� ! �������� �޶� Ÿ���� ������ �����ε� ����xxx
//		
		public User(String userId, String userPassword, String userName,int userAge, char userGender) {
			// �Ű������� 5�� == ���� �޴� ���� 5�� 
			this.userId = userId;
			this.userPassword = userPassword;
			this.userName = userName;
			this.userAge = userAge;
			this.userGender = userGender;
		}
		
//	
//	
	//�޼ҵ� getter setter
	public String getUserId () {
		return userId;
		}
	
	public void setUserId( String userId) {
		this.userId = userId;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword( String userPassword) {
		this.userPassword = userPassword;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName( String UserName) {
		this.userName = userName;
	}
	
	public int getUserAge() {
		return userAge;
	}
	
	public void setUserAge (int userAge) {
		this.userAge = userAge;
	}
	
	public char getUserGender () {
		return userGender;
	}
	
	public void setUserGender (char userGender) {
		this.userGender = userGender;
	}
	
	
}

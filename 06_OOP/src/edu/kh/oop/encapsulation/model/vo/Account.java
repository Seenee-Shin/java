package edu.kh.oop.encapsulation.model.vo;

public class Account {
	
	//public = ��𼭵�, ������ ���� ����
	//private = �ش� ��ü �ȿ����� ��밡�� 
	
	private String name;
	private  String accountNumber;
	private  String password;
	private int money;
	private  int bankCode;
	
	
	public void deposit() {
		System.out.println("�Ա� ��� ����");

	}
	
	public void withdraw() {
		System.out.println("��� ��� ����");
		
	}
	
	//private���� ���� ������ ���ѵ� ��ü�� �Ӽ��� ���������� �����ϴ� ���
	//�Ӽ��� ���� �����ϴ� setter
	// ���� ������ getter
	
	
	//setter
	//	public void set�Ӽ���(�Ӽ��ڷ���+�Ӽ���){
	// 			this.�Ӽ��� = �Ӽ���;
	//	}

	
	public void setName( String name ) {
							//�ܺηκ��� ���޹��� ���� �����ϴ� �Ű�ü
							// �ܺη� ���� ���޹��� ���� �ش��� ���ο��� name�̶�� ���������� ��� 
		this.name = name;
		
	}
	
	public void setAccountNumber ( String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setpassword( String password ) {
		this.password = password;
		
	}
	
	public void setMoney( int money) {
		this.money = money;
	}
	
	public void setBankCode ( int bankCode ) {
		this.bankCode = bankCode;
	}
	
	
	//getter 
	// public �Ӽ� �ڷ��� get�Ӽ��� (){
	// 		return �Ӽ���;
	// }

	public String getName() {
		// ȣ��� ������ ��ȯ�� �ڷ���
		return name; 
		// ȣ��� ������ ��ȯ 
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getMoney() {
		return money;
	}
	
	public int getBankCode() {
		return bankCode;
	}
	
}

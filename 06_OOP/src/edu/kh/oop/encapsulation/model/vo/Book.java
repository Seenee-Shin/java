package edu.kh.oop.encapsulation.model.vo;

public class Book {
	
	private String title;
	private String auther;
	private int price;
	
	//private���� ���� ������ ���ѵ� ��ü�� �Ӽ��� ���������� �����ϴ� ���
	// ĸ��ȭ : ��ü�ջ��� ���� ���� ���� 
	
	// �Ӽ��� �����ϱ� ���� ���� ���� ��� 
	// �Ӽ��� ���� �����ϴ� setter // ���� ������ getter
	
	
	public void knowledgeTransfer() {
		
	}
	// void : �������� ��ȯ���� ���� 
	public void setTitle (String title) {
							// �Ű�ü������ parameter
							// ���� ���� ���� ���� (�Ű�ü)
		this.title = title;
		//���� ��ü�� �Ӽ��� private ������  setTitle��ü�� ���ٰ��� (���� ��ü�ȿ� �����ϱ� ����)
	}
	
	public String getTitle() {
		return title;
	} // �������� ��ȯ ���� �ֱ� ������ void ���� ����
	
	
	public void setAuther(String auther) {
		this.auther = auther;
	}
	
	public String getAuther() {
		return auther;
	}
	
	public void setPrice (int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}

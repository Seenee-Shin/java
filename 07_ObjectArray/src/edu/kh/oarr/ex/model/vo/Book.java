package edu.kh.oarr.ex.model.vo;

//getter ,setter �ڵ��ϼ� 
// alt + [shift] +s -> r
// 


public class Book {
	// �ʵ�
	private String title;
	private String auther;
	private int price;
	
	
	//������
	public Book() {	}
	
	public Book(String title, String auther, int price) {
		
		this.title = title;
		this.auther = auther;
		this.price = price;
		
	}
	
	//getter setter 

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	//�޼ҵ�
	public String information() {
		//�ʵ� ���� ��ȯ �޼ҵ�
		
		return title + " / "+ auther + " / " + price;
		
	}
	
	
	
	

}

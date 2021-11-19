package edu.kh.oarr.ex.model.vo;

//getter ,setter 자동완성 
// alt + [shift] +s -> r
// 


public class Book {
	// 필드
	private String title;
	private String auther;
	private int price;
	
	
	//생성자
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
	
	
	
	//메소드
	public String information() {
		//필드 정보 반환 메소드
		
		return title + " / "+ auther + " / " + price;
		
	}
	
	
	
	

}

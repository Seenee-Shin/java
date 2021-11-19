package edu.kh.oop.encapsulation.model.vo;

public class Book {
	
	private String title;
	private String auther;
	private int price;
	
	//private으로 직접 접근이 제한된 객체의 속성을 간접적으로 접근하는 기능
	// 캡슐화 : 객체손상을 막기 위해 진행 
	
	// 속성에 접근하기 위한 간접 접근 방법 
	// 속성별 값은 셋팅하는 setter // 값을 얻어오는 getter
	
	
	public void knowledgeTransfer() {
		
	}
	// void : 돌려보낼 반환값이 없음 
	public void setTitle (String title) {
							// 매개체개변수 parameter
							// 전달 받은 값은 저장 (매개체)
		this.title = title;
		//현재 객체의 속성을 private 이지만  setTitle개체에 접근가능 (같은 객체안에 존재하기 떄문)
	}
	
	public String getTitle() {
		return title;
	} // 돌려보낼 반환 값이 있기 때문에 void 쓰지 않음
	
	
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

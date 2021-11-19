package edu.kh.oop.field.model.vo;

public class Korean {
	
	private String name;
	private String id;
	public static int nCode = 82; // static 예약어 추가 (수정용이)
	// static 예약어사 작성된 코드는 프로그램 실행시 static영역에 자동으로 추가 
	

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setNCode(int nCode) {
		this.nCode = nCode;
	}
	
	public int getNCode() {
		return nCode;
	}
}

package edu.kh.oop.field.model.vo;

public class Korean {
	
	private String name;
	private String id;
	public static int nCode = 82; // static ����� �߰� (��������)
	// static ������ �ۼ��� �ڵ�� ���α׷� ����� static������ �ڵ����� �߰� 
	

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

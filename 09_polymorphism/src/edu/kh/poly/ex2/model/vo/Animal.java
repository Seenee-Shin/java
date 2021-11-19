package edu.kh.poly.ex2.model.vo;

public abstract class Animal {
	private String type;
	private String eatType;
	
	// ��ü ������ �Ұ��� �ϱ⿡ ������ �ʿ���� 
	// but ��ӹ��� �ڽ� Ŭ������ ���� �� �� ���� 
	
	public Animal() { }
	
	public Animal(String type, String eatType) {
		super();
		this.type = type;
		this.eatType = eatType;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public String getEatType() {
		return eatType;
	}
	public void setEatType(String eatType) {
		this.eatType = eatType;
	}
	
	
	//���� ���� ���� �ϴ� ����� �ٸ� ��� 
	public abstract void hunt();
	// �̿ϼ� �޼ҵ� 
	// ��� ���� �ڽ� Ŭ�������� ���� 
	// ���� Ŭ���� ������ �������̵����ֱ� ���ϸ� ���� 
	// �޼ҵ� �������̵� ����ȭ 
	
}

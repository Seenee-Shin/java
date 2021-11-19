package edu.kh.poly.ex2.model.vo;

public class Dog extends Animal{
	
	private int loyalty;
	
	public Dog() {}
	
	public Dog(String type, String eatType, int loyalty) {
		super(type, eatType);
		this.loyalty = loyalty;
	}
	
	@Override
	public void hunt() {
		System.out.println("달려가서 물기");
	}
	
	
	public int getLoyalty() {
		return loyalty;
	}

	public void setLoyalty(int loyalty) {
		this.loyalty = loyalty;
	}

	

}

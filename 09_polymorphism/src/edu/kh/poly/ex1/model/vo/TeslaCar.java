package edu.kh.poly.ex1.model.vo;

public class TeslaCar extends Car {

	private int batteryCacity;
	
	public TeslaCar() {
		super();
	}
	
	public TeslaCar(int wheel, String handle, String engine, int batterCapacity) {
		
		super(wheel, handle, engine);
		this.batteryCacity = batterCapacity;
	}

	public int getBatteryCapacity() {
		return batteryCacity;
	}

	public void setBatteryCacity(int batteryCacity) {
		this.batteryCacity = batteryCacity;
	}
	
	@Override
	public String toString(){
		return super.toString() + " / " + batteryCacity;
	}
	
	
}

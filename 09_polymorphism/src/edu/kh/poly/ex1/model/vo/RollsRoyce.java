package edu.kh.poly.ex1.model.vo;

public class RollsRoyce extends Car {
	
	private String umbrellacolor;
	
	public RollsRoyce() {
		
	}

	public RollsRoyce(int wheel, String handle, String engine, String umbrellacolor) {
		super(wheel, handle, engine);
		this.umbrellacolor = umbrellacolor;
	}
	
	
	
	public String getUmbrellacolor() {
		return umbrellacolor;
	}

	public void setUmbrellacolor(String umbrellacolor) {
		this.umbrellacolor = umbrellacolor;
	}

	@Override
	public String toString() {
		return super.toString() + " / " + umbrellacolor;
	}


	
	
}

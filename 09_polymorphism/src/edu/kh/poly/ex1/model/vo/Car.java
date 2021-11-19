package edu.kh.poly.ex1.model.vo;

public class Car {
	private int wheel;
	private String handle;
	private String engine;
	
	public Car () { }

	public Car(int wheel, String handle, String engine) {
		super();
		this.wheel = wheel;
		this.handle = handle;
		this.engine = engine;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	@Override
	public String toString() {
		return wheel + " / " + engine + " / " + handle;
	}
	
	
}

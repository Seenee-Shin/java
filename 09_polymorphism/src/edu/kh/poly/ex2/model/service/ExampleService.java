package edu.kh.poly.ex2.model.service;

import edu.kh.poly.ex2.model.vo.Animal;
import edu.kh.poly.ex2.model.vo.Dog;

public class ExampleService {
	
	public void example1() {
		
		//추상클래스를 이용한 객체 생성 
		//Animal animal = new Animal(); 
		// error : Cannot instantiate the type Animal
		// animal 타입은 객체화 불가능 -> 추상 클래스이기 때문 
		
		// 추상 클래스를 상속 받아 구형한 일반 클래스 객체 생성 
		Dog dog = new Dog("개과", "잡식", 100);
		
		dog.hunt();
		
		//추상클래스는 부모타입 참조변수로 사용 가능 
		Animal animal = new Dog("개과", "충성심", 100);
		
		animal.hunt();
		
	}
	
	public void example2() {
		Marker[] arr = new Marker[3];
		
		arr[0] = new MyCalculator();
		arr[1] = new NewCalaulator();
		arr[2] = new Test();
		
		
	}

}

package edu.kh.poly.ex2.model.service;

import edu.kh.poly.ex2.model.vo.Animal;
import edu.kh.poly.ex2.model.vo.Dog;

public class ExampleService {
	
	public void example1() {
		
		//�߻�Ŭ������ �̿��� ��ü ���� 
		//Animal animal = new Animal(); 
		// error : Cannot instantiate the type Animal
		// animal Ÿ���� ��üȭ �Ұ��� -> �߻� Ŭ�����̱� ���� 
		
		// �߻� Ŭ������ ��� �޾� ������ �Ϲ� Ŭ���� ��ü ���� 
		Dog dog = new Dog("����", "���", 100);
		
		dog.hunt();
		
		//�߻�Ŭ������ �θ�Ÿ�� ���������� ��� ���� 
		Animal animal = new Dog("����", "�漺��", 100);
		
		animal.hunt();
		
	}
	
	public void example2() {
		Marker[] arr = new Marker[3];
		
		arr[0] = new MyCalculator();
		arr[1] = new NewCalaulator();
		arr[2] = new Test();
		
		
	}

}

package edu.kh.poly.ex1.model.service;

import edu.kh.poly.ex1.model.vo.Car;
import edu.kh.poly.ex1.model.vo.RollsRoyce;
import edu.kh.poly.ex1.model.vo.Spark;
import edu.kh.poly.ex1.model.vo.TeslaCar;

public class PolymorphismService {

	public void example1() {
		
		Car c = new Car(4, "����"
				+ "�ڵ�","��������");
		// ���� Ŭ���� �������� = ���� Ŭ���� ��ü 
		
		TeslaCar t = new TeslaCar(4, "�����ڵ�" , "�������", 50000);
		//���� Ŭ���� �������� = ���� Ŭ���� ��ü 
		
		Car c2 = new TeslaCar(6, "�����ڵ�" , "�������", 100000);
		// ����Ŭ���� �������� = ���� Ŭ���� ��ü 
		// ������
		
		//�� ��ü�� �ʵ����� ��� 
		System.out.println("c : " + c);
		System.out.println("t : " + t);
		System.out.println("c2 : " + c2.getWheel() + c2.getHandle() + c2.getEngine());
	}
	
	public void example2 () {
		
		// ��ĳ���� Ȱ�� : ��ü�迭 
		
		TeslaCar tesla = new TeslaCar(4,"����","�������",5000);
		RollsRoyce royce = new RollsRoyce(4,"����	","��������","����");
		Spark spark = new Spark(4,"����","��������",50);
		// ��� Car�� ���� Ŭ���� -> ������ ��� ���� 
		
		// �� ��ü�� ���� ���� ��� 
		Car[] arr = new Car[3]; //���� Ŭ������ �������� 
		
		arr[0] = tesla; // tesla ���������� TeslaCar�� �ּҰ� ����
		arr[1] = royce; 
		arr[2] = spark; 
		
		for(int i =0 ; i <arr.length; i++) {
			System.out.println(	arr[i].getEngine());
		}
		
		System.out.println("=====================");
		
		//��ĳ���� Ȱ�� : �Ű������� ���� 
		printEngine(tesla);
		printEngine(royce);
		printEngine(spark);
		
		
		// ��ĳ���� Ȱ�� :����Ÿ�Կ� ���� 
		Car c2 = creatcar(1);
	}
	
	public Car upgradeEngine(Car c) {
		String newEngine = c.getEngine() + "�跮��";
		c.setEngine(newEngine);
		return c;
	}
	
	// 1�̸� �׽��� 2�� �ѽ� 3�̸� ����ũ ��ü ���� �� ��ȯ 
	public Car creatcar(int num) {
		Car c = null;
		switch(num) {
		case 1 : c = new TeslaCar(); break;
		case 2 : c = new RollsRoyce(); break;
		case 3 : c = new Spark(); break;	 
		} 
		
		return c;
	}
	

	public void printEngine(Car c) {
		System.out.println(c.getEngine());
		
	}
	
	public void example3() {
		//�ٿ�ĳ����
		Car c = new Spark();
		((Spark)c).getDiscountOffer();
		
		System.out.println(c instanceof Spark);
		
		Car[] carArr = {new Car(9, "ū ���� �ڵ�", "v8 ���� ����"),
						new TeslaCar(4, "��� ���� �ڵ�", "�������", 50000),
						new RollsRoyce(6, "���ڵ�", "���� ����", "��������"),
						new Spark(4, "���� �ڵ� ", "���ָ� ����", 9.5)};
		
			// �׽���� ���͸� �뷮 ���
			// �ѽ��� ��� �� ���
			// ����ũ�� �������ú��� ���
			// �׳� ���� toStirng
		
		for(int i =0; i <carArr.length ; i++ ) {
			
			if ( carArr[i] instanceof Spark) {
				System.out.println(((Spark)carArr[i]).getDiscountOffer());
			}else if ( carArr[i] instanceof RollsRoyce) {
				System.out.println(((RollsRoyce)carArr[i]).getUmbrellacolor());
			} else if ( carArr[i] instanceof TeslaCar) {
				System.out.println(((TeslaCar)carArr[i]).getBatteryCapacity());
			}else {
				System.out.println(carArr[i].toString());
			}
			
		}
		} 
	
	public void example4() {
		
		Car c = new Spark(4, "�����ڵ�", "���ָ� ����", 0.5);
		// ��ĳ���� 
		System.out.println(c.toString());
		//���α׷� �� c.toString�� CarŬ������ �ִ� �Ͱ� ����Ǿ��ִ� ���� Ȯ�� 
		// -> ���� ���ε� 
		
		// ������ ���� ���ε����� ������ �Ͱ� �ٸ��� ��� ���� Spark�� toString������ ��� 
		//-> ���� ���ε� 
		
	}
}

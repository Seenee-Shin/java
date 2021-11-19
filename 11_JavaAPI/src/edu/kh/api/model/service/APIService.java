package edu.kh.api.model.service;

public class APIService {
	
	//Wrapper Ŭ���� 
	// �⺻�ڷ����� ��üȭ �����ִ� Ŭ���� 
	// �⺻ �ڷ����� ���õ� Ư�� ��, ����� ����
	// �⺻ �ڷ����� �ٷ� �� ���� ��쿡 ���
	// ex) �Ű������� Object�� ���, Collection�� ����� �� (Collection�� ��ü�� ��� ) 
	
	//Wrapper -> java.lang ��Ű�� �ȿ� ���� 
	// (�⺻�ڷ���>WapperClass) == Boxing <-> Unboxing
	// byte/byte , short/Short , int/ Integer , long/Long, float/Float
	// double/Double , boolean/ Boolean, char/ Character
	
	//���ֻ��Ǵ� �ʵ�,�޼ҵ�� ��� static���� ���� �Ǿ��ִ�
	
	public void example1() {
		System.out.println(Integer.MAX_VALUE );
		System.out.println(Integer.MIN_VALUE );
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE); //beat ũ�� 
		//��� Wrapper Class���� ���� 
		// boolean�� �ּ�, �ִ� ���� 
	
	}
	public void example2() {
	// ���ڿ� ���ڸ� ���� �ڷ������� 
	
		String str1 = "12345";
		 str1 = int num;
		
		System.out.println();
		
		byte b = Byte.parseByte("1");
		short s = Short.parseShort("2");
		int i = Integer.parseInt("3");
		long l = Long.parseLong("4");
		float f = Float.parseFloat("0.1");
		double d = Double.parseDouble("0.2");
		boolean bool = Boolean.parseBoolean("true");
		
		// Character.parseCharacter �� �������� �ʴ´�. 
		// ��� .CharAt���� ���ڿ��� �̾ƿ´� .
	}
	public void example3() {
		// Boxing / Unboxing
		
		//Integer i1 = new Integer(100); // ��������
		int num1 = i1.intValue();
		// �������� Boxing / Unboxing ������� ���� 
		// Auto Boxing / Unboxing �� ��� 
		
		Integer i2 = 200;
		int num2 = i2 + 100;
		
		
	}
}

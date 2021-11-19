package edu.kh.oop.field.model.service;

import edu.kh.oop.field.model.vo.Korean;

public class FieldService {
	
	public void example1 () {
		
		Korean k1 = new Korean();
		Korean k2 = new Korean();
		
		k1.setName("��ö��");
		k1.setId("990204-3203614");
		
		k2.setName("�迵��");
		k2.setId("990302-2394710");
		
		
		System.out.printf("%s / %s / %d\n",k1.getName(),k1.getId(),k1.getNCode());
		System.out.printf("%s / %s / %d\n",k2.getName(),k2.getId(),k2.getNCode());
		
		//if 5õ������ �ִ� 
		// �����ڵ� 82���� 1�� ���� > �����ʿ� > static Ȱ�� 
		 
		Korean.nCode = 1;
		//static���� ����Ǿ� ��� Korean ��ü�� �����ڵ带 ����
		// ���������ڰ� private�̱� ������ ���� ���� �Ұ��� > ĸ��ȭ ��Ģ ����, public���� �ۼ� 
		
		System.out.printf("%s / %s / %d\n",k1.getName(),k1.getId(),k1.getNCode());
		System.out.printf("%s / %s / %d\n",k2.getName(),k2.getId(),k2.getNCode());
		
		//JVM�� static���� == ���� == ���� �޸𸮿��� 
		// �ʵ� ����ȭ 
		
		// 1) ������� == �ν��Ͻ� ���� (static x) 
//		private ~~
//		(����) static�� ������ Ŭ���� ���ο� �ۼ��Ǵ� �ʵ�, �޼ҵ带 ��Ʋ�� "���'��� ��Ī
//		
//		���� : new�����ڸ� ���� haep������ ��ü ���� 
//		�Ҹ� : ��ü�� �Ҹ�ɶ� ���� �Ҹ� (��� ������������ �������� ���� �� GC�� �Ҹ��Ŵ)
//		
		// 2) Ŭ���� ���� == static���� (static o) 
//		public static ~~
//		 ���� : ���α׷� ����� static������ ����
//		 �Ҹ� : ���α׷� ����� �ڵ��Ҹ� 
//		
	}

}

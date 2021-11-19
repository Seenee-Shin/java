package edu.kh.collection.model.service;

import edu.kh.collection.model.vo.Student;

public class ArrayService {
	// �迭 
	// �Ѱ��� �ڷ����� ������ ���� (�ѹ� ������ ũ��� ���� �Ұ���)
	
	private Student[] sdList = new Student[3];
							   // ��ü ���� ���� 3�� (�ּҸ� �����ϴ� ����)
	
	private int index = 0; //add �޼ҵ��� �ε��� ���� ����
	
	public boolean add(Student std) {
		
		// �迭���� ���� �ڵ� = ���ο� ū �迭 ���� �� ���� ���� -> std�� ��������
		//�迭 ���� == �ε����� 2�� ����
		if(index == sdList.length) {
			Student[] newList = new Student[sdList.length*2];
			// 2�� ū �迭 ���� 
			System.arraycopy(sdList, 0, newList, 0, sdList.length);
			// ���� ����
			sdList = newList;
			// ���� ����
		}
		
		sdList[index] = std;
		index++;
		return true;
	}
	
	@Override
	public String toString() {
		String str = "";
		
		for(int i=0; i<index ; i++) {
			str += sdList[i]+", ";
			
		}
		return str;
	}

}

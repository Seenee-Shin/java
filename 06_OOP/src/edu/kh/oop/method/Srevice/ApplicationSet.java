package edu.kh.oop.method.Srevice;

public class ApplicationSet {
	
	//���� ��ȯ �޼ҵ�
	public int squared(int num) {
		//���� ���� �� ����
		
		return num*num;
	}
	
	//�迭���� �� �ʱ�ȭ�޼ҵ� 
	
	public int[] createArray(int size) {
		//������ int[] return
		int[] arr = new int[size];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = i+1;			
		}
		
		return arr;
	}
	
	//���� �迭�� ���� �޾� �� ��ҿ� ����� ���� �� �����ϱ� 
	public int arraySum(int[] arr) {
		int sum = 0; 
		for(int i = 0; i <arr.length ; i++) {
			sum += arr[i];
		
		}
		
		return sum;
	}

	
	
	
	
	

}

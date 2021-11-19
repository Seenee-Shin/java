
package edu.kh.array.ex.service;

import java.util.Arrays;

public class ArrayService2 {

	public void example1() {
	 	int[] arr = {1,2,3,4,5};
		
		//���� ���� - �ּҸ� ���� 
		// ��ü�� �Ű����� , ��ȯ�� ���޽� ��� 
		
		int[] copyArr = arr;
		
		System.out.println("���� ��");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copyArr));
		
		copyArr[0] = 999;
		System.out.println("���� ��");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copyArr));
	}
	
	public void example2() {
		// ���� ���� : ���� �迭�� ������ �ڷ��� , �����ϰų� ū ũ���� �迭 �Ҵ� �ʿ�
		// ���� ������ ���� , ������ �Ȱ��� �迭�� ������ ��
		
		int [] arr = {1,2,3,4,5};
		 
		int [] copyArr = new int[arr.length];
		 
		 //for ���� �̿��� ���� ���� 
		/* for(int i = 0 ; i<arr.length; i++) {
			 copyArr[i] = arr[i];
		}*/
	
		 
		 // System.arraycopy(���� �迭, ���� �����ε��� , ����迭 , ���� �����ε���, ���� ����) 
		 System.arraycopy(arr, 0, copyArr, 0, arr.length);
		 
		 System.out.println("���� ��");
		 System.out.println(Arrays.toString(arr));
		 System.out.println(Arrays.toString(copyArr));
		 
		 copyArr[0] = 999;
		 System.out.println("���� ��");
		 System.out.println(Arrays.toString(arr));
		 System.out.println(Arrays.toString(copyArr));
		 
	}
	
	public void example3() {
		// �迭 �ߺ� �˻� 
		
		int[] arr= {4,2,3,4,1};
		 // �� ���� ����
		for (int i = 0 ; i < arr.length-1 ; i++) {
			
			//�� ��� ���� 
			for (int j= 1 + i ; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					
					System.out.println(arr[i] + "�ߺ�");
					
					break; 
				}
				
			}
		}
	}
	
	public void example4() {
		//���� �߻� 
		//���� ���� ���� 0 ~ 20
		// ���� ���� ���� : 20 
		
		//math.random()
		// ���� �߻� �޼ҵ� ( ������ ) / 0.0 ~ 1.0 ������ ���� �߻�
		
		int[] arr = new int[4];
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			arr[i] = (int)(Math.random()* 21); // 0.0~ 21.0 �̸� 
		}
		
		 System.out.println(Arrays.toString(arr));
		 
		 //�ߺ� �˻� �ڵ� 
		 for (int i = 0 ; i <arr.length -1 ; i++) {
			 
			 for(int j = 0 + i ; j < arr.length ; j++) {
				if(arr[i] == arr[j]){
					System.out.println(arr[i] + "�ߺ�");
				}
				
			 }
		 }	 
	}
	
	public void lottoNumberConstructor() {
		// ���� 1. 1~45������ ���� 
		// ���� 2. �� 6���� ��ȣ ��÷ 
		// ���� 3.  �ߺ� ���� 
		// �������� ���� 
		
		int[] lotto = new int[6];
		
		for( int i = 0 ; i < lotto.length ; i++) {
			int ran = (int)(Math.random()* 45 + 1);
			
			lotto[i] = ran;
			
			for(int x=0 ; x<i ; x++) {
				if(lotto[x] == ran) {
					i--;
					break;
				}
			}
			//Arrays.sort(�迭��)
			// �迭 �� ���� �������� ������ ����
		}Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
	
	//////////////////��Ʈ�� //////////////////////
	
	public void example5() {
		String str1 = "Apple";
		String str2 = "Banana";
		
		String[] arr = new String[3];
		arr[0] = "Hello";
		arr[1] = "�ȳ�";
		arr[2] = "Hi";
		
		for( int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
}

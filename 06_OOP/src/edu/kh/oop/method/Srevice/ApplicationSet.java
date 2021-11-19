package edu.kh.oop.method.Srevice;

public class ApplicationSet {
	
	//제곱 반환 메소드
	public int squared(int num) {
		//전달 받은 값 리턴
		
		return num*num;
	}
	
	//배열생성 및 초기화메소드 
	
	public int[] createArray(int size) {
		//생성된 int[] return
		int[] arr = new int[size];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = i+1;			
		}
		
		return arr;
	}
	
	//정수 배열을 전달 받아 각 요소에 저장된 값의 합 리턴하기 
	public int arraySum(int[] arr) {
		int sum = 0; 
		for(int i = 0; i <arr.length ; i++) {
			sum += arr[i];
		
		}
		
		return sum;
	}

	
	
	
	
	

}

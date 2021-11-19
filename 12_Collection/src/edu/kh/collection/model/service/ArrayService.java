package edu.kh.collection.model.service;

import edu.kh.collection.model.vo.Student;

public class ArrayService {
	// 배열 
	// 한가지 자료형의 변수의 묶음 (한번 지정된 크기는 변경 불가능)
	
	private Student[] sdList = new Student[3];
							   // 객체 참조 변수 3개 (주소를 저장하는 변수)
	
	private int index = 0; //add 메소드의 인덱스 지정 변수
	
	public boolean add(Student std) {
		
		// 배열길이 증가 코드 = 새로운 큰 배열 생성 후 깊은 복사 -> std로 얕은복사
		//배열 길이 == 인덱스면 2배 증가
		if(index == sdList.length) {
			Student[] newList = new Student[sdList.length*2];
			// 2배 큰 배열 생성 
			System.arraycopy(sdList, 0, newList, 0, sdList.length);
			// 깊은 복사
			sdList = newList;
			// 얕은 복사
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

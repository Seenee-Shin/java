package edu.kh.eh.model.exception;

public class DivideByTwoException extends Exception {
	// 사용자 정의 예외 
	// Exception 클래스를 상속받기 
	
	// UncheckedException = RuntimeException || 그 하위 
	// CheckedExeception =   RuntimeException을 제외한 나머지 
	
	// 예외 발생 == new 예외클래스가 수행되어 예외객체가 생성됨 
	// 객체 생성을 위해서는 생성자가 있어야 한다.
	// 사용자 정의 예외에는 생성자를 작성해야한다.
	
	public DivideByTwoException() {
		super("2로 나눌 수 없습니다.");
		 //에러(예외) 발생시 출력되는 문구
	}
	
	public DivideByTwoException(String message) {
		super(message);
		//출력하는 문구를 매개변수에서 얻어옴
	}

}

package edu.kh.oop.field.ex1;

public class FieldTest1 {
	 
	//Field : 클래스에서 객체의 속성을 정의하는 부분
	//[접근제한자][예약어] [자료형] 변수명[=초기값];
	// 필드 접근제한자 : public + / protected # / (default) ~ / private - 
	
	public String test1 = "+";
	protected String test2 = "#";
			String test3 = "~";
	private String test4 = "-";
	
	public void example1() {
		
		System.out.println( test1 );
		System.out.println( test2 );
		System.out.println( test3 );
		System.out.println( test4 ); 
	}
}

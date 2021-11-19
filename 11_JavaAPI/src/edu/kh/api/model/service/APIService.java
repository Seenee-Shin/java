package edu.kh.api.model.service;

public class APIService {
	
	//Wrapper 클래스 
	// 기본자료향을 객체화 시켜주는 클래스 
	// 기본 자료형과 관련된 특정 값, 기능을 제공
	// 기본 자료형을 다룰 수 없는 경우에 사용
	// ex) 매개변수가 Object인 경우, Collection을 사용할 떄 (Collection은 개체만 취급 ) 
	
	//Wrapper -> java.lang 패키지 안에 존재 
	// (기본자료형>WapperClass) == Boxing <-> Unboxing
	// byte/byte , short/Short , int/ Integer , long/Long, float/Float
	// double/Double , boolean/ Boolean, char/ Character
	
	//자주사용되는 필드,메소드는 모두 static으로 선언 되어있다
	
	public void example1() {
		System.out.println(Integer.MAX_VALUE );
		System.out.println(Integer.MIN_VALUE );
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE); //beat 크기 
		//모든 Wrapper Class에서 가능 
		// boolean은 최소, 최댓값 없음 
	
	}
	public void example2() {
	// 문자열 숫자를 숫자 자료형으로 
	
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
		
		// Character.parseCharacter 는 존재하지 않는다. 
		// 대신 .CharAt으로 문자열을 뽑아온다 .
	}
	public void example3() {
		// Boxing / Unboxing
		
		//Integer i1 = new Integer(100); // 삭제예정
		int num1 = i1.intValue();
		// 수동적인 Boxing / Unboxing 사용하지 않음 
		// Auto Boxing / Unboxing 을 사용 
		
		Integer i2 = 200;
		int num2 = i2 + 100;
		
		
	}
}

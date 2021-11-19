package edu.kh.oop.field.model.service;

import edu.kh.oop.field.model.vo.Korean;

public class FieldService {
	
	public void example1 () {
		
		Korean k1 = new Korean();
		Korean k2 = new Korean();
		
		k1.setName("박철수");
		k1.setId("990204-3203614");
		
		k2.setName("김영희");
		k2.setId("990302-2394710");
		
		
		System.out.printf("%s / %s / %d\n",k1.getName(),k1.getId(),k1.getNCode());
		System.out.printf("%s / %s / %d\n",k2.getName(),k2.getId(),k2.getNCode());
		
		//if 5천만개가 있다 
		// 국가코드 82에서 1로 변경 > 수정필요 > static 활용 
		 
		Korean.nCode = 1;
		//static으로 선언되어 모든 Korean 객체가 국가코드를 공유
		// 접근제한자가 private이기 때문에 직접 접근 불가능 > 캡슐화 법칙 무시, public으로 작성 
		
		System.out.printf("%s / %s / %d\n",k1.getName(),k1.getId(),k1.getNCode());
		System.out.printf("%s / %s / %d\n",k2.getName(),k2.getId(),k2.getNCode());
		
		//JVM의 static영역 == 정적 == 공유 메모리영역 
		// 필드 세분화 
		
		// 1) 멤버변수 == 인스턴스 변수 (static x) 
//		private ~~
//		(참고) static을 제외한 클래스 내부에 작성되는 필드, 메소드를 통틀어 "멤버'라고 총칭
//		
//		생성 : new연산자를 통해 haep영역에 객체 생성 
//		소멸 : 객체가 소멸될때 같이 소멸 (어떠한 참조변수에도 참조되지 않을 때 GC가 소멸시킴)
//		
		// 2) 클래스 변수 == static변수 (static o) 
//		public static ~~
//		 생성 : 프로그램 실행시 static영역에 생성
//		 소멸 : 프로그램 종료시 자동소멸 
//		
	}

}

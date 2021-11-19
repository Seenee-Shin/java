package edu.kh.inheritance.ex.model.vo;

//final 클래스 상속 불가 확인하기 
public class HighSchoolStudent /*extends Student*/ {
	// 에러발생 : The type HighSchoolStudent cannot subclass the final class Student
	// Final 클래스인 Studentdml 하위 클래스가 될 수 없다.
	// final class 예시 : String
}

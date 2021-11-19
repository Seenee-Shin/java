package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import edu.kh.collection.model.vo.Person;
import edu.kh.collection.model.vo.Student;

public class CollectionService {
	public void example() {
		ArrayService array = new ArrayService();
		
		//학생객체 추가
	 if (array.add(new Student("홍길동",15,2))){
		System.out.println("학생 정보 추가 성공");
	}

	 if (array.add(new Student("고길동",15,3))){
		System.out.println("학생 정보 추가 성공");
	}
	
	 if (array.add(new Student("희동이",8,1))){
		System.out.println("학생 정보 추가 성공");
	}
	 
	 if (array.add(new Student("김영희",17,1))){
		 System.out.println("학생 정보 추가 성공");
	 } // 배열 범위 초과 std[3]  -> 배열길이 증가 코드 설정 
	
	System.out.println(array.toString());
	}
	public void example2() {
		// list의 사용 
		//collection 자바에서 제공하는 자료구조를 담당하는 프레임 워크 
		
		ArrayList list = new ArrayList(); // 기본생성자로 생성시 초기 용량 10
		ArrayList stdList = new ArrayList(3);
		
		//1.add 메소드 : 리스트 맨 끝에 추가 
		if(stdList.add(new Student("홍길동",15,2))) {
			System.out.println("학생 정보 추가 성공");
		}
	
		if(stdList.add(new Student("고길동",16,3))) {
			System.out.println("학생 정보 추가 성공");
		}
		
		if(stdList.add(new Student("강호동",17,1))) {
			System.out.println("학생 정보 추가 성공");
		}
		
		if(stdList.add(new Student("희동이",8,1))) {
			System.out.println("학생 정보 추가 성공");
		}
		
		//2. toString : 리스트에 저장ㅇ된 모든 요소를 한줄의 물자열로 반환 
		System.out.println(stdList.toString());
	
		//3.add(int index, E e) : 지정된 index에서 삽입 
		stdList.add(1, new Student ("박철수",13,6));
		System.out.println("중간 삽입 확인");
		System.out.println(stdList);
		
		//4.size : 리스트의 저장된 데이터 개수 반환 
		System.out.println("저장된 학생 수 : " + stdList.size());
		
		//5. get(int index) : 리스트에 저장된 요소 반환 
		System.out.println(stdList.get(0));
		System.out.println(stdList.get(1));
		System.out.println(stdList.get(2));
		System.out.println(stdList.get(3));
		System.out.println(stdList.get(4));
		
		//get + size 
		
		System.out.println("=============================");
		
		for(int i = 0; i < stdList.size(); i++){
			System.out.println(stdList.get(i));
		}
		
		
		System.out.println("=============================");
		
		//6.Object set(int index) : 리스트의 요소를 e로 변경 후 기존에 있던 값 반환 (자리교체)
		Object obj = stdList.set(0, new Student("이민호",18,2));
		System.out.println("반환된 ob : "+ obj);
		System.out.println(stdList);
		
		//7.remove (int index) : 리스트 값 삭제 후 기본에 있던 값 반환 
		Object obj2 = stdList.remove(1);
		System.out.println("제거된 학생 정보 : "+ obj2);
		System.out.println(stdList);
		
		
		//다른 자료형 추가하기 
		stdList.add("문자열도 객체이다.");
		
		//collection은 객체만 저장 가능하기 때문에 int가 integer로 자동변환됨 (auto boxing)
		stdList.add(100);
		
		ArrayList list2 = new ArrayList();
		list2.add(new Student("김갑수",19,3));
		list2.add(new Student("김삼순",12,5));
		
		stdList.add(list2);
		//객체이기 때문에 list2도 들어갈 수 있다. 
		
		for(int i = 0; i<stdList.size();i++) {
			System.out.println(stdList.get(i));
		}
		
		System.out.println("=======================");
		System.out.println("stsList의 요소 중 학생객체는 학생이름만 출력");
		
		for(int i = 0; i<stdList.size();i++) {
			if(stdList.get(i) instanceof Student) {
				//instanceof: 상속받은 개체 찾기 or 객체확인
				
				//ArrayList에 저장되는 데이터 타입은 모두 Object 타입으로 인식 (자료형 관계x)
				//Object를 Student로 다운캐스팅 하여 출력 
				System.out.println(
				((Student)stdList.get(i)).getName()
				);
			}else {
				System.out.println(stdList.get(i));
			}
		}
		
		
	}
	//향상됭 for문 (for each문)
	// 컬렉션이나 배열의 모든 요소를 처음부터 끝까지 순서대로 접근하는 용도의 for문 
	public void example3() {
		
		ArrayList list = new ArrayList();
		list.add("김밥");
		list.add("라면");
		list.add("탕수육");
		list.add("파스타");
		
		//리스트에 저장된 데이터 모두 출력
		
		//기존 for문 
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("================");
		
		//향상된 for문 
		//for(  :  )
		for( Object obj : list ) {
			//for문이 반복될때 마다 list에 저장된 요소를 순차적으로 obj 변수에 저장 
			System.out.println(obj);
		}
	}
	
	public void example4() {
		//generics
		//클래스, 메소드, 컬렉션 내부에 사용되는 클래스 타입을 한 종류로 제한
		
		//제네릭 이점 
		//하나의 타입으로 제한 되기 때문에 instanceof, 다움캐스팅의 작업이 필요하지 않다.
		// ->코드 활용이 쉬워짐 (컴파일 단계에서 강력한 타입체크) 
		
		// 하나의 코드로 여러타입 처리가 가능하다.
		
		// 컬렉션 타입 제한 기능의 제네릭 사용 
		//작성법
		ArrayList<Student> stdList = new ArrayList<Student>();
		//Student로 타입이 제한된 ArrayList 객체 생성
		// == Student 타입만 저장 가능 
		
		stdList.add(new Student("김개똥",9,2));
		stdList.add(new Student("김스벅",9,2));
		stdList.add(new Student("김투썸",9,2));
		stdList.add(new Student("김할리스",9,2));
		
		for(Student std :stdList) {
			//stdList가 Student 로 타입이 제한되어있기 때문에 변수에 타입도 Student타입으로 지정
			// instanceof 검사 필요x 
			System.out.println(std.getName());
			//Student 변수밖에 없기 때문에 다운캐스팅 필요 x 
		}
	}
	
	public void example5() {
		//다형성 : 부모타입의 참조변수로 상속관계에 있는 자식객체를 참조 
		// 인터페이스 : 상속받은 자식에세 동일한 이름의 기능을 부여, 객체생성 불가능 but 부모타입 참조변수 사용가능 
		
		//ArrayList: 배열 모양의 list, 검색에 효율적 
		//LInkedList: 요소가 라인으로 연걸/ 추가,삭제에 용의
		
		//다형성 미적용 
		ArrayList<String> list1 = new ArrayList<String>();
//		LinkedList<String> list1 = new LinkedList<String>();
		
		// ArrayList 대신 LinkedList로 교체 할 경우 ArrayList로 작성된 모든 부분을 LinkedList로 바꿔야한다. (불편)
		
		list1.add("aaa");
		list1.add("bbb");
		list1.add("ccc");
		list1.add("ddd");
		
		list1.remove(0);
		list1.remove(0);
		list1.remove(0);
		
		ex5_1(list1);
		list1 = ex5_2();
		
		// 추가 삭제가 빈번하여 LinkedList가 효율적 
		
	}
	public void ex5_1(ArrayList<String> list ) {
		System.out.println(list);
	}
	
	public ArrayList<String> ex5_2(){
		return new ArrayList<String>();
		
	}
	
	public void example6() {
		// 다형성을 적용 -> 유지보수성 향상, 범용성 향상
		List<String> list2 = new LinkedList<String>();
		//부모타입(List) 참조변수로 자식타입객체(ArrayList)참조
		//같은 부모타입의 다른 자식객체로 변경,수정 시 문제 발생x 
		//-> ArrayList, LinkedList는 List를 상속받았기때문에 메소드의 이름이 같음 (인터페이스의 특징)
		//-> 두메소드의 매개변수 반환형이 부모타입이기 때문에 다형성 적용 
		
		list2.add("aaa");
		list2.add("bbb");
		list2.add("ccc");
		list2.add("ddd");
		
		list2.remove(0);
		list2.remove(0);
		list2.remove(0);
		list2.remove(0);
		
		ex6_1(list2);
		list2 = ex6_2();
	}
	
	public void ex6_1(List<String> list) {
	//매개변수의 다형성 적용 
		System.out.println(list);
	}
	
	public List<String> ex6_2(){
		return new ArrayList<String>();
	}
	
	//제네릭 다형성 적용 
	public void example7() {
		List<Person> list = new ArrayList<Person>();
		//Person으로 제한된 ArrayList 생성
		
		list.add(new Person('남',180.5));
		list.add(new Student('여',163.7,"김삼순",17,1));//하위객체 추가 해도 에러x
		
		for(Person p : list) {
			System.out.println(p.toString());
								// 정적바인딩 
			//실행중 오버라이딩돤 하위 객체의 tostring에 연결 -> 동적바인딩 
			// 효과 : 하나의 코드로 여러타입의 코드를 수행할 수 있음 
		}
	}
	
	
	
	
	
	
	
	
}

package edu.kh.poly.ex1.model.service;

import edu.kh.poly.ex1.model.vo.Car;
import edu.kh.poly.ex1.model.vo.RollsRoyce;
import edu.kh.poly.ex1.model.vo.Spark;
import edu.kh.poly.ex1.model.vo.TeslaCar;

public class PolymorphismService {

	public void example1() {
		
		Car c = new Car(4, "원형"
				+ "핸들","경유엔진");
		// 상위 클래스 참조변수 = 상위 클래스 객체 
		
		TeslaCar t = new TeslaCar(4, "원형핸들" , "전기모터", 50000);
		//하위 클래스 참조변수 = 하위 클래스 객체 
		
		Car c2 = new TeslaCar(6, "원형핸들" , "전기모터", 100000);
		// 상위클래스 참조변수 = 하위 클래스 객체 
		// 다형성
		
		//각 객체의 필드정보 출력 
		System.out.println("c : " + c);
		System.out.println("t : " + t);
		System.out.println("c2 : " + c2.getWheel() + c2.getHandle() + c2.getEngine());
	}
	
	public void example2 () {
		
		// 업캐스팅 활용 : 객체배열 
		
		TeslaCar tesla = new TeslaCar(4,"원형","전기모터",5000);
		RollsRoyce royce = new RollsRoyce(4,"원형	","경유엔진","검정");
		Spark spark = new Spark(4,"원형","가스엔진",50);
		// 모두 Car의 하위 클래스 -> 다형성 사용 가능 
		
		// 각 객체의 엔진 정보 출력 
		Car[] arr = new Car[3]; //상위 클래스의 참조변수 
		
		arr[0] = tesla; // tesla 참조변수는 TeslaCar의 주소가 저장
		arr[1] = royce; 
		arr[2] = spark; 
		
		for(int i =0 ; i <arr.length; i++) {
			System.out.println(	arr[i].getEngine());
		}
		
		System.out.println("=====================");
		
		//업캐스팅 활용 : 매개변수에 적용 
		printEngine(tesla);
		printEngine(royce);
		printEngine(spark);
		
		
		// 업캐스팅 활용 :리턴타입에 적용 
		Car c2 = creatcar(1);
	}
	
	public Car upgradeEngine(Car c) {
		String newEngine = c.getEngine() + "계량형";
		c.setEngine(newEngine);
		return c;
	}
	
	// 1이면 테슬라 2면 롤스 3이면 스파크 객체 생성 후 반환 
	public Car creatcar(int num) {
		Car c = null;
		switch(num) {
		case 1 : c = new TeslaCar(); break;
		case 2 : c = new RollsRoyce(); break;
		case 3 : c = new Spark(); break;	 
		} 
		
		return c;
	}
	

	public void printEngine(Car c) {
		System.out.println(c.getEngine());
		
	}
	
	public void example3() {
		//다운캐스팅
		Car c = new Spark();
		((Spark)c).getDiscountOffer();
		
		System.out.println(c instanceof Spark);
		
		Car[] carArr = {new Car(9, "큰 원형 핸들", "v8 디젤 엔진"),
						new TeslaCar(4, "기능 많은 핸등", "전기모터", 50000),
						new RollsRoyce(6, "금핸들", "디젤 엔진", "갈색엔진"),
						new Spark(4, "원형 핸들 ", "가솔린 엔진", 9.5)};
		
			// 테슬라면 배터리 용량 출력
			// 롤스면 우산 색 출력
			// 스파크면 할인혜택비율 출력
			// 그냥 차는 toStirng
		
		for(int i =0; i <carArr.length ; i++ ) {
			
			if ( carArr[i] instanceof Spark) {
				System.out.println(((Spark)carArr[i]).getDiscountOffer());
			}else if ( carArr[i] instanceof RollsRoyce) {
				System.out.println(((RollsRoyce)carArr[i]).getUmbrellacolor());
			} else if ( carArr[i] instanceof TeslaCar) {
				System.out.println(((TeslaCar)carArr[i]).getBatteryCapacity());
			}else {
				System.out.println(carArr[i].toString());
			}
			
		}
		} 
	
	public void example4() {
		
		Car c = new Spark(4, "원형핸들", "가솔린 엔진", 0.5);
		// 업캐스팅 
		System.out.println(c.toString());
		//프로그램 전 c.toString은 Car클래스에 있는 것과 연결되어있는 것이 확인 
		// -> 정적 바인딩 
		
		// 하지만 정적 바인딩으로 예상한 것과 다르게 출력 값은 Spark의 toString값으로 출력 
		//-> 동적 바인딩 
		
	}
}

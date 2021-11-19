package edu.kh.collection.model.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.model.vo.Student;

public class MapService {
	
	// Map : key,Value 한쌍의 데이터를 모아둔 객체 
	// key - 중복을 허용하지 않고, 순서가 없어서(set의 특징) map내부에 뒤죽박죽으로 저장됨 
	//Value 는 key에 의해 서로구분, 중복 가능 (List의 특징)
	
	public void example1() {
		//HashMap<K,V> : java map 중 가장 기초가 되는 map
		// key에 해당하는 객체는 반드시 equals,hashcode가 오버라이딩 되어야함 
		
		Map<String, Student> map = new HashMap<String,Student>();
		
		//put : map에 데이터 추가 
		map.put("S001", new Student ("홍길동",15,2));
		map.put("S002", new Student ("김선호",18,2));
		map.put("S003", new Student ("임철",17,1));
		map.put("S004", new Student ("임철",17,1));
		
		System.out.println(map);
	}
	
	public void example2() {
		Map<Integer, String> map = new HashMap<>();
		// 컬렉션의 타입추론기능
		
		map.put(1,"고추바바삭");
		map.put(2,"뿌링클");
		map.put(3,"허니콤보");
		map.put(4,"블랙알리오");
		map.put(5,"자메이카 통다리");
		map.put(6,"황금올리브");
		
		//get(key) : 매개변수로 작성된 key와 매핑되는 value반환 
		System.out.println(map.get(2));
		System.out.println(map.get(5));
		
		//모든요소 반복 접근하기 
		//1.Iterator 사용
		//map에서 key만 모아둔 set 호출 (keyset())
		
		Set<Integer> kset = map.keySet();
		Iterator<Integer> it = kset.iterator();
		
		while(it.hasNext()){
			int key = it.next();
			System.out.printf("key : %d, value: %s\n",key,map.get(key));
		}
		
		System.out.println("====================================");
		
		//2. 향상된 for문 
		Set<Integer> set2 = map.keySet();
		
		
		for(int key : set2) {
			System.out.printf("key : %d, value: %s\n",key,map.get(key));
		}
	}

}

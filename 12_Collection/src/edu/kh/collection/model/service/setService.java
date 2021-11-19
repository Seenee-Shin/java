package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.model.vo.Student;

public class setService {
	//set :  집합 
	//- 순서 존재 x , 중복 불가능 (null도 하나만 저장)
	//중복데이터 확인을 위해 equals 오버라이딩 시행 (필수)
	public void example1() {
		
		// hashSet
		Set<String> set = new HashSet<String>();
		set.add("삼성");
		set.add(new String("Apple"));
		set.add(new String("사과"));
		set.add(new String("바나나"));
		set.add(new String("오렌지"));
		set.add(new String("Apple"));
		
		System.out.println("저장된 갯수 : " + set.size());
		
		System.out.println(set.toString());
		//순서 x 
		
		//로또번호 생성기
		//set을 이용하여 중복없는 랜덤 값 저장  
		Set<Integer> lotto = new HashSet<Integer>();
		while(true) {
			int random = (int)(Math.random()*45 +1 );
			
			lotto.add(random);
		
			if(lotto.size() == 6) {
				break;
			}
		
		}
		System.out.println("생성된 번호 : " + lotto);
		
		//set에서 값을 하나씩 반복 접근 
		// -> set은 인덱스가 없어 순서 유지 x , 원하는 데이터를 하나씩 반환 불가능 
		
		//Iterator (반복자)사용으로 값 출력
		//컬렉션 객체 반복 접근 (순차적으로 반복 접근 가능)
		
		Iterator<Integer> it = lotto.iterator();
		// lotto set에 저장된 요소를 하나씩 꺼내올 수 있는 형태로 변환
		
		while(it.hasNext()) {
			//hasNext : 다음 요소를 가지고 있는 지 확인 (있으면 true)
			int num = it.next();
			//next : 다음 값을 얻어 오는 것
			//int -> integer : auto unboxing
			
			System.out.println("발생한 랜던 값 : "+ num);
			
		}
		
		//향상된 for문 사용하여 출력 ->컬렉션을 쉽게 사용하기 위해 사용
		System.out.println("<향상된 for문 사용>");
		
		for(int num :lotto) {
			System.out.println("발생한 랜던 값 : "+ num);
		}
		
		
	}
	
	public void example2() {
		//hash set 사용을 위한 준비
		//** hash라는 단어가 들어간 컬렉션을 객체를 사용하는 경우 저장하려는 객체에
		//반드시 hashCode(), equals()의 오버라이딩이 필요 
		
		// 학생 저장 set생성 
		Set<Student> stdSet = new HashSet<Student>();
		
		stdSet.add(new Student("홍길동",15,2));
		stdSet.add(new Student("홍길동",15,2));
		// 중복 저장 x 값을 출력하면 하나만 출력 
		
		System.out.println(stdSet);
	}
	
	public void example3() {
		//TreeSet : 이진 트리 구조를 이용해 데이터를 저장하는 set 
		//Binary Tree 특징 오름차순 자동 정렬 + set특징 == treeSet
		
		Set<Integer> lotto = new TreeSet<Integer>();
		
		while(true) {
			
			int random = (int)(Math.random() * 45 +1);
			
			lotto.add(random);
			
			if (lotto.size() == 6) {
				break;
			}
		}
		System.out.println("자동 생성된 번호 : "+ lotto);
	} 
	
	public void example4() {
		// 로또 1000원에 한번 단위 입력, 입력된 금액 만큼 번호 생성, 리스트에 저장 후 출력
		
		Scanner sc = new Scanner(System.in);
		List<Set<Integer>> list = new ArrayList<Set<Integer>>();
		
		System.out.print("금액 입력 (1,000원 단위) : ");
		int price =sc.nextInt();
		
		int count =  price/1000;
		
		for (int i=0; i< count; i++) {
			//로또 번호 생성 
			Set<Integer> lotto = new TreeSet<Integer>();
			
			while(true) {
				
				int random = (int)(Math.random() * 45 +1);
				lotto.add(random);
				if (lotto.size() == 6) {
					
					break;
				}
			}
			list.add(lotto);
		}
		
		for( Set<Integer> lotto : list ) {
				System.out.println("발생한 랜덤 값 : "+ lotto);
			
		}
		}
}

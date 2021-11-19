package edu.kh.collection.model.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.model.vo.Student;

public class MapService {
	
	// Map : key,Value �ѽ��� �����͸� ��Ƶ� ��ü 
	// key - �ߺ��� ������� �ʰ�, ������ ���(set�� Ư¡) map���ο� ���׹������� ����� 
	//Value �� key�� ���� ���α���, �ߺ� ���� (List�� Ư¡)
	
	public void example1() {
		//HashMap<K,V> : java map �� ���� ���ʰ� �Ǵ� map
		// key�� �ش��ϴ� ��ü�� �ݵ�� equals,hashcode�� �������̵� �Ǿ���� 
		
		Map<String, Student> map = new HashMap<String,Student>();
		
		//put : map�� ������ �߰� 
		map.put("S001", new Student ("ȫ�浿",15,2));
		map.put("S002", new Student ("�輱ȣ",18,2));
		map.put("S003", new Student ("��ö",17,1));
		map.put("S004", new Student ("��ö",17,1));
		
		System.out.println(map);
	}
	
	public void example2() {
		Map<Integer, String> map = new HashMap<>();
		// �÷����� Ÿ���߷б��
		
		map.put(1,"���߹ٹٻ�");
		map.put(2,"�Ѹ�Ŭ");
		map.put(3,"����޺�");
		map.put(4,"���˸���");
		map.put(5,"�ڸ���ī ��ٸ�");
		map.put(6,"Ȳ�ݿø���");
		
		//get(key) : �Ű������� �ۼ��� key�� ���εǴ� value��ȯ 
		System.out.println(map.get(2));
		System.out.println(map.get(5));
		
		//����� �ݺ� �����ϱ� 
		//1.Iterator ���
		//map���� key�� ��Ƶ� set ȣ�� (keyset())
		
		Set<Integer> kset = map.keySet();
		Iterator<Integer> it = kset.iterator();
		
		while(it.hasNext()){
			int key = it.next();
			System.out.printf("key : %d, value: %s\n",key,map.get(key));
		}
		
		System.out.println("====================================");
		
		//2. ���� for�� 
		Set<Integer> set2 = map.keySet();
		
		
		for(int key : set2) {
			System.out.printf("key : %d, value: %s\n",key,map.get(key));
		}
	}

}

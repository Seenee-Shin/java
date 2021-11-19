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
	//set :  ���� 
	//- ���� ���� x , �ߺ� �Ұ��� (null�� �ϳ��� ����)
	//�ߺ������� Ȯ���� ���� equals �������̵� ���� (�ʼ�)
	public void example1() {
		
		// hashSet
		Set<String> set = new HashSet<String>();
		set.add("�Ｚ");
		set.add(new String("Apple"));
		set.add(new String("���"));
		set.add(new String("�ٳ���"));
		set.add(new String("������"));
		set.add(new String("Apple"));
		
		System.out.println("����� ���� : " + set.size());
		
		System.out.println(set.toString());
		//���� x 
		
		//�ζǹ�ȣ ������
		//set�� �̿��Ͽ� �ߺ����� ���� �� ����  
		Set<Integer> lotto = new HashSet<Integer>();
		while(true) {
			int random = (int)(Math.random()*45 +1 );
			
			lotto.add(random);
		
			if(lotto.size() == 6) {
				break;
			}
		
		}
		System.out.println("������ ��ȣ : " + lotto);
		
		//set���� ���� �ϳ��� �ݺ� ���� 
		// -> set�� �ε����� ���� ���� ���� x , ���ϴ� �����͸� �ϳ��� ��ȯ �Ұ��� 
		
		//Iterator (�ݺ���)������� �� ���
		//�÷��� ��ü �ݺ� ���� (���������� �ݺ� ���� ����)
		
		Iterator<Integer> it = lotto.iterator();
		// lotto set�� ����� ��Ҹ� �ϳ��� ������ �� �ִ� ���·� ��ȯ
		
		while(it.hasNext()) {
			//hasNext : ���� ��Ҹ� ������ �ִ� �� Ȯ�� (������ true)
			int num = it.next();
			//next : ���� ���� ��� ���� ��
			//int -> integer : auto unboxing
			
			System.out.println("�߻��� ���� �� : "+ num);
			
		}
		
		//���� for�� ����Ͽ� ��� ->�÷����� ���� ����ϱ� ���� ���
		System.out.println("<���� for�� ���>");
		
		for(int num :lotto) {
			System.out.println("�߻��� ���� �� : "+ num);
		}
		
		
	}
	
	public void example2() {
		//hash set ����� ���� �غ�
		//** hash��� �ܾ �� �÷����� ��ü�� ����ϴ� ��� �����Ϸ��� ��ü��
		//�ݵ�� hashCode(), equals()�� �������̵��� �ʿ� 
		
		// �л� ���� set���� 
		Set<Student> stdSet = new HashSet<Student>();
		
		stdSet.add(new Student("ȫ�浿",15,2));
		stdSet.add(new Student("ȫ�浿",15,2));
		// �ߺ� ���� x ���� ����ϸ� �ϳ��� ��� 
		
		System.out.println(stdSet);
	}
	
	public void example3() {
		//TreeSet : ���� Ʈ�� ������ �̿��� �����͸� �����ϴ� set 
		//Binary Tree Ư¡ �������� �ڵ� ���� + setƯ¡ == treeSet
		
		Set<Integer> lotto = new TreeSet<Integer>();
		
		while(true) {
			
			int random = (int)(Math.random() * 45 +1);
			
			lotto.add(random);
			
			if (lotto.size() == 6) {
				break;
			}
		}
		System.out.println("�ڵ� ������ ��ȣ : "+ lotto);
	} 
	
	public void example4() {
		// �ζ� 1000���� �ѹ� ���� �Է�, �Էµ� �ݾ� ��ŭ ��ȣ ����, ����Ʈ�� ���� �� ���
		
		Scanner sc = new Scanner(System.in);
		List<Set<Integer>> list = new ArrayList<Set<Integer>>();
		
		System.out.print("�ݾ� �Է� (1,000�� ����) : ");
		int price =sc.nextInt();
		
		int count =  price/1000;
		
		for (int i=0; i< count; i++) {
			//�ζ� ��ȣ ���� 
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
				System.out.println("�߻��� ���� �� : "+ lotto);
			
		}
		}
}

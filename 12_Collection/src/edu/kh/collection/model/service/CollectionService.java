package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import edu.kh.collection.model.vo.Person;
import edu.kh.collection.model.vo.Student;

public class CollectionService {
	public void example() {
		ArrayService array = new ArrayService();
		
		//�л���ü �߰�
	 if (array.add(new Student("ȫ�浿",15,2))){
		System.out.println("�л� ���� �߰� ����");
	}

	 if (array.add(new Student("��浿",15,3))){
		System.out.println("�л� ���� �߰� ����");
	}
	
	 if (array.add(new Student("����",8,1))){
		System.out.println("�л� ���� �߰� ����");
	}
	 
	 if (array.add(new Student("�迵��",17,1))){
		 System.out.println("�л� ���� �߰� ����");
	 } // �迭 ���� �ʰ� std[3]  -> �迭���� ���� �ڵ� ���� 
	
	System.out.println(array.toString());
	}
	public void example2() {
		// list�� ��� 
		//collection �ڹٿ��� �����ϴ� �ڷᱸ���� ����ϴ� ������ ��ũ 
		
		ArrayList list = new ArrayList(); // �⺻�����ڷ� ������ �ʱ� �뷮 10
		ArrayList stdList = new ArrayList(3);
		
		//1.add �޼ҵ� : ����Ʈ �� ���� �߰� 
		if(stdList.add(new Student("ȫ�浿",15,2))) {
			System.out.println("�л� ���� �߰� ����");
		}
	
		if(stdList.add(new Student("��浿",16,3))) {
			System.out.println("�л� ���� �߰� ����");
		}
		
		if(stdList.add(new Student("��ȣ��",17,1))) {
			System.out.println("�л� ���� �߰� ����");
		}
		
		if(stdList.add(new Student("����",8,1))) {
			System.out.println("�л� ���� �߰� ����");
		}
		
		//2. toString : ����Ʈ�� ���夷�� ��� ��Ҹ� ������ ���ڿ��� ��ȯ 
		System.out.println(stdList.toString());
	
		//3.add(int index, E e) : ������ index���� ���� 
		stdList.add(1, new Student ("��ö��",13,6));
		System.out.println("�߰� ���� Ȯ��");
		System.out.println(stdList);
		
		//4.size : ����Ʈ�� ����� ������ ���� ��ȯ 
		System.out.println("����� �л� �� : " + stdList.size());
		
		//5. get(int index) : ����Ʈ�� ����� ��� ��ȯ 
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
		
		//6.Object set(int index) : ����Ʈ�� ��Ҹ� e�� ���� �� ������ �ִ� �� ��ȯ (�ڸ���ü)
		Object obj = stdList.set(0, new Student("�̹�ȣ",18,2));
		System.out.println("��ȯ�� ob : "+ obj);
		System.out.println(stdList);
		
		//7.remove (int index) : ����Ʈ �� ���� �� �⺻�� �ִ� �� ��ȯ 
		Object obj2 = stdList.remove(1);
		System.out.println("���ŵ� �л� ���� : "+ obj2);
		System.out.println(stdList);
		
		
		//�ٸ� �ڷ��� �߰��ϱ� 
		stdList.add("���ڿ��� ��ü�̴�.");
		
		//collection�� ��ü�� ���� �����ϱ� ������ int�� integer�� �ڵ���ȯ�� (auto boxing)
		stdList.add(100);
		
		ArrayList list2 = new ArrayList();
		list2.add(new Student("�谩��",19,3));
		list2.add(new Student("����",12,5));
		
		stdList.add(list2);
		//��ü�̱� ������ list2�� �� �� �ִ�. 
		
		for(int i = 0; i<stdList.size();i++) {
			System.out.println(stdList.get(i));
		}
		
		System.out.println("=======================");
		System.out.println("stsList�� ��� �� �л���ü�� �л��̸��� ���");
		
		for(int i = 0; i<stdList.size();i++) {
			if(stdList.get(i) instanceof Student) {
				//instanceof: ��ӹ��� ��ü ã�� or ��üȮ��
				
				//ArrayList�� ����Ǵ� ������ Ÿ���� ��� Object Ÿ������ �ν� (�ڷ��� ����x)
				//Object�� Student�� �ٿ�ĳ���� �Ͽ� ��� 
				System.out.println(
				((Student)stdList.get(i)).getName()
				);
			}else {
				System.out.println(stdList.get(i));
			}
		}
		
		
	}
	//���� for�� (for each��)
	// �÷����̳� �迭�� ��� ��Ҹ� ó������ ������ ������� �����ϴ� �뵵�� for�� 
	public void example3() {
		
		ArrayList list = new ArrayList();
		list.add("���");
		list.add("���");
		list.add("������");
		list.add("�Ľ�Ÿ");
		
		//����Ʈ�� ����� ������ ��� ���
		
		//���� for�� 
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("================");
		
		//���� for�� 
		//for(  :  )
		for( Object obj : list ) {
			//for���� �ݺ��ɶ� ���� list�� ����� ��Ҹ� ���������� obj ������ ���� 
			System.out.println(obj);
		}
	}
	
	public void example4() {
		//generics
		//Ŭ����, �޼ҵ�, �÷��� ���ο� ���Ǵ� Ŭ���� Ÿ���� �� ������ ����
		
		//���׸� ���� 
		//�ϳ��� Ÿ������ ���� �Ǳ� ������ instanceof, �ٿ�ĳ������ �۾��� �ʿ����� �ʴ�.
		// ->�ڵ� Ȱ���� ������ (������ �ܰ迡�� ������ Ÿ��üũ) 
		
		// �ϳ��� �ڵ�� ����Ÿ�� ó���� �����ϴ�.
		
		// �÷��� Ÿ�� ���� ����� ���׸� ��� 
		//�ۼ���
		ArrayList<Student> stdList = new ArrayList<Student>();
		//Student�� Ÿ���� ���ѵ� ArrayList ��ü ����
		// == Student Ÿ�Ը� ���� ���� 
		
		stdList.add(new Student("�谳��",9,2));
		stdList.add(new Student("�轺��",9,2));
		stdList.add(new Student("������",9,2));
		stdList.add(new Student("���Ҹ���",9,2));
		
		for(Student std :stdList) {
			//stdList�� Student �� Ÿ���� ���ѵǾ��ֱ� ������ ������ Ÿ�Ե� StudentŸ������ ����
			// instanceof �˻� �ʿ�x 
			System.out.println(std.getName());
			//Student �����ۿ� ���� ������ �ٿ�ĳ���� �ʿ� x 
		}
	}
	
	public void example5() {
		//������ : �θ�Ÿ���� ���������� ��Ӱ��迡 �ִ� �ڽİ�ü�� ���� 
		// �������̽� : ��ӹ��� �ڽĿ��� ������ �̸��� ����� �ο�, ��ü���� �Ұ��� but �θ�Ÿ�� �������� ��밡�� 
		
		//ArrayList: �迭 ����� list, �˻��� ȿ���� 
		//LInkedList: ��Ұ� �������� ����/ �߰�,������ ����
		
		//������ ������ 
		ArrayList<String> list1 = new ArrayList<String>();
//		LinkedList<String> list1 = new LinkedList<String>();
		
		// ArrayList ��� LinkedList�� ��ü �� ��� ArrayList�� �ۼ��� ��� �κ��� LinkedList�� �ٲ���Ѵ�. (����)
		
		list1.add("aaa");
		list1.add("bbb");
		list1.add("ccc");
		list1.add("ddd");
		
		list1.remove(0);
		list1.remove(0);
		list1.remove(0);
		
		ex5_1(list1);
		list1 = ex5_2();
		
		// �߰� ������ ����Ͽ� LinkedList�� ȿ���� 
		
	}
	public void ex5_1(ArrayList<String> list ) {
		System.out.println(list);
	}
	
	public ArrayList<String> ex5_2(){
		return new ArrayList<String>();
		
	}
	
	public void example6() {
		// �������� ���� -> ���������� ���, ���뼺 ���
		List<String> list2 = new LinkedList<String>();
		//�θ�Ÿ��(List) ���������� �ڽ�Ÿ�԰�ü(ArrayList)����
		//���� �θ�Ÿ���� �ٸ� �ڽİ�ü�� ����,���� �� ���� �߻�x 
		//-> ArrayList, LinkedList�� List�� ��ӹ޾ұ⶧���� �޼ҵ��� �̸��� ���� (�������̽��� Ư¡)
		//-> �θ޼ҵ��� �Ű����� ��ȯ���� �θ�Ÿ���̱� ������ ������ ���� 
		
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
	//�Ű������� ������ ���� 
		System.out.println(list);
	}
	
	public List<String> ex6_2(){
		return new ArrayList<String>();
	}
	
	//���׸� ������ ���� 
	public void example7() {
		List<Person> list = new ArrayList<Person>();
		//Person���� ���ѵ� ArrayList ����
		
		list.add(new Person('��',180.5));
		list.add(new Student('��',163.7,"����",17,1));//������ü �߰� �ص� ����x
		
		for(Person p : list) {
			System.out.println(p.toString());
								// �������ε� 
			//������ �������̵��� ���� ��ü�� tostring�� ���� -> �������ε� 
			// ȿ�� : �ϳ��� �ڵ�� ����Ÿ���� �ڵ带 ������ �� ���� 
		}
	}
	
	
	
	
	
	
	
	
}

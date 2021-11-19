package edu.kh.control.condition.practice.service;

import java.util.Scanner;

public class PracticeService {

	public void practice1() {
		System.out.println("1. �Է�\n2. ����\n3. ��ȸ\n4. ����\n7. ����");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴� ��ȣ�� �Է� �ϼ���  : ");
		int num = sc.nextInt();
		
		String menu = null;
		boolean flag = true;
		
		switch (num) {
		case 1 : menu = "�Է�"; break;
		case 2 : menu = "����"; break;
		case 3 : menu = "��ȸ"; break;
		case 4 : menu = "����"; break;
		case 7 : 
			System.out.println("���α׷��� ����˴ϴ�.");
			flag = false; 
			break;
		
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			flag = false; 
		}
		
		if(flag == true) {
			System.out.println( menu + "�޴��Դϴ�.");
		}
	}
	
	
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ���  : ");
		int num = sc.nextInt();
		
		String result;
		if( 0 > num ) {
			result = ("����� �Է����ּ���");
		} else if (num % 2 == 0) {
			result = "¦���Դϴ�";
		} else {
			result = "Ȧ���Դϴ�";
		}
		System.out.println(result);
	}
	
	
	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("��������   : ");
		int kor = sc.nextInt();
			
		System.out.print("��������   : ");
		int math = sc.nextInt();
		
		System.out.print("��������   : ");
		int eng = sc.nextInt();
		
		int total = kor + math + eng ;
		double avg = (kor + math + eng)/3;
		
		String result;
		
		if(kor < 40 || math < 40 || eng < 40 ) {
			result = "���հ��Դϴ�.";
		} else if (avg >= 60) {
			result = 
				 "���� : "+ kor + "\n"+
				 "���� : "+ math + "\n"+
				 "���� : "+ eng + "\n"+
				 "�հ� : "+ total + "\n"+
				 "��� : "+ avg + "\n"+
				 "�����մϴ�, �հ��Դϴ�!";
		}else {
			result = "���հ��Դϴ�.";
		}
		System.out.println(result);
	}
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();
		
		String result = " " ;
		
		boolean flag = true;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			result = "31��";
			break;
			
		case 4: case 6: case 9: case 11:
			result = "30��";
			break;
			
		case 2: 
			result = "28��";
			break;
		
		default : 
			flag = false;
		}
		
		if(flag) {
			System.out.println(month + "���� " + result + "���� �ֽ��ϴ�.");
		} else {
			System.out.println(month + "���� �߸� �Էµ� ���Դϴ�.");
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű(m)�� �Է��� �ּ���: ");
		double height = sc.nextDouble();
		
		System.out.print("������(kg)�� �Է��� �ּ���: ");
		double weight = sc.nextDouble();
		
		double bmi = weight/(height*height);
		
		String result;
		
		if(bmi > 30) {
			result = "�� ��";
		} else if (bmi >= 25) {
			result = "��";
		} else if (bmi >= 23) {
			result = "��ü��";
		} else if (bmi >= 18.5) {
			result = "����ü��";
		} else {
			result = "��ü��";
		}
		
		System.out.println("BMI���� : " + bmi + "\n" + result);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�߰� ��� ���� : ");
		double mid = sc.nextInt() * 0.2;
		
		System.out.print("�⸻ ��� ���� : ");
		double fin = sc.nextInt() * 0.3;
		
		System.out.print("���� ���� : ");
		double report = sc.nextInt() * 0.3;
		
		System.out.print("�⼮ Ƚ�� : ");
		double attend = sc.nextInt();
		
		double total = mid + fin + report + attend;
		
		String result;
		String score =
			"�߰� ��� ����(20) : " + mid + "\n" + 
			"�⸻ ��� ����(30) : " + fin + "\n" + 
			"���� ����   (30) : " + report + "\n" + 
			"�⼮ ����   (20) : " + attend + "\n" + 
			"���� : "+ total +"\n";
		
		if(attend <= 20 -(20 * 0.3)) {
			result = "Fail [�⼮ Ƚ�� ���� ("+ (int)attend + "/20)]";
		} else if (total >= 70) {
			
			result = score + "PASS";
			
		}else {
			result = score + "Fail [���� �̴�]";
		}
		System.out.println("============���==============");
		System.out.println(result);
	}
	
	public void practice7() {
		
		double result = 0;
//		boolean flag = true;
		int flag = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ǿ�����1 �Է� : ");
		int input1 = sc.nextInt();
		
		System.out.print("������ �Է� : ");
		char op = sc.next().charAt(0);
		
	    if (op != '+' && op != '-' && op != '/' && op != '%' && op != '*') {
	    	System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
	    	flag = 2;
	    }
	   	else if ((op == '/' && input1 == 0)||op == '%' && input1 == 0) {
	    	System.out.println("0�� ������ �����ϴ�.");
	    	flag = 3;
	    }
	   	else {
	    	System.out.print("�ǿ�����2 �Է� : ");
	    	int input2 = sc.nextInt();
	    	
	    	if (input1 < 0 || input2 < 0) {
	    		System.out.println("�߸� �Է� �Ͽ����ϴ�.");
	    		flag = 2;
	    	}
	    	
	    	switch (op) {
	    	case '+' : result = input1 + input2; break;
	    	case '-' : result = input1 - input2; break;
	    	case '*' : result = input1 * input2; break;
	    	case '%' : result = input1 % input2; break;
	    	case '/' : 
	    		if(input2 == 0) {
	    		System.out.println("0���� ���� �� �����ϴ�.");
	    		flag = 3;
	    		} 
	    		else {
	    			result = (double)input1 / input2;
	    		}
	    		break;
	    		
		    default : System.out.println("�߸� �Է� �Ͽ����ϴ�."); 
		    		flag = 2;
	    	}
	    if(flag == 1) {
	    	System.out.printf("%d %c %d = %f",input1, op, input2, result);
	    }
		
	}
 }
}

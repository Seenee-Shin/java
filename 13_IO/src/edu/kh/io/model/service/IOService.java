package edu.kh.io.model.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOService {
	//Flie Ŭ���� : ����,������ �ٷ�� �ڹ� Ŭ���� 
	// ���� �ҷ�����, ���� ���� �� 
	
	public void example1() {
		// ���� ���� 
		File f1 = new File("test1.txt");//��� ���
							//��� ���� 
							// ������ : �ּҸ� ����
							// ����� : ���� ��ġ(������Ʈ) ���� 
		
		//boolean createNewFile()
		//���� ���� �޼ҵ� 
		//������ true, �������н� false
		try {
			if(f1.createNewFile()) {
				System.out.println("���� ���� ����");
			}else {
				System.out.println("������ �̹� �����մϴ�");
				
			}
		} catch (IOException e) {
			 System.out.println("���� ���� �� ���� �߻� ");
			 e.printStackTrace();
			 // ���� �߻� ��� ��� 
		}	
	}
	
	
	// Stream : ����°��� ������ ���
	// ����Ʈ ��� ��Ʈ��, ���ڱ�� ��Ʈ��
	
	public void example2() {
		//FileInputStream :���Ͽ� �ۼ��� ������ 1byte�� �Է� �޴� ��Ʈ�� 
		// FileInputStream ��ü ���� �� FlieNotFoundException �߻����ɼ��� �־� �̸� ó���ؾ��� 
		
		FileInputStream fis = null; // ������������ (null������ �������)
		
		try {
			fis = new FileInputStream("byte/inputTest1.txt");
			//����� �������� ���� ���� (������ġ ���� == 13_IO)
			
			//�ܺο� �ִ� ���� ���� 1byte�� ���������� java(����)�� �ҷ�����(�о����)
			// �о�� �����Ͱ� ������ -1 ��ȯ
			//->int read() ��� -> ����ó�� (IOException ���ɼ� o )
			
			while(true) { //���Ͽ� ����ڰ� ������ �𸣱� ������ ���� ����
				int data = fis.read();
				
				if(data == -1) {
					break;
				}
				
				System.out.print((char)data);
				//���� ����ȯ�Ͽ� �� ��� 
				//�����ڵ�� 2byte�̱� ������ ǥ�� �Ұ��� 
			}
			
			fis.close(); //��� ���� -> �ڿ�(�޸�)��ȯ / �ʿ���� ��θ� ��� �θ� �ӵ� ������ 
			
		}catch(IOException e ) { 
			e.printStackTrace();
			//����ó���� ������ : IOException�� FileNotFoundEception�� ����Ŭ������ ������ ���� 
		}finally {
			
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void example3() {
		//FileOutputStream : ���α׷� -> ���� ��������(���)
		
		//1) FileOutputStream �������� ���� 
		FileOutputStream fos = null;
		
		//2)����ó�� (try-catch-finally)
		try{
			//4)FileOutputStream ��ü����
			fos = new FileOutputStream("byte/outputTest1.txt"
					);
			//��ο� �ۼ��� ������ �������� ������ �ڵ� ���� ����
			//���� �����ϸ� �������Ͽ� ����� (�⺻(, false))
			//�̾�� : ��� �ۼ� �� ,true �ۼ�
			
			//5) �Է¹��� ���ڿ��� �ϳ��� ������ ����
			Scanner sc = new Scanner(System.in);
			
			String str = "";
			
			for(int i=0; i<3; i++) {
				System.out.print("�Է� : ");
				str += sc.nextLine()+"\n";
			}
			
			//6)���� ��� 
			//void write(����) : 
			for(int i=0; i<str.length(); i++) {
				fos.write(str.charAt(i));
			}
			
		}catch(IOException e){
			e.printStackTrace();
			
		}finally {
		//3) �ڿ� ��ȯ & �ڿ���ȯ ����ó��
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		
	}
	public void example4() {
		
		//FileReader: ���� -> ���α׷�/ ���ڱ��(2byte) ��Ʈ��
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("char/inputTest2.txt");;
			while(true) {
				int data = fr.read(); //�ѹ��ھ� �о���� / �о�� ���ھ����� -1��ȯ
				
				if (data == -1) {
					break;
				}
				System.out.print((char)data);
								//���ڷ� ��� ����ȯ 
				//�����ڵ� (2byte) �о���� ���� 
				
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}
	public void example5() {
		//FileWriter : ���α׷� -> ���� ��� (���ڱ�� ��Ʈ��) 
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("char/outputTest2.txt",true);
			
			Scanner sc = new Scanner(System.in);
			String str = "";
			
			for(int i=0; i<3; i++) {
				System.out.print("�Է� :");
				
				str += sc.nextLine() + "\n";
			}
			
			fw.write(str);
			//���ڿ� �ѹ��� ��� ���� 
			
		}catch(IOException e) {
			
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

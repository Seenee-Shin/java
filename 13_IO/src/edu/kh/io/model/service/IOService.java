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
	//Flie 클래스 : 파일,폴더를 다루는 자바 클래스 
	// 파일 불러오기, 파일 생성 등 
	
	public void example1() {
		// 파일 생성 
		File f1 = new File("test1.txt");//상대 경로
							//경로 지정 
							// 절대경로 : 주소를 지정
							// 상대경로 : 현재 위치(프로젝트) 기준 
		
		//boolean createNewFile()
		//파일 생성 메소드 
		//생성시 true, 생성실패시 false
		try {
			if(f1.createNewFile()) {
				System.out.println("파일 생성 성공");
			}else {
				System.out.println("파일이 이미 존재합니다");
				
			}
		} catch (IOException e) {
			 System.out.println("파일 생성 중 예외 발생 ");
			 e.printStackTrace();
			 // 예외 발생 경로 출력 
		}	
	}
	
	
	// Stream : 입출력간의 데이터 통로
	// 바이트 기반 스트림, 문자기반 스트림
	
	public void example2() {
		//FileInputStream :파일에 작성된 내용을 1byte씩 입력 받는 스트림 
		// FileInputStream 객체 생성 시 FlieNotFoundException 발생가능성이 있어 이를 처리해야함 
		
		FileInputStream fis = null; // 참조변수선언 (null값으로 비어있음)
		
		try {
			fis = new FileInputStream("byte/inputTest1.txt");
			//상대경로 기준으로 파일 연결 (현재위치 기준 == 13_IO)
			
			//외부에 있는 파일 내용 1byte씩 순차적으로 java(내부)로 불러오기(읽어오기)
			// 읽어올 데이터가 없으면 -1 반환
			//->int read() 사용 -> 예외처리 (IOException 가능성 o )
			
			while(true) { //파일에 몇글자가 있을지 모르기 때문에 무한 루프
				int data = fis.read();
				
				if(data == -1) {
					break;
				}
				
				System.out.print((char)data);
				//강제 형변환하여 값 출력 
				//유니코드는 2byte이기 때문에 표기 불가능 
			}
			
			fis.close(); //통로 봉쇄 -> 자원(메모리)반환 / 필요없는 통로를 계속 두면 속도 느려짐 
			
		}catch(IOException e ) { 
			e.printStackTrace();
			//예외처리의 다형성 : IOException은 FileNotFoundEception의 상위클래스로 다형성 적용 
		}finally {
			
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void example3() {
		//FileOutputStream : 프로그램 -> 파일 내보내기(출력)
		
		//1) FileOutputStream 참조변소 선언 
		FileOutputStream fos = null;
		
		//2)예외처리 (try-catch-finally)
		try{
			//4)FileOutputStream 객체생성
			fos = new FileOutputStream("byte/outputTest1.txt"
					);
			//경로에 작성된 파일이 존재하지 않으면 자동 파일 생성
			//파일 존재하면 기존파일에 덮어쓰기 (기본(, false))
			//이어쓰기 : 경로 작성 후 ,true 작성
			
			//5) 입력받은 문자열을 하나의 변수로 저장
			Scanner sc = new Scanner(System.in);
			
			String str = "";
			
			for(int i=0; i<3; i++) {
				System.out.print("입력 : ");
				str += sc.nextLine()+"\n";
			}
			
			//6)파일 출력 
			//void write(문자) : 
			for(int i=0; i<str.length(); i++) {
				fos.write(str.charAt(i));
			}
			
		}catch(IOException e){
			e.printStackTrace();
			
		}finally {
		//3) 자원 반환 & 자원반환 예외처리
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		
	}
	public void example4() {
		
		//FileReader: 파일 -> 프로그램/ 문자기반(2byte) 스트림
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("char/inputTest2.txt");;
			while(true) {
				int data = fr.read(); //한문자씩 읽어오기 / 읽어올 문자없으면 -1반환
				
				if (data == -1) {
					break;
				}
				System.out.print((char)data);
								//문자로 출력 형변환 
				//유니코드 (2byte) 읽어오기 가능 
				
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
		//FileWriter : 프로그램 -> 파일 출력 (문자기반 스트림) 
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("char/outputTest2.txt",true);
			
			Scanner sc = new Scanner(System.in);
			String str = "";
			
			for(int i=0; i<3; i++) {
				System.out.print("입력 :");
				
				str += sc.nextLine() + "\n";
			}
			
			fw.write(str);
			//문자열 한번에 출력 가능 
			
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

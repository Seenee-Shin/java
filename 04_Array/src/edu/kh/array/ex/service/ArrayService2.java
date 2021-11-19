
package edu.kh.array.ex.service;

import java.util.Arrays;

public class ArrayService2 {

	public void example1() {
	 	int[] arr = {1,2,3,4,5};
		
		//얕은 복사 - 주소만 복사 
		// 객체의 매개변수 , 반환형 전달시 사용 
		
		int[] copyArr = arr;
		
		System.out.println("변경 전");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copyArr));
		
		copyArr[0] = 999;
		System.out.println("변경 후");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copyArr));
	}
	
	public void example2() {
		// 깊은 복사 : 원본 배열과 동일한 자료형 , 동일하거나 큰 크기의 배열 할당 필요
		// 원본 데이터 유지 , 원본과 똑같은 배열을 가공할 때
		
		int [] arr = {1,2,3,4,5};
		 
		int [] copyArr = new int[arr.length];
		 
		 //for 문을 이용한 깊은 복사 
		/* for(int i = 0 ; i<arr.length; i++) {
			 copyArr[i] = arr[i];
		}*/
	
		 
		 // System.arraycopy(원본 배열, 복사 시작인덱스 , 복사배열 , 삽입 시작인덱스, 복사 길이) 
		 System.arraycopy(arr, 0, copyArr, 0, arr.length);
		 
		 System.out.println("변경 전");
		 System.out.println(Arrays.toString(arr));
		 System.out.println(Arrays.toString(copyArr));
		 
		 copyArr[0] = 999;
		 System.out.println("변경 후");
		 System.out.println(Arrays.toString(arr));
		 System.out.println(Arrays.toString(copyArr));
		 
	}
	
	public void example3() {
		// 배열 중복 검사 
		
		int[] arr= {4,2,3,4,1};
		 // 비교 기준 선정
		for (int i = 0 ; i < arr.length-1 ; i++) {
			
			//비교 대상 선정 
			for (int j= 1 + i ; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					
					System.out.println(arr[i] + "중복");
					
					break; 
				}
				
			}
		}
	}
	
	public void example4() {
		//난수 발생 
		//난수 생성 범위 0 ~ 20
		// 난수 생성 개수 : 20 
		
		//math.random()
		// 난수 발생 메소드 ( 더블형 ) / 0.0 ~ 1.0 사이의 난수 발생
		
		int[] arr = new int[4];
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			arr[i] = (int)(Math.random()* 21); // 0.0~ 21.0 미만 
		}
		
		 System.out.println(Arrays.toString(arr));
		 
		 //중복 검사 코드 
		 for (int i = 0 ; i <arr.length -1 ; i++) {
			 
			 for(int j = 0 + i ; j < arr.length ; j++) {
				if(arr[i] == arr[j]){
					System.out.println(arr[i] + "중복");
				}
				
			 }
		 }	 
	}
	
	public void lottoNumberConstructor() {
		// 조건 1. 1~45번까지 생성 
		// 조건 2. 총 6개의 번호 추첨 
		// 조건 3.  중복 없음 
		// 오름차순 정렬 
		
		int[] lotto = new int[6];
		
		for( int i = 0 ; i < lotto.length ; i++) {
			int ran = (int)(Math.random()* 45 + 1);
			
			lotto[i] = ran;
			
			for(int x=0 ; x<i ; x++) {
				if(lotto[x] == ran) {
					i--;
					break;
				}
			}
			//Arrays.sort(배열멸)
			// 배열 내 값을 오름차순 순서로 정렬
		}Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
	
	//////////////////스트링 //////////////////////
	
	public void example5() {
		String str1 = "Apple";
		String str2 = "Banana";
		
		String[] arr = new String[3];
		arr[0] = "Hello";
		arr[1] = "안녕";
		arr[2] = "Hi";
		
		for( int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
}

package codingTest.model.service;

import java.util.*;

public class BaekJoon {

	Scanner sc = new Scanner(System.in);

	public void b10871() {
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < arr.length; i++) {
			int num = sc.nextInt();
			if(num < X) {
				arr[i] = num;
			}
		}
		
		for(int i =0; i < arr.length; i++) {
			if(arr[i] !=0) {
				System.out.print(arr[i]+" ");
			}
		}

		
	}
	
	public void b10952() {
		int A = -1;
		int B = -1;
		while(true){
			A = sc.nextInt();
			B = sc.nextInt();
			
			if(A ==0 && B==0 ) {break;}
			else{System.out.println(A+B);}
			
		}
	}

}

package codingTest.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		int C = sc.nextInt();
//		int D = sc.nextInt();
//		sc.close();
//		
//		String result ="";
//		
//		if(A == C) {
//			if(B==D || B<D) {
//				result = "Takahashi";
//			}else{
//				result = "Aoki";
//			}
//		}else if(A<C) {
//			result = "Takahashi";
//		}else {
//			result = "Aoki";
//		}
//		
//		System.out.println(result);
		
		
//		int N = sc.nextInt();
//		
//		Set<Integer> n = new HashSet<Integer>();
//		
//		for(int i = 0; i<N; i++) {
//			int num = sc.nextInt();
//			n.add(num);
//		}
//		
//		for(int i =0 ; i<=2000; i++) {
//			if(!n.contains(i)) {
//				System.out.println(i);
//				break;
//			}
//		}
//		
		
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];

		
		for(int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0; i<B.length; i++) {
			B[i] = sc.nextInt();
		}
		
		int a = A[0];
		int b = B[0];
		
		for(int i =0; i<A.length; i++) {
			if(A[i]-A[i+1] <= K) {
			}else if(B[i]-B[i+1] <=K) {
			}else if(A[i]-B[i+1]<=K) {
			}else if(B[i]-A[i+1]<=K) {
			}
			
		}

	}

}
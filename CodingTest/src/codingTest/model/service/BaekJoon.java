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
	
	public void b4344() {
		int sum = 0;
		double avg = 0;
		double over = 0;
		
		int C = sc.nextInt();
		while(C!=0) {
			
			int N = sc.nextInt();
			
			int[] student = new int[N];
			
			for(int i =0; i<N; i++) {
				int score = sc.nextInt();
				student[i]= score;
				sum += score;
			}
			
			avg = sum/N;
			
			for(int i =0; i <N; i++) {
				if(student[i] > avg) {
					over++;
				}
			}
			
			double result = (over/N)*100 ;
			
			if(C == 0) {
				break;
			}else {
				System.out.println(String.format("%.3f%%", result));
			}
			
			C--;
			sum=0;
			over=0;
			avg=0;
		}
	}
	
	public void b2577() {
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int multiple = A*B*C;
		
		int[] count = new int[10];
		
		while(multiple > 0) {
			
			int num = multiple%10;
			
			for(int i=0; i <count.length; i++) {
				if(num == i) {
					count[i]++;
				}
			}
			multiple /= 10;
		}
		
		for(int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}
	}
	
	public void b11022() {
		
		int T = sc.nextInt();
		
		for(int i =0; i < T; i++) {
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			int result = A+B;
			
			System.out.printf("Case #%d: %d + %d = %d\n",i+1,A,B,result);
		}
		
	}
	
	public void b1546() {
		int N = sc.nextInt();
		int[] max = new int[N]; 
		Double[] newScore = new Double[N];
		double sum=0;
		double newAvg =0;
		
		for(int i =0; i <N; i++) {
			int score = sc.nextInt();
			max[i] = score;
		}
		
		Arrays.sort(max);
		
		System.out.println(max[N-1]);
		
		for(int i =0; i<N; i++) {
			newScore[i] =  (double)max[i]/(double)max[N-1]*100;
			sum += newScore[i];
		}
		
		newAvg = sum/N;
		
		System.out.println(newAvg);
		
		
	}
	
	public void b3052() {
		Set<Integer> result = new HashSet<Integer>();
		
		for(int i =0; i<10; i++) {
			int number =sc.nextInt();
			result.add(number%42);
		}
		
		System.out.println(result.size());
	}
		

}

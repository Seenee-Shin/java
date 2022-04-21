package codingTest.model.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
	
	public void b8958() {
		int T = sc.nextInt();
		String[] ox = new String[T]; 
		sc.nextLine();
		
		for(int i= 0; i <ox.length; i++) {
			ox[i]= sc.nextLine();
			}
			
		for(int i =0; i<ox.length; i++) {
			int score = 0;
			int count = 0;
			for(int j=0; j<ox[i].length(); j++) {
				if(ox[i].charAt(j)=='O') {
					count++;
					score += count;
				}else {
					count = 0;
				}
			}
			System.out.println("score :"+ score);
		}
	}	
	
	
	public void b1152() {
		String input = sc.nextLine().trim();
		String[] count = input.split(" ");
		if(count[0]=="") {
			System.out.println(0);
		}else {
			System.out.println(count.length);
		}
	}
	
	public void b2839() {
		int N = sc.nextInt();
		int count = 0;
		
		while(true) {
			//가장 적게 봉지를 만들어야하기 때문에 먼저 5로 나누어 지는지 확인
			if(N%5==0) {
				count += N/5;
				System.out.println(count);
				break;
			}else if (N <0){
				System.out.println(-1);
				break;
			}
			
			//처음에는 N%3 ==0으로했지만, 11같은경우 어디에도 속하지 않기 때문에 count를 직접++, 3kg의 설탕봉지는 --해줌 
			N -= 3;
			count++;
		}
	}
	
	public void b2751() throws IOException {
		//스캐너와 sysout은 시간초과가 생길 가능성이 크므로 buffer를 이용해 입출력하는 연습을 하자
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String n = br.readLine();
		int N =Integer.parseInt(n) ;
		
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i = 0; i<N; i++) {
			int number = Integer.parseInt(br.readLine());
			result.add(number);
		}
		Collections.sort(result);
		for(Integer i : result) {
			bw.write(i+"\n");
		}
		
		bw.flush();
		
	}
	
	public void b1712(){
		
		 //고정비용
		long A = sc.nextLong();
		//가변비용
		long B = sc.nextLong();
		//노트북 가격
		long C = sc.nextLong();
		
		if(B >= C) {
			System.out.println(-1);
		}else {
			long count = A/(C-B) +1 ;
			System.out.println(count);
		}
		
		sc.close();
	}
	
	public void b11720() {
		int N = sc.nextInt();
		String number = sc.next();
		
		int sum = 0;
		for(int i=0; i < number.length(); i++) {
			sum+= number.charAt(i)-'0';
		}
		System.out.println(sum);
	}
	
	public void b2675() {
		int N = sc.nextInt();
		
		for(int i =0; i <N; i++) {
			int R = sc.nextInt();
			String S = sc.next();
			
			for(int j=0; j<S.length(); j++) {
				for(int k= 0; k<R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
		sc.nextLine();
		sc.close();
	}
	
	public void b1929() {
		//시간초과 ... 
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.nextLine();
		int count =0;
		
		for(int i = 2; i<=N; i++) {
			for(int j=2; j<=N; j++) {
				if(i%j ==0) {
					count++;
				}
			}
			
			if(count==1) {
				System.out.println(i);
			}
			count = 0;
		}
	}

}

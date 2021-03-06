package codingTest.model.service;

import java.io.*;
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
			//???? ???? ?????? ???????????? ?????? ???? 5?? ?????? ?????? ????
			if(N%5==0) {
				count += N/5;
				System.out.println(count);
				break;
			}else if (N <0){
				System.out.println(-1);
				break;
			}
			
			//???????? N%3 ==0??????????, 11???????? ???????? ?????? ???? ?????? count?? ????++, 3kg?? ?????????? --???? 
			N -= 3;
			count++;
		}
	}
	
	public void b2751() throws IOException {
		//???????? sysout?? ?????????? ???? ???????? ?????? buffer?? ?????? ?????????? ?????? ????
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
		
		 //????????
		long A = sc.nextLong();
		//????????
		long B = sc.nextLong();
		//?????? ????
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
	
	public void b1929() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    StringTokenizer st = new StringTokenizer(br.readLine());
		//???????? ... 
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
		int count =0;
		
		for(int i = M; i<=N; i++) {
			for(int j=2; j<=i; j++) {
				if(i%j ==0) {
					count++;
					if(count == 2) {
						break;
					}
				}
			}
			
			if(count==1) {
	            StringBuilder sb = new StringBuilder();
                sb.append(i).append("\n");
                bw.write(sb.toString());
			}
			count = 0;
		}
		 bw.flush();
		 br.close();
	}
	
	
	//?????????? : ???????????????? ?? 
	// ???????????????? ?? : ?????? ???? ???? ?????? ?????? ???? ???? ????
	// 2???? ???????? ???? ?????? ?????? ??????????.
	public void b1929A() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//???????? ... 
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		boolean[] prime = new boolean[N+1];
		
		prime[0]=prime[1]=true ;
		
		
		//2???? N???? ???? ???? ?????? 
		for(int i = 2; i<=Math.sqrt(N); i++) {
			if (prime[i]==true) continue;
			
			for(int j=i*i; j<prime.length; j=j+i) {
				prime[j]=true;
			}
		}
		//M???? N?????? ???? ????????
		for(int i=M; i<=N; i++) {
			if(!prime[i]) System.out.println(i);
		}
		
		bw.flush();
		br.close();
	}
	
	public void b10809() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String S = br.readLine();
		int[] check = new int[26];
		Arrays.fill(check,-1);

		for(int i =0; i<check.length; i++) {
			char alpabet = (char) (i+97);
			
			for(int j=0; j<S.length(); j++) {
				if(alpabet ==S.charAt(j)) {
					check[i] = j;
					
					break;
				}
			}
		}
		
		for(int i=0; i<check.length; i++) {
			bw.write(check[i]+" ");
		}
		br.close();
		bw.flush();
	}
	
	
	public void b11654() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		char ch = input.charAt(0);
		
		System.out.println((int)ch);
		
	}

	public void b2869() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int firstDay = A;
		int normal = A-B;
		int sum =0;
		int count = 1;
		
		while(sum < V) {
			if(count == 1) {
				sum += firstDay;
			}else {
				sum += normal;
			}
			
			if(sum >= V) break;
			count++;
		}
		
		bw.write(count+"\n");
		br.close();
		bw.flush();
	}
	
	public void teamLab() {
//		long sum = 0;
//		for(int i =1; i <=50; i++) {
//			
//			long add = (long)Math.pow(i, 4);
//			
//			sum += add;
//		}
//		System.out.println(sum);
		
//		int[] arr = new int[32];
//		arr[0] =1;
//		arr[1] = 0;
//		arr[2] = 5;
//		
//		for(int i=3; i<arr.length; i++) {
//				arr[i]=arr[i-3]+arr[i-2]+arr[i-1];
//				
//				System.out.println(arr[i]);
//		
//		}
//		int x1, x2, x3, x4;
//		List<Integer> arr = new ArrayList<Integer>();
//		for(int i =1; i<= 50000; i++) {
//			if(i%3==0) {
//				arr.add(i);
//			}else {
//				x1 = i / 10; 
//			    x2 = i / 100; 
//			    x3 = i / 1000; 
//			    x4 = i / 10000; 
//			    if (i % 3 == 0 || i % 10 == 3 || x1 % 10 == 3 || x2 % 10 == 3 || x3 % 10 == 3 ||x4 % 10 == 3) {
//			    	arr.add(i);
//			    	
//			    }
//			}
//			
//		}
//		long sum =0;
//		for(int i =0; i < arr.size(); i++) {
//			sum += arr.get(i);
//		}
//		System.out.println(sum);
		
//		
//		double sum =0;
//		double n=1;
//		while(sum < 8.0) {
//			sum += (1/n);
//			n++;
//		}
//		System.out.println(n-1);
		
		int a = 205;
		int b = 82;
		int c = 30;
		int count = 0;
		int sum = 0;
		for(int i=1; i<=30; i++) {
			for(int j=1;j<=40; j++) {
				for(int k=1;k<=20; k++) {
					sum = i*a + j*b + k*c;
				}
			}
		
		}
		System.out.println(sum);
	}
	
	public void b10828() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		for(int i =0; i <N; i++) {
			
		}
	}
	
	public void push(int[] stack) {
		
	}
	public void pop(int[] stack) {
		
	}
	public void size(int[] stack) {
		
	}
	public void empty(int[] stack) {
		
	}
	public void top(int[] stack) {
		
	}
}

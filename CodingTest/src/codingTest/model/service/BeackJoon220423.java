package codingTest.model.service;

import java.io.*;
import java.util.*;

public class BeackJoon220423 {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public void b10828() throws Exception {
		
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i =0; i <N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String  order= st.nextToken();
			int num = -6;
			if(st.hasMoreTokens()) {
				num = Integer.parseInt(st.nextToken());
			}
			
			if(order.equals("push")) stack.add(num);
			
			else if(order.equals("pop")) System.out.println(pop(stack));
			else if(order.equals("size")) System.out.println(stack.size());
			else if(order.equals("empty")) System.out.println(empty(stack));
			else if(order.equals("top")) System.out.println(top(stack));
			
		}
	}
	
	public int pop(Stack<Integer> stack ) {
		if(!stack.isEmpty()) return stack.pop(); 
		else return -1;
	}
	
	public int empty(Stack<Integer> stack) {
		if(!stack.isEmpty()) return 0;
		else return 1;
	}
	
	public int top(Stack<Integer> stack) {
		if(stack.isEmpty()) return -1;
		else return stack.peek(); 
	}
	
	
	public void b1316() throws IOException {
		int N = Integer.parseInt(br.readLine());
		String[] str = new String[N];
		for(int i =0; i<=N; i++) {
			str[i] = br.readLine();
		}
		
		System.out.println(check(str));;
	}
	
	public int check(String[] str) {
		int result =0;
		int count =0;
		int[] alpabet = new int[26];
		
		return result;
	}
}

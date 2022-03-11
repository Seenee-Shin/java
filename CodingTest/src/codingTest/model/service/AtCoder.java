package codingTest.model.service;

import java.util.Scanner;

public class AtCoder {

	//シカのAtCoDeerくんは二つの正整数 a,b を見つけました。 a と b の積が偶数か奇数か判定してください
	//1 ≤ a,b ≤ 10000
	//a,b は整数
	public void main() {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if((1<=a && 10000 >=a) && (1 <= b && 10000 >= b)) {
			if((a*b)%2 == 0) {
				System.out.println("Even");
			}else {
				System.out.println("Odd");
			}
		}else {
			System.out.println("error");
		}

	}
	
	
	//すぬけ君は 1,2,3 の番号がついた 3 つのマスからなるマス目を持っています。 各マスには 0 か 1 が書かれており、マス i には s 
	//iが書かれています。 すぬけ君は 1 が書かれたマスにビー玉を置きます。 ビー玉が置かれるマスがいくつあるか求めてください。
	
	//
	public void placingMarbles(){
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		
		int num = 0;
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)=='1'){
				num++;
			}
		}
		System.out.println(num);
		sc.close();
	}
	
	
	//黒板に N 個の正の整数 a[1]~a[N]  が書かれています．
	//すぬけ君は，黒板に書かれている整数がすべて偶数であるとき，次の操作を行うことができます．

	//黒板に書かれている整数すべてを，2 で割ったものに置き換える．
	//すぬけ君は最大で何回操作を行うことができるかを求めてください．
	public void shiftOnly() {
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		int arr[] = null;
		
		if(length >= 1 && length <=200) {
			arr = new int[length];
			
			for(int i=0; i<arr.length; i++) {
				int num = sc.nextInt();
				if(num >= 1 &&  num<=  Math.pow(10, 9)) {
					arr[i] = num;
				}
			}
		}else {
			System.out.println("error");
		}
		
		int count = 0;
		boolean flag = true;
		do{
			for(int i=0; i<arr.length; i++) {
				if(arr[i]%2 == 0) {
					arr[i] = arr[i]/2;
				}else {
					flag = false;
					count--;
					break;
				}
			}
			count++;
		}while(flag);
		System.out.println(count);
		
	}
	
	//あなたは、500円玉をA枚、100円玉をB枚50円玉をC枚持っています。 これらの硬貨の中から何枚かを選び、合計金額をちょうど X 円にする方法は何通りありますか。
	//同じ種類の硬貨どうしは区別できません。2 通りの硬貨の選び方は、ある種類の硬貨についてその硬貨を選ぶ枚数が異なるとき区別されます。
	public void coin() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int count = 0;
		int sum = 0;
		
		
		
		if((a+b+c) >= 1) {
			int x = sc.nextInt();
		
			if( (x >= 50 && x <= 20000) && x%50 == 0) {
				for(int i =0; i <= a; i++) {
					for(int k=0; k <= b; k++) {
						for(int j =0; j<= c; j ++) {
							sum = (i*500) +(k*100)+(j*50);
							if(sum == x) {
								count++;
							}
						}
					}
				
				}
				System.out.println(count);
			}
		}
	}
	
	public void someSum() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = 0;
		int num =0;
		int result = 0;
		
		if(n>=1 && n <= Math.pow(10, 4)) {
			if((a>=1 && a<= 36)&&(b>=1 && b<= 36)){
				for(int i =0; i <= n; i++) {
					num = i;
					sum = 0;
					
					while(num != 0) {
						sum += num%10;
						num /= 10;
						System.out.println("i : "+i);
						System.out.println("sum : "+sum);
						
					}
					if(sum >=a && sum <= b) {
						result += i;
						System.out.println("result : " +result);
					}
				}
			}
		}
	}
	
//	import java.util.Scanner;
//	public class Main {
//	 
//	    public static void main(String[] args) {
//	    	
//	    }
//	}
}
		

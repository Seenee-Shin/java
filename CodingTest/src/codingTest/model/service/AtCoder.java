package codingTest.model.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


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
	
	//N 枚のカードがあります. i 枚目のカードには, a [i]という数が書かれています.
	//Alice と Bob は, これらのカードを使ってゲームを行います. ゲームでは, Alice と Bob が交互に 1 枚ずつカードを取っていきます. Alice が先にカードを取ります.
	//2 人がすべてのカードを取ったときゲームは終了し, 取ったカードの数の合計がその人の得点になります.
	//2 人とも自分の得点を最大化するように最適な戦略を取った時, Alice は Bob より何点多く取るか求めてください.	
	public void cardGameforTwo() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Integer[] a = new Integer[n];
		int alice = 0;
		int bob = 0;
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt(); 
		}
		
		Arrays.sort(a, Collections.reverseOrder());
		
		for(int j =0; j < a.length; j++ ) {
			if(j%2 == 0) {
				alice += a[j];
			}else{
				bob += a[j];
			}
		}
		System.out.println(alice-bob);
	}
	
	public void kagamiMochi(){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		Set<Integer> resultSet = new HashSet<Integer>();
		
		for(int i =0; i <n; i++) {
			resultSet.add(sc.nextInt());
		}
		System.out.println(resultSet.size());
	}
	
	public void otoshidama() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int y = sc.nextInt();
		int num1=0;
		int num2 = 0;
		int num3 =0;
		
		for(int i =0; i <= n; i++) {
			for(int j=0; j <= n-i; j++) {
				
				for(int k=0; k <= n-i-j; k++) {
					if(i+j+k == n) {
						if((i*10000)+(j*5000)+(k*1000)==y) {
							num1=i;
							num2=j;
							num3=k;
						}
					}
				}
			}
		}
		if(num1==0 && num2==0 && num3==0) {
			System.out.println("-1 -1 -1");
		}else{
			System.out.println(num1+" "+num2+" "+num3);
		}
	}
	
	public void ABC049C() {
 		Scanner sc = new Scanner(System.in);
		
		String s = sc.next().toLowerCase();
		sc.close();
		
		String[] t = {"eraser","erase","dreamer","dream"};

		
		for(int i=0;i<t.length;i++){
			s = s.replace(t[i], "");
		}
		
		System.out.println((s.equals("")?"YES":"NO"));

	}	
	
	public void teamLab() {
		List<Integer> arr = new ArrayList<Integer>();
		int count = 0;
		
		for (int i = 7; i<=7777777; i++) {
			if(i%7 == 0) {
				arr.add(i);
			}
		}
		
		for(int j = 0 ; j<arr.size(); j++ ) {
			int num = arr.get(j);
			do {
				//각 자리수가 7일때 카운트 ++; 
				if(num%10 == 7) {
					count++;
				}
				
				num /= 10;
				
			}while(num>0);
		}
		
		System.out.println(count);
	}
	

	
	
	
//	import java.util.Scanner;
//	public class Main {
//	 
//	    public static void main(String[] args) {
//	    	
//	    }
//	}
}
		

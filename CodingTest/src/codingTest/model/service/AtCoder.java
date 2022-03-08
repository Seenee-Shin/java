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

}

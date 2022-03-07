package codingTest.model.service;

import java.util.Scanner;

public class AtCoder {

	public static void main(String[] args) {
		//シカのAtCoDeerくんは二つの正整数 a,b を見つけました。 a と b の積が偶数か奇数か判定してください
		//1 ≤ a,b ≤ 10000
		//a,b は整数
		
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

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
//	int A = sc.nextInt();
//	int B = sc.nextInt();
//	int C = sc.nextInt();
//	int X = sc.nextInt();
//	sc.close();
//	
//	if(X<=A) {
//		System.out.println("1.000000000000");
//	}else if(X > A && X <= B) {
//		double result = (double)C/(B-A);
//		System.out.printf("%.12f",result);
//	}else {
//		System.out.println("0.000000000000");
//		//�������� Ȯ�� 0 
//		
//	}
	
//	String S = sc.nextLine();
//	List<String> list = new ArrayList<String>();
//	
//	for(int i =0; i<S.length(); i++ ) {
//		String result =  S.substring(i,i+1);
//		list.add(result);
//	}
//	Collections.sort(list);
//	
//	for(int i =0; i<list.size(); i++) {
//		System.out.print(list.get(i));
//	}
//	
//	int n = sc.nextInt();
//	String S = sc.next();
//	System.out.println(S.substring(n-1));
	
//	int N = sc.nextInt();
//	String S = sc.next().toUpperCase();
//	
//	String[] s = new String[N];
//	HashMap<String, Integer> map = new HashMap<String, Integer>();
//	map.put("x",0);
//	map.put("y",0);
//	
//	int count =0;
//	
//	for(int i = 0; i <N; i++) {
//		s[i] = S.substring(i, i+1);
//	}
//	
//	for(int j=0 ; j <s.length; j++) {
//		if(s[j].equals("S")) {
//			switch(count) {
//			case 1 :  map.put("y",map.get("y")-1); break;
//			case 2 :  map.put("x",map.get("x")-1);break;
//			case 3 :  map.put("y",map.get("y")+1);break;
//			default : map.put("x",map.get("x")+1);;break;
//			}
//		}
//		if(s[j].equals("R")) {
//			switch(count) {
//			case 0 :count++; break;
//			case 1 :count++; break;
//			case 2 :count++; break;
//			default :count=0;break;
//			}
//		}
//	}
//	System.out.println(map.get("x")+" "+map.get("y"));
	
//		int N = sc.nextInt();
//		int su = -1;
//		List<Integer> ta = new ArrayList<Integer>();
//		
//		for(int i=1; i <= (2*N)+1; i++) {
//			ta.add(i);
//			Collections.sort(ta);
//		}
//		
//		do{
//			
//			for(int i =0; i<ta.size(); i++) {
//				System.out.println(ta.get(i));
//				ta.remove(i);
//				Collections.sort(ta);
//				
//				su = sc.nextInt();
//				sc.nextLine();
//				
//				for(int j=0; j<ta.size(); j++) {
//					if(su == ta.get(j)) {
//						ta.remove(j);
//						Collections.sort(ta);
//					}
//				}
//			}
//			
//		}while(su != 0);
//		
		
		int N = sc.nextInt();
		String S = sc.next().toUpperCase();
		
		int x = 0;
		int y = 0;
		int count =0;
		
		for(int j=0 ; j <S.length(); j++) {
			if(S.charAt(j)=='S'){
				switch(count) {
				case 1 :  y--; break;
				case 2 :  x--;break;
				case 3 :  y++;break;
				default : x++;break;
				}
			}
			else {
				switch(count) {
				case 0 :count++; break;
				case 1 :count++; break;
				case 2 :count++; break;
				default :count=0;break;
				}
			}
		}
		System.out.println(x+" "+y);
	}
}
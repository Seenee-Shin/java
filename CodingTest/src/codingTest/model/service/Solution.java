package codingTest.model.service;

import java.util.Scanner;

public class Solution {
	// �ű� ���̵� ��õ
	
		// ��Ģ
		//���̵��� ���̴� 3�� �̻� 15�� ���Ͽ��� �մϴ�.
		//���̵�� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.) ���ڸ� ����� �� �ֽ��ϴ�.
		//��, ��ħǥ(.)�� ó���� ���� ����� �� ������ ���� �������� ����� �� �����ϴ�.
			
		//	1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
		//	2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
		//	3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
		//	4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
		//	5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
		//	6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
		//	     ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
		//	7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.

		// [���ѻ���]
//			new_id�� ���� 1 �̻� 1,000 ������ ���ڿ��Դϴ�.
//			new_id�� ���ĺ� �빮��, ���ĺ� �ҹ���, ����, Ư�����ڷ� �����Ǿ� �ֽ��ϴ�.
//			new_id�� ��Ÿ�� �� �ִ� Ư�����ڴ� -_.~!@#$%^&*()=+[{]}:?,<>/ �� �����˴ϴ�.
	//���̵� �Է� �ޱ� 
	Scanner sc = new Scanner(System.in);

	public String solution(String new_id) {
		String answer = "";
		
		//1�ܰ� : �ҹ��ڷ� ġȯ
		new_id.toLowerCase(); 
		
		//2�ܰ� :2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
		new_id.replaceAll("[^a-z0-9-_.]","");
		
		//3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
		new_id.
        return answer;
    }
	
	
}
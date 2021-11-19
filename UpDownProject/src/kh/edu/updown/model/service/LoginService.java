package kh.edu.updown.model.service;

import java.util.Scanner;

import kh.edu.updown.model.vo.Member;

public class LoginService {
	
	private Member[] members = new Member[3];

	
	private Scanner sc = new Scanner(System.in);
	// ���ٿ� ���� ����
	// 1 ~ 100 ���� ���� �� �����ϰ� �� ���ڸ� �����ϰ� ��/�ٿ� ������ ����
	// ���� Ƚ���� ���� �α����� ȸ���� ���� �Ǵ� �ְ� ����� ���
	// ȸ���� highScore �ʵ� ���� ����
	
	public void startGame(Member loginMember) {
	System.out.println("[Game Start...]");
	
	double random = (int)((Math.random()*100 + 1));
	int count = 0;
	
		for( int i = 1; i < 100; i++) {
			
		System.out.print(i + "��° �Է� : ");
		int input = sc.nextInt();
		count++;
		
		if(input > random && input != random) {
			System.out.println("---DOWN---");
			
		}else if(input < random && input != random) {
			System.out.println("---UP---");
			
		} else if(input == random) {
			System.out.println("����!");
			System.out.println("�Է½õ� Ƚ�� : " + count);
			}
		if(count < loginMember.getHighScore() || loginMember.getHighScore() == 0) {
			System.out.println("*** �ְ� ��� �޼� ***");
			break;
		}
			
		} 
	}
	
	
	// �� ���� ��ȸ
	// �α����� ����� ���� �� ��й�ȣ�� ������ ������ ������ ȭ�鿡 ���
	public void selectMyInfo(Member loginMember) {
	System.out.println("[�� ���� ��ȸ]");
	}
	
	
	// ��ü ȸ�� ��ȸ
	// ��ü ȸ���� ���̵�, �ְ������� �ⷰ
	public void selectAllMember(Member[] members) {
	System.out.println("[��ü ȸ�� ��ȸ]");
	}
	
	
	// ��й�ȣ ����
	// ���� ��й�ȣ�� �Է� �޾�
	// ���� ��쿡�� �� ��й�ȣ�� �Է� �޾� ��й�ȣ ����
	public void updatePassword(Member loginMember) {
	System.out.println("[��й�ȣ ����]");
	}

}

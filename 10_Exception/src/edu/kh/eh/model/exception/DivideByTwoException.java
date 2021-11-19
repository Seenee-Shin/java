package edu.kh.eh.model.exception;

public class DivideByTwoException extends Exception {
	// ����� ���� ���� 
	// Exception Ŭ������ ��ӹޱ� 
	
	// UncheckedException = RuntimeException || �� ���� 
	// CheckedExeception =   RuntimeException�� ������ ������ 
	
	// ���� �߻� == new ����Ŭ������ ����Ǿ� ���ܰ�ü�� ������ 
	// ��ü ������ ���ؼ��� �����ڰ� �־�� �Ѵ�.
	// ����� ���� ���ܿ��� �����ڸ� �ۼ��ؾ��Ѵ�.
	
	public DivideByTwoException() {
		super("2�� ���� �� �����ϴ�.");
		 //����(����) �߻��� ��µǴ� ����
	}
	
	public DivideByTwoException(String message) {
		super(message);
		//����ϴ� ������ �Ű��������� ����
	}

}

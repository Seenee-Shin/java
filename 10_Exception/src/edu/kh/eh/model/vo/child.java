package edu.kh.eh.model.vo;

import java.io.IOException;

public class child extends Parent {

	@Override
	public void methodA() throws IOException {
		//오버라이딩 예외 처리 구문은 예외범위가 같거나 더 구체적(좁은 범위) 
	}
}

package com.sist.exam1;

public class Hello {

	public void sayHello1(String name) {		// 이름바꾸면 MainClass에서 오류가 발생한다 >> 결합성이 높은 프로그램
		
		System.out.println(name+"님 환영합니다");
		
	}
	
}

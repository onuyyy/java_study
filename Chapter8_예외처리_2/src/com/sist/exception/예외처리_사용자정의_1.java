package com.sist.exception;

import java.util.*;
/*
 * 
 * 자신		==> 객체호출 this		/	생성자 호출 this()
 * 상위클래스	==> 객체호출 super		/	 생성자 호출 super()
 * 
 * class A {
 * }
 * class B extends A {
 * }
 * 
 * B b = new B(); ==> new A(), new B()
 * 				  	  -------  -------
 * 					 super(상위) this(하위)
 * 					  -----------------
 * 
 * 
 */
class MyRuntimeException extends RuntimeException {
	
	public MyRuntimeException(String msg) {
		
		super(msg);		// RumtimeException이 가지고 있는 생성자를 호출한다
		
	}
	
}

public class 예외처리_사용자정의_1 {

	public static void main(String[] args) {
		
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("점수 입력 : ");
			int score = scan.nextInt();
			if(score < 0) {
				
				throw new MyRuntimeException("음수는 사용할 수 없다");
				// 장점 => 에러 위치 확인이 가능
				// 사용자 정의 클래스를 호출할 때 사용한다
				
			}
			System.out.println("점수는 "+score+"점 입니다");
			
		} catch (MyRuntimeException ex) {
			
			System.out.println(ex.getMessage());
			System.out.println("----------------------------- 에러 발생 위치 확인");
			ex.printStackTrace();
			
			
		}

	}

}

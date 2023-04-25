package com.sist.exception;

import java.util.*;


// 사용자 정의를 사용하려면 Exception을 상속
class MyException extends Exception {
	
	public MyException(String message) {
		
		super(message);		// getMessage()
		
	}
	
}

public class 예외처리_사용자정의 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = scan.nextInt();
		
		try {
			
			if(num%2==0) {
				
				throw new MyException("짝수입니다");		// 사용자정의는 throw new를 이용하여 불러와야한다, 예외를 임의로 발생시켜야 한다
				
			}
			
		} catch (MyException e) {		// catch절 안에는 지정한 클래스만 올 수 있다
			
			System.out.println(e.getMessage());
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		

	}

}

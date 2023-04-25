package com.sist.exception;
/*
 * 예외 떠맡기기, 예외 회피하기
 * 	=> 메소드를 읽는다 => JVM에 이런 예외가 발생할 수 있다 (알려만 주는 것) => 예외 선언
 * 	`직접 처리 또는 선언
 * 	=> RuntimeException => 생략이 가능 (예외처리를 안 해도 된다)
 * 
 * 	상위 클래스를 이용해서 전체를 처리할 수 있다
 * 			Throwable (Exception/error)\
 * 				ㅣ
 * 	-----------------------------
 *  ㅣ							ㅣ
 *  Error					Exception
 *   (X)			 ----------------------
 *   				 ㅣ					 ㅣ
 *   			   Check			   UnCheck
 *   					ㅣ				 ㅣ
 *   			  IOException		RuntimeException
 *   			  SQLException			 ㅣ
 *   			  				NumberFormatException, Arr, ..
 * 	
 * 
 * 			void method() throws RuntimeException
 * 		***	void method() throws Exception		
 * 			void method() throws NumberFormatException, ClassCAstException
 * 		***	void method() throws IOException	
 * 		***	void method() throws SQLException, NumberFormatException
 * 				***들이 예외처리 필수인 것들
 * 		
 * 			throws 뒤에는 check
 */
public class 예외처리_예외회피_1 {

	public static void methods() throws Exception {			// Exception은 예외처리 대상
		
		
		
	}
	
	public static void method1() throws Exception {			// 간접처리 (JVM이 처리)
		
		methods();
		
	}
	
	public static void method2() {
		
		try {
		
			methods();
			
		} catch(Exception e) {			// Throwable 도 됨, 같거나 큰 걸 넣어야 한다 
			
		}
		
	}
	
	public static void method3() throws IOException, SQLException, ClassNotFoundException {
		
	}
	
	public static void method4() throws IOException, SQLException, ClassNotFoundException {
		
		
	}
	
	public static void method5() throws Exception {
		
		
	}
	
	public static void method6() throws Throwable {
		
		
	}
	
	public static void main(String[] args) {
		
		
		
	}

}

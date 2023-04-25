package com.sist.exception;
/*
 * 267page => try ~ catch (예외북구)
 * 
 * try : 정상 실행하는 코딩
 * catch : 예외가 발생시에 복구하는 과정 (여러 개 사용이 가능) > 계층 구조를 따라가는 순서가 존재한다
 * 
 * 
 * 예외처리 : 소스상에서 수정이 가능하 에러 (가벼운 에러)
 * 			= 사전에 에러를 방지하는 프로그램
 * 			= 비정상 종료를 방지하고 정상 종료를 가능하게 만드는 게 목적
 * 
 * 	** 먼저 계층 구조를 알아야 한다 => 상속도
 * 
 * Object : 모든 클래스의 상위 클래스 (모든 클래스는 Object 상속을 받는다)
 * 	 ㅣ
 * Throwable : 에러의 최상위 클래스
 * 	 ㅣ
 * 	 -----------------------------
 *	 ㅣ							ㅣ
 * Error					Exception
 * 처리가 불가능				 처리가 가능
 * - 메모리 부족				 - 0으로 나누는 경우
 * - 윈도우 충돌				 - 정수 변환의 문제
 * 							 - 형변환, 파일명 오류
 * 							 - 웹에서 url/ip가 틀렸을 때
 * 							 - 객체가 null인 경우
 * 
 * 
 * Exception : 예외처리의 최상의 클래스
 * 	1) CheckedException : 컴파일시에 예외처리를 했는지 여부 확인
 * 						 반드시 예외처리를 해야한다
 * 	2) UncheckedException : 컴파일시에 예외처리를 확인하지 않는다
 * 							필요시에만 예오처리를 한다
 * 
 * Exception
 * 	1) CheckedException (java.io)
 * 		- IOException :  파일 입출력, 메모리 입출력, 네트워크 입출력
 * 		- SQLException : 오라클 연결 (오라클이 인식하는 언어 : SQL)
 * 			JDBC => DBCP => ORM (MyBatis, JPA)
 * 			web => 핵심 (데이터베이스 연동)
 * 		- MalformeDURLException : ip/web url	(java.net)
 * 		- ClassNotFOoumndException : 클래스이름으로 메모리 할당 => 클래스명, 패키지명 틀린 경우 => 스프링에서 주로 사용하는 기술 (리플렉션)
 * 
 *  A a = new A();
 *  Class.forName('a');
 *  	- InterriptedException : 쓰레드 (한 개의 프로세스 안에서 여러 개의 프로그램을 동시에 사용) => 충돌과 관련 
 * 		
 * 
 * => 예외처리는 필수 : 정상상태를 유지 : 견고한 프로그램
 *
 * 		
 *	2) UncheckedException : : 예외처리는 필요한 경우에만 사용
 *				ㅣ
 *		RuntimeException : 실행시 (인터프리터) => 사용자 입력, 프래그림 실수
 *				ㅣ
 *		NumberFormatException : 정수 변환에서 에러
 *			=> Wrapper : 기본형을 사용하기 쉽게 클래스형으로 제작
 *						boolean -> Booleab
 *						int -> Integers
 *			Interger.parseInt(" 10") => 윈도우/웹 (문자열만 사용)
 *				웹에서 전송된 데이터를 받는 경우
 *				String gerParamete() =>정수
 *				Jsoup : 데이터 수집 (String)
 *		ArrayIndexOutOfBoundsException : 배열범위 초과
 *		ArithmeeticExcption : 0으로 나눌 경우
 *		NullPointException : 객체나 배열에 주소가 없는 경우
 *		ClassCastException : 클래스의 형변환이 잘못된 경우
 *			class A
 *			class B extends A
 *			B new = A(); > 오류
 *			B b = (B)new A(); > 오류
 *			A a = new B(); > 맞음
 *			B b = (B)A; > 맞음
 *
 *
 *	예외처리의 기본
 *	try catch ~
 *		형식)
 *		try {
 *			정상수행이 가능한 코딩 => 지금까지 소스가 들어간다
 *		{ catch (예외처리 종류 설정) {
 *			수행과정에서 오류 발생시 처리되는 부분
 *		} 
 *
 *		
 *		소스 전체 처리 : 종류
 *		부분 처리 : 
 *
 * 
 * 
 * 
 * 
 */
public class 예외처리_예외복구_1 {

	public static void main(String[] args) {
		
		
			for(int i = 1; i <= 10; i++) {
				
				try {
					
				int j = (int)(Math.random()*3);
				int k = i/j;
				System.out.println("i = "+i+"k = "+k);
				
			} catch (Exception e) {
				
				System.out.println("0으로 나눌 수 없다");
			}
		
			
		}
		
		
		

	}

}

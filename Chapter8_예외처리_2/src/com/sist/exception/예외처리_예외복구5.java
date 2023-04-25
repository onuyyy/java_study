package com.sist.exception;
/*
 * finally => 생략이 가능
 * 		   = try나 catch를 수행하든 상관없이 무조건 수행되는 문장
 * 파일 닫기, 오라클 연결 해제, 서버 연결 해제 => 오라클 연결, 네트워크 연결
 * 
 * 	try {
 * 
 * 		정상 수행이 가능한 문장
 * 			=> 에러가 난다면 (예상하지 못한 에러가 발생할 수 있다고 예측)
 * 
 * 	} catch (예상되는 예외 클래스) {
 * 		
 * 		에러가 발생시에 처리
 * 			= 에러를 확인
 * 			= 복구를 할 수도 있다 => 오류 메시지를 전송도 가능
 * 
 * } finally {
 * 
 * 		무조건 수행하는 문장을 코딩
 * 	
 * }
 * 
 * 
 * 
 * 실행순서
 * 	문장1
 * 	문장2
 * 	try {
 * 		문장3
 * 		문장4
 * 		문장5
 * 	} catch (예외처리 클래스1) {
 * 		문장6
 * 	} catch (예외처리 클래스2) {
 * 		문장7
 *	} catch (예외처리 클래스3) {
 * 		문장8
 * 	} finally {					>> 에러가 나든 안 나든 무조건 수행
 *  	문장9
 * 	}
 * 		문장10
 * 		문장11
 * 
 * 1.try가 정상 수행했을 때
 * 		1-2-3-4-5-9-10-11
 * 2. try 문장4에서 오류 발생했을 때 (에러 클래스1)
 * 		1-2-3-6-9-10-11
 * 3. try 문장4에서 오류 발생했을 때 (에러 클래스2)
 * 		1-2-3-7-8-9-10-11
 * 4. try 문장4에서 오류 발생했을 때 (에러 클래스3)
 * 		1-2-3-8-9-10-11
 * => 목적 에러시에 제외를 하고 나머지 문장을 수행
 * 
 * 
 * 
 * ** 멀티 예외처리
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class 예외처리_예외복구5 {

	public static void main(String[] args) {
		
		try {
		int[] arr = new int[2];
		arr[0] = 10;
		arr[1] = 0;
		System.out.println(arr[0]/arr[1]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {		// or 기호 | 하나만 적는다,		멀티블록이라고 부른다
			System.out.println("에러 발생");
		}
			System.out.println("프로그램 종료");
	}

}

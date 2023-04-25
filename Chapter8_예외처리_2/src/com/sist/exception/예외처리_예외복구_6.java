package com.sist.exception;
/*
 * 예외 발생시 메세지 확인하는 방법 => 자바에서 지원
 * 
 * 1. getMessage()		: 에러에 대한 메세지만 전송
 * 		=> 에러에 대한 숙달이 필요
 * 2. prinsStackTrace()	: 실행하는 과정 중 어디서 에러가 났는지 확인
 */
public class 예외처리_예외복구_6 {

	public static void main(String[] args) {
		
		try {
			
			int[] arr = new int[100];
			arr[100] = 100;
			System.out.println(arr[100]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e.getMessage());
//			e.printStackTrace();
		
		}
		
	}

}

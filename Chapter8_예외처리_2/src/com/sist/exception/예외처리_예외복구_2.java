package com.sist.exception;
/*
 * ** 예외를 수정하는 것이 아니다 => 에러 발생한 소스를 건너뛰는 것
 * 
 * 형식
 * 	try {
 * 		문장1
 * 		문장2
 * 		문장3
 * 	} catch (예외처리 종류) {
 * 		문장4
 * 	}
 * 		문장5
 * 		문장6
 * 			==> 문장1 > 문장2 > 문장3 > 문장5 > 문장6
 * 				** 문장4는 에러가 발생했을 떄 실행
 * 
 * ex)
 *  * 	try {
 * 		문장1
 * 		문장2			>> 에러 발생 >> catch로 이동
 * 		문장3
 * 	} catch (예외처리 종류) {
 * 		문장4
 * 	}
 * 		문장5
 * 		문장6
 * 			==> 문장1 > 문장4 > 문장5 > 문장6
 * 
 * 	>> try 안에서 에러 발생시에 이러난 위치부터 try 끝까지는 수생하지 않는다 > catch로 이동하기 때문에 catch 문장 수행
 * 
 * 
 * 
 * 
 * 
 * 
 */


public class 예외처리_예외복구_2 {

	public static void main(String[] args) {
		
//		System.out.println("문장1");
//		System.out.println("문장2");
//		System.out.println("문장3 (에러 발생) : "+(10/0));	// 비정상 종료, 밑에 문장 수행 불가
//		System.out.println("문장4");
//		System.out.println("문장5");
		
		System.out.println("문장1");
		System.out.println("문장2");
		
		try {
			System.out.println("문장3");
			System.out.println("문장4");
			int[] arr = new int[2];
			arr[2] = 100;
			System.out.println("문장5"+arr[2]);	// 에러 발생, 비정상 종료
			System.out.println("문장5");
		} catch (ArrayIndexOutOfBoundsException e) {	// 배열 범위 초과 에러
			System.out.println("문장6 : 에러 처리 완료");
		}
		
		System.out.println("문장7");
		System.out.println("프로그램 종료");
	}
	
}

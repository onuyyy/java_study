package com.sist.exception;
/*
 * 에러 => 컴파일 (javac) / 실행시 (java)
 * 		  ------------   -----------
 * 			 Check		   UnCheck
 * 			
 * 		Check : 반드시 예외처리 (자바문법)
 * 		UnCheck : 생략
 * 
 * 에러
 * 		= 수정이 불가능한 에러 (심각한 오류) : 메모리 부족, 윈도우 덤프
 * 		= 수정이 가능한 에러 (가벼운 오류) : 소스상에서 수정이 가능 >> 프로그래머가 고칠 수 있음
 * 															==> Exception (예외처리)
 * 
 *  에러 발생
 * 		1) 프로그래머의 실수
 * 			초기화 값이 없는 상태에서 비교
 * 			배열 인덱스 오류
 * 			무한 루프
 * 			파일명 오류 ...
 * 		2) 사용자의 입력 실수
 * 			계산기 나누기 => 0
 * 			정수인데 문자열로 입력 ...
 * 						==> 웹에서 유효성 검사
 * 
 * 예외처리 목적 : 견고한 프로그램을 만들기 위해 사용
 * 				>> 비정상을 방지하고 정상 상태를 유지
 * 				>> 사전에 에러를 방지한다
 * 
 * 1. 예외처리 방식
 * 	1) 고려할 점 : if문으로 해보고 안 되면 > 예외처리
 * 	2) 예외처리 : 복잡한 에러 or if문으로 해결할 수 없을 때
 * 		=> 웹 : 404, 500, 415, 400, 403 에러 발생 ...
 * 				404 : 파일이 없는 경우
 * 				500 : 자바 컴파일시 오류
 * 				415 : 한글 변환
 * 				403 : 접속 거부
 * 
 * 2. 예외처리 종류
 * 	1) 예외 발생시 => 복구?
 * 		try ~ catch > 실행하다 오류나면 잡아서 처리하겠다
 * 			형식)
 * 				try {
 * 					정상 수행하는 문장
 * 					int a = 10;
 * 					int b = 0;
 * 					double d = a/(double)b;		>> 오류 발생하는 구간 ==> catch로 이동한다
 * 					sout(d);					>> 여기는 수행을 못하는 구간, 오류 발생한 곳에서 동작이 멈춘다
 * 				} catch(Exception e) {			>> Exception e : 모든 오류를 다루는 것
 * 					예외 발생시 처리하는 영역
 * 				}
 * 					** 예외 발생시 catch 안에서 처리하고 catch 밑에 영역을 수행	

 * 
 *   사용자로부터 문자열을 받아서 정수로 변경한 후에 배열에 저장 > 나누기를 한 후에 출력
 * 			---------------------	   --------	  -----------------
 * 				예상 오류 구간 1		예상 오류 구간 2   예상 오류 구간 3
 * 
 * 
 * 	2) 예외 발생시 => 회피?
 * 		throws
 * 	3) 예외 발생 => 테스트
 * 		throw		
 * 	4) 사용자 정의 예외
 * 		지원하지 않는 예외가 존재
 * 
 * 3. 예외처리 계층구조
 * 			Object
 * 			  ㅣ
 * 		  Throwable
 * 			  ㅣ
 * 		--------------
 * 		ㅣ			 ㅣ
 * 	  Error		 Exception
 * 					 ㅣ
 * 			--------------------------------
 * 			ㅣ							   ㅣ
 * 	  CheckException    		  UnCheckException(필요시에만)		>> 둘 다 존재 X
 * 			ㅣ							   ㅣ
 * 		IOException     			 RuntimeException
 *	   SQLException						   ㅣ
 * 	ClassNotFoundException		  NumberFormatException 
 * 
 * IOException : 입출력
 * 	(java.io)
 * SQLException : 오라클 연동
 * 	(java.sql)
 * ClassNotFoundException : 클래스명이 틀린 경우
 * MalformedURLException : url 주소가 틀린 경우
 * NumberFormatException : 문자열 => 정수형으로 변경할 때
 * NullPointerException : 객체 초기화가 안된 상태, 참조할 주소가 없는 경우
 * ArrayIndexOutOfBoundsException : 배열 범위 초과시 발생
 * ArithmeticException : 0으로 나눌 경우
 * ClassCastException : class의 형변환이 틀린 경우
 * IllegalArgumentException : 부적절한 인자 전달
 * 
 * 
 * 
 * 	>> 각각 한 개의 오류밖에 못 잡음 :  Exception 이걸 쓰면 전체 다 잡을 수 있음
 * 
 * 
 * 
 * 
 * 예외 의미 : 프로그램에서 돌발적으로 문제가 발생시 처리를 어떻게 할지
 * 			>> 프로그램은 에러시에 비정상으로 종료
 * 				정상적으로 종료가 가능하게 만드는 과정
 * 
 * 
 * 
 *  
 * 
 */


class BBBBB{
	
}

class CCCCC extends BBBBB {
	
	public void disp(int a, int b, int c) {
		System.out.println("1");
	}
	public void disp(int a, int b, byte c) {
		System.out.println("2");
	}
	public void disp(int a, char b, int c) {
		System.out.println("3");
	}
	
}



public class 예외처리_1 {

	static String s;
	static A a;
	
	public static void main(String[] args) {
		
//		String ss = "Hello Java";
//		System.out.println(ss.substring(ss.indexOf("K"),ss.lastIndexOf("J")));		// StringIndexOutOfBoundsException
		
		
		CCCCC cc = new CCCCC();
		cc.disp('A', 10, 'B');
		System.out.printf("%d %c %s\n",10,20,"30");
		
		
//		CCCCC cc = (CCCCC) new BBBBB();		//	ClassCastException (형변환 오류)

		
		System.out.println(10/0);	//	ArithmeticException (나누기 0 오류)
		System.out.println("1");
		
		
		int[] arr = new int[2];
		arr[2] = 10;				//  ArrayIndexOutOfBoundsException (배열 범위 초과 오류)
		System.out.println("2");
		
	
		if(s.equals("Hello")) {
			System.out.println("ok");		// 오류 발생 NullPointerException => s가 선언만 되고 주소가 배정이 안 됐는데 불러와서 오류 남
		}
		
		
		System.out.println("3");
		int a = 10;
		int b = 0;
		
		if(b!=0) {			// 정상수행 try
			
		int c = a/b;
		System.out.println(c);
			
		} else {			// 예외처리 catch
			System.out.println("error");	
		}

		
//		String s = " 1";	// 공백있어서 오류 발생 NumberFormatException
//		System.out.println(Integer.parseInt(s));
//		
		
	}

}


/*
 * 1. 정상적으로 종료가 되게 만든다
 * 2. 우선적으로 if문 처리가 가능한지 여부 확인 => 자바에서 제공하는 예외처리 이용
 * 3. if문은 주로 사용하는 게 ==> 검색용, 사용자 입력 제한
 */





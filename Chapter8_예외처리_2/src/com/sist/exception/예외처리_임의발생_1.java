package com.sist.exception;

public class 예외처리_임의발생_1 {
	
	
// 방법 1 try catch로 직접 잡기
//	public static void main(String[] args) {
//		
//		try {
//		Thread.sleep(10);
//		
//		} catch (Exception e) {
//			
//		}
//		
//	}
//
//}



/*
 *  InterruptedException < Exception < THrowable
 */


// 방법 2 컴퓨터가 처리하게끔 throws 하기
//public static void main(String[] args) throws InterruptedException {
//	
//
//	Thread.sleep(10);
//	
//			
//	}
//	
//}
	
	
	
	
	/*
	 * 임의발생 : 테스트 목정
	 * ------------------ 배포전 (배포 : 상용화)
	 * 
	 *  형식) 
	 *  	throw new 예외처리생성자()
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	public static void main(String[] args) {

		
		try {
		int a = 10;
		if(a%2==0) {
			
			System.out.println("입의로 예외 발생");
//			throw new NumberFormatException("정수 변환이 어렵다");
			
			// throw => 사용자 정의 예외처리
			// ==> catch로 이동 -> 소스코딩을 할 수 없다
			// getMessage 변경 => 생성자 매개변수 이용
			/*
			 * class NumberFormatException extends Exception {
			 * 		private String message = "default 문자열";
			 * 		public NumberFormatException() {
			 * 		}
			 * }
			 * public NumberFormatException (String message) {
			 * 		this.message = message;
			 * }
			 * 		getter/setter
			 * }
			 */
			
			Integer.parseInt(" 10");
			
		}
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
			// 에러 확인 => 에러 부분을 수정
			
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException : " +e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e ) {
			System.out.println(e.getMessage());
		}
	}
	
}
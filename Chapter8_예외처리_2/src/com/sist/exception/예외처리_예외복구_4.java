package com.sist.exception;
/*
 * 배열에 데이터를 저장			=> 배열 범위
 * 나누기						=> 0으로 나누기
 * 기타 예외일 때 어떻게 처리할까?	=> 통합		==> RuntimeException
 * 
 * 
 * 
 * 
 */
public class 예외처리_예외복구_4 {

	public static void main(String[] args) {
		
		try {
			 
			int[] arr = new int[2];
			arr[0] = 10;
			arr[1] = 2;
			
			System.out.println(arr[0]/arr[1]);
		
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 초과");
		} catch (ArithmeticException e) {				
			System.out.println("0으로 나눌 수 없다");
		} catch (RuntimeException e ) {					//	>> RuntimeException이 계충구조가 더 높아서 밑에 두 개의 에러들을 다 잡아들여서 필요없음 
			System.out.println("예측 못한 에러");			//					   => 계층구조가 높은 것이 맨 잍으로 와야 나머지 오류를 잡아줄 수 있음
		}

		System.out.println("프로그램 종료");
	}

}
 
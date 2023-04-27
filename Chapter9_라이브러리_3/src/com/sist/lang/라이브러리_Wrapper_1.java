package com.sist.lang;
/*
 * Wrapper : 전체를 감싼다
 * 			= CSS (container)
 * 프로그램 개발 =? 기본형 데이터형을 객체 단위로 저장할 때
 * 
 * List<int> => 오류
 * 		---- 클래스형
 * List<Integer>
 * 		=> 기본형을 클래스화 해서 사용
 * 		   ------------ Wrapper
 * 
 * 기본형			클래스형		=> 기본형에 기능을 추가해서 클래스화 시킨 것 (Wrapper)
 * int			Integer
 * long			Long
 * byte			Byte
 * double		Double
 * boolean		Boolean
 * 
 * String score = (String) 4.3;	=> 형변환 불가
 * double score = (double) "4.3";	=> 오류 
 * 
 * 
 * 
 * 
 */
public class 라이브러리_Wrapper_1 {

	public static void main(String[] args) {
		
		String s = "4.3";
//		double d = (double)s;	// 문자열은 숫자로 바꿀 수 없다
		
		double d = Double.parseDouble(s);
		System.out.println(d+4.2);
		// 문자열을 원하는 데이터형으로 변경할 때 주로 사용
		//	==> 모든 데이터형이 문자열 => 기본형 데이터형으로 바꿔줌
		// 클래스명 : 객체 단위로 저장해야 하기 때문에 외워야 함
		// 문자열 : 해당 데이터형으로 변환할 때 parseXxxx => static
		
		
		/*
		 * 오토박싱 / 언박싱
		 * 
		 * 오토박싱
		 * 	Integer i = new Integer(10);
		 *  Integer i = 10;
		 * 	클래스에 해당 데이터값을 설정
		 * 	int aa = i;
		 * 	기본형에 클래스 객체를 설정		
		 * 
		 */
		
		Integer i = 100;
		System.out.println(i);
		int aa = i;
		System.out.println("aa = "+aa);
		
		
		
//		void display(Integer i1, Integer i2);
//		=> display(10, 20)
		/*
		 *  Wrapper 클래스
		 *  1. 문자열을 해당 데이터형으로 변환	(기본형 => 기능부여)
		 *  	문자열 => 정수형 integer.parseInt("10")
		 *  	문자열 => 실수형 Double.parseDouble("4.5")
		 *  	문자열 => 논리형 Boolean.parseBoolean("true")
		 *  2. 객체단위로 저장할 때가 있다 (자료구조 => Collection)
		 */
		
		
		
		
		
		
	}

}

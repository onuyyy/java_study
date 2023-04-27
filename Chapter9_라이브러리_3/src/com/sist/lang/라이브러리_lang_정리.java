package com.sist.lang;
/*
 * 
 * java.lang => 기본 (가장 많이 사용되는 클래스의 집합)
 * 			 => import 생략 가능
 * 		Object	     : 최상위 클래스
 * 						=> 데이터형으로 사용 (가장 큰 데이터형)
 * 							=> Object o = 10;, o = true, o = "", ...
 * 						=> 라이브러리에서 제공하는 메소드는
 * 							리턴형 / 매개변수 => 대부분 object
 * 							=> 형변환
 * 								기본형 = 클래스
 * 								클래스 = 기본형값
 * 						=> 기능
 * 							1) clone :  복제
 * 							2) toString : 객체를 문자열화 
 * 							3) finalize : 소멸자
 * 							4) equals : 객체 비교 (기본 => 주소값, 실제 값을 비교할 때는 오버라이딩을 시켜야 함)
 * 		String
 * 		StringBuffer : append() 문자열 결합
 * 		Wrapper		 : 기본 데이터형을 클래스화 시킨 것
 * 						=> 클래스집합
 * 						=> int long double boolean
 * 													==> 기본형을 객체형으로 저장, 문자열을 기본형으로 변환
 * 						=> 정수 변경 : Integer.parseInt()
 * 						   실수 변경 : Double.parseDouble()
 * 						   논리 변경 : Boolean.parseBoolean()
 * 		Math		 : 수학
 * 						=> random() : 난수 발생 (0.0~0.99)
 * 						=> ceil() 	: 올림 메소드
 * 						=> round() 	: 반올림메소드 => 평균, 통계
 * 		System		 => System.currentTimeMillis() : 실제 시간을 => long
 * 					 	로그파일 => 웹
 * 					 => System.gc() : 가비지 컬렉션 호출 (메모리 회수)
 * 					 => System.out : 화면 출력 (outputStream)
 * 					 => System.in  : 키보드 입력값, 파일 (inputStream)
 * 		String		 : 문자열 저장 클래스
 * 					 => 기능
 * 						length()
 * 						substring()
 * 						trim()
 * 						charAt()
 * 						replace()
 * 						equals()
 * 						startsWith()
 * 						contains()
 * 						indexOf()
 * 						lastIndexOf()
 * 						valueOf()
 * 
 * 
 * 
 * 
 * 
 */

import java.util.*;



public class 라이브러리_lang_정리 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();		// <String> 리턴형과 매개변수를 String형으로 바꿈
		list.add("aaa");

		String a = (String)list.get(0);
		
		Integer aa = 10;
		System.out.println(aa);
		
	}

}

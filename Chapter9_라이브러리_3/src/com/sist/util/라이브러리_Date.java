package com.sist.util;
/*
 * 
 * Date : java.util
 * 	1) 시스템의 현재 시간/날짜를 읽어오는 클래스
 * 	2) Date 클래스의 단점 => 기능이 빈약하다
 * 							=> 날짜만 저장하는 클래스 (오라클의 데이터형과 호환이 가능)
 * 					   => 단점을 보완 : Calendar
 * 	3) Date => SimpleDateFormat => java.text
 * 			   ---------------- 원하는 스타일로 날짜 변경
 * 	4) 사용처 : 웹 (등록일), 
 * 
 * 
 */





import java.text.SimpleDateFormat;
import java.util.*;
public class 라이브러리_Date {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss뿡");
		System.out.println(sdf.format(date));
		
		
		/*
		 * 년도 : yyyy(2023), yyy(023), 
		 * 월 : MM(01), M(1)
		 * 일 : dd(01), d(1)
		 * 시간 : hh(01), h(1)
		 * 분 : mm(01), m(1)
		 * 초 : ss(01), s(1)
		 * 
		 * Date => 호환, 날짜만 저장하는 기능 (오라클) => DATE
		 * 
		 * 
		 */
		
		
		
		
	}

}

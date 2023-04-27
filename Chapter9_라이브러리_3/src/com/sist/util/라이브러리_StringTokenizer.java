package com.sist.util;
import java.util.*;
/*
 * 
 * StringTokenizer : 문자열 분리
 * 1) split() => 대체
 * 2) 빅데이터 / 네트워크 / 웹
 * 
 * 기능
 * 	= 생성자
 * 		String s1 = "애니메이션/어드벤처/코미디";		(구분 문자 있음)
 * 		String s2 = "박서준  아이유  김종수  고창석  정승길  이현우  양현민  홍완표  허준석  이하늬";		(구분 문자 없음)
 * 
 * 		StringTokenizer st = new StringTokenizer(s1, "/")
 * 		StringTokenizer st = new StringTokenizer(s2)
 * 
 * 
 * 		StringTokenizer st = new StringTokenizer("구분할 문자열", 구분자)
 * 		StringTokenizer st = new StringTokenizer("구분할 문자열")		==> 구분자가 없을 경우 공백 별로 자른다
 * 
 *  = 기능
 *  	1) countTokens() : 분리된 데이터 개수
 *  	2) nextToken()	 : 분리된 데이터 읽기
 *  	3) hasMoreTokens() : 분리 개수만큼 루프 수행
 * 
 */
public class 라이브러리_StringTokenizer {

	public static void main(String[] args) {
		
//			String s1 = "애니메이션/어드벤처/코미디";	
//			StringTokenizer st = new StringTokenizer(s1, "/");
//			System.out.println(st.countTokens());
//			System.out.println(st.nextToken());		// 자른 데이터들을 순서대로 가져온다
//			System.out.println(st.nextToken());
//			System.out.println(st.nextToken());
			
			
			String s2 = "박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "+
					"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "+
					"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "+
					"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "+
					"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "+
					"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "+
					"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "+
					"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "+
					"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 ";
			
			StringTokenizer st3 = new StringTokenizer(s2);
			while(st3.hasMoreTokens()) {
				System.out.println(st3.nextToken());
			}
			
			
			
//			StringTokenizer st2 = new StringTokenizer(s2);
//			System.out.println(st2.countTokens());
//			
//			int a = st2.countTokens();		// countToken은 변수에 저장하고 써야 한다
//			for(int i = 0; i < a; i++) {
//				System.out.println(st2.nextToken());
//			}
			

			
	}

}

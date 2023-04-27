package com.sist.util;

import java.util.StringTokenizer;

/*
 * 네트워크
 * 
 * String s = "red|green|blue|black|yellow";
 * 			=> 자르는 방법 : split, StringTokenizer
 * 				=> StringTokenizer st = new StringTokenizer(s,"|")
 * 					=> 
 * 
 * 				=> String[] colors = s.split("\\|")
 * 					=> 원형 : split(String regex)
 * 
 * 
 * 		hasMoreTokens
 * 		1) cursor
 * 		->	before First
 * 			red		=> nextToken()
 * 			green	=> nextToken()
 * 			blue	=> nextToken()
 * 			black	=> nextToken()
 * 			yellow	=> nextToken()
 * 			after Last => nextToken() => false (읽기 종료)
 * 
 * 		** 개수가 초과되면 오류가 난다
 * 
 * 
 * 
 * 
 */
public class 라이브러리_StringTokenizer_2 {

	public static void main(String[] args) {
		
		String s = "red|green";
		StringTokenizer st = new StringTokenizer(s,"|");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());		// 데이터는 두 갠데 세 번 읽어서 오류가 발생한다, nextToken은 하나씩 가져옴
		
		while (st.hasMoreTokens()) {			// 커서가 위치한 곳에 초큰이 있으면 true, 없으면 false를 리턴한다 hasMoreTokens
			System.out.println(st.nextToken());
		}

		
	
		}

}

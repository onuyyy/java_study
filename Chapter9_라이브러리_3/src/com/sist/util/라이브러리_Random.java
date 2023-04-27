package com.sist.util;
/*
 * java.util ==> 프로그램 개발시 유용하게 사용할 수 있는 클래스의 집합
 * 			 ==> 반드시 import를 사용한다 (import java.util.*)
 * 			 ==> java.lang , java.util , java.io , java.net , java.text
 * 
 * 				java.util
 * 				1) Random : 난수 발생
 * 				2) Date/Calendar : 날짜, 시간
 * 				3) StringTokenizer : 문자 분리 (split)
 * 				4) Collection - List, Set, Map
 * 								List : 순서가 존재, 데이터 중복을 허용 => 데이터베이스				>> ArrayList 
 * 								Set : 순서가 없다, 데이터 중복을 허용하지 않는다 => 장르...			>> HashSet
 * 								Map : 순서가 없다, 저장시에 키, 값 => 동시에 저장 => 클래스 관리	>> HashMap
 * 
 * 	Arrays => 배열을 제어하는 기능
 * 		   => 배열 데이터 출력 toString()
 * 		   => sort : 정렬
 * 		   => Arrays.asList() => 배열을 ArrayList로 변경
 * 
 * 	Random => nextInt() => int 범위
 * 			  nextInt(5) => 0 ~ 4
 * 			  nextInt(101) => 0 ~ 100
 * 			  nextInt(100)+1 => 1 ~ 100
 * 
 * 
 * 
 * 
 */

import java.util.*;
public class 라이브러리_Random {

	public static void main(String[] args) {
		
//		Random r = new Random();
//		int a = r.nextInt(100)+1;
//		
//		System.out.println(a);
		
		int[] numbers = new int[10];
		Random r = new Random();
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(100)+1;
		}
		
		System.out.println("================================= 정렬 전");
		System.out.println(Arrays.toString(numbers));
		System.out.println("================================= 정렬 후(ASC)");		// 올림차순
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println("================================= 정렬 후(DESC)");	// 내림차순
		for(int i = numbers.length-1; i >= 0; i--) {
			System.out.print(numbers[i]+" ");
		}
		

	}

}

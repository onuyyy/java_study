package com.sist.util;
import java.util.*;
/*
 * 
 * subList(int start, int end) => index 번호가 start부터 end까지 부분적으로 데이터 복사
 * 								  					  ---- (end - 1)
 * ==> 페이지 나누기
 * addAll() => ArrayList가 가지고 있는 모든 데이터를 복사
 * retainAll() => 두 개의 ArrayList에서 같은 값을 가지고 있는 데이터 복사
 * Collections.sort() => ArrayList 정렬
 * 
 * 
 * 
 * 
 * 
 */
public class 라이브러리_List_3 {

	public static void main(String[] args) {
		
		ArrayList names1 = new ArrayList();
		names1.add("홍길동");
		names1.add("심청이");
		names1.add("이순신");
		names1.add("강감찬");
		names1.add("춘향이");
		
		ArrayList names2 = new ArrayList();
		names2.add("홍길");
		names2.add("심청이");
		names2.add("이순");
		names2.add("강감");
		names2.add("춘향");
		
		System.out.println("=================== names1 : 변경 전");
		for(Object i:names1) {		
			
			System.out.println(i); 		
			
		}
		

		names1.retainAll(names2);		// names1번만 바꿔라, names2번은 변경되지 않음
		

		
		System.out.println("=================== names1 : 변경 후");
		for(Object i:names1) {			// 중복된 값만 추출
			
			System.out.println(i); 		
			
		}

		System.out.println("=================== names2");
		for(Object i:names2) {			// 중복된 값만 추출
			
			System.out.println(i); 		
			
		}
		
		System.out.println("===================");
		
		ArrayList temp = new ArrayList();
		temp.addAll(names1);
		temp.retainAll(names2);	// 1과 2의 데이터에 같은 값 찾아 names1에 저장
		
		for(Object name:names1) {			// 중복된 값만 추출
			
			System.out.println(name); 		
			
		}
		
		System.out.println("===================");	
		for(Object i:names2) {			// 중복된 값만 추출
			
			System.out.println(i); 		
			
		}
		
		
		
		
	}

}

package com.sist.util;

import java.util.ArrayList;
import java.util.Collections;

// List의 메소드
/*
 * add, remove, set, size, clear	=> 기본 메소드
 * 
 * containsAll()	=> 두 개의 list에서 중복된 데이터를 모아서 관리
 * 					=> JOIN
 * retainAll		=> 두 개의 list에서 중본된 데이터만 남기기
 * addAll			=> 데이터 전체를 복사할 때 사용
 * subList			=> 부분적인 복사
 * 
 * 
 * 
 */



public class 라이브러리_List_2 {

	public static void main(String[] args) {
		
	
		ArrayList list = new ArrayList();
		list.add(3);	// 0
		list.add(5);	// 1
		list.add(7);	// 2
		list.add(6);	// 3
		list.add(9);	// 4
		list.add(2);	// 5
		list.add(1);	// 6
		list.add(4);	// 7
		
		// 출력
		for(Object i:list) {
			
			System.out.println(i); 		// 왜 to.String이 없지?
			
		}

		// 일부만 추가 subList(start, end)
		ArrayList list2 = new ArrayList(list.subList(1, 4));
		list2.add(10);
		list2.add(11);
		list2.add(12);
		
		
		System.out.println("===================== 111");
		
		for(Object i:list2) {
			System.out.println(i);
		}
		
		
		System.out.println("===================== 222 ");
		
		// sort
		Collections.sort(list);									// 정렬하기
		
		for(Object i:list) {
			
			System.out.println(i); 		
			
		}
		
		
		System.out.println("===================== 333");
		
		// 같은 데이터가 있는지 확인
		System.out.println(list.containsAll(list2));			// 데이터가 전부 같냐?
		
		for(Object i:list) {
			
			System.out.println(i); 		
			
		}
		
		
		System.out.println("===================== 444");
		System.out.println(list.retainAll(list2));				// 중복된 데이터만 추출
		
		for(Object i:list) {
			
			System.out.println(i); 		
			
		}
		
		System.out.println("===================== 555");		// 데이터 복사	
		
		ArrayList list3 = new ArrayList();
		list3.addAll(list);
		
		
		for(Object i:list3) {
			
			System.out.println(i); 		
			
		}
		
		
		
		
		
		
		
	}

}

package com.sist.util;
import java.util.*;
/*
 * 
 * Calendar : Date 클래스를 보완해서 새롭게 만든 클래스
 * 	1) 생성 방법 
 * 		Calendar cal = Calendar.getInstance();
 * 		==> new를 사용하지 않으면 추상클래스다
 * 		==> Calendar는 추상클래스
 * 	2) 날짜 설정 방법 => set()
 * 	3) 날짜를 읽어올 때 => get()
 * 	4) 각 달의 마지막 날 => getActualMaximum()
 * 	5) 요일 읽어올 때 => get()
 * 
 * 
 */
public class 라이브러리_Calendar_1 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();		// abstract
		// 위 코딩은 오늘 날짜를 가져온다
		// 필요한 경우에는 오버라이딩하여 사용한다
		// new를 사용하지 않는 경우 => 추상클래스, 인터페이스
		/*
		 * 기능을 가지고 있다 => 추상클래스 (구현된 메소드와 구현이 안된 메소드를 가지고 있다)
		 * 기능을 가지고 있지 않다 => 인터페이스 (구현이 안된 메소드만 가지고 있다)
		 * List list = new ArrayList() => 인터페이스
		 */
		
		System.out.println("년도 : "+cal.get(Calendar.YEAR));
//		System.out.println("년도 : "+cal.get(1));		위와 동일 값 출력
		
		System.out.println("월 : "+(cal.get(Calendar.MONTH)+1));
		// MONTH는 0번부터 시작 +1 해줘야함 (0~11)
		
		System.out.println("일 : "+cal.get(Calendar.DATE));
		System.out.println("시간 : "+cal.get(Calendar.HOUR));
		System.out.println("분 : "+cal.get(Calendar.MINUTE));
		System.out.println("초 : "+cal.get(Calendar.SECOND));
		
		System.out.println("이번 달 마지막 날 : "+cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		String[] week = {"","일","월","화","수","목","금","토"};
		// week => 1 ~ 7 (1부터 시작하기떄문에 앞자리는 비워둬야 한다)
		
		System.out.println("요일 : "+week[cal.get(Calendar.DAY_OF_WEEK)]);
		
		
		

	}

}

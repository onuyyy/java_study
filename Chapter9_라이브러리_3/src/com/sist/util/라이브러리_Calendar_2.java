package com.sist.util;
/*
 * 
 * Date를 Calendar로 변경하여 처리하는 연습 필요
 * 
 * 
 */

import java.util.*;
public class 라이브러리_Calendar_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("년도를 입력해라");
		int year = scan.nextInt();
		System.out.print("월 입력해라");
		int month = scan.nextInt();
		System.out.print("일 입력해라");
		int day = scan.nextInt();

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);			// 날짜를 바꾸는 행위
		cal.set(Calendar.MONTH, month-1);		// MONTH는 0번부터 시작 설정시 -1 해줘야함 (0~11)
		cal.set(Calendar.DATE, day);
		
		System.out.println("===== 설정된 날짜 확인 =====");
		System.out.println("년도 : "+cal.get(Calendar.YEAR));
		System.out.println("월 : "+cal.get(Calendar.MONTH)+1);	// 값을 가져올 때는 +1
		System.out.println("일 : "+cal.get(Calendar.DATE));
		
		String[] week = {"","일","월","화","수","목","금","토"};
		System.out.println("요일 : "+week[cal.get(Calendar.DAY_OF_WEEK)]);
		
		String[] week2 = {"일","월","화","수","목","금","토"};
		System.out.println("요일 : "+week2[cal.get(Calendar.DAY_OF_WEEK)-1]);
		// week는 배열 첫번째에 공백을 두거나, -1 해줘야 함
		
	}

}

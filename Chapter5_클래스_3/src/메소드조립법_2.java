/*
 * 달력 만들기
 * 	1. 년도, 월	>> 
 * 		
 * 	2.
 */

import java.util.Scanner;
public class 메소드조립법_2 {

	// 입력
	static int input(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.print(msg+" 입력 : ");
		return scan.nextInt();
	}
	
	// 처리 (요일 구하기)
	
	static void getWeek(int year, int month) {
		int total = (year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		int[] lastday = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if((year%4==0 && year%100!=0) || (year%400==0))
			lastday[1] = 29;
		else
			lastday[1] = 28;
		
		// 전달까지의 총날수
		
		for(int i = 0; i < month-1; i++) {
			total+=lastday[i];
		}
		
		// +1
		
		total++;	// 매월 1일자 
		
		// 전체 더하고, %7 => 요일
		// 요일 구하기
		
		int week = total%7;
	}
	
	
	static void print(int month, int week) {
		int[] lastday = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] strWeek = {"일","월","화","수","목","금","토"};
		for(int i = 0; i < strWeek.length; i++) {
			System.out.print(strWeek[i]+"\t");
		}
		
		System.out.println("\n");
		for(int i = 1; i <= lastday[month-1]; i++) {
			if(i==1) {		// 맨 처음 1번 1일자 요일만큼 공백을 출력
				for(int j = 0; j < week; j++) {

				}
				System.out.println("\t");	 
			}
			
			System.out.printf("%2d\t",i);
			week++;
			if(week > 6) {			// 6 = 토, 일 = 0
				week=0;
				System.out.println("\n");
			}
		}
	}
	
	
	static void process() {
		int year = input("년도");
		int month = input("월");
		System.out.println(year+"년도 "+month+"월");
		int week = getWeek(year, month);
		
	}
	
	
	
	public static void main(String[] args) {
		
		process();
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("년도 입력 : ");
//		int year = scan.nextInt();
//		
//		System.out.println("월 입력 :");
//		int month = scan.nextInt();
//		사용자 입력 기능 >> 메소드
//		
//		
//		// 전년도까지의 총 날수
//		
//		int total = (year-1)*365
//				+(year-1)/4
//				-(year-1)/100
//				+(year-1)/400;
//		int[] lastday = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		
//		if((year%4==0 && year%100!=0) || (year%400==0))
//			lastday[1] = 29;
//		else
//			lastday[1] = 28;
//		
//		// 전달까지의 총날수
//		
//		for(int i = 0; i < month-1; i++) {
//			total+=lastday[i];
//		}
//	
//		// +1
//		
//		total++;	// 매월 1일자 
//		
//		// 전체 더하고, %7 => 요일
//		// 요일 구하기
//		
//		int week = total%7;
//		
//		System.out.printf("%2d년도 %d월\n",year, month);
//		String[] strWeek = {"일","월","화","수","목","금","토"};
//		for(int i = 0; i < strWeek.length; i++) {
//			System.out.print(strWeek[i]+"\t");
//		}
//		
//		System.out.println("\n");
//		for(int i = 1; i <= lastday[month-1]; i++) {
//			if(i==1) {		// 맨 처음 1번 1일자 요일만큼 공백을 출력
//				for(int j = 0; j < week; j++) {
//
//				}
//				System.out.println("\t");	 
//			}
//			
//			System.out.printf("%2d\t",i);
//			week++;
//			if(week > 6) {			// 6 = 토, 일 = 0
//				week=0;
//				System.out.println("\n");
//			}
//		}
	
		
		
		
		
		

	}

}

/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;
public class 배열응용_7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("년도 입력 : ");
		int year = scan.nextInt();
		System.out.println("월 입력 : ");
		int month = scan.nextInt();
		
		System.out.println(year+"년 "+month+"월");

		System.out.println("\n");
		
		char[] strweek = {'일','월','화','수','목','금','토'};
		for(char c:strweek) {
			System.out.print(c+"\t");
		}
		
		System.out.println();
		// 1. 1년도 1월 1일부터 ~ 전년도 (2022-12-31)
		int total = (year-1)*365
				+(year-1)/4		// 윤년 조건
				-(year-1)/100	
				+(year-1)/400;
		
		// 2. 전달까지의 날 수 (2023-03-31)
		int[] lastday = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if((year%4==0 && year%100 != 0) || (year%400==0)) 
				lastday[1] = 29;
		else
			lastday[1]=28;
		for(int i = 0; i < month-1; i++) {
			total+=lastday[i];
		}
			
		// 3. +1 => 4월 1일자의 요일 확인 가능
		total++;
		
		// 4. 요일 구하기
		int week = total%7;
		
		// 5. 달력 출력
		for(int i = 1; i <= lastday[month-1]; i++) {
			if(i==1) {
				for(int j = 0; j < week; j++) {
					System.out.println("\t"); 			// 달력에서 4/1 토요일이기때문에 앞자리 공백을 두기 위함
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week > 6) {
				System.out.println();
				week = 0;
			}
		}
			

		
		
		
		
		
	}

}

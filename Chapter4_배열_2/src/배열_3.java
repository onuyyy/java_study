
import java.util.Scanner;
public class 배열_3 {

	public static void main(String[] args) {
		
		/*
		 * 년도 월 일 > 무슨요일?	> calender라는 class 있음
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = scan.nextInt();
		System.out.print("월 입력 : ");
		int month = scan.nextInt();
		System.out.print("일 입력 : ");
		int day = scan.nextInt();
		
		// 요일 : 월~일 똑같으니 배열로 잡음
		char[] strweek = {'일','월','화','수','목','금','토'};
		// 각 달의 마지막 날
		int[] lastday = {31,28,31,30,31,30,31,31,30,31,31,31} ;
		
		if((year%4==0 && year%100!=0) || (year%400==0))
			lastday[1]=29;
		else
			lastday[1]=28;
		
		
		// 1. 1년도 1월 1일 ~ 전 년도까지의 총 날수
		
		int total = (year-1) * 365
				+(year-1) / 4
				-(year-1) / 100
				+(year-1) / 400;
		
		// 2. 전 달까지의 합
		
		for(int i = 0; i < month-1; i++) {
			total+=lastday[i];
		}
		total+=day;
		
		// 3. 요일 구하기
		int week = total%7;
		
		System.out.printf("%d년도 %d월 %d일 %c요일입니다",year,month,day,strweek[week]);
		
		
		
		
		
		

	}

}

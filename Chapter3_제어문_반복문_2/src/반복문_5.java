/*
 * 
 *  가위바위보 게임
 * 	몇전 몇승 몇패
 * 
 * 	컴퓨터	사용자
 * 	가위	0	가위 0	- = 0	same
 * 			바위 1	- = -1	사용자
 * 			보 2		- = -2	컴퓨터
 * 	바위	1	가위 0	- = 1	컴퓨터
 * 			바위 1	- = 0	same
 * 			보 2		- = -1	사용자
 * 	보 2		가위 0	- = 2	사용자
 * 			바위 1	- = 1	컴퓨터
 * 			보	 2	- = 0	same
 * 
 * 	>> 비기는 경우 : 0
 * 	>> 사용자 win : -1, 2
 * 	>> 컴퓨터 win : -2, 1
 * 
 * 
 * 
 */

import java.util.Scanner;
public class 반복문_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int win = 0, lose = 0, same = 0;
		while(true) { // for(;;) >> while문의 무한루프는 true를 넣어주면 된다
			System.out.println("가위 (0), 바위 (1), 보 (2), 종료 (9)");
			// 컴퓨터 난수 발생 필요
			int com = (int)(Math.random()*3); // 0, 1, 2
			int user = scan.nextInt();
			
			if(user==9) {
				System.out.println("game over");
				break;
			}
			
			// 컴퓨터와 사용자의 가위바위보 출력
			if(com==0)
				System.out.println("컴퓨터 : 가위");
			else if(com==1)
				System.out.println("컴퓨터 : 바위");
			else if(com==2)
				System.out.println("컴퓨터 : 보");
			
			if(user==0)
				System.out.println("사용자 : 가위");
			else if(user==1)
				System.out.println("사용자 : 바위");
			else if(user==2)
				System.out.println("사용자 : 보");
			
			switch(com-user) {
			case -1: case 2:
				System.out.println("user win");
				win++;
				break;
			case 1: case -2:
				System.out.println("computer win");
				lose++;
				break;
			case 0:
				System.out.println("same");
				same++;
				break;
			}
			
			
		}	// while문 종료 시점
		System.out.println("==============결과값");
		int total = win+lose+same;
		System.out.printf("%d전 %d승 %d패 %d 무\n", total,win,lose,same);
		
	}
	

}

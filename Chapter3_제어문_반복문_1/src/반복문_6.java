 /*
 * 컴퓨터가 난수를 발생시킨다 (1~100)
 * 	> 사용자 입력
 * 	> 입력시에 힌트 (up or down)
 * 	> for문은 몇 바퀴?
 * 		> 무한루프 : for(;;) 조건 범위 증가식 없는 것  >> while문을 통해 종료시점 정해놓는 것이 좋음
 * 
 */

import java.util.Scanner;
public class 반복문_6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int com = (int)(Math.random()*100)+1;
		int count = 0;
		
		for(;;) { 
		System.out.println("user : ");
		int user = scan.nextInt();
		count++;
		
			if(user <=100 && user >=1) {
				if(user > com) {
					System.out.println("down!");
				} else if(user < com) {
					System.out.println("up!");
				} else if(user==com) {
					System.out.println("same!");
					System.out.println("count : "+count);
				}
			}
			else {
				System.out.println("error!");
				System.exit(0);
			}
	}
	}
	
}

	
		

	




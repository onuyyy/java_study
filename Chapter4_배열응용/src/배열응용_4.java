/*
 * 
 * 숫자 야구 게임
 * 1. 컴퓨터 > 임의의 숫자 발생 (1~9까지 중복없는 난수 발생)\
 * 	 3 6 9
 * 2. 사용자가 숫자를 입력해서 발생된 난수를 맞히는 게임
 * 3. 몾 맞히면 힌트
 *   2 9 6
 *   		> 0S-2B
 *   3 7 8 
 *   		> 1S-0B
 *   3 9 8 
 *   		> 1S-1B
 * 
 */



import java.util.Arrays;
import java.util.Scanner;
public class 배열응용_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] com = new int[3];
		int[] user = new int[3];
		
		for(int i = 0; i < com.length; i++) {
			com[i] = (int)(Math.random()*9)+1;
			for(int j = 0; j < i; j++) {
				if(com[i]==com[j]) {			// 중복 방지하기 위한 부분
					i--;
					break;
				}
			}
		}
		// System.out.println(Arrays.toString(com));
		
		while(true) {
			System.out.print("세자리 정수 입력 : ");
			int input = scan.nextInt();
			if(input < 100 || input > 999) {
				System.out.println("error");
				continue;						// continue는 처음부터 다시 시작
			}
			
			// 세자리 정수를 입력했다면
			user[0] = input/100;		// 369/100 = 3
			user[1] = (input%100)/10;	// 369%100 = 69 > 69/10 = 6
			user[2] = input%10;			// 369%10 = 9
			
			// 1. 같은 정수를 입력하면 안 된다
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				System.out.println("중복된 수는 사용할 수 없습니다");
				continue;
			}			
			
			// 2. 0을 포함할 수 없다
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("0을 사용할 수 없습니다");
				continue;
			}
			
			// 힌트 준비
			int s = 0, b = 0;
			for(int i = 0; i < com.length; i++) {
				for(int j = 0; j < user.length; j++) {
					if(com[i]==user[j]) {
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			// 힌트 제공
			System.out.printf("input : %d,Result:%dS0%dB\n",input,s,b);
		
//			System.out.println("====================");
//			
//			System.out.print("S : ");
//			for(int i = 0; i < s; i++) {
//				System.out.println("●");
//			}
//			System.out.print("\nB : ");
//			for(int i = 0; i < b; i++) {
//				System.out.println("○");
//			}
//			
//			System.out.println("\n====================");
			
			// 종료 시점 > S = 3 일 때 종료
			if(s==3 ) {
				System.out.println("game over");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}

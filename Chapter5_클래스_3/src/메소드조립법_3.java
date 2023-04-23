/*
 *		1. 난수 발생
 *		2. 사용자 입력
 * --------------------------
 *		3. 비교
 *		4. 힌트
 * --------------------------
 *		5. 종료 여부 확인
 */


import java.util.Arrays;
import java.util.Scanner;
public class 메소드조립법_3 {

	

	
	
	public static void main(String[] args) {
		
		int[] com = new int[3];
		int[] user = new int[3];
		for(int i = 0; i < 3; i++) {
			com[i] = (int)(Math.random()*9)+1;		// 1~9
			for(int j = 0; j < i; j++) {
				if(com[i]==com[j]) {
					i--;			
					break;			// 중복 없는 숫자 발생하게끔
				}
			}
		}
		
//		System.out.println(Arrays.toString(com));
		
		Scanner scan = new Scanner(System.in);
		
		// 사용자 입력
		while(true) {
			System.out.print("세자리 정수 입력 : ");
			int input = scan.nextInt();
			// 정상 입력 >> &&
			// 오류 입력 >> ||
			if(input < 100 || input > 999) {
				System.out.println("잘못된 입력입니다");
				// while의 조건식으로 이동 >> 처음부터 다시 시작
				continue;
			}
			
			// 369 
			user[0] = input/100;	//	369/100 = 3
			user[1] = (input%100)/10;	//	(369%100) = 69/10 = 6
			user[2] = input%10;		//	369%10 = 
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				System.out.println("같은 숫자 안 된다");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("0을 입력할 수 없다");
				continue;
			}
			
			// 123 132
			// 비교
			int s = 0, b = 0;
			// s는 같은 자리의 수가 동일, b는 다른 자리에 있는 수가 동일
			
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {		// user
					if(com[i]==user[j]) {		// 같은 수가 있냐?
						if(i==j)	
							s++;		// 같은 자리에 있으면 s 증가
						else
							b++;		// 다른 자리에 있으면 b 증가
					}
				}
			}
			
			// 힌트
			System.out.printf("input : %d, REsult : %dS-%dB\n",input,s,b);
			
			// 종료여부
			if(s==3) {
				System.out.println("game over");
				break;
			}
		}
		
		
		

		
		
		

	}

}

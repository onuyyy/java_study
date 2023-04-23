/*
 * 사용자의 입력을 받아서 구구단 하기
 *  
 */

import java.util.Scanner;
public class 반복문_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단 입력 : ");
		int gugudan =scan.nextInt();
		System.out.println("====="+gugudan+"단=====");
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d*%d=%d\n",gugudan,i,gugudan*i);
		}
		

	}

}

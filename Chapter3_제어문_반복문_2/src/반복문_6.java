/*
 * 
 * do ~ while문 : 후조건이기 때문에, 무조건 1번 이상의 수행이 가능하다
 * 
 *	1. 초기화
 *	2. 게임
 *	3. 형식
 *		초기값			①
 *		do {
 *			반복실행문장	②
 *			증가식		③
 *		} while (조건식);	>> 증가된 변수로 조건 검색
 *		
 * 
 */

import java.util.Scanner;	// util 클래스 안에 들어있는 모든 기능 쓰려면 uti.*; 하면 된다
public class 반복문_6 {

	public static void main(String[] args) {
		
		// 1~10까지 출력
		int i = 1;
		do {
			System.out.print(i+" ");
			i++;	// i값이 2가 된 상태
		} while (i <=10);
		
		
		System.out.println("\n====================");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = scan.nextInt();
		
		int g = 1;	//변수 명을 바꾸든가, i를 초기화 시키든가 해야 함 위에서 i가 10이 되었기 때문에
		do {
			System.out.printf("%5d*%5d=%5d\n",dan,g,dan*g);
			g++;
		} while (g <= 9);
		
		// 2d 2자리수, 5d 5자리수만큼의 자리
	
		
		System.out.println("\n===================="); 
		
		
		
		
		System.out.println("\n====================for");
		
		
		i = 10;
		for(i = 10; i < 10; i++) {
			System.out.println("i = " +i);
		}										// >> 실행 불가 조건 안 맞음
		
		
		
		
		System.out.println("\n====================while");
		
		i =10;
		while(i < 10) {
			System.out.println("i = " +i);
		}										// >> 실행 불가 조건 안 맞음
		
		
		
		
		System.out.println("\n====================do while");
		
		i = 10;
		do {
			System.out.println("i = "+i);
			i++;
		} while (i <10);						// 1번은 무조건 실행
		
		

	}

}

/*
 * 
 * 다중조건문 = 선택문
 * 다중조건문과 스위치문은 유사한 제어문
 * 
 * 1. if ~ else if (다중조건문)
 * 		> 범위가 있는 경우
 * 
 * 2. switch 
 * 		> 한 개가 선택될 경우
 * 		> char int string만 들어올 수 있음
 * 		> case 값 :
 * 		> 종료시에는 break; > 이거 안 쓰면 뒤에 case까지 전부 실행
 * 		> dafault : 생략 가능
 * 		> 여러 개를 같은 문장으로 처리 시에는
 * 			ex) case 10 : case 9 :	처리문장		> 같이 쓰면 된다
 * 				case 10 || case 9 || 와 같음 
 * 
 */

import java.util.Scanner;
public class 선택문_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("계절 날짜 : ");
		int month = scan.nextInt();
		
		switch(month) {
		case 1: case 2: case 12:
			System.out.println("winter");
			break;
		case 3: case 4: case 5:	
			System.out.println("spring");
			break;
		case 6: case 7: case 8:
			System.out.println("summer");
			break;
		case 9: case 10: case 11:
			System.out.println("fall");
		default :
			System.out.println("nothing");
			
			
	
		}
		
		
		
		

	}

}

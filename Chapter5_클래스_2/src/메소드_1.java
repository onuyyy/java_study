/*
 * 
 * 		변수		연산자	제어문		출력
 *  	---		------------		---
 *  	 ㅣ			 ㅣ				 ㅣ
 * 		배열			명련문		Application
 *		클래스		-----		-----------
 *					메소드     	Web Application
 *----------------------------------------------
 *	클래스
 *		1. 메소드
 *			1) 사용자 정의 (우리가 만드는 것)
 *			2) 라이브러리 (암기) => 리턴형 / 매개변수 / 기능
 *				String trim() : 좌우 공백 제거
 *				double random() : 0.0 ~ 0.99 (임의의 수 추출)
 *		2. 변수(멤버) => 프로그램 종료시까지 메모리 유지
 *		3. 생성자
 *		----------------------------------------
 *		객체 지향 프로그램 : 유지 보수 (데이터 보호, 	재사용, 	  수정, 추가)
 *								   캡슐화    상속/포함  오버라이딩/오버로딩
 *		4. 비정상 종료를 방지하는 프로그램 : 견고한 프로그램 => 예외 처리
 *		----------------------------------------------------------- 8장까지 (기본 코딩)
 *		5. 자바에서 지원하는 라이브러리 => 조립식 프로그램
 *		-----------------------------------------------------------
 *		*** 오라클 연결하기 => 웹
 *		*** 브라우저 연결
 *		--------------------- => 오라클 연결 + 브라우저 연결 = Spring
 * 
 * 
 */

//	년도 입력 받아서 윤년 여부 확인
/*
 * 메소드 안에서 출력할지, (void)
 * 결과 값을 받아서 처리할지 (boolean) => 결정
 * ------------------------------------ 리턴형
 * 매개변수 => 년도 입력
 */

import java.util.Scanner;
public class 메소드_1 {
	static void isYear(int year) {						// 자체에서 출력할 때 
		if((year%4==0 && year%100!=0 || (year%400==0)))
			System.out.println(year+"년도는 윤년입니다");
		else 
			System.out.println(year+"년도는 윤년이 아닙니다");
	}
	
	
	static void process() {
		Scanner scan= new Scanner(System.in);
		System.out.println("년도 입력 : ");
		int year = scan.nextInt();
		
		//메소드 호출
		//isYear(year);
		// 호출시에는 실제 데이터 값이 들어가야 함
		boolean bCheck = isYear2(year);
		if(bCheck==true) 
			System.out.println(year+"년도는 윤년입니다");
		else
			System.out.println(year+"년도는 윤년이 아닙니다");
	}
	
	/*
	 * satatic void aaa(int a)
	 * 		=> aaa(10)
	 * 
	 * static int bbb(int a)
	 * 		=> int a = bbb(10)
	 */
	
	
	static boolean isYear2(int year) {
		boolean bCheck = false;
		if((year%4==0 && year%100!=0 || (year%400==0)))
			bCheck = true;
		return bCheck;
	}
	
	
	public static void main(String[] args) {
		
		
		
		process();
		
		
		
		

	}

}

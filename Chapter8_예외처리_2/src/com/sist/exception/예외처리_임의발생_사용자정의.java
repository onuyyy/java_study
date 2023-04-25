package com.sist.exception;
/*
 * 
 * throws : 예상되는 에러를 선언해둔다
 * 			=> 메소드를 사용시에 다른 메소드에서 처리 후에 사용해야 한다
 * 			=> 선언만 할 수 있다 / 처리 후에 사용한다
 * 			=> 다른 메소드로 전가 (라이브러리)
 * 			=> 라이브러리가 보통 선언을 하고 있다
 * 			   -------- 선언(CheckedException만 등록)
 * 				IO / NET / Thread / Web / JDBC => 웹과 관련되어 있다
 * 
 * 	throw : 고의로 예외를 발생시킨다 (테스트용)
 * 
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;
public class 예외처리_임의발생_사용자정의 {

	public static void main(String[] args) {
		
		try {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수 입력 : ");
		int score = scan.nextInt();
		
		if(score < 0) {
			throw new IllegalArgumentException();		// 예외를 발생시키기만 한 것 => 밑에 있는 catch를 부르고 있는 중이다
		}
			System.out.println("score : "+score);
		} catch (IllegalArgumentException e) {
			System.out.println("점수는 음수를 사용할 수 없다");
		}
		
	
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("점수 입력 : ");
//		int score = scan.nextInt();	
//		
//		if(score<0) {
//			System.out.println("점수는 읍수 사용 금지");
//		} else {
//			System.out.println("score : "+score);			// **if문으로 해결할 수 있으면 if문으로 먼저 사용
//		}
		
		
		
	}

}

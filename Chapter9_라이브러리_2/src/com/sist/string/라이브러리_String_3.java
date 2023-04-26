package com.sist.string;
import java.util.*;

/*
 * 
 * String 메소드 (문자열 제어하는 기능)
 * 
 * String은 문자열 배열
 * 	- 문자마다 인덱스 번호를 가지고 있다 (0부터 시작)
 * 
 * String s = "Hello Java"
 * 			   12345678910
 * 
 * 주요 기능
 * 	1) 문자열에서 문자 하나 추출 => char charAt(int index)
 * 
 */

public class 라이브러리_String_3 {

	public static void main(String[] args) {
		
//		String msg = "Hello Java";
//		for(int i = 0; i < msg.length(); i++) {
//			System.out.println((i+1)+"번째 문자 : "+msg.charAt(i));
//		}
//		
//		
//		System.out.println("msg 거꾸로 출력하기"); 
//	
//		for(int i = msg.length()-1; i >= 0; i--) {
//		System.out.println((i+1)+"번째 문자 : "+msg.charAt(i));
//		}
	
		
		System.out.println("알파벳 문자열을 입력 받아서 대문자 몇 개, 소문자 몇 개를 출력하는 프로그램"); 
		
		
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();				// 공백 포함 모두 출력할 때 nextLine, 공백 앞에서 끊을 때 next
		System.out.println("알파벳 입력 : "+text);
		
		int num1 = 0;
		int num2 = 0;
		
		for(int i = 0; i < text.length(); i++) {
			
			char c = text.charAt(i);
			if(c >= 'A' && c <= 'Z')
				num1++;
			else if(c >= 'a' && c <= 'z')
				num2++;
			
		}
		
		System.out.println("대문자 : "+num1);
		System.out.println("소문자 : "+num2);
		
		

	} 

}

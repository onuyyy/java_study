package com.sist.string;
import java.util.*;

/*
 * charAt(0)
 * 문자열을 입력해서 좌우대칭인지 확인하는 프로그램
 * 
 */

public class 라이브러리_String_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String text="";
			
		while(true) {											// 오류 먼저 걸러내기
			System.out.println("문자열 입력 : ");
			text = scan.next();
			
			if(text.length()%2!=0) {
				System.out.println("문자 개수가 짝수여야 합니다");
				continue;
			}
			
			break;
			
		}
		
		
		System.out.println("데이터 값 : "+text);
		
		boolean bCheck = false;
		int j = text.length()-1;
		
		for(int i = 0; i < text.length()/2; i++) {
			
			if(text.charAt(i)==text.charAt(j)) {
				bCheck = true;
			}
			j--;
			
		} 
		
		if(bCheck==true) {
			System.out.println(text+"는(은) 좌우대칭입니다");
		} else {
			System.out.println(text+"는(은) 좌우대칭이 아닙니다");
		}
			
		
		

	}

}

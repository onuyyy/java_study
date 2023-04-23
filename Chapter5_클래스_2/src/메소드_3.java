/*
 * char 한 개 보내서 => 대문자, 소문자 => boolean
 * 
 */

import java.util.Scanner;
public class 메소드_3 {
	

	static String isAlpha(char c) {
		String result = "";		
		if(c >='A' && c <= 'Z') {
			result="대문자";
		} else if(c >='a' && c <= 'z') {
			result="소문자"; 
		} else {
			result="알파벳이 아니다";
		}
		
		return result;
	}
	
	static void process() {
		Scanner scan = new Scanner(System.in);
		System.out.println("알파벳을 입력해라 : ");
		String s = scan.next();
		char c = s.charAt(0);		// 문자 한 개를 읽어와서 char로 변환시킨다
		/*
		 * String s = "Hello";
		 * 			   01234
		 * 			=> s.charAt(1) ==> 'e'자를 가지고 옴
		 * 
		 */
		String result = isAlpha(c);
		System.out.println(c+"는(은) "+result);
		
		// 가급적이면 결과 값이 여러 개인 경우 >> 문자열로 처리
	}


	
	public static void main(String[] args) {


		
		process();
		

	}

}

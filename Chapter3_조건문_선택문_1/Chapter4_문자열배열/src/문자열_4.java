/*
 * 
 * length()	=> 문자 개수 
 * 	- length가 1보다 작으면 입력이 안된 것
 * 
 * trim() => 좌우 공백 제거
 * 
 * javascript => java와 메소드가 동일 (jquery, vuejs, reactjs)
 * 
 * 
 */

import java.util.Scanner;
public class 문자열_4 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
//		System.out.println("문자열 입력 : ");
//		String s =scan.next();
//		System.out.println("입력된 값 : "+s);
//		System.out.println("문자 개수 : "+s.length());
		
		String s =" Hello Java!! ";
		System.out.println(s.length());
		
		System.out.println(s.trim().length());		// 맨 끝 좌우 공백만 없애는 것

	}

}

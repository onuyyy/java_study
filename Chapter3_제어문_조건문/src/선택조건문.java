/*
 * true , false > 나눠서 처리할 땐
 * 	ex) if(조건문) >  조건문 (비교연산자, 부정연산자, 논리연산자)만 가능
 * 		{	조건문이  true일 경우에 수행
 * 		}
 * 		else{	조건문이 false일 경우에 수행
 * 		}
 * 			> ex) 로그인 여부, 아이디 중복체크, 관리자 or 사용자
 * 
 * 
 */

// 알파벳을 받아서 소문자인지 대문자인지 체크

public class 선택조건문 {

	public static void main(String[] args) {
		
		int no = (int)(Math.random()*2); // 0,1
		char ch;
		
		if(no==0) 
			ch = (char)((Math.random()*26)+65); // 대문자 출력 문자 번호
		else 
			ch = (char)((Math.random()*26)+97);	// 소문자 출력 문자 번호
		
		if(ch >= 'A' && ch <= 'Z')
			System.out.println(ch+"는(은) 대문자입니다");
		else
			System.out.println(ch+"는(은) 소문자입니다");
	}

}

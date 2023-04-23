/*
 * 
 * 문자열 데이터형 : 참조형
 * 	=> String : 문자열 저장
 * 		- 가장 많이 사용되는 데이터형 string(기본형처럼 사용), int 
 * 		- 웹, 윈도우는 무조건 문자열 통신
 * 		- 문자열 : " " 여러 개 문자 저장 (String) /	문자 : '' 한 글자 저장 (char)
 * 		- java.lang.String에 존재한다 (라이브러리)
 * 		- 사용 법 : String name = "홍길동"
 * 			       String name = new String(")
 * 		- String => char[] : String은 char의 배열이라고도 할 수 있다 문자의 모음
 * 		- 일반데이터 (문자열 저장), 클래스형 => 지원하는 기능 (메소드)
 * 
 *  
 * String에서 지원하는 메소드 : 변경할 수 없다 => 표준화
 * 			MAth.random(), Math.ceil, Math.round()
 * 			 임의의 수 추출	      올림	     반올림
 * 				> 메소드는 결과값을 받아서 처리해줘야 한다
 * 	1) 대문자 변환 toUpperCase()
 *  String s = "hello java";
 *  String result = s.tpUpperCase();
 *  				=> 결과값 "HELLO JAVA"
 *  2) 소문자 변환 toLowerCase();
 *  String s = "HELLO java";
 *  String result = s.toLowerCase();
 *  				=> 결과값 "hello java"  
 *  3) 찾기
 *  -----------
 *  startsWith	=> 시작하는 문자열 : 결과값이 true false > if문에서 많이 사용
 *  endsWith	=> 끝나는 문자열 : 결과값이 true false > if문에서 많이 사용
 *  ----------- 서제스트(자동완성기)
 *  contains	=> 포함 문자 : 결과 값이 true false > 검색할 때 많이 사용 > 추천 
 * 
 *   
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class 문자열_1 {

	public static void main(String[] args) {
		
		char[] msg = {'h','e','l','l','o', 'j','a','v','a'};
		for(char c:msg) {
			if(c >='a' && c <= 'z') {		// 소문자라면
				System.out.print((char)(c-32));		// 대문자-소문자 = 32
				// 'A', 'a' ==> 'a'-'A'
				//  65   97 (문자번호)
			}
			if(c >= 'A' && c <= 'Z') {		// 대문자라면
				System.out.print(c);
			}
		}
		
		System.out.println();
		
		for(char c:msg) {
			if(c >='a' && c <= 'z') {		// 소문자라면
				System.out.print(c);		// 대문자-소문자 = 32
				// 'A', 'a' ==> 'a'-'A'
				//  65   97 (문자번호)
			}
			if(c >= 'A' && c <= 'Z') {		// 대문자라면
				System.out.print((char)(c+32));
			}
		}
		
		System.out.println();
		System.out.println("========================");
		String s = "Hello Java";
		System.out.println("=> 대문자 변환 / 소문자 변환");
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		
		
		
		
	}

}

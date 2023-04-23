/*
 * 
 * 메소드 : 클래스의 구성 요소(동적)
 *		1) 특정 기능을 수행하는 명령문의 집합 >> 연산자 / 제어문으로 이루어짐
 *		2) 한 가지 기능만 수행한다 
 *			ex) ----------- 
 *				댓글 			>> class
 *				댓글 목록 출력	>> 기능 메소드
 *				댓글 쓰기
 *				댓글 수정
 *				댓글 삭제
 * 				-----------
 * 				게시판		>> class
 * 				글 쓰기		>> 메소드
 * 				목록 출력
 * 				상세보기
 * 				-----------
 * 				영화			>> class >> 상속을 받게 되면 메가박스, 롯데시네마를 만들 수 있음
 * 				목록 출력		>> 메소드
 * 				상세보기
 * 				예약하기
 * 				추천하기
 * 		3) 메소드 구성 요소
 * 			선언부
 * 				void display()
 * 			구현부
 * 				{ 처리
 *  			}
 *  
 *  		선언부 형식 >> [접근지정어][옵션] 리턴형 메소드명(매개변수)
 *  											   ------ 사용자가 요청한 값 (여러개 가능)
 *  										 -----  알파벳, 한글로 시작 (알파벳은 대소문자 구분)
 *  												숫자 사용이 가능 (앞에 사용 불가)
 *  												키워드, 공백 사용 금지
 *  												특수문자 ( _ , $ )가능
 *  												소문자로 시작한다
 *  								   ----- 기본형(int long byte double ...)
 *  										 배열, 클래스
 *  					--------- static, final, abstract
 *  					public, protected, default, private {
 *  					}
 *  
 *  				- 원형 static int add(int a, int b) {
 *  							return a+b;
 *  						}
 *  
 *  				- 호출
 *  					넘겨준 데이터를 받아서 저장
 *  					int result = add(10,20);
 *  						>> 결과 : 30
 *  				*** 메소드를 호출시에는 메소드는 처음부터 끝까지 수행한 후에 호출된 위치로 다시 온다
 *  					
 *  	4) 메소드 만드는 방법
 *  			- 리턴형이 있느냐 없느냐
 *  			- 매개변수는 몇 개냐
 *  		리턴형		매개변수
 *  		  O			  X
 *  		  O			  O		>> String substring (int a, int b)
 *  							   String s = "Hello Java";
 *  										   12345678910
 *  							   String a = s.substring(0,5) >> Hello 출력
 *  		  X			  O
 *  		  X			  X
 *  		-------------------
 *  
 *  
 *  
 */
import java.util.Scanner;
public class 문제풀이_0410 {


//	1. 1~10까지 출력하는 메소드 구현
	
//	static void gugudan() {
//		
//		for(int i = 1; i <= 10; i++) {
//			System.out.print(i+" ");
//		}
//		
//	}
	
	
	
	
	
//	2. 1~10까지 합을 구하는 메소드 구현
	
//	static void sum() {
//		
//		int sum = 0;
//		for(int i = 1; 1 <= 10; i++) {
//			sum+=i;
//		}
//		
//		System.out.println("sum : "+sum);
//	
//	
//	}
	
	
	
//	3. 1~n까지 합을 구하는 메소드 구현			>> 굳이 사용자의 입력값을 주지 말고 매개변수를 사용해라
	
//	static int sum (int num) {
//		
//		int sum = 0;
//		for(int i = 1; i <= num; i++) {
//			sum+=i;
//		}
//		
//		System.out.println("sum : "+sum);
//		
//	}
	
	

	
//	4. 두 정수의 나눗셈 결과를 구해주는 메소드 구현
		
		static int result(int a, int b) {
			
			int out = a/b;
			return out;
			
		}
		
	
		
		
		
		
//	5. 문자열의 소문자를 대문자로 바꿔주는 메소드 구현
		
	
		static String method5(String s) {
			
			String result = "";
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
					result = result + s.charAt(i);
				else if(s.charAt(i) >= 'a' && s.charAt(i) <='z')
					result = result + (char)(s.charAt(i)-32); 
			}
			return result;
			
		}
		
		
		
		
		
		
//	6. 문자열을 거꾸로 출력하는 메소드 구현

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	 	// 1.사용자로부터 아이디를 받아서 중복체크하는 메소드 원형을 작성하시오
	
		// static boolean idCheck (String id)
		
	
		// 2.우편번호를 검색하는 메소드 원형을 작성하시오
		
		// static String[] post(String dong)
		
		
		// 3.2단에서 9단까지 구구단을 출력하는 메소드 원형을 작성하시오

		// static void gugudan()
	
		// 1. 1~10까지 출력하는 메소드 구현
	
//		static void output() {
//			for(int i = 1; i <= 10; i++) {
//				System.out.print(i+" ");
//			}
//		}
	
	
		// 2. 1~10까지 합을 구하는 메소드 구현
	
//		static void method() {
//			int sum = 0;
//			for(int i = 1; i <= 10; i++) {
//				sum+=i;
//			}
//			System.out.println("sum : "+sum);
//		}										>> void 활용
		
//		static int method() {
//			int sum = 0;
//			for(int i = 1; i <= 10; i++) {
//				sum+=i;
//			}
//			return sum;							// return 활용
//		}
			
	
	
		// 3. 1~n까지 합을 구하는 메소드 구현 
		
//		static void method3(int n) {
//			int sum = 0;
//			for(int i = 1; i<=n; i++) {
//				sum+=i;
//			}
//			System.out.println("sum : "+sum);
//		}
		
		
		
		
		
		// 4. 두 정수를 나눗셈 결과를 구해주는 메소드 구현
		
//		static double method4(int a, int b) {
//			
//			return a/(double)b;
//		}
	
	
	
	
	
		
		// 5. 문자열의 소문자를 대문자로 바꿔주는 메소드 구현
		
//		static String method5(String s) {
//			String result = "";
////			for(int i = 0; i < s.length(); i++) {
////				if(s.charAt(i)>='A' && s.charAt(i)<='Z')
////					result+=s.charAt(i);
////				else if(s.charAt(i)>='a' && s.charAt(i)<='z')
////					result+=(char)(s.charAt(i)-32);
////					
////			}
//			return s.toUpperCase();
//		}
		
		
		
		// 6. 문자열을 거꾸로 출력하는 메소드 구현
			
//		static void method6(String s) {
//			for(int i = s.length()-1; i>=0; i--) {
//				System.out.print(s.charAt(i));
//			}
//		}

		
		
	public static void main(String[] args) {
		
//		output();
		

		
//		String s = "Hello Java";
//		System.out.println(s.substring(0,5));	// 자른 것만 가져오는 기능
//		
//		String ss = s.substring(0,5);
//		System.out.println(ss);
		
		
//		System.out.println(method());
		
		
//		method3(100);
//	}

		
//		
//		double d = method4(10,3);
//		System.out.printf("%.2f\n",d);


//		String s = method5("Hello Java");
//		System.out.println(s);
		
//		method6("hello JAVA");
		
		
		String s = "Hello";
		String result = method5(s);
		System.out.println(result);
		
		
		
		
	}
		
}

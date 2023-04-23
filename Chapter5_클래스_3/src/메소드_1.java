/*
 * 
 * 클래스 구성요소
 * 	1. 변수 : 프로그램 종료시까지 유지하는 변수 (전역변수, 멤버변수)
 * 		     메소드 안에서 사용되는 변수 (지역변수)
 * 				기본형 / 참조형
 * 				정수 : int, long
 * 				실수 : double
 * 				논리 : boolean
 * 				참조형 : 데이터가 여러개 (메모리 주소 이용)
 * 					> 배열(1차원만) : 같은 크기의 데이터만 모음
 * 			    	  클래스 : 다른 크기의 데이터형
 * 	2. 생성자 : 변수에 초기화, 클래스를 메모리에 저장시에 사용
 * 	4. 메소드 : 기능을 수행, 다른 클래스와 연결 (메세지)
 * 			연산자 / 제어문 (명령문)
 * 			명령문의 집합
 * 				=> 1 다른 클래스와 통신
 * 				=> 2 재사용 목적
 * 					 ---- 기능을 최소화 (한 개의 기능만 수행)
 * 							ex) 회원 (클래스)
 * 								- 회원 가입, 수정, 탈퇴, 로그인, 로그아웃	=> 각각 메소드를 만든다 (5개)
 * 																	=> 수정, 추가 (객체지향) 
 * 
 * 		1) 메소드 형식
 * 			[접근지점]	 [옵션] 					리턴형 메소드명(매개변수)
 * 			 public	 static,final,abstract	 
 * 
 * 		2) 메소드 종류
 * 			리턴형		매개변수
 * 		 	 O			  O
 * 			=> String
 * 				String substring(int s)
 * 				String replace(String s1, String s2)
 * 			-------------------
 * 			 O			  X
 * 			String trim()
 * 			double random()
 * 			-------------------
 * 			 X			  O
 * 			void println(String s)
 * 			void main(String[] arg)
 * 				> 결과값이 없는 경우
 * 			-------------------
 * 			 X			  X
 * 			void println()								
 * 
 * 		3) 메소드 구성요소
 * 			= 리턴형 (처리 결과값)	> 화면 출력 (데이터)
 * 									- 여러 개인 경우 : 배열, 클래스
 * 										ex) 검색, 상세보기
 * 									- 한 개인 경우 : 기본형
 * 										ex) 최대값, 최소값, 합, 평균 => int double
 * 			= 매개변수 (사용자의 요청값)	- 여러 개인 경우 : 3개 이상이면 > 배열 or 클래스
 * 									- 한 개인 경우 : 
 * 									aaa(int a, int b, int c, int d)
 * 									aaa(int[] arr)
 * 			= 메소드명 
 * 				- 알파벳으로 시작한다 (대소문자 구분)
 * 				- 숫자 사용이 가능, 앞에 사용 금지
 * 				- 특수문자는 $ , _ 만 사용
 * 					_ : 임시 메소드를 만들 때 사용  ex) _main (임시로 만들어졌구나!)
 * 						단어가 두 개 이상일 때도 사용	ex) board_write or boardWrite
 * 													 기능   소기능 > 이런 식으로 씀
 * 				- 키워드는 사용 금지
 * 				- 약속 : 소문자 시작한다 
 * 				-----------------------------------------------------------------식별자
 * 				** 변수는 같은 이름으로 사용이 불가능하다
 * 				** 메소드는 같은 이름을 사용할 수 있다 (오버로딩) 같은 이름을 가지고 여러 개의 기능을 만드는 것
 * 												>> 매개변수가 다르면 다른 메소드로 인식한다
 * 												>> 데이터형이 다르거나, 개수가 다를 때도 가능
 * 					+	더하기 가능 
 * 					plus(int, int)
 * 					plus(double, double)
 * 					plus(double, int)
 * 					plus(char, int)
 * 					plus(char, char)
 * 					plus(String, String)
 * 				** 매개변수 개수를 알지 못할 경우						
 * 					ex) 장바구니 => 가변매개변수
 * 						형식 : (int ...arg)
 * 										
 * 
 * 
 * 
 */

import java.util.Arrays;
import java.util.Scanner;
public class 메소드_1 {

	// 사용자가 원하는 개수만큼 난수 발생 (1 ~ 100)
	// 사용자 >> 개수 (매개변수)
	// 리턴형 >> 배열
	
	static int[] rand(int count) {
		int[] arr = new int[count];		// 이 개수만큼 rand안에 들어간다
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		return arr;
	}

	
	
	public static void main(String[] args) {
	
		
//		System.out.println();
//		void println()
	
//		System.out.printf("%d\n",10);
//		System.out.printf("%d %d\n",10,20);
//		System.out.printf("%d %d %d\n",10,20,30);
//		System.out.printf("%d %d %d %d\n",10,20,30,40);
//		System.out.printf("%d\n",10);
//		printf(String format, Object... args)	>> 가변매개변수 : 매개변수 개수를 알 수 없을 때
//							  ------ object 주면 모든 데이터형 저장 가능	
//		Object a = 10;
//		Object b = 10.5;
//		Object c = 'a';
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("난수 개수 입력 : ");
		int count = scan.nextInt();
		int[] arr = rand(count);
		System.out.println(Arrays.toString(arr));
		
		// 메소드 호출 과정	: 메소드명(매개변수값) >> 자신의 클래스에서 쓰는 방식 (클래스명 생략 가능)
		// 클래스명.메소드명(매개변수값) >> 다른 클래스에서 호출
		
		
		
		
		
		
	}

}

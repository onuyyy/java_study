package com.sist.util;
/*
 * Object
 * 	= 최상위 클래스, 모든 데이터형을 받을 수 있음
 * 	= 저장 : 일반 기본형, 사용자 정의 클래스 => 기본적으로 설정 Object 형변환
 * 	= 기능
 * 		clone() : 복제 (새로운 메모리 생성)
 * 		finalize() : 소멸자 (메모리 해제될 때 자동 호출된다)
 * 		toString() : 객체를 문자열화
 * 		equals() : 객체 비교 (기본은 객체의 주소값) => 내용을 비교하기 위해선 오버라이딩하여 재정의해서 사용한다
 * 		System : gc()
 * 				System.out, System.in => 표준 입출력
 * 		Math : 수학
 * 				round()  : 반올림
 * 				ceil()	 : 올림
 * 				random() : 난수 (임의의 수 추출)
 * 		StringBuffer : 문자열이 많은 경우 제어할 때 사용
 * 				append() : 문자열 결합, 속도가 빠름
 * 				delete() : 문자 제거
 * 				insert() : 문자열 추가
 * 		String : 문자열을 쉽게 제어 가능하게 만든 클래스
 * 				equals(), trim(), substring(),
 * 				length, valueOf(), contains()
 * 				startsWith(), split(), replace(), replaceAll() 
 * 		
 * java.util : 사용 빈도가 많다
 * 		= StringTokenizer : 문자열 분리 (쉽게 분리)
 * 			- countToken() => 분리된 단어의 개수
 * 			- hasMoreTokens() =>분리된 개수만큼 반복문 수행
 * 			- nextToken() : 실제 분리된 데이터를 한 개씩 읽는다
 * 		= Wrapper : 기본형을 클래스화 (기능을 수행)
 * 			- Integer => int
 * 			- Double => double
 * 			- Boolean => boolean
 * 			- Long => long
 * 								==> parseInt(), parseDouble(), parseBoolean(), parseLong() : 문자열 변환 **
 * 										- 웹은 무조건 데이터가 String
 * 										
 * 			- 기본형 / Wrapper는 호환
 * 				Integer i = 10 ==> 실제값(리터럴) 대입
 * 				------------------ 오토박싱(박싱)
 * 				int a = new Integer(10) ==> 기본형에서 클래스 객체값을 받는다
 * 				----------------------- 언박싱
 * 		= Random
 * 			- nextInt(int bound)
 * 			  nextInt(10) => 0 ~ 9
 * 		= Arrays : 배열을 쉽게 관리할 수 있다
 * 			- sort() : 정렬
 * 			- toString() : 배열 출력
 * 			- asList() : List 형변환
 * 		= 날짜 관련
 * 			- Date : 기능이 없다 => 다른 프로그램과 호환, 날짜 저장용으로 주로 사용
 * 			- Calendar : 날짜에 대한 기능이 필요시 사용, Date를 보완한 클래스
 * 				날짜 설정
 * 					=> set() : 년도-월-일-시간-분-초
 * 					=> get() : 날짜를 가져올 때
 * 					=> get(Calendar.DAY_OF_WEEK)
 * 					= 각달의 마지막 날 : getActualMaximum()
 * 		= 배열을 대체하는 프로그램
 * 			- Collection (데이터를 쉽게 관리) => 10개 (자동으로 저장 공간이 설정)
 * 				1) List	(순서도 있고 중복이 있다)
 * 					- ArrayList
 * 					- Vector
 * 					- LinkedList-Queue
 * 				2) Set (순서도 없고 중복이 없다)
 * 					- HashSet
 * 					- TreeSet
 * 				3) Map => 인터페이스
 * 					- HashMap
 * 					- Hashtable
 * 
 * 
 * 
 * 
 * 
 */

// Calendar 응용

import java.util.*;
public class 라이브러리_Calendar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 사용자로부터 년도, 월을 받기 => 예약, 체크엔, 체크아웃 : 달력 만들기
		
		System.out.println("년도, 월 입력 (yyyy-mm) : ");
		int year = scan.nextInt();
		int month  = scan.nextInt();
		
		// 1일자의 요일을 가지고 온다 (4 => 4월 1일)
		
		Calendar cal = Calendar.getInstance();
		// 추상클래스는 미완성된 클래스 (메소드가 구현이 안된 상태)
		// 구현할 클래스를 이용한다, 싱글턴 (newInstance(). getInstance())
		/*
		 * static => 클래스명.메소드명()
		 * 		ex) Math.random()
		 * 보통 new를 이용하여 메모리 생성해야 함
		 * 
		 * 클래스명 객체명= new 생성자()
		 * - 클래스명과 생성자가 다르면 추상클래스이고,
		 * 	 클래스명과 생성자가 같으면 일반클래스이다
		 * 
		 * 클래스명 객체먕 = 메소드() => 추상클래스
		 * 
		 * 
		 */
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		// 요일 구하기
		
		int week = cal.get(Calendar.DAY_OF_WEEK)-1;		// 설정된 날의 요일 구하기
		
		// 입력 달의 마지막날
		
		int lastday = cal.getActualMaximum(Calendar.DATE);
		
		// 달력 출력
		String[] strweek = {"일","월","화","수","목","금","토"};
		
		System.out.println(year+"년도 "+month+"월");
		System.out.println("\n");
		
		for(String s:strweek) {
			
			System.out.print(s+"\t");
			
		}
		
		System.out.println();
		for(int i = 1;i <= lastday; i++) {
			
			if(i==1) {			// 맨처음 할 일 : 공백 설정
				
				for(int j = 0; j < week; j++) {
					System.out.print("\t");
				}
				
			}
			
			// 달력 출력
			
			System.out.printf("%2d\t",i);
			
			week++;
			
			if(week > 6) {		// 일요일이면
				week = 0;		// 일요일
				System.out.println();	// 다음줄에 출력하라
				
			}
			
		}
	
		
		
		

	}

}

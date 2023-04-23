package com.sist.main;		// 패키지의 위치

// 패키지는 폴더 개념, 관련된 클래스와 자바 파일을 저장하는 것이다
// 다른 패키지의 클래스를 불러올 때 반드시 import를 사용한다

// import com.sist.main.클래스구성요소_1;
// import com.sist.main.*;
// import java.util.*;
// 패키지 > 임포트 순서대로 작성한다
// 클래스명 기억 안 나면 *로 대체 가능
/*
 * 패키지명 주의점
 * 	- 키워드는 사용할 수 없다
 *  - 대소문자 구분 => 소문자 권장
 *  	com.sist.class => 오류, class가 키워드
 * 	- 숫자는 앞에 쓸 수 없다
 * 	- 특수문자는 $  _ 만 가능하다 
 * 
 * 다른 패키지에서는 같은 이름의 클래스를 만들 수 있다
 * 
 * 2. 메소드
 * = 접근방식 .을 이용한다
 * = 인스턴스 메소드 => static이 없는 메소드 : 메모리에 따로 저장된다
 * 				 => static 메소드는 공통으로 저장된다
 * 
 * 클래스의 분리
 *  = 데이터형
 *  = 액션(동작) >> 메소드만 가지고 있는 클래스
 *  
 *  
 *  
 *  
 *  1) 데이터형
 *  2) 데이터 처리
 *  3) 조립 => main 안에서 한다 (메인보드)
 *  
 *  
 *  1. 메소드의 구성요소
 *  리턴타입(결과값) 메소드명(매개변수 > 요청에데이터) > 선언부 {
 *  	구현부
 *  	return 결과값
 *  		   ------ 리턴타입과 결과값은 같은 형식이어야 함
 *  
 *  리턴타입 :  사용자가 요청한 내용을 처리 후에 결과값의 데이터형
 *  			1) 결과값이 없는 경우 => void
 *  			2) 결과값이 있는 경우
 *  				리턴타입 / return 값은 항상 일치하진 않는다
 *  				 > 항상 리턴타입이 결과값보다는 크거나 같다
 *  			3) 리턴타입이나 결과값은 1개만 나온다
 *  				 > 여러 개일 경우 : 배열이나 클래스를 이용한다
 *  				ex) int[] display()
 *  					=> int[] arr = display()
 *  					=> int[] arr = new int[5];
 *  					   int[] arr2 = arr;			>> 같은 주소면 같이 제어한다 (얕은 복사)
 *  
 *  					class A			// 사용자정의 데이터형 A가 데이터형이다
 *  					A display() {
 *  						A a = new a();
 *  						return a;
 *  					}
 *  						=> A aa = display();  => aa = a 
 *     
 *      
 *     리턴형 : 기본형, 배열, 클래스 (사용자 정의 테이터형)
 *     return int => 10...
 *     		  double => 10.5
 *     		  char => 'a'
 *     	  	  배열 => 배열명(주소)
 *     		  클래스 => 객체명(주소)
 *     		  A a = new A()
 *     		  return a;
 *     매개변수 : 사용자 요청값	
 *     			getView(int page)
 *     			finData(String s)
 *     			login(String id, String pwd)
 *  
 *  
 * 
 * 
 * 
 * 
 */
class Student {		// Student가 데이터형이 됨
	
	int hakbun;
	String name;
	String sex;
	int kor;
	int eng;
	int math;
	
}

class StudentSystem {
	
	int getHakbun() {
		return 1;
	}
	String getName() {
		return "홍길동";
	}
	String getSex() {
		return "남자";
	}
	int getKor() {
		return 90;
	}
	int getEng() {
		return 80;
	}
	int getMath() {
		return 70;
	}
	Student getData() {
		
		Student s = new Student();
		s.hakbun = 2;
		s.name = "심청이";
		s.sex = "여자";
		s.kor = 80;
		s.eng = 100;
		s.math = 95;
		
		return s;
	}
}


public class 클래스구성요소_1 {

	public static void main(String[] args) {
		
		Student hong = new Student(); 
		StudentSystem ss = new StudentSystem();
		hong.hakbun = ss.getHakbun();
		hong.name = ss.getName();
		hong.sex = ss.getSex();
		hong.kor = ss.getKor();
		hong.eng = ss.getEng();
		hong.math = ss.getMath();
		// 메소드를 한 개씩 나눠서 하는 것보다 아래처럼 한 번에 만드는 것이 낫다
		
		
		Student shim = ss.getData();
	}

}

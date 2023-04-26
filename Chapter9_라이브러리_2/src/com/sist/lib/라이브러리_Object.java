package com.sist.lib;
/*
 * 
 * 사용자 정의 클래스 + 라이브러리
 * 
 * 1) 자바의 모든 클래스 (라이브러리 클래스, 사용자 정의 클래스)
 * 		=> 상위 클래스 (Object)
 * 2) 자바에서 지원하는 라이브러리
 * 		=> java.lang : 자바의 기본 클래스 (가장 많이 사용되는 라이브러리)
 * 			- import를 생략한다
 * 			- Object, String, StringBuffer, Wrapper, System, Thread
 * 		=> java.util : 유용하게 사용하도록 만들어진 라이브러리
 * 			- Scanner, StringTokenizer, 자료구조 (데이터를 쉽게 관리)
 * 		=> java.io : 입출력 (메모리, 파일, 네트워크) => CheckException
 * 		=> java.net : 네트워크 => CheckException
 * 		=> java.sql : 데이터베이스 연결
 * 		=> java.text : 변환할 때 (날짜 형식, 문자열 형식)
 * 
 * Web 관련 라이브러리
 * Spring 관련 라이브러리
 * 데이터 수집
 * 
 * 
 * 자동처리
 * 
 * 1) import java.lang.*
 * 2) 메소드
 * 		void method() {
 * 			return => 생략 => 자동 추가
 * 		}
 * 3) 생성자
 * 		class A {
 * 			public A() {} => 자동 추가
 * 4) 상속
 * 		class A extends Object
 * 
 * java.lang에서 지원하는 클래스는 대부분이 final 클래스이다
 * 			=> 상속을 받아서 확장이 불가능 (있는 그대로 사용)
 * 			=> 상속을 받아서 확장이 가능 => Object
 * 			=> Object : 모든 데이터형을 받을 수 있다
 * 						=> 데이터형을 여러 개 사용시에는 라이브러리에서 리턴형이 대부분 Object
 * 						=> 형변환을 사용해야 사용이 가능하다
 * 						=> 클래스를 형변환 => (int)new Object()
 * 										  (integer)new Object()
 * 						Integer i = 10;
 * 						int a = new Integer(10) => 언박싱
 * 
 * Object
 * 	주요 기능)
 * 		finalize()	: 소멸자 함수 (메모리 할당 -> 해제할 때 호출)
 * 		toString()	: 객체를 문자열로 변환
 * 		clone()		: 새로운 메모리를 생성할 때 복제
 * 		getClass()	: 클래스 객체읽기
 * 		equals()	: 객체 비교할 때
 * 
 * 
 *
 */

class Student {
	private int hakbun;		// this.은 생략이 가능 => 지역변수와 같은 이름일 떄 구분
	private String name;
	
	public Student() {

		this.hakbun = 1;
		name = "홍길동";
		System.out.println("생성자 : 멤버변수에 대한 초기화");
	}
	
	// 소멸자
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("객체 메모리 해제");
		
	}
	
	public void print() {
		System.out.println("학번 : "+hakbun+" 이름 : "+name);
	}
}




public class 라이브러리_Object {

	public static void main(String[] args) {
		
		/*
		 * 객체 메모리 할당 (메모리에 저장)
		 * 객체를 활용 (메소드 호출, 변수 변경)
		 * 객체 메모리 해제 (메모리에서 삭제)
		 */
		
		Student s  = new Student();
		
		s.print();
		s = null;		// 주소를 받은 걸 없애버림 : 소멸자 GC 대상

		// 객체 메모리 강제 해제
		System.gc();	// 	finalize()
	}

}

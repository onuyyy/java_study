package com.sist.lib;
/*
 * 
 * 1. java.lang
 * 		1) Object : 모든 클래스의 상위 클래스 (모든 클래스는 상속을 Object로 받는다)
 * 				=> 기능만 제공 (메소드)
 * 				= toString() : 자주 사용이 된다, 객체를 문자열화 시킨다
 * 								>> 오버라이딩
 * 				= clone()		: 객체 복제 (참조가 X)
 * 					** 참조와 복제의 차이점
 * 						참조 : 같은 메모리를 이용 (얕은 복사)
 * 						복제 : 다른 메모리를 생성 (깊은 복사)
 * 				= finalize()	: 소멸자 함수 (호출되면 메모리가 해제)
 * 				= equals()		: 객체 비교할 때 사용
 * 
 * 		2) String : 문자열을 관리하는 클래스
 * 			기능(메소드)
 * 				= equals() : 문자열을 비교할 때 사용
 * 							'==' 은 주소값 비교
 * 							ex) 로그인 처리, 상세보기, 아이디 중복체크, ...
 * 				= startsWith : 시작 문자열이 같은 경우			
 * 				= endsWith	 : 끝나는 문자열이 같은 경우
 * 				= contains	 : 포함된 문자열 갖고 온다
 * 							=> ex) 추천하기
 * 				= replace	 : 문자나 문자열을 변경할 때
 * 						211.238.242.101
 * 									102
 * 									103 ... 한 개씩 변경 가능
 * 				= replaceAll : 문자나 문자열을 변결할 때 (정규식) => 문자열의 형태
 * 								한 번에 변경 가능
 * 				= trim		 : 좌우의 공백을 제거
 * 				= split		 : 특정 단어별로 나눠서 저장 => String[]
 * 						=> StringTokenizer
 * 				= valueOf	 : 모든 데이터형을 문자열로 변경
 * 				= length	 : 문자의 개수를 가지고 온다
 * 				= substring	 : 문자열을 자를 때 사용한다
 * 				
 * 		3) StringBuffer, StringBuilder, ...
 * 		   Wrapper : 기본형의 클래스
 * 				Byte, Integer, Double, Boolean, Float, Long, ....
 * 				
 * 		   Sytstem
 * 		   Math
 *		   Thread
 * 		  ----------------------------------------------------------------- java.lang은 import를 생략할 수 있다
 * 
 * 2. java.util
 * 		Date / Calendar
 * 		StringTokenizer
 * 		Collection
 * 			- List	: ArrayList / Queue, LinkedList / Vector
 * 			- Map	: HashMap / HashTable
 * 			- Set(interface) : HashSet / TreeSet
 * 
 * 	2-1. java.text
 * 
 * 
 * 3. java.io
 * 4. java.net
 * 5. java.sql
 * 					==> 기본 라이브러리
 * 6. javax.xml
 * 7. javax.servlet.http
 * 8. 외부 라이브러리 (자바에서 지원하는 것이 아닌, 업체에서 지원)
 * 		=> Open API (ex  Js.soup, simple-json) = mvnrepository.com
 * 		org.
 * 		com.
 * 
 * ------------- 1. DB (Mybatis, Hibernate(JPA))
 * 				 2. XML, JSON (VueJS, Ajax, React)
 * 				 3. 프레임워크 (Spring, Spring-Boot, Struts)
 * 				 
 * 
 * 
 */
class A {
	
	int a = 10;
	int b = 20;
	
}

public class 라이브러리 {


	
	public static void main(String[] args) {
		
		A aa = new A();
		System.out.println(aa);
		System.out.println(aa.toString());

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}



}

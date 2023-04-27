package com.sist.util;

import java.util.ArrayList;

/*
 * 
 * Collection => 데이터를 묶어서 관리 할 수 있게 만든 클래스
 * 			  => 배열의 단점 보완
 * 컬렉션 프레임워크 (프레임워크 => 표준화)
 * 				=> 모든 개발자가 동일한 현태로 소스코딩
 * 				=> 소스의 통일화 목적 : Spring, MyBatis,JQuery, VueJS, ReactJS
 * 				일정 틀 => 쉽게 다른 개발자의 코딩을 분석
 * 		= 완전 통일화 : 라이브러리
 * 		= 데이터 그룹, 다수의 데이터 => 모아서 관리 (배열, 클래스)
 * 
 * 배열 : 단점 => 고정적 (배열 크기를 정해놓고 작업)
 * 				- 증가/감소 되었을 때 새로운 배열을 다시 만들어야 한다는 단점이 존재
 * 			 	- 배열을 크게 만듦녀 => 메모리 누수 현상이 발생
 * 
 * 컬렉션 : 가변형 => 데이터 크기에 맞게 클래스를 제작 => 최적화
 * 				- 디폴트 (10개) => 추가 (자동으로 10개...)
 * 				- 저장 메모리를 결정하지 않는다
 * 
 * 종류 
 * 
 * 			  ㅣ- List (구현클래스) => 메소드가 다 동일하다	- ArrayList (가장 많이 사용) **
 * Collection										- Vector
 * 			  ㅣ										- LinkedList
 * 			  - Set (구현클래스) - HashSet **
 * 							  - TreeSet
 * 
 * 
 * 				Map	(인터페이스) - HashMap **
 * 							  - HashTable
 * 
 * 
 * List => ArrayList (비동기) => Vector를 보완
 * 		   Vector (동기화) => 네트워크에서 주로 사용
 * 		   LinkedList => C언어 호환 => C언어 호환
 * 
 * List list = new ArrayList()
 * list = new Vector()
 * list = new LinkedList()
 * 
 * Set => HashSet => 중복없는 데이터 저장
 * 		  TreeSet => 검색
 * 
 * Map => HashMap
 * 		  HashTable => 이것을 보완한 것이 HashMap
 * 
 * 
 * 
 * ==> List
 * 		1) 순서를 가지고 있다 (인덱스) => 0번부터 시작
 * 		2) 저장된 데이터 중복을 허용한다
 * 		3) CURD 프로그램레 주로 사용한다
 * 		4) 비동기화 => 데이터베이스 프로그램 연동시 사용
 * 		5) 주요메소드
 * 			= 데이터 추가 : add(Object)
 * 			= 데이터 삭제 : remove()
 * 			= 데이터 수정 : set()
 * 			= 데이터 읽기 : get()
 * 			= 저장된 데이터 개수 : size()
 * 			= 전체 삭제 : clear()
 * 			= 데이터 존재여부 확인 : isEmpty()
 * 			= 오라클에서 데이터 읽어서 저장 List ==> 브라우저로 전송
 * 		6) 구현하고 있는 클래스
 * 			ArrayList / Vector / LinkedList
 * 
 * 
 * ==> Set
 * 		1) 순서가 없다 (인덱스 번호가 없다) => for-each를 이용하여 출력해야 함
 * 		2) 데이터 중복을 허용하지 않는다 (순서가 없기 때문에)
 * 		3) List에 중복된 데이터를 제거
 * 		4) 구현 클래스 : HashSet, TreeSet
 * 			= 데이터 추가 : add(Object)
 * 			= 데이터 삭제 : remove()
 * 			= 데이터 수정 : set()
 * 			= 데이터 읽기 : get()
 * 			= 저장된 데이터 개수 : size()
 * 			= 전체 삭제 : clear()
 * 			= 데이터 존재여부 확인 : isEmpty()
 * 
 * 
 * ==> Map (웹에서 지원하는 모든 클래스는 Map 형식을 가지고 있다)
 * 		- request, response, session, cookie
 * 			new Cookie(key, 값) => key 무슨 데이터인지 확인하는 용도
 * 
 * 				request.setAttribute("id","hong")
 * 		= 키와 값을 쌍으로 저장
 * 		= 키는 중복을 허용하지 않는다, 값은 중복이 가능
 * 			=> 키가 동일할 때는 덮어쓴다
 * 		= 사용처 : 웹에서 주료 사용 (클래스 관리, SQL 관리시 많이 사용)
 * 		= 구현된 클래스 : HashMap
 * 		= 주요 메소드
 * 			=> 저장 : put()
 * 			=> 읽기 : get(key)
 * 		
 * -------------------------------------------------------
 * 
 * 웹 프로그램
 * 
 * Model 1 방식
 * 	=> 간단한 사이트 만들 때 사용
 *
 * Model 2 방식
 * 	=> 큰 사이트 : MVC
 * 
 * 
 * 
 * 
 */



public class 라이브러리_List_1 {
/*
 * ArrayList => 사용빈도가 가장 많다
 *  => 배열과 유사 => 인덱스번호를 사용한다 => 자동으로 지정
 *  => 순차적이다 (인덱스가 항상 0 ~~)
 *  => 크기를 지정하지 않는다 (가변형)
 * 
 * 생성 방법
 * List list = new ArrayList();			=> 기본 생성자 => 메모리가 10개
 * ArrayList list = new ArrayList();
 * 	=> 10개를 넘으면 자동 10개를 추가한다
 * 
 * ArrayList list = new ArrayList(10)
 * 
 * 
 * 
 */
	public static void main(String[] args) {
		
		
		// 생성
		ArrayList list = new ArrayList();		// 저장이 될때 기본 default로 저장이 된다 => Object
		// list에는 모든 데이터형을 첨부할 수 있다 (클래스, 기본형, ...)
		// 가급적이면 같은 데이터형을 첨부하는 것이 관리하기 편리하다			==> for문을 돌릴 수가 없기 때문에
		// list라는 공간 데이터 추가
		// 순서가 존재한다 => for문을 이용할 수 있음
		
//		list.add("홍길동");
//		list.add(1);
//		list.add(10.5);
//		list.add('A');
//		list.add(100L);
		
		
		// 이름 관리
		list.add("홍길동");		// index => 0
		list.add("박문수");		// index => 1
		list.add("심청이");		// index => 2
		list.add("춘향이");		// index => 3
		list.add("이순신");		// index => 4
		list.add(2,"강감찬");		// index => 2	>> 2번 심청이가 3번으로 밀어난다
		list.add(3,"을지문덕");	// index => 3
		list.add("박문수");
			// 자동으로 인덱스 번호가 변경이 된다
			// add : 데이터 추가 => 오버로딩이 된다
		
		// 인덱스번호로 출력하기
		
		for(int i = 0;i < list.size(); i++) {
			System.out.println(i+"."+list.get(i));
			// 저장된 개수 => size() ==> 배열의 length
			
		}
		
		
		// 삭제
		System.out.println("==================== 삭제");
		
		
		// 인덱스 번호는 중간에 생략하는 번호가 없다
		
//		0.홍길동
//		1.박문수
//		2.강감찬
//		3.을지문덕
//		4.심청이
//		5.춘향이
//		6.이순신
		// ==> 삭제시에는 이름으로 삭제 요청 => 가장 처음에 있는 이름만 삭제	
		
		
//		list.remove(o)	
//		list.remove("홍길동")	>> 둘 다 가능		
//		실제 값을 삭제 => 중복이 있는 경우 한 개만 삭제
		
		list.remove(3);		// 내용값 말고 인덱스 번호로 지우는 게 정확하다
		
		for(int i = 0;i < list.size(); i++) {
			
			System.out.println(i+"."+list.get(i));
			
		}
		
		
		// 수정 => set : set(index번호, 변경할 데이터)
		System.out.println("==================== 수정");
		
		list.set(0, "홍길수");
		
		
		for(int i = 0;i < list.size(); i++) {
			
			System.out.println(i+"."+list.get(i));
			
		}
		
		
	
		System.out.println("==================== 저장된 개수 확인");
		System.out.println("인원 수 : "+list.size()+"명");

		
		System.out.println("==================== 전체 삭제");
		
		list.clear();	// 메모리 공간 삭제
		System.out.println("인원 수 : "+list.size()+"명");
		
		/*
		 * add(Object o)
		 * set(int index, Objext o)
		 * remove(int index)
		 * Object get(int index)
		 * int size()
		 */
		
		
		
		
		
		

		
		
		
	}

}

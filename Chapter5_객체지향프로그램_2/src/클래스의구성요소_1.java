/*
 * 
 * 기초
 * 	= 변수, 데이터형
 * 	= 연산자, 제어문
 *    ----- 단항연산자 ( ++ -- ! (type))
 *    ----- 이항연산자 (산술 비교 논리 대입)
 *    ----- 삼항연산자 
 *    ----- 조건문 (단일if, 선택 if~else, 다중 if~else if)
 *    ----- 반복문 (for, while)
 *    			  ---- (이차 for, for=each)
 *    ----- 반복제어문 (break)
 * 	= 배열
 * 	  --- 1차 배열
 *  = 문자열 저장 => String
 *  	기능 : 1) equals > 문자열 비교
 *  		  	 boolean equals(String s)
 *  		  2) startsWith : 시작문자열
 *  		  	 boolean startsWith(String s)
 *  		  3) endsWith : 끝문자열
 *  		  	 boolean endsWith(String s)
 *  		  4) contains : 포함
 *  		  	 boolean contains(String s)
 *  		  5) length : 문자 개수
 *  			 int length()
 *  		  6) indexOf : 문자나 문자열의 위치를 검색 (처음부터 찾는다)
 *  			 int indexOf(char or String) 
 *  				>> 문자열은 인덱스 번호가 0번부터 시작한다
 *  					ex) String s = "Hello Java";
 *  						s.indexOf('a'), s.indexOf("a") >> 7
 *  		  7) lastIndexOf : 문자나 문자열의 위치를 검색 (뒤에서부터 찾는다)
 *  			 int lastIndexOf(char or String)
 *  					ex) String s = "Hello Java";
 *  						s.lastIndexOf('a'), s.lastIndexOf("a") >> 9
 *  		  8) trim : 좌우의 공백 제거
 *  			 String trim()
 *  		  9) valueOf : 모든 데이터형을 문자열로 변환할 때
 *    			 static String valueOf(모든 데이터형) >> String에서 유일하다
 *    			 String.valueOf(1)  			 
 *  					ex) valueOf(1) => "1"
 *  		  10) replace() : 변환 (문자열, 문자)
 *  			  String replace(char, char)
 *  			  String replace(String, String) // 앞에 문자를 뒤에 문자로 바꾼다
 *  		  11) replaceAll : 변환 (문자열, 문자)
 *  			  String replaceAll(String, String)
 *  			  					------ regexp => 정규식
 *  			  replaceAll("[가-힣]","") => 한글 전체를 공백으로 바꿔라
 *  				[A-Z] 대문자 전체 / [a-z] 소문자 전체 
 *  		  12) substring() : 문자열을 자르는 경우
 *  			  String substring(int s)
 *  				String s = "Hello Java"
 *  							0123456789
 *  				s.substring(6)  => 시작 위치만 지정함, 6부터 마지막까지 : Java 
 *    			  String substring(int s, int e) => 어디서부터 어디까지 자를 건지 지정함
 *    
 *    
 *    class : 설계 => 속성,  기능
 *    				 ---변수
 *    					   ---메소드
 *    		웹 => 출력 내용 (변수)
 *    		  => 메뉴, 버튼 : 기능
 *    			--------------- 요구사항분석 : 설계하는 과정
 *    추상화 : 설계 (기능, 데이터) : 사물을 단순화
 *    	ex) 
 *    		사원 : 사번, 이름, 연봉, ...
 *    			>> 단순화 시켜서 변수 잡기
 *    			 출근한다, 퇴근한다, 밥 먹는다,...
 *    			>> 메소드
 *    class 설계 =====> 메모리 저장 (이 과정을 인스턴스라고 한다)
 *    								new : 클래스를 저장할 때
 *    								** Spring릉 new를 사용할 수 없음 >> new 없이 저장이 가능 : 리플렉션
 *    
 *    
 * 1. 구성요소
 * 		class ClassNmae {
 * 			변수(속성)
 * 				멤버변수
 * 					= 인스턴스변수 (new 사용시마다 데이터 공간 생성)
 * 					= 정적변수 static (한 개의 공간만 생긴다) >> 공유변수 >> 컴파일러에 의해서 자동으로 생성
 * 			메소드(동작) : 기능
 * 			생성자 : 멤버변수 (인스턴스 변수) 초기화
 * 				   메모리에 저장시 처음으로 호출되는 메소드
 * 		}
 * 
 * 
 * 2. 구성요소 사용법
 * 	1) 메모리에 저장
 * 		class A {
 * 			변수 / 메소드
 * 		}
 * 
 * 		A a; 선언
 * 		a = new A();
 * 
 * 		A a = new A();
 * 
 * 		class A {
 * 			int sabun;
 * 			String name;
 * 			String getName(){}
 * 			int getSabun(){}
 * 			void run(){}
 * 		}
 * 
 * 		A a = new A();
 * 			>> 위 변수들의 저장 공간이 하나씩 생김
 * 		a.sabun ==> 100이라는 주소에 있는 sabun의 값을 가지고 온다
 * 							=> 메모리 주소 접근 연산자
 * 		a 
 * 	   ---
 * 	   100		new > 데이터 메모리를 모아준다 +
 * 
 * 
 * 3. 접근범위
 * 4. 객체지향의 3대 요소
 * 5. 클래스의 종류
 * 6. 예외처리
 * -------------------------------
 * API >> 지정된 라이브러리 사용법
 * 
 * 
 * class A {
 * 		int aa;
 * }
 * class B {
 * 		A a = new A();
 * }
 * 
 * B b = new B();
 * B.a.aa
 *
 * B b new B();
 * System.out.aa
 * 
 * ----------- 
 * 
 * class A {
 * 		int aa;
 * }
 * clas B {
 * 		A a = new A();
 * }
 * class C {
 * 		B b = new B();
 * }
 * 
 * C c  = new C()l
 * c.b.a.aa
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
 * 
 */


class Student {
	
	int hakbun;
	String name;
	
}

public class 클래스의구성요소_1 {

	public static void main(String[] args) {
		
		Student hong = new Student();
		// hong 안에 hakbun, name이 생성 됨
		
		hong.hakbun = 1;
		hong.name = "홍길동";
		
		Student shim = hong;		// 주소가 같다
		shim.hakbun = 2;
		shim.name = "심청이";
		
		System.out.println(hong.hakbun);
		System.out.println(hong.name);
		
		
		
	}

}


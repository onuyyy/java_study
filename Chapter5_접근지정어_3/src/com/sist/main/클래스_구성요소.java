package com.sist.main;

/* 
 * 1. 클래스 구성요소
 * class ClassName {
 * 
 * 	변수 (멤버변수)
 * 	1) 멤버변수 (인스턴스)
 * 		[접근지정어] 데이터형 변수명;	>>	어느 클래스까지 사용이 가능한지 설정
 * 		=> new를 사용할 때마다메모리가 따로 생성되는 변수
 * 		=> new를 이용해서 반드시 메모리를 만들어놓고 사용해야 한다
 * 		=> 자동 초기화가 된다 : 필요시마다 답을 변경해야 함
 * 			기본형 초기화 : int long double boolean ...
 * 			참조형 초기화 : 배열 클래스 => 메모리 주소를 참조하여 저장된 모든 데이터를 관리
 * 						** 배열은 같은 크기의 데이터만 관리 (사과박스, 배박스, ...)
 * 						** 클래스는 다른 크기의 데이터 관리 (종합과일세트)
 * 						** 초기화는 null (주소가 배정되지 않은 상태)
 * 2) 정적변수 (공유변수) => 메모리 공간을 하나만 만든다 : 모든 객체가 공유
 * 		[접근지정어] static 데이터형 변수명;
 * 						 ------ 기본형, 배열, 클래스 => 전부 데이터형
 * 								=> new를 사용하지 않아도 컴파일러에 의해서 자동으로 생성된다
 * 3) 변수 사용 방법
 * 	- 인스턴스 변수 : 반드시 메모리에 저장해야 한다
 * 			class A {
 * 				int aa;
 * 			}
 * 
 * 			A a = new A();
 * 			a.aa = 100;		>> 접근 방법 : 객체(인스턴스)를 통해서 접근해야 한다
 * 	- 정적 변수	
 * 			class A {
 * 				static int a;		>> static은 그저 공유 목적으로 만들어졌다 어디 소속이 아님
 * 			}				
 * 			
 * 			A.a		클래스명으로 접근이 가능>> 메모리 할당을 안 해도 된다
 * 	** 보안 중심
 * 		1) 모든 멤버변수는 private 데이터를 은닉화
 * 	** 멤버변수가 사용이 가능한 옵션 : static, final(상수)
 *------------------------------------------------------------------------------
 * 	생성자
 * 	1) 특징
 * 		생성자는 클래스명과 통일하다
 * 		리턴형을 가지고 있지 않다
 * 		오버로딩을 지원한다 => 생성자는 필요시에 여러 개를 만들 수 있다
 * 		** 생성자를 만들지 않는 경우엔 컴파일러가 자동으로 default 생성자를 만들어 준다
 * 		** 오버로딩 : 같은 메소드명으로 여러 개의 기능을 만들어서 사용
 * 			오버로딩 조건 
 * 			= 메소드명이 동일
 * 			= 매개변수의 개수나 데이터형이 다르다
 * 			= 한 개의 클래스 안에서 제작
 * 			= 리턴형은 관계가 없다
 * 				ex) plusInt(int a, int b)				>>		plus(int a, int b)
 * 					plusDouble(double d1, double d2)	>>		plus(double d1, double d2)
 * 					plusString(String s1, String s2)	>>		plus(String s1, String s2)
 * 					plusChar(char c1, char c2)					...
 * 					plusByte(byte b1, byte b2)
 * 					plusIntDouble(int a, double d)
 * 					plusCharInt(char c, int a)
 * 					plusStringInt(String s, int a)
 * 					...
 * 					...								>> 이걸 언제 만들어.. 그냥 같은 이름으로 만드는 오버로딩으로 제작한다
 * 
 * 					= 역할
 * 					게시판
 * 					이름 . 제목. 내용
 * 					이름 + 제목
 * 					이름 + 내용
 * 					이름 + 제목 + 내용		>> 다른 데이터형 찾을 때
 * 
 * 
 * 					method(int a)
 * 					method(int b)	>> 변수명이 다르다고 해서 다른 메소드가 아님
 * 									>> 메모리에 저장될 때 method(int) 이렇게 저장된다
 * 
 * 		객체 생성시에 호출되는 메소드
 * 		생성자 호출시에는 반드시 new 생성자();
 * 						   -----------
 * 		멤버 변수의 초기화를 담당한다
 * 			>> 외부에서 데이터를 읽어서 초기화 (구현)
 * 			** 초기화 3가지 형태
 * 				1) 명시적 초기화
 * 					class A {
 * 						int a = 10;
 * 						static int b = 20;	>> 직접 값을 집어넣음
 * 					}
 * 				2) 초기화 블록 : 멤버변수, static 변수 초기화만 가능 => this 사용이 가능
 * 					class A {
 * 						int a;
 * 						{
 * 						for(int i = 0; i < 10; i++) {		>> 불가능,  초기화 블록 줘야 함 : 블록을 하나 열어서 그냥 구현
 * 							a = i;
 * 						}
 * 					}
 * 				3) static 초기화 블록 : static 변수만 가능	=> this 사용이 불가능
 * 					class A {
 * 						static int b;
 * 						static {
 * 							for(int i = 0; i < 10; i++) {
 * 								b = i;
 * 							}
 * 						}
 * 					}
 * 				4) 생성자	: 멤버변수, static 변수 초기화만 가능, => this 사용이 가능		
 * 						class A {
 * 							int a;
 * 							A() {
 * 								for(int i = 1; i < 10; i++) {
 * 									a = 1;
 * 								}
 * 							}
 * 						}
 * 
 * 						** 인스턴스 변수는 생성자를 주로 이용한다
 * 						** static 변수는 생성자보다 static 블록을 많이 사용한다
 * 						** 생성자는 필요시마다 호출
 * 						   초기화 블록은 자동 호출
 * 
 * 		순서
 * 			명시적 초기화 > static 블록 > 인스턴스 블록 > 생성자
 * 			=> 초기화 1. 윈도우, 2. 네트워크 연결, 3. 파일 읽기, 4. 데이터베이스
 * 			=> 오버로딩을 지원한다
 * 			   ------ 생성자를 여러 개 사용 가능
 * 				class A {
 * 					A() {
 * 						==> 기본 생성자 : 생성자가 하나도 없을 경우 자동 생성된다
 * 					}
 * 					A(int a) {
 * 						=> 다른 생성자 호출이 가능 > this() : 생성자 블록 첫줄에만 사용이 가능하다 딱 한 번!
 * 								ex) this(10)	=> A(10)
 * 									A(int a) {}
 * 						초기값을 주기 위해서 사용자로부터 받는다
 * 					}
 * 					A(int a, String n) {
 * 						초기값을 주기 위해서 사용자로부터 받는다
 * 					}
 * 				}
 * 
 * 
 * 			1 void display(int a, int b, int c)
 * 			2 void display(int a, double d, int c)
 * 			3 void display(int a, int b, flaoat f)
 * 			4 void display(double a, double b, double c)
 * 			
 * 			=> display(10.5, 10, 'c')	>>	4번이 호출된다 데이터를 받을 수 있다, 4번이 다 담을 수 있음 
 * 
 * 		this() => 생성자 호출(자신의 생성자)
 * 		this => 자신의 객체
 * 			구분자 => 지역변수와 멤버변수가 같은 경우에 구분하려고 씀
 * 				class A {
 * 					int a;
 * 					void disp(int a) {
 * 						a를 사용하면 => 매개변수값만 사용이 가능
 * 					}
 * 				}
 * 
 * 
 * 		ex)	class B {
 * 				int a;
 * 				void dis(int a)	{
 * 					sout(a);
 * 					this.a = a;			>> this.a가 class B 바로 밑에 있는 a를 가르킨다, this를 안 쓰면 dis의 a를 가르킨다
 * 				}			
 * 			}
 * 
 * 		ex)	class B {
 * 				int a = 10;
 * 			}
 * 			class B extends C {
 * 				int a = 20;
 * 			}	
 * 			void dis(int aa)
 * 				sout(a);	>> B의 a를 출력하고 싶으면 supter.a / B의 a를 출력하고 싶으면 this.a4
 * 				}			
 * 			}
 * 
 * 
 * 		=> 멤버메소드(static이 아닌 메소드)
 * 			=> 모든 멤버변수, static변수, 메소드를 사용할 수 있다
 * -------------------------------------------------------------------------------------------
 * 메소드 : 다른 클래스와 연결 담당(메세지)
 * 			멤버변수에 대한 제어
 * 			반복 제거, 재사용, 수정,  ...
 * 					-----------
 * 					한가지 기능만 수행이 되게 만든다
 * 			메소드는 호출 시에 처음부터 끝까지 수행한다 > 호출한 위치로 돌아간다
 * 			웹에서 동작하는 부분이 메소드다
 * 				 ----------
 * 				 메뉴 클릭, 버튼 클릭, 이미지 클릭, ...
 * 				 엔터 ...
 * 
 * 		-멤버메소드
 * 
 * 		- 공유메소드 [접근지정어] static 리턴타입 메소드(매개변수목록) 선언부
 * 		static [접근지정어] 
 * 		{
 * 		구현부
 * 		}
 * 
 * 		- 메소드 호출
 * 		멤버메소드
 * 			클래스 객체명 = new 생성자();
 * 			객체명.메소드()
 * 
 * 		- 공유메소드
 * 			클래스명.메소드()
 *		
 *	메소드 유형
 *		리턴타입		매개변수
 *		  O			  O
 *		  O			  X
 *		  X			  O
 *		  X			  X
 *		- 리턴타입은 한 개만 사용이 가능 (결과값이 많은 경우 > 클래스 또는 배열)
 *		- 매개변수는 여러 개 있는 경우도 있다 > 최소화하여 사용	
 *	
 * 
 * 
 * 
 * 
 * 
 * 
 */


// 오류 예시
//class A {
//	 int a;
//	 for(int i = 0; i <= 10; i++) {				>> 오류 난다
//		 a = i;
//	 }
//}


// static 블록 활용
//class A {
//	static int a;
//	static {
//		for(int i = 1; i <= 10; i++) {
//			a = i;
//		}
//	}
//}


// 생성자 활용
//class A {
//	int a;
//	A() {
//		for(int i = 1; i <= 10; i++) {
//			a = i;
//		}
//	}
//}


// 오류 예시
//class A {
//	int b;
//	static int a;
//	{
//		b = 10;
//		a = 20;
//	}
//	static {
//		a = 20;
//		b = 10;		>> static 안에 인스턴스 변수 들어가면 오류가 난다
//	}
//}


// 초기화 순서
class A {
	int a = 10;
	static int b = 20;
	{
		System.out.println("인스턴스 초기화 블록 변경 전 a = "+a);
		a = 100;
		System.out.println("인스턴스 초기화 블록 변경 후 a = "+a);
	}
	
	static {
		System.out.println("static 초기화 블록 변경 전 b = "+b);
		b = 100;
		System.out.println("static 초기화 블록 변경 후 b = "+b);
	}
	
	A() {			// 여기는 직접 호출해야 함
		System.out.println("인스턴스 생성자 변경 전 a = "+a);
		a = 1000;
		System.out.println("인스턴스 생성자 변경 후 a = "+a);
		
		System.out.println("static 생성자 변경 전 b = "+b);
		b = 2000;
		System.out.println("static 생성자 변경 후 b = "+b);
		
		// 순서 		명시적 초기화 > static 블록 > 인스턴스 블록 > 생성자	: 생성자를 이용하면 이전 초기화는 필요가 없다
		
	}
}


public class 클래스_구성요소 {

	public static void main(String[] args) {
//		
//		System.out.println(A.a);
		
		A aa = new A();
//		System.out.println(aa.a);
		
		System.out.println(aa.a);
		System.out.println(A.b);
		
		
		
		
	}

}

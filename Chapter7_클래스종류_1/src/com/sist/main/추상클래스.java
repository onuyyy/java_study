package com.sist.main;
/*
 * 추상클래스 (abstract)
 * 	메소드 관련 (구현이 안된 메소드) 
 * 	=> 상속과 더 깊은 관련이 있다 (오버라이딩)
 * 
 * **오버라이딩 조건
 * 	상속을 받아서 기존의 기능을 변경해서 사용하는 기법 modify
 * 		1) 상속관계가 존재해야 한다
 * 			=> 단독 사용이 불가능하다 (메모리 저장이 안 된다 : 미완성된 클래스)
 * 			=> 사용법은 상속을 내린 후에 상속을 받은 클래스를 통해서 메모리가 할당된다
 * 				class A
 * 				class B extends A
 * 					=> A a = new B();
 * 					=> A a = new A(); > 이건 오류
 * 		2) 메소드명이 동일해야 한다
 * 		3) 리턴형이 동일
 * 		4) 매개변수가 동일 (매개변수가 다른 경우 => 오버로딩)
 * 		5) 접근지정어는 확대 가능 / 축소하면 오류 발생한다
 * 			private < default < protected < public
 * 		*** 기본 목적 : 여러 개의 클래스를 모아서 한 개의 이름으로 제어
 * 		*** 프로그램 설계 (미완성된 클래스)
 * 			= 요구사항분석
 * 				벤치마킹 : 여러개 사이트를 참조
 * 					ex) 로그인 => 만 개의 레시피
 * 						회원가입 => 망고플레이트
 * 						예약 => CGV
 * 			= 프로그램에 맞게 구현헤서 사용
 * 				ex) void btnClick();
 * 					=> 로그인 버튼 
 * 			= 한 개의 객체를 통해서 여러 개를 제어하는 프로그램 
 * 
 * 추상클래스
 * 	=> 공통적으로 사용하는 부분 (코딩 내용을 다르게 만들 경우)
 * 	ex) 
 * 		게시판	 : 목록 출력, 찾기, 글쓰기, 내용보기
 * 		묻고 답하기 : 목록 출력, 찾기, 글쓰기, 내용보기, 답변하기
 * 		댓글 게시판 : 목록 출력, 찾기, 글쓰기, 내용보기, 답변하기, 댓글
 * 		후기 게시판 : 목록 출력, 찾기, 글쓰기, 내용보기, 답변하기, 댓글, 업로드
 * 
 * 		abstract class Board {
 * 			목록출력();
 * 			찾기(){};
 * 			글쓰기();
 * 			내용보기(){};
 * 		}
 * 
 * 		** 권장사항 : 한 개 이상의 추상메소드를 포함한다 => 구현이 안된 메소드
 * 			
 * 			void find();
 * 			Board content();
 * 			void write();
 * 
 * 		추상클래스의 특징
 * 			1) 단일상속 -> extends
 * 			2) 메소드가 구현이 안된 것이 있으면 미완성 클래스라고 한다 => 메모리에 단독으로 저장할 수 없다
 * 				abstract class A
 * 					=> A a = new A();	>> 불가!!
 * 			3) 상속을 내려서 구현된 클래스를 이용해서 메모리를 할당한다
 * 				abstract class A
 * 				class B extends A
 * 				------------------ 구현이 안된 메소드를 구현한다 >> 상속 받아서 구현해야 함 무조건 구현해야 함
 * 				=> A a = new B();	 이렇게 해야 함 (묵시적 형변환)
 * 				   double d = 10;	 작은 클래스를 큰 클래스에 대입하면 자동형변환		
 * 				=> A a = new B();
 * 				   B b = (B)a;		=> 명시적 형변환
 * 				
 * 		** 클래스는 상속관계, 포함관계 => 크기를 잴 수 있다
 * 			상속을 내리는 클래스 > 상속을 받는 클래스
 * 			포함하고 있는 클래스 > 포함되는 클래스보다 크다
 * 			
 * 			class A
 * 			class B extends A		==> A > B = is-a
 * 			class A {
 * 				B b = new B();
 * 			}
 * 			class B ==> A > B = has-a
 * 			
 * 			4) 목적 : 관련된 여러 클래스를 묶어서 한 개의 이름으로 관리
 * 					---------------
 * 						=> 공통적인 기능
 * 						=> 버스, 미들버스, 고속버스, 좌석 버스
 * 						   --------------------------- 버스 ==> 이게 추상클래스
 * 			5) 선언된 메소드가 있는 경우 => 상속시 반드시 구현해야 한다
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.io.*;
abstract class 도형 {
	
	// 무조건 구현이 필요하다
	
	public abstract void draw();
		
		// 필요시에 오버라이딩을 한다
	
		public void color() {
			System.out.println("검정색");
		}
	}

class 선 extends 도형 {

	@Override
	public void draw() {
		
		System.out.println("선을 그린다");
		
	}
	
}

class 원 extends 도형 {

	@Override
	public void draw() {
		
		System.out.println("원을 그린다");
		
	}
	
}

class 네모 extends 도형 {

	@Override
	public void draw() {
		
		System.out.println("네모를 그린다");
		
	}
	
}

//interface A {
//	
//}

/*
 * 1. 일반 클래스 => new
 * 2. 추상 클래스 => 구현 후 사용
 * 3. 인터페이스 => 추상클래스와 동일
 * 4. 파일널 클래스(종단 클래스) => 상속해서 확장 불가능
 * 5. static => 클래스 이름으로 접근, 메모리 할당 필요없음 
 * ------------------------------------------------
 * 
 * 
 * 
 * 
 * 
 * 
 */


abstract class A {
	
	public abstract void aaa();		// abstract 안 적을시  추상클래스에서 구현 안 해도 된다
	public abstract void bbb();
	public abstract void ccc();
	public abstract void ddd();
	public abstract void eee();
	
}

class B extends A {

	@Override
	public void aaa() {							// 괄호를 열고 닫으면 구현된 걸로 인식
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ccc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ddd() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eee() {
		// TODO Auto-generated method stub
		
	}			// A의 추상클래스를 구현해야 한다
	
	
	
}


public class 추상클래스 {

	public static void main(String[] args) {
		
		// 오버라이딩 기법
		
		도형 a = new 선();
		a.draw();
		a = new 원();
		a.draw();
		a = new 네모();		
		a.draw();		// a라는 객체 안에 선 원 네모 다 넣었다
		
		OutputStream out;
		


	}

}

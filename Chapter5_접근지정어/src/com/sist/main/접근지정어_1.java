package com.sist.main;
/*
 * 
 * 객체지향 프로그램
 * 1) 틀래스의 구성 요소 => 클래스 (모델링)
 * 2) 객체지향의 3대 요소
 * 		= 캡슐화 : 데이터 보호 목적 (다른 클래스에서 접근하지 못하게, 데이터 손실이 없게)
 * 				=> 접근하는 범위를 지정해야 함 : 접근지정어
 * 		= 상속/포함 : 재사용
 * 		= 오버라이딩/오버로딩 = 다형성 (수정, 추가가 가능)
 * 3) 클래스의 종류
 * 		= 추상 클래스 / 인터페이스
 * 		= 내부 클래스
 * 		= 종단 클래스
 * 		= 공유 클래스
 * ----------------------------------------------------- 여기까지 객체지향
 * 4) API : 자바에서 지원하는 클래스 (라이브러리)
 * 		java.lang
 * 		java.util
 * 		java.io
 * 		java.net
 * 5) 클래스 조립법 : 사용자 정의 + 라이브러리
 * -----------------------------------------------------
 * 
 * 1. 접근지정어의 종류
 * 
 *						 클래스내에서만 사용		//		같은 패키지에서만 사용		//		같은 패키지에서만 사용 		//		모든 클래스 접근
 * 						(자신의)													상속을 받은 클래스는 다른 패키지
 * 																						상에서 접근
 * ---------------------------------------------------------------------------------------------------------------------------------
 * private					O							 	X								X							 X
 * 은닉화
 * 멤버변수
 * class A {
 * 	private int age;
 * }
 * ---------------------------------------------------------------------------------------------------------------------------------
 * default					O								O								X							X
 * class A {
 * 	int age;
 * }
 * ---------------------------------------------------------------------------------------------------------------------------------
 * protected				O								O								O							X
 * class A {
 * 	protected int age;
 * }
 * --------------------------------------------------------------------------------------------------------------------------------- 
 * public					O								O								O							O
 * class A {
 * 	public int age;
 * }
 * --------------------------------------------------------------------------------------------------------------------------------- 
 * 
 * 1) 변수 ==> private
 * 2) 메소드 ==> 다른 클래스와 연결 (통신수단) ==> public
 * 3) 생성자 ==> public (다른 클래스에서 메모리 할당 후에 사용)
 * --------------------------------------------------------------------------------------------------------------------------------- 
 * 4) 클래스 ==> public
 * 5) 조립 : 모든 클래스가 연결 (변수)
 * 			변수는 private, 접근은 method 통해서 사용
 * 						은닉화 ==> 캡슐화
 * 		1. 변수를 다른 클래스나 자신의 클래스에서 사용
 * 		   ---- 읽기 / 쓰기 기능
 * 			    ---------- getter / setter
 * 
 * 
 * 
 * 
 */

class Student {
	
	// 한 명의 학생에 대한 정보를 은닉화
	private int hakbun;
	private String name;
	private int kor,eng,math;
	// 변수의 기능은 읽기.쓰기 만들어주기 >> 메소드
	
	public int getHakbun() {
		return hakbun;
	}
	
	/*  
	 * 지역변수 : 메소드 안에 선언변수, 매개변수
	 * 멤버변수 :  저장 위치가 다르기 때문에 변수명이 동일할 수 있다
	 * 			class Human {
	 * 				String name;		>> 멤버 변수 : 클래스 전체에서 사용, 다른 클래스에서도 호출 가능
	 * 				public void setName(String name) {		>> String name 우선순위
	 * 					int a = 10;		>> 지역변수	>> 지역변수 우선순위
	 * 				sout(name)
	 * 				=> 지역변수와 멤버변수가 같은 경우 구분 => this 사용 (클래스 자신)
	 * 											   => this.name => human이 가지고 있는 name 변수
	 * 				=> 변수명이 다른 경우
	 * 					1. 지역변수에서 먼저 찾고 없으면 멤버변수로 넘어가서 찾음
	 * 			}
	 */
	public void setHakbun(int hakbun) {		// 지역변수와 멤버변수가 충돌할 때만 this를 사용
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
}
public class 접근지정어_1 {

	
	
	public static void main(String[] args) {
		
		// 1명의 학생을 저장한다
		
		Student hong = new Student();
		//  변수의 초기화
		//		 ----- 생성자 이용할지 직접 입력할지
		
		hong.setHakbun(1);
		hong.setName("홍길동");
		hong.setKor(88);
		hong.setEng(90);
		hong.setMath(85);
		
		System.out.println(hong.getHakbun()+" "+hong.getName()+" "+hong.getKor()+" "+hong.getEng()+" "+hong.getMath());

		/*
		 * 캡슐화를 사용하는 이유
		 * 외부에서 잘못되 사용이나 변수에 대한 손상을 방지하기 위해 사용
		 * 	=> 캡슐화를 사용하기 위해서 만드는 방법 : 접근지정어 (private)
		 * 
		 * 
		 */
		
		
		
	}

}

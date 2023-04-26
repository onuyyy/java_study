package com.sist.lib;
/*
 * 
 * toString() : 객체를 문자열화 시킨다
 * 
 * 	 (String)으로 형변환
 * 	 .toString
 * 
 * 
 * class A {
 * }
 * A a = new A();
 * 
 * 
 * 
 * 	1) 명시적 : sout(a.toString()) => a의 주소값 출력
 * 	2) 묵시적 : sout(a)
 */

class Member {
	
	private int mno ;
	private String name;
	
	public Member(int m, String n) {
	
		mno = m;
		name = n;
		// this. 생략할 수 있다 => 변수명이 다르기 때문에
		// 지역변수, 매개변수를 찾는다 => 없는 경우 멤버변수를 찾는다
	
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "회원번호 : "+mno+", 이름 : "+name;
	}
	
}




public class 라이브러리_Object_2 {


	public static void main(String[] args) {
		
		Member m1 = new Member(1, "박문수");
		Member m2 = new Member(2, "심청이");
		
		System.out.println("m1 묵시적 (toString 생략) : "+m1);
		System.out.println("m1 명시적 : "+m1.toString());
		
		System.out.println("m2 묵시적 (toString 생략) : "+m2);
		System.out.println("m2 명시적 : "+m2.toString());

		
		// 원래 m1 = 하면 주소값이 출력되는데, 오버라이딩으로 덮어놔서 문자열이 출력된다
		// toString : 객체를 문자열로 변환시킨다
		
		
	}

}

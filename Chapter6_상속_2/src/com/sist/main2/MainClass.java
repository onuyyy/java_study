package com.sist.main2;
/*
 * 오버라이딩 : 재정의
 * 	= 변수 오버라이딩 : 변수명이 동일
 * 	= 메소드 오버라이딩 : 메소드명이 동일
 * ------------------------------------------------------------
 * 		
 * 
 * 					   [오버로딩]		       [오버라이딩]				=> 둘을 모아서 다형성이라고 한다
 * -------------------------------------------------------------
 * 클래스 관계		 	  같은 클래스				상속 관계
 * ------------------------------------------------------------- 	
 * 메소드명				동일					  동일
 * ------------------------------------------------------------- 
 * 리턴형		     	  관계 없음				  동일
 * -------------------------------------------------------------
 * 매개변수	     개수, 데이터형이 다르다			  동일
 * -------------------------------------------------------------
 * 접근지정어		 	  관계 없음				확장이 가능
 * -------------------------------------------------------------  
 * 목적				새로운 기능 추가		  기존 기능을 수정
 * -------------------------------------------------------------
 * 
 * => 오버라이딩은 메소드를 변경하는 것이다 
 * => 
 * 
 * 
 */

class Human {		// Human의 Super는 Object이다
	int a = 10;
}

class Student extends Human {
	//	int a = 20;		//	변수 새롭게 만드는 것 : 변수 오버라이딩
	public Student() {
		
		this.a = 100;
		int a = 30;		//	이게 this.a위에 있으면 Human에서 내려온 a 이고 지금 자리에 있으면 지역변수인 게 된다
		
		System.out.println("a 값 : "+a);				// 지역변수			
		System.out.println("a 값 : "+this.a);		// Student의 변수		
		System.out.println("a 값 : "+super.a);		// Human 변수			
	}
}

public class MainClass {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		
	}

}

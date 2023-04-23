package com.sist.main2;

// Object는 모든 클래스의 상위 클래스 (모든 클래스는 Object 상속을 받는다 => 최상위 클래스)
/*
 * 
 * class A (extends Object) >> 생략되어 있음
 * class B extends A
 * 
 *	  Object
 * 		A
 * 		ㅣ
 * 		B
 * 
 * 	Object o = new A();
 * 	Object o = new B();
 * 
 */

public class Container {		// Container 클래스를 관리하는 클래스
	
	public Object getBean(int no) {
		
		
		Object o =null;
		if(no==1)
			o = new A();
		else if(no==2)
			o = new B();
		else if(no==3)
			o = new C();
		else if(no==4)
			o = new D();
		else if(no==5)
			o = new E();
		
		return o;
		
		
//		Object o = new A();
//		o = new B();
//		o = new C();
//		o = new D();
//		o = new E();
//		o = "";
//		o = 10;
//		o = 'a';
//		o = true;
//		Object[] a = {10,"",10.6};		// 배열 안에 섞을 수도 있다
//		// Object는 모든 데이터형을 다 받을 수 있다
//		


	}

}

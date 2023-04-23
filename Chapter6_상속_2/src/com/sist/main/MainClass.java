package com.sist.main;
/*
 * 스프링 => 1) 가급적이면 상속없이 독립적인 클래스
 * 		   2) new를 사용하지 않는다
 * 상속 => 재사용기법	(is-a)
 * 단점 : 속도가 느리다 (사용빈도 극히 드물다)	=> 포함 클래스(has-a)
 * 
 * 	상속					포함
 *  ---     			---
 *  기능 수정				제공한 그대로 사용
 *  메소드를 수정하거나		-------------- 오버라이딩이 가능 (익명의 클래스)
 *  변수를 추가해서 사용
 * 
 * => 상속을 받는 경우
 * 	class A {
 * 		int a;
 * 		int b;
 * 		static int c;
 * 	}
 * class B extends A {
 * 		// int a, b;
 * 		int d;
 * 		int e;
 * }
 * 
 * 	B b = new B();	=>	A 객체가 먼저 생성된 다음에 B 객체가 생성이 된다
 * 
 * 	기존의 클래스를 재사용이 가능, 수정, 추가
 * 	----------------------
 * 		소스 코딩량을 줄일 수 있다 => 스프링
 * 		코드를 공통적으로 사용하기 때문에 관리가 편하다
 * 		class A {
 * 			public void disp() {}		>> 여기를 바꾸면 상속 받은 애들도 다 바뀜
 * 		}
 * 		class B extends A {
 * 		}
 * 		class C extends A {
 * 		}
 * 
 * 
 * 
 * 
 */

class Super {
	int a,b;
	static int c;
	
	public Super() {		// 생성자 호출 메모리가 할당
		System.out.println("Super 클래스 메모리 할당");
	}
}

class Sub extends Super {
	int d,e;
	
	public Sub () {
		System.out.println("Sub 클래스 메모리 할당");
	}
}




public class MainClass {

	public static void main(String[] args) {
		
		Sub sub = new Sub();
		// 
		
		
		
		

	}

}

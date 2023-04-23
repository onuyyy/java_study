package com.sist.main3;

import java.io.FilterOutputStream;

/*
 * 인터페이스 간의 상속
 * interface A
 * interface B extends A
 * 			   ------- 상속
 * 
 * interface A {
 * 		void aaa();
 * }
 * iterface B extends A {
 * 		void bbb();
 *		// void aaa()
 * }
 * class C implements B {		
 * 		public void aaa(){}
 * 		public void bbb(){}
 * }
 * 
 * 
 * 
 * 
 */


interface A {
	
}
interface B extends A {		// A > B
	
}
class C implements B {		// C < B		>> ** interface도 클래스와 동일하다 >> 상속 과정을 거치면 동일한 크기가 나온다
										//  >> 구분 : 클래스는 단일 상속, 인터페이스는 다중 상속 
}

public class MainClass {

	public static void main(String[] args) {
		
//		A a = new C();
//		B b = new C();
//		C c = new C();		// 이 방법이 제일 좋음 c는 한 번에 다 처리할 수 있음
//		
//		if(c instanceof A)		// C < A 	c 객체는 a 소속이냐고 묻는 것  : a > c ?
//			System.out.println("ok");
//		if(c instanceof B)		// C < B
//				System.out.println("ok2");
//		if(b instanceof A)		// B < A		
//			System.out.println("ok3");
//		if(a instanceof C)		// A == C	
//			System.out.println("ok4");
//		if(a instanceof B)		// A > B
//			System.out.println("ok5");
		
		String s = "";
		StringBuffer sb =  new StringBuffer();
		Object o = new Object();
		if(s instanceof Object)
			System.out.println("ok");
		if(sb instanceof Object)
			System.out.println("ok2");
		if(o instanceof String)
			System.out.println("ok3");		// o < String?	=>	false = Object가 더 크기 때문에
//		if(s instanceof StringBuffer)
//			System.out.println("ok4");		오류!! : 상속, 포함 관계가 아닌 경우는 크기를 잴 수 없다 (관계가 없어서)
		
		// instanceof는 객체 크게를 잴 때 사용한다
		// 오른쪽 클래스가 크거나 같으면 => true
		// 상속을 내리면 상위클래스가 된다	
				
	}

}

package com.sist.lib;
import java.lang.reflect.Method;
import java.util.*;

class A {
	
	public void aaa() {
		System.out.println("aaa() Call... ");
	}
	
	public void bbb() {
		System.out.println("bbb() Call... ");
	}
	
	public void ccc() {
		System.out.println("ccc() Call... ");
	}
	
	public void ddd() {
		System.out.println("ddd() Call... ");
	}
	
	public void eee() {
		System.out.println("eee() Call... ");
	}
	
	public void ooo() {
		System.out.println("ooo() Call... ");
	}
	
	public void kkk() {
		System.out.println("kkk() Call... ");
	}
	
	
	
}


public class 라이브러리_Object_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("메소드명 입력 : ");
		String m = scan.next();
//		
//		A a = new A();
//		if(m.equals("aaa"))
//				a.aaa();
//		if(m.equals("bbb"))
//			a.bbb();
//		if(m.equals("ccc"))
//			a.ccc();
//		if(m.equals("ddd"))
//			a.ddd();
//		if(m.equals("eee"))
//			a.eee();
		
		try {
			
			// 리플렉션 => 클래스 이름으로 클래스 정보를 읽기 => 모든 제어가 가능
			// 변수, 자동 메모리 할당, 메소드 호출, 생성자 변경
			
			Class clsName = Class.forName("com.sist.lib.A");
			Object obj = clsName.getDeclaredMethods();
			
			Method[] methods = clsName.getDeclaredMethods();
			System.out.println(Arrays.toString(methods));
			
			for(Method mm:methods) {
				
				if(m.equals(mm.getName())) {
					mm.invoke(obj, null);
				}
				
			}
			
		} catch(Exception e) {}
		
		
		

	}

}

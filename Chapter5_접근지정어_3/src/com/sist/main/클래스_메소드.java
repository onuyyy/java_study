package com.sist.main;
import static java.lang.Math.random;
/*
 * import 패키지명.클래스명
 * import 패키지명.*	>> 이 패키지 안에 들어있는 모든 클래스 불러오기
 * import static java.lang.Math.random;
 * java.lang.* => 자동 로딩이 된다, import를 사용하지 않는다
 * 				ex) String, Math, ...
 * void method() {
 * 	return;		>> 자동 설정이 된다 (생략이 가능하다) => void에서만
 * 				>> return은 중간에 존재할 수도 있다 
 * }
 * 
 * class A {
 * 	A() {}	>> 디폴트 생성자, 내가 입력 안 해도 자동으로 붙어있다
 * }
 * 
 */

public class 클래스_메소드 {

	public static void main(String[] args) {
		
	int a = (int)(random()*100)+1;
	System.out.println(a);
		
	
	}

}

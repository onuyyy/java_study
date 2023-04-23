package com.sist.main;
/*
 * 접근지정어 : 접근 범위 지정 => 생성자, 메소드, 변수
 * private : 자신의 클래스에서만 사용이 가능 => 멤버변수는 private
 * 			=> 다른 클래스와의 연결 불가
 * 			=> 이 담점을 보완할 수 있는 것이 getter setter
 * 				변수는 은닉화하고 메소드를 통해서 접근하는 방식 (캡슐화)
 * 				은닉화와 캡슐화의 차이점?	:
 * default : 같은 패키지 안에서 접근
 * 				=> 한 파일에 class를 두 개 만들지 않는다
 * protected : 같은 패키지 안에서 접근, 상속이 있는 경우에는 다른 패키지에 접근이 가능
 * public : 패키지 관계없이 모든 클래스에서 접근이 가능하다
 * ----------------------------------------------------------------------
 * 형식)
 * 	멤버변수는 	> private
 * 	메소드, 생성자 	> public : 다른 클래스와 연결을 담당
 * ----------------------------------------------------------------------	
 * 매개변수로 객체 전송 => 주소 메모리 주소 (변경 => 자체가 변경)
 * 	== 얕은 복사
 * 
 * class A 
 * 
 * A a = new A();	> 얕은 복사
 * A b = a;
 * 
 * 매개변수 전송 방식
 * --------------
 * 값 복사 : 값만 전송, 복사본					>> 기본형 (int, double, String, ..)
 * 주소 복사 : 주소 전송, 원본 : 바뀌면 같이 바뀜		>> 배열, 클래스
 * 
 * 
 * class Member {
 * 번호
 * 이름
 * 아이디
 * 비민번호
 * 성별
 * 생년월일
 * 이메일
 * 주소
 * 전화
 * }
 * 
 * 	=> void memberJoin(번호, 이름, id, pw, 성별, 생년월일, 이메일, 주소, 전화) {
 * 			오라클에 저장해라(명령)
 * 		}
 * 
 * 
 * 
 */

class Value {
	int a = 10;
	int b = 20;
}

public class 접근지정어 {
	

		static void swap(int a, int b) {
			int temp = a;
			a = b;
			b = temp;
			System.out.println("a = "+a+" , = "+b);
			
	}
		
		static void swap(Value v) {		// 위에 메소드랑 메소드명은 같은데 매개변수가 다르다 > 오버로딩
			int temp = v.a;
			v.a = v.b;
			v.b = temp;
			System.out.println("v.a = "+v.a+" , v,b = "+v.b);
		}
		
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		swap(x,y);
		System.out.println("x = "+x+" , y = "+y); 		// >> 값 복사
		
		Value a = new Value();
		swap(a);
		System.out.println("a.a = "+a.a+" , a.b = "+a.b);
		
	}

}

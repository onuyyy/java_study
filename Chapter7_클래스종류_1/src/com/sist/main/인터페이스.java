package com.sist.main;

import org.jcp.xml.dsig.internal.SignerOutputStream;

/*
 * 
 * 1. 사용처의 응용을 할 줄 알아야 함
 * 
 * 	인터페이스	: 추상클래스의 일종 (보완)
 * 		1) 다중 상속
 * 		2) 인터페이스는 클래스와 동일 (상속을 받으면 상위 클래스다)
 * 		3) 설계만 되어있다 (구현이 안된 메소드만 모아서 선언)
 * 		4) 장점
 * 			= 기능 설계 => 개발 시간이 단축된다
 * 			  아키텍처 (PM)		DBA
 * 			= 요구사항 분석 => 데이터베이스 설계 => 데이터 수집
 * 			  --------------------------
 * 				추삭클래스 / 인터페이스 설계
 * 					     => 화면 UI => 퍼블리셔
 * 						 => 구현	   => 웹 프로그래머
 * 						 => 테스팅   => 테스터
 * 						 => 배포 	   => PL
 * 			= 표준화 가능 : 같은 메소드를 사용해야 함
 * 			  -------- 스프링 (통합)
 * 			  프레임워크 : 세트 
 * 			= 서로 관계 없는 클래스를 연결해서 사용할 수 있다
 * 			= 유지보수가 편하다
 * 			   (수정)
 * 			= 독립적으로 사용할 수 있다
 * ------------------------------------------------------
 * 클래스 여러 개를 묶어서 한 개의 이름으로 제어할 수 있다
 * 						List (가변형) - Map, Set
 * 		 				 ㅣ	
 * ------------------------------------------------------
 * ㅣ				ㅣ			ㅣ			ㅣ			ㅣ
 * ArrayList	LinkedList    Vector	  Queue		  Stack
 * 
 * List list = new ArrayList()
 * list = new Vector()
 * list = new LinkedList()
 * list = new Queue()
 * list = new Stack()
 * 						=> 한 개의 이름으로 여러 개를 사용할 수 있다
 * 
 * 웹에서 가장 많이 사용하는 라이브러리
 * 	1) String
 *  2) List
 *  3) Integer (int를 사용하기 편리하게 만든 클래스)
 *  	웹/윈도우 => 모든 데이터형이 String
 *  	page = 1 => "1" => 1 ==> Wrapper 
 *  	<input type = text>
 *  	JTextField
 * 
 * 	형식)
 * 		[접근지정어] interface InterfaceName {
 * 
 * 			상수 
 * 				int a;	>> 오류나는 코드
 * 				int a = 10;	>> 상수형이라 값을 줘야 함 / int 앞에 (public static final) 가 생략되어 있음 > 자동 추가 
 * 			추상메소드
 * 				void display();
 * 				public static final void display();	>> 옆에 두 개가 같은 코드 
 * 		}
 * 
 * 
 * ** 자동으로 컴파일러가 채워주는 것들
 * 		1) import java.lang.*;	=>	String, Math, ...
 * 		2) 메소드	=>	void aaa() {
 * 						return; >> 자동 추가
 * 					}
 * 		3) 생성자	=>	class A {
 * 						A() {}
 * 					}
 * 		4) 인터페이스
 * 			변수 선언	=>	(public static final)int a = 10;	>> 앞에 public static final이 생략되어있음 
 * 						(public abstract) void display();
 * 						구현이 가능한 메소드
 * 						(public) default void aaa() {}
 * 						**interface는 상수, 메소드 => public만 사용한다
 * 		= 선언만 되어있어서 상속을 내려야 한다 
 * 			=> 상속 받은 클래스를 구현해서 사용한다 (오버라이딩)
 * 		= 다중 상속을 지원한다
 * 
 * 	인터페이스 상속 과정
 * 	interface A
 * 	class B extends A ==> 오류  >> 확장해서 사용한다는 듯
 * 	class B implemets A >> 구현 후에 사용한다는 뜻 "인터페이스"
 * 
 * 	interface ==> interface
 * 		interface A
 * 		interface B ( extends ) A		
 * 		interface ==> class
 * 
 * 		interface A
 * 		class B ( implements ) A
 * 		class	  ==> interface
 * 
 * 		class A
 * 		interface B (  ) A	==> 오류
 * 
 * 		
 * 		interface A
 * 		interface B extends A
 * 		class C implements B ==> 단일 상속
 * 
 * 		interface A
 * 		interface B
 * 		class C implements A,B ==> 다중 상속 (두 개를 동시에 받을 수 있음)
 * 
 * 		interface A
 * 		interface B
 * 		class C
 * 		class D extends C implements A, B	>> 클래스 C로부터 상속 받고, 인터페이스 A, B를 받는다
 * 
 * 		class E extends JFrame implements MouseListener, LeyListener, ActionListener, Runnable
 * 			=> 인터페이스가 여러 개 붙을 수도 있다
 * 		
 * 		=> 게임을 만든다 : 마우스, 키보드, 버튼, 쓰레드 
 * 
 * 
 * 	
 * 일반메소드
 * interface A {
 * 	JDK1.8이상 => 
 * 	(public) default void display() {}		>> dafault를 붙여야 구현이 가능하다
 * 	(public) abstract void doGame();
 * }
 * 
 * interface A {
 * 	void aaa();
 * 
 * class B implements A {		>> 이대로 쓰면 구현 안 해서 오류  implements는 구현해서 사용한다는 것임
 * 
 * }
 * 
 *  * interface A {
 * 	void aaa();
 * 
 * class B implements A {		
 * 	public void aaa() {}
 * }
 * 
 * 
 * 
 * 
 * **
 * 1) 인터페이스는 객체를 생성할 수 없다	
 * 		=> 구현이 안된 메소드를 가지고 있기 때문에 메모리에 저장이 불가능하다	=> 가능한데.. 복잡하다	= 익명의 클래스를 이용하면 객체 생성할 수 있다
 * 		인터페이스 = new 구현한 클래스()
 * 2) 인터페이스는 다중 상속이 가능하다
 * 		class A implements 인터페이스, 인터페이스, ... >> 원하는만큼 상속받을 수 있다
 * 
 * 
 * 
 *
 * 
 * 
 * 
 * 
 */


interface AA {
	int a = 10;
	void aaa();
}
interface BB {
	int a = 20;
	void bbb();
}
class CC implements AA, BB {
	// AA.a , BB.a
	
	public void print() {
		System.out.println(AA.a);
		System.out.println(BB.a);
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("BB.bbb()구현");
		
	}

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("AA.aaa()구현");
		
	}
}



//interface A {
//	
//	private int a = 10;	// >> 오류나는 코드, 인터페이스는 public이다
//	void display();		// >> public static final 생략되어서 오류 안 남
//	
//}





public class 인터페이스 {

	public static void main(String[] args) {
		

		
		System.out.println("=====AA 클래스 동작=====");
		AA aa = new CC();	// implements도 extends와 동일하게 적용 AA가 CC보다 더 커서 형변환 가능
		// bbb는 호출 불가	A가 bbb를 가지고 있지 않기 때문에
		aa.aaa();
		
		System.out.println("=====BB 클래스 동작=====");
		BB bb = new CC();
		bb.bbb();

		System.out.println("=====CC 클래스 동작=====");
		CC cc = new CC();
		cc.aaa();
		cc.bbb();
		cc.print();
	}

}

package com.sist.main;
/*
 * 1. 제어어
 * 	1) static : 공통적인
 * 		=> Math : Math가 가지고 있는 모든 메소드는 static으로 되어있다
 * 	2) final : 마지막 => 변수(상수) / class(종단클래스 => 확장 불가, 상속 불가)
 * 		=> class final className
 * 			: System, String, Math, StringBuffer => 있는 그대로 사용해야 함
 * 				=> java.lang.*;
 * 	3) abstract : 추상적인 => 공통점을 모아준다 => 프로그램에 맞게 구현
 * ======================================================================
 * 클래스의 종류
 * 	1) 추상클래스
 * 		형식)
 * 		public abstract class ClassName {
 * 			1. 변수 (멤버변수)
 * 			2. 메소드 : 구현된 메소드 
 * 			3. 메소드 : 구현이 안된 메소드 (선언)
 * 				=> 자신이 메모리 할당을 할 수가 없다
 * 					ex) 
 * 						abstract class A {
 * 						}
 * 						A a = new A();		>> 오류 A 클래스에서 구현이 안 되어있기 때문에
 * 											>> 상속을 받아서 구현이 안된 메소드를 구현 후에 사용한다 => 오버라이딩
 * 					class B extends A { 
 * 					}					
 * 					A a  = new B();		=> 묵시적 형변환 (자동형변환)
 * 										=> a가 가지고 있는 메소드는 B로 대체
 * 					B b = new B();		
 * 			4. 생성자
 * 		}
 * 	2) 인터페이스 : 추상 클래스의 단점을 보완
 * 				- 단일 상속 => 다중상속으로 바꾼다
 * 				- 추상 클래스의 일종 (클래스 => 상위클래스)
 * 				- 인터페이스의 모든 메소드와 변수는 public
 * 				- 다른 접근지정어는 사용 불가
 * 				- 추상클래스나 인터페이스는 상속을 받는 경우 반드시 선언만 된 메소드를 구현해서 사용한다 (블록을 열고 닫으면 구현이 됨)
 * 				- 추상 클래스 : 입출력, 네트워크, 데이터연결
 * 				- 인터페이스 : 윈도우 이벤트, 버튼 클릭, 마우스 클릭, 키보드
 * 
 * 				- 구성요소
 * 					public interface interface명 {
 * 						*변수 설정 
 * 							=> 인터페이스의 변수는 상수형 변수를 가지고 있다
 * 								int a; > 오류
 * 								int a = 10;	> 이렇게 써야 함
 * 								==> 컴파일시 자동으로 public static final int a = 10; 으로 된다
 * 						*메소드
 * 							구현이 안된 메소드
 * 							void display();
 * 								=> 컴파일시 public abstract void display();
 * 										 ----------------> 이 부분은 생략되어 있음 : 자동추가가 된다
 * 									interface A {
 * 										void display();
 * 									}
 * 									class B implement A {
 * 										void display() {		=> 오류 발생 : 접근지정어 축소
 * 										}
 * 									}
 *					 	*메소드	
 * 							구현이 된 메소드
 * 								=> 인터페이스에 선언된 메소드 추가시 관련된 모든 클래스가 오류 발생
 * 							default void methodName()
 * 							------- public이 자동 추가된다
 * 							
 * 						메소드
 * 							구현이 된 메소드
 * 							static void method () {
 * 							}
 * 							public static void methodName()
 * 					}
 * 	3) 내부클래스 (네트워크, 빅데이터)
 * 		멤버클래스 : 쓰레드 => 데이터를 공유할 목적으로 만든다
 * 			class A {
 * 				A, B, C, D, E => 변수나 메소드가 있다		/ A a = new A(); 이렇게 안 하고 그냥 A, B 이렇게 가져다 쓸 수 있음
 * 				class B {
 * 				}
 * 			}
 * 
 * 		익명의 클래스 : 상속없이 오버라이딩 가능하게 만든다
 * 			class A {
 * 				B b = new B() {}	>> 상속없이 생성자 안에서 구현 가능
 * 			}
 * 			class B {
 * 				void display(){}
 * 			}
 * 	
 * 
 * 
 * 
 */

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MainClass extends JFrame implements MouseListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

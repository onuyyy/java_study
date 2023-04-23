package com.sist.main5;

import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		
//		Human h = new Human();
//		h.print();
//		
//		h = new Member();
//		h.print();
//		
//		h = new Sawon();
//		h.print();

		Scanner scan = new Scanner(System.in);
		System.out.print("선택(Human(1), Memner(2), Sawon(3)) : ");
		
		int select = scan.nextInt();
//		if(select==1) {
//			Human h = new Human();
//			h.print();
//			h.aaa();
//			h.bbb();
//		}
//		if(select==2) {
//			Member h = new Member();
//			h.print();
//			h.aaa();
//			h.bbb();
//		}
//		if(select==3) {
//			Sawon h = new Sawon();
//			h.print();
//			h.aaa();
//			h.bbb();
//		}
		
		Human h = null;
			if(select==1)
				h = new Human();
			else if(select==2)
				h = new Member();
			else if(select==3)
				h = new Sawon();
		
			h.print();
			h.aaa();
			h.bbb();
			
	}

}

/*
 * 객체지향 => 묶는 것이다
 * 
 * 	1. 관련된 데이터를 묶는다 : 배열, 클래스
 * 	2. 관련된 명령문을 묶는다 : 메소드
 * 	3. 관련된 클래스를 묶는다 : 상속, 인터페이스
 *
 * 	=> 단점 : 하위클래스에서 기능을 추가하게 되면, 접근이 불가하다
 * 										 ----------- >> 보완하기 위헤 인터페이스가 나옴
 * 
 * 4. 접근지정어
 * 		=> default, protected, public : 상속이 내려감
 * 		=> private : 상속은 되는데, 접근이 불가능
 * 
 * 	  제어어
 * 		=> 변수	: 접근지정어 전체 사용 가능, static, final
 * 		=> 메소드	: 접근지정어 전체 사용 가능, static, final, abstract
 * 		=> 생성자	: 접근지정어만 사용 가능
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

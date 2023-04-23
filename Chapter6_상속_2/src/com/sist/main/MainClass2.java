package com.sist.main;
/*
 * 상속이 있는 경우 => 객체 생성 방법
 * double d = 10; d = 10.0		>> 왼쪽이 크면 묵시적으로 바뀜 10.0
 * 
 * class A
 * class B extends A
 * 
 * 	A (상위 클래스)
 * 	↑
 * 	B (하위 클래스)
 * 
 * 	==> 크기 (범위)	상위 > 하위
 * 		-------- 상속이 되어있냐, 포함되어 있냐
 * 
 * 		A > B
 * 		-------- float > long
 * 
 * 	A a = new A();
 * 	A b = new B();
 * 	B c = new B();
 *  B d = new A(); ==> X
 *  B e = (B)new A(); ==> X
 *  	** 형변환
 *  	(int)10.5
 *  
 *  상속 알아둬야 할 것
 *  1. 형식
 *  	class A extends B => 단일 상속
 *  2. 클래스 크기
 *  	상속을 내리는 클래스 => 상속을 받는 클래스
 *  3. 형변환
 *  	작은 클래스 = 큰 클래스
 *  4. 자바의 최상위 클래스 => object
 *  5. 상속의 예외 : static => 공유, 초기화 블록, 생성자, private (상속은 되는데 접근 불가)
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


class Human {
	
	int a = 10;
	int b = 20;
	static int c = 30;
	public void display() {
		System.out.println("Human : display() call....");
		
	}
	
}

class Student extends Human {
	int d = 40;
	int e = 50;
	
	public void display() {
		System.out.println("Student : display() call....");		//	상속 받아서 변경하는 것! 오버라이딩
		
		/*
		 * 오버라이딩
		 * 1. 상속 => 재정의
		 * 2. 메소드명 동일
		 * 3. 매개변수가 동일
		 * 4. 리턴형 동일
		 * 5. 접근지정어는 확장 가능 / 축소하면 오류
		 */
		
	}
	
	
//	int a = 10;
//	int b = 20;
//	static int c = 30;
//	public void display() >> 변경하자
	
}


public class MainClass2 {

	public static void main(String[] args) {
		
		Human h = new Human();		// a, b, c
		h.display();
		
		Student s = new Student();	// a, b, c, d, e
		s.display();
		
		Human h2 = new Student();	// a, b, c 		작은 클래스를 대입했기 때문에 가능 Human이 Student보다 크다
		h2.display();

//		Student s2 = new Humnan();	>>	오류! 큰 것을 작은 것에 대입했기 때문에
		
//		Student s2 = (Student)new Human();	>>	형변환 오류
		Student s2 = (Student)h2;	// a, b, c, d, e	생성자가 동일해야 한다
		s2.display();
		
//		Student s3 = (Student)h;	// ClassCastException => 형변환 오류
		
		// 사용 범위 ==> 상위클래스는 하위클래스의 추가된 내용에 접근이 불가능하다
		// 뒤에 거 신경 쓰지 말고 앞에 나오는 클래스가 가지고 있는 데이터에만 접근한다
		// 실제 상속 => 라이브러리 (윈도우, 데이터베이스)
		
		/* 
		 * 클래스명과 생성자가 다를 경우에
		 * 	클래스명 변수명 = new 생성자()
		 * 	
		 * 
		 * 		Human h2 = new Student();
		 * 		1) 변수 제어 = 클래스 타입을 따라간다	Human
		 * 		2) 메소드 제어 = 생성자 타입을 따라간다	Student
		 */
		
		
	}

}

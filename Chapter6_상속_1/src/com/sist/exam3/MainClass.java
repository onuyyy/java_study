package com.sist.exam3;

class A {
	
	//	addr과 display를 A가 마음대로 제어하지 못함 static이기 때문에
	
	int a;
	int b;
	String name;
	static String addr;
	public A() {
		
		/*
		 * int a;
		 * int b;
		 * String name;
		 * static String addrl
		 * print()
		 * display()
		 */
		
	}
	public void print() {
		
	}
	public static void display() {		// static 안에서는 인스턴스 마음대로 못 씀 객체 생성 후 써야 함 A aa = new A();
			
		A aa = new A();
		aa.a = 10;
		aa.b = 20;
		aa.name = "홍길동";
		aa.print();

		
	}
	
}


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

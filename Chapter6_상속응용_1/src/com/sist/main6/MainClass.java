package com.sist.main6;

class Super {
	int a = 10;
	int b = 20;
}
class Sub extends Super {
	
	int a = 100;
	int b = 200;
	
	public Sub() {
		
		System.out.println("a = "+a+" , b = "+b);
		this.a = 100;
		this.b = 200;
		System.out.println("a = "+a+" , b = "+b);
		System.out.println("super = "+super.a+" , super = "+super.b);
		
	}
}






public class MainClass {

	public static void main(String[] args) {
		
		Sub sub = new Sub();


	}

}

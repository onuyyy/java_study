package com.sist.lib;


class Sawon2 {
	
	private int sabun;
	private String name;
	
	public int getSabun() {
		return sabun;
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sawon2 (int sabun, String name) {
		
		this.sabun = sabun;
		this.name = name;
		
	}

	
	
	
	// equals 재정의하여 사용한다
	
	@Override
	public boolean equals(Object obj) {
		
		Sawon2 s = (Sawon2)obj;

		return name.equals(s.name) && sabun==s.sabun;
	}
	

	
	public void print() {
		System.out.println("사번 : "+sabun+" 이름 : "+name);
	}
	
	
	
}




public class 라이브러리_Object_3_1 {

	public static void main(String[] args) {
		
//		Sawon s1 = new Sawon(1, "홀길동");
//		System.out.println(s1);
//		s1 = new Sawon(1, "박문수");
//		System.out.println(s1);
		
		// 오버라이딩을 하지 않는 경우 => 주소값을 비교한다
		
		Sawon2 s1 = new Sawon2(1,"홍길동");
		Sawon2 s2 = new Sawon2(1,"홍길동");
		
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1.equals(s2)) {								// Object에 equals는 주소값을 비교한다
			System.out.println("같은 사원입니다");
		} else {
			System.out.println("다른 사원입니다");
		}
		
		
		s1.print();
		s2.print();
		
		String h = "Hello";
		System.out.println(h.length());
		System.out.println("Hello".length());
		
		
		
		
		
		
	}

}



/*
 * String s = "Hello";
 * s.length();
 * 
 * "hello".length();
 * 
 * 
 * 
 */





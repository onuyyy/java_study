package com.sist.lib;
/*
 * equals => Object에서는 객체비교 String에서는 문자열
 */

class Student2 {
	
	private String name;

	
	// getter setter : 데이터는 가둬두고 메소드로  이용
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Student2(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student2)
			return name==((Student2)obj).name;		// 문자열 비교
		else
			return false;
	}
	
	
}


// == (객체 => 주소 비교), equals (객체가 가지고 있는 변수값 비교)
// 재정의를 하지 않는 경우는 == 동일하다

public class 라이브러리_Object_3 {

	public static void main(String[] args) {
		
		Student2 s1 = new Student2("홍길동");
		Student2 s2 = new Student2("홍길동");
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		
		if(s1==s2) {								// 객체 비교에서 주소를 비교하는 중임
			System.out.println("s1과 s2는 같다");
		} else {
			System.out.println("s1과 s2는 같지 않다");
		}
		
		// 주소 -> default는 주소값 비교
		if(s1.equals(s2)) {
			System.out.println("s1과 s2는 같다");
		} else {
			System.out.println("s1과 s2는 같지 않다");
		}
		
	}

}

package com.sist.string;
/*
 * 
 * String : 문자열을 조작하고 처리하는 기능
 * 			= String은 클래스, 일반 데이터형으로 취급
 * 			= 모든 클래스는 Call By Reference, String은 Call By Value
 * 
 * 				A a = new A()
 * 				A b = a;		==> 같은 주소를 제어
 * 				String s = "Hello";
 * 				String s1 = s;	==> s1을 변경하면 s는 변경사항이 없다
 * 			= 메모리 할당 (저장)
 * 				String s = "Hello";
 * 				String s = new String("Hello");
 * 			*** 문자열은 주소 (자체가 주소다)
 * 				=> 같은 문자열이면 같은 주소를 가지고 있다
 * 				=> new 이룔해서 생성이 되면 다른 주소에 저장이 된다
 * 			
 * 
 * 
 * 
 * 
 * 
 */
public class 라이브러리_String_1 {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);

		if(s1==s2) {		// 주소값 비교
			System.out.println("s1과 s2는 같다");
		} else {
			System.out.println("s1과 s2는 같지 않다");
		}
		
		String s3 = new String("Hello");
		System.out.println("s3 : "+s3);
		
		if(s1==s3) {		// 주소값 비교
			System.out.println("s1과 s3의 주소는 같다");
		} else {
			System.out.println("s1과 s3의 주소는 같지 않다");
		}
		
		
		String s4 = new String("Hello");
		// 실제 저장된 데이터값이 같은지 확인 : equals	(object의 equals면 재정의해서 사용해야 함) 
		
		if(s1.equals(s3)) {		// 저장된 값이 같은지 물어보는 것
			System.out.println("s1과 s3는 같은 값을 가지고 있다");
		} else {
			System.out.println("s1과 s3는 다른 값을 가지고 있다");
		}
		
		
		if(s1==s4) {		// 주소값 비교
			System.out.println("s1과 s4의 주소는 같다");
		} else {
			System.out.println("s1과 s4의 주소는 같지 않다");
		}
		
		
		// 문자열 결합 +
		
		String ss ="Hello";
		String ss1 = "Java!!";
		String ss2=ss+ss1;
		
		System.out.println(ss2);
		
		
	}

}

// 주소를 이용해서 제어하는 것을 참조타입이라고 한다
// char[] => 쉽게 사용이 가능하게 만들어준다
















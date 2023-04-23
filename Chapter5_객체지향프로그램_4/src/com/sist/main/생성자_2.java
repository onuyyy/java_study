package com.sist.main;

import java.sql.SQLOutput;

//class Student {
//	
//	int hakbun = 10;			// 여기 쓰는 거 의미 없음	
//	String name;
//	{
//		hakbun = 100;			// 여기 쓰는 거 의미 없음
//	}
//	Student() {
//			hakbun = 1000;		// 최종적인 학번은 1000 	
//	}
//}

/*
 *	멤버변수 초기화 시키는 방법
 *	1. 디폴트 값으로 지정 : 선언만 할 때 자동 생성 
 * 	2. 명시적인 초기화 : 직접 값을 설정 
 * 		class A {
 * 			int a = 10;
 * 		}
 * 	3. 생성자를 통해서 초기화
 * 		class A {
 * 			int a;
 * 			A() {
 * 				a = 100;
 * 			}
 * 		}
 * 
 * 	4. 초기화 블록
 * 		class A {
 * 			int a;
 * 			// a = 1000; > 이건 사용 불가
 * 			{
 * 				a = 1000;	> 이렇게 사용
 * 			}	
 * 		}
 * 
 * 		** 작성 순서 : 디폴트 > 명시적 > 초기블록 > 생성자
 * 			int a = 0	 int a = 10	 int a  = 100 	int a = 1000
 * 
 * 
 * 
 * 
 * 
 */
class Student {
	
	int hakbun;
	String name;
	
	Student() {
		System.out.println("Student call..");
		hakbun = 1;
		name = "홍길동";
	}
	Student(int h, String n) {
		hakbun = h;
		name = n;
	}
}

//class Student {
//	
//	int hakbun = 1;
//	String name = "name";
//
//}


public class 생성자_2 {

	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println(s.hakbun);
		System.out.println(s.name);
		
		Student s1 = new Student();
		System.out.println(s.hakbun);
		System.out.println(s.name);
		
		Student s2 = new Student(2, "씸청이");	// 초기값 다름
		System.out.println(s2.hakbun);
		System.out.println(s2.name);
		
		Student s3 = new Student(3, "박문수");	// 초기값 다름
		System.out.println(s3.hakbun);
		System.out.println(s3.name);
		
		
		
		// 생성자 호출시에는 반드시 new를 앞에 붙여서 호출해야 한다
		// 선언하고 초기화까지만 가능한데, 구현은 안 된다 ex) for문 돌리기 if 조건식....
		

	}

}

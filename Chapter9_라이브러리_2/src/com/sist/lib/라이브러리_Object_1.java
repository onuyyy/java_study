package com.sist.lib;
/*
 *	clone => 복제할 때 사용
 *	: 메모리가 새롭게 생성 (prototype)
 * 
 * 
 * 
 */

class Sawon implements Cloneable  {
	
	private int sabun;
	private String name;
	
	//초기화 
	public Sawon(int sabun, String name ) {
		
		// 지역번수 우선순위
		this.sabun = sabun;
		this.name = name;
	/*
	 *  오버로딩
	 *  생성자 => 여러 개 사용이 가능, 객체 생성시에 호출
	 *  생성자는 무조건 한 개 이상이 있다
	 *  생성자를 사용하지 않으면 자동으로 기본 생성자를 추가
	 *  시작과 동시에 필요한 내용을 서술 
	 *  필요시에만 사용
	 *  	
	 */

	}

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

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	// 재정의 : 오버라이딩 (Object)
	
	public void print() {
		System.out.println(sabun+name);
	}
	
}
public class 라이브러리_Object_1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		// 메모리 할당
		Sawon s1 = new Sawon(1,"홍길동");
	
		s1.print();
		
		Sawon s2 = s1;
		s2.print();
		s1.setSabun(2);
		s1.setName("심청이");
		System.out.println("s2 : "+s2);
		System.out.println("s1 : "+s1);
		
		// 같은 주소를 이용할 때는 다른 객체의 내용도 변경된다
		s2.print();
		
		
		// 복제
		Sawon s3 = (Sawon)s1.clone();	// 예외처리 안 하면 오류 남, Object가 더 크기 때문에 형변환 시켜줘야 함
		System.out.println("s3 : "+s3);
		
		s3.print();
		
		s3.setName("박문수");
		s3.setSabun(5);
		s3.print();
		
		s1.print();
		s2.print();		// s1,s2는 같은 주소이고 s3는 다른 주소라 다른 값이 나옴
		
	}

}

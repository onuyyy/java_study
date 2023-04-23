package com.sist.main;
class Member {
	
	private String name;		// getter setter 필요 >> 메모리에 읽기랑 쓰기밖에 없음
	// 메모리에 저장된 데이터 읽기
	private static Member mem;
	
	public String getName() {
		return name;
	}
	// 메모리에 저장
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static Member newInstance() {
		if(mem==null)
			mem = new Member();
		return mem;
	}
	
}

public class 정적초기화_싱글턴 {						// 하나의 객체를 사용할 때 싱글턴이라고 한다, 하나만 가지고 제어한다

	public static void main(String[] args) {
		
		Member m1 = Member.newInstance();
		m1.setName("홍길동");
		Member m2 = Member.newInstance();
		m2.setName("심청이");
		Member m3 = Member.newInstance();
		m3.setName("박문수");
		
		System.out.println(m1.getName());
		System.out.println(m2.getName());
		System.out.println(m3.getName());
	}

}

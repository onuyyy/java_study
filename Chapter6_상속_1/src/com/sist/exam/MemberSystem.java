package com.sist.exam;
import java.util.Scanner;

public class MemberSystem {

	static Member[] members = new Member[10];
	static int index = 0;
	
	// 회원가입
	public void join() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디, 이름, 성별 입력(hong 홍길동 남자) : ");
		
		members[index] = new Member();		// 이거 없으면 줏
		members[index].setId(scan.next());
		members[index].setName(scan.next());
		members[index].setSex(scan.next());
		index++;
		
	}
	
	public void print() {
		for(Member m:members) {
			if(m!=null) {
				System.out.println(m.getId()+" "+m.getName()+" "+m.getSex());
			}
		}
	}
	
}

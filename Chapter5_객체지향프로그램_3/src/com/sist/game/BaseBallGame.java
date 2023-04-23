package com.sist.game;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 1. 컴퓨터 난수 발생		int[] com
 * 2. 사용자 입력			int[] user
 * 3. 비교				int[] com / int[] user 비교
 * 4. 힌트				s or b
 * 5. 종료 여부			s
 */


public class BaseBallGame {

	int[] com = new int[3];		
	int[] user = new int[3];		// 모든 메소드에서 사용할 수 있음 퍼블릭 : 전역에서 써야 하니까 전역변수로 설정해둠
	int s, b;
	
	
	// 컴퓨터 난수 발생
	
	void rand() {
		for(int i = 0; i < com.length; i++) {
			com[i] = (int)(Math.random()*9)+1;
			for(int j = 0; j < i; j++) {
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	// 2. 사용자입력	void
	
	void userInput() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("세자리 정수 입력 : ");
			int input = scan.nextInt();
			if(input < 100 || input > 999) {
				System.out.println("잘못된 입력입니다");
				continue;							// 도스에서만 사용 (웹에선 없음)
			}
			user[0] = input/100;
			user[1] = (input%100)/10;
			user[2] = input%10;
			
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				System.out.println("같은 숫자 불가");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("0은 사용 불가");
				continue;
			}
			break;		// if문에 해당되는 내용이 없으면 (정상입력) =>  while문 종료한다 break 
		}
	}
	
	
	// 3. 비교		void
	
	void compare() {
		s = 0;		
		b = 0;		// 초기화
		for(int i = 0;  i < com.length; i++) {
			for(int j = 0; j < user.length; j++) {
				if(com[i]==user[j]) {		// 같은 숫자가 있냐?
					if(i==j)
						s++;	// 같은 자리면 s 증가
					else
						b++;	// 다른 자리면 b 증가
				}
			}
		}
	}
	
	
	// 4. 힌트		void
	
	void hint() {
		System.out.printf("inputNumber : %d%d%d, Result : %dS-%dB\n", user[0],user[1],user[2],s,b);
	}
	
	
	// 5. 종료여부		void
	
	boolean isEnd(int s) {
		boolean bCheck = false;		// default가 false이기때문에 3s가 아니면 false 출력
		if(s==3)0
			bCheck = true;
		return bCheck;
	}
	
	
	// 6. 조립		=> process
	
	void process() {
		Scanner scan = new Scanner(System.in);
		
		rand();
		while(true) {
			userInput();
			compare();
			hint();
			if(isEnd(s)==true) {		// true 생략 가능
				System.out.println("게임을 다시 할까요?(y(Y) or n(N))");
				char c = scan.next().charAt(0);
				if(c=='y' || c=='Y') {
					System.out.println("새로운 게임을 시작합니다");
					process();									// 프로세스 메소드를 재호출하는 것	: 재귀 호출, 자기 자신이 본인을 부르는 것. (처음부터 다시 실행)
				} else {
					System.out.println("게임 종료");
//					System.exit(0);		// 프로그램 완전히 종료할 때 쓰는 것
					break;
				}
			
			}
		}
	}
	
	
	public static void main(String[] args) { 
		
		BaseBallGame b = new BaseBallGame();
		b.rand();
		System.out.println(Arrays.toString(b.com));
		b.process();
	
	}
}

package com.sist.main4;
import com.sist.main3.Student;		// 데이터형으로만 사용하는 Student
import java.util.Scanner;
// 패키지가 다르면 임포트 붙여야 쓸 수 있음
/*
 * 1. 데이터형 (변수 묶음) => 사용자 정의 데이터형
 * 2. 기능을 가지고 있는 클래스 제작 (메소드)
 * 3. 사용자에게 보여준다 (조립) => 웹 (메인페이지)
 * 
 * 
 */
public class StudentSystem {

	private Student[] std = new Student[3];
	
	/*
	 * 위 코드는 데이터공간만 생긴 거고 주소값은 null이다
	 */
	
	
//	  1. 학생 초기화
	/* 
	 * - 명시적 초기화 : 객체 생성시 모든 객체값이 동일하다
	 * ------------------------------------------
	 * - 생성자 이용
	 * - 초기화 블록
	 * - 메소드 이용
	 * ----------------- => 위 세 개는 입력값을 받거나 외부에 데이터 읽기
	 * 											-------------- 크롤링 or 파일
	 * ** 클래스 영역(클래스 블록)에서는 선언만 가능하기때문에 선언과 동시에 초기화해야 함
	 * 		>> 제어문, 외부 라이브러리 호출 불가능 >> 클래스 블록 말고 다른 블록 안에 들어가야 함ㄴ
	 */
	 	public void init() {
	 			
	 			Scanner scan = new Scanner(System.in);
	 			for(int i = 0; i < std.length; i++) {
	 				
	 				std[i] = new Student();	// 배열은 모드 저장공간이  null (메모리 연결 필수)
	 				//		-------------->> 여기가 메모리 연결하는 부분 new!!
	 				
	 				System.out.print("학번 입력 : ");
	 				std[i].setHakbun(scan.nextInt());
	 				System.out.print("이름 입력 : ");
	 				std[i].name = scan.next();
					System.out.println("국 영 수 입력 : ");
					std[i].setKor(scan.nextInt());
					std[i].setEng(scan.nextInt());
					std[i].setMath(scan.nextInt());
					System.out.println("성별 입력 : ");
					std[i].setSex(scan.next());
					
					}
	 			}
	 	
	 	
	 	
	 	public void display() {		// default => com.sist.main4 안에서만 접근이 가능
	 		for(Student s:std) {
	 			System.out.println(s.getHakbun()+" "+s.name+" "+s.getKor()+" "+s.getEng()+" "+s.getMath()+" "+s.getSex()+s.getTotal()+" "+s.getAvg()+s.getScore()+s.getRank());
	 		}
	 	}

//		  2. 평균 구하기
	 	
	 	public void stdAvg() {
	 		for(int i = 0; i < std.length; i++) {
	 			std[i].setAvg(std[i].getTotal()/3.0);		// >> 비공개
	 			// std[i].avg = std[i]						   >> 공개
	 		}
	 	}
	 	
//		  3. 총점 구하기
	 	
	 	public void stdTotal() {
	 		for(int i = 0; i < std.length; i++) {
	 			std[i].setTotal(std[i].getKor()+std[i].getEng()+std[i].getMath());		// 메소드 통해서 접근하는 방식이 캡슐화
	 		}
	 	}
	 	
//		  4. 학점 구하기
	 	
	 	public void stdScore() {
	 		
	 		char c = 'A';
	 		for(int i = 0; i < std.length; i++) {
	 			switch((int)(std[i].getAvg())/10) {
	 			case 10 :
	 			case 9 :
	 				c = 'A';
	 				break;
	 			case 8 :
	 				c = 'B';
	 				break;
	 			case 7 :
	 				c = 'C';
	 				break;
	 			case 6 :
	 				c = 'D';
	 				break;
	 			default :
	 					c = 'F';		
	 			}
	 			std[i].setScore(c);
	 			
	 		}
	 		
	 	}
	 	
//		  5. 등수 구하기 
		 
	 	public void stdRank () {
	 		for(int i = 0; i < std.length; i++) {
	 			std[i].setRank(1);
	 			for(int j = 0; j < std.length; j++) {
	 				if(std[i].getTotal() < std[j].getTotal()) {
	 					std[i].setRank(std[i].getRank()+1);
	 				}
	 			}
	 		}
	 	}

	 		}
	 	
	
	 	
	 	

	


	 	
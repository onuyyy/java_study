
/*
 * 자바에서 지원하는 제어문 : 반복 / 조건 / 선택 / 반복제어
 * 	> 변수, 연산자, 제어문
 * 	   ㅣ---------------메소드
 * 	  여러개
 * 	자바에서 지원하는 모든 제어문은 밑에 있는 명령문만 제어할 수 있다 (한 개만 제어한다)
 * 	ex)  if(조건)
 * 			문장1 > 제어
 * 			문장2 > 관련없는 문장
 * 				=> 한 개 이상 명령문을 수행 시에는 반드시
 * 					if (조건) {
 * 					문장1
 * 					문장2
 * 					}
 * 
 * 	> 조건문
 * 		1) 단일 조건문
 * 			if(조건) > 부정연산자 (!), 비교연산자, 논리연산자만 들어올 수 있음 = true or false
 * 			{	조건이 true일 경우에만 수행하는 문장을 작성
 * 			}
 * 
 * 		2) 선택 조건문
 * 		3) 다중 조건문
 * 	> 선택문
 * 		1) while
 * 		2) do while
 * 		3) for
 * 			- 일반 for
 * 			- 향상된 for (for-each) : 웹에서 핵심적
 * 	> 반복문
 * 		1) break
 * 		2) continue
 * ----------------------연산자 응용
 * 	> 반복제어문
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;
public class 조건문 {

	public static void main(String[] args) {
		
		//조건문 (단일 조건문) > 짝수? 홀수?
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력");
		int num = scan.nextInt();
		if(num%2==0) { // 짝수 조건
		
			System.out.println(num+"는(은) 짝수입니다");
			System.out.println("num="+num);			// 무조건 수행하는 문장 if문과 관련 x
		}
		if(num%2!=0) { // 홀수 조건
			System.out.println(num+"는(은) 홀수입니다");
			System.out.println("프로그램 종료");		// 무조건 수행하는 문장 if문과 관련 x
			
			// if문에는 세미콜론 빼라
		}
	}

}

/*
 * 
 * method => 140page
 * 1) 메소드 형식	 >>	기능처리
 * 			리턴형 메소드명(매개변수...) {  >> 구현부
 * 				>> 구현부
 * 			}
 * 		- 리턴타입
 * 			처리 후 결과값 한 개만 전송이 가능하다
 * 			** 여러 개일 경우 : 배열, 클래스
 * 			** 한 개인 경우 : 일반 기본형 or String
 * 			1) 결과값이 있는 경우
 * 				리턴형 메소드명(매개변수가 있거나 없을 수 있음) {
 * 					return 값;		>> 위 리턴형과 일치해야 함 or 리턴형이 큰 데이터형인 경우에 가능
 * 				}
 * 
 * 				ex) int method() {
 * 						return 10.5;	>> 오류 발생 // return (int)10.5;로 형변환하면 가능
 * 					}
 * 
 * 						** int a = method(); >> 10
 * 
 * 					double method() {
 * 						return 10;		>> 가능 double이 int보다 크기 때문에
 * 					}
 * 
 * 						** double a = method();
 * 							>> 결과 값을 받아서 처리해야 한다
 * 
 * 					int[] method() {
 * 						int[] arr = {1,2,3,4,5};
 * 						return arr;		>> 배열은 주소만 넘겨준다
 * 					}
 * 
 * 						** int[] arr = method();
 * 
 * 					String method() {
 * 						return "";
 * 					}
 * 			
 * 						** String s = method();
 * 
 * 
 * 			2) 결과값이 없는 경우	(리턴형이 없는 경우)
 * 				void method() {
 * 					return;		>> 메소드 종료
 * 				}
 * 					==> method();
 * 
 * 		- 메소드명 => 식별자와 규칙과 동일하다
 * 					길이에 제한이 없다 >> 의미를 부여해야 한다 구분할 수 있게끔
 * 		- 매개변수 => 사용자의 요청 값
 * 					
 * 
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;
public class 문제풀이_0422 {
	
//	1. 정수를 입력 받아서 이진법을 출력하는 메소드 작성
//		1) 정수 입력 
//		2) 이진법 처리
//		3) 출력 

	static void process1() {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("정수 입력 : ");
	int num = scan.nextInt();
	
	int[] binary = new int[16];
	int index = 15;
	while(true) {
		binary[index] = num%2;
		num = num/2;
		if(num==0)
			break;
		index--;
	}
	
	for(int i = 0; i < binary.length; i++) {
		if(i%4==0 && i!=0)
			System.out.print(" ");
		System.out.print(binary[i]);
		
	}
	
	
//	System.out.println(Integer.toBinaryString(i));
	
	}
	
	
//	2. 임의의 정수를 배열로 생성해서 입력하고 정렬하는 프로그램 작성 
//		1) 임의의 정수 입력 (배열 생성후)
//		2) 정렬 처리
//		3) 출력 

	static void process2() {
		
		//select sort , bubble sort, api sort 고르기
	System.out.println();
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++ ) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
	
	
//	3. 년도를 입력 받아 윤년여부를 확인하는 프로그램 작성
//		1) 년도 입력 메소드
//		2) 윤년 처리 
//		3) 출력 

	static void process3() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("년도 입력 : ");
		int year = scan.nextInt();
		
		year = (year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;

		if((year%4==0 && year%100!=0) || (year%400==0))
			System.out.println("윤년이 아닙니다");
		else
			System.out.println("윤년입니다");
		
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		process1();
		process2();
		process3();
		
		
	}

}

/*
 * 
 * 	1. 데이터 저장					>>>					2. 데이터 처리							>>>			3. 요청 결과 출력
 *  정수, 실수, 문자, 문자열, 논리								사용자 요청										애플리케이션, 웹 애플리케이션
 *  													결과값을 추출 > 연산처리 / 제어
 *  한개 저장 : 변수, 상수									> 연산자 / 제어문 : 메소드
 *  관련된 데이터 여러 개 : 배열 (같은 데이터형끼리만)
 *  클래스 : 다른 데이터형을 모아서 관리
 *  
 * 위 1,2,3 을 모아놓은 것은 component : 클래스 안에서 제작 > 재사용을 위한 목적으로 만들어짐
 * 									변경과 추가가 가능하게 만들어야 함 : '객체지향'이라고 함 : 유지보수를 목적으로 만드는 프로그램을 자바
 * 
 * 
 * 
 * 다중조건문
 * : 조건이 맞는 문장을 수행하고 종료 (한 개의 문장만 수행)
 * 		 > 여러 개를 수행 : 단일 조건문울 사용해야 된다
 * 			ex) 1~100까지 숫자 중 3, 5, 7의 배수의 합을 출력한다
 * 				> 단일조건문 3개를 써야 함
 * 				> 형식 : if (조건) {		>> true일 때 수행하는문자 작성 > 종료
 *						false일 때 다음으로 넘어감
 * 						}
 * 						else if(조건문) {
 * 						} 
 * 						else if(조건문) {
 * 						}
 * 						else{				 >> 셍략 가능
 * 						해당 조건이 없는 경우에 처리되는 문장
 * 						}
 * 
 * 
 * 
 */
import java.util.Scanner;
public class 다중조건문_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수 입력 : ");
		int num1 = scan.nextInt();
		System.out.println("두번째 정수 입력 : ");
		int num2 = scan.nextInt();
		System.out.println("연산자 입력 : (+ - / * )");

		
		char op = scan.next().charAt(0); // 문자열 중에 첫번째에 있는 char를 추출할 때 쓰는 기능
		
		// + - * / => charAt(1) > 1번을 가져와라 - (자바는 0부터 시작하니까)
		// => 자바의 단점 : char를 받을 수 없다 (문자열) > 형변환 써야 함
		// 경우의 수 + - / * 4가지, 또는 다른 문자 입력시 (else)
		
		if(op=='+') {
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		}
		else if(op=='*') { 
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
		}
		else if(op=='-') { 
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
		}
		else if(op=='/') {
			if(num2==0)
				System.out.println("0으로 나눌 수 없습니다");
			else
			System.out.printf("%d/%d=.2f\n",num1,num2,num1/(double)num2);
		}
		else {   // 해당 조건이 없는 경우에 처리 됨
			System.out.println("잘못된 연산자입니다");
		}
			
		
		
		
		
	}

}

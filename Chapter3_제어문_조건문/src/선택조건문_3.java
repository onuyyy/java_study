/*
 * 중첩 > if~else
 * 사칙연산 + , - , * , /
 * 		> 이거 외에 처리하는 방법 '이게 아니라면?'
 * 
 */

import java.util.Scanner;
public class 선택조건문_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두 개의 정수 입력 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("연산자 입력( + , - , * , / )");
		char op = scan.next().charAt(0);
		//	문자열에서 문자 한 개를 추출할 경우에 사용되는 기능
		
		if(op=='+' || op=='-' || op=='*' || op=='/') {
			if(op=='+')
				System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
			if(op=='-')
				System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
			if(op=='*')
				System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
			if(op=='/') {
				if(num2==0 || num1==0)
					System.out.println("0으로 나눌 수 없습니다");
				else
				System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
				
			}
		}
		else {
			System.out.println("잘못된 연산입니다");
		}
		

	}

}

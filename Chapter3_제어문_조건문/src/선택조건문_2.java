/*
 * 한 개의 점수를 받아서 60점 이상이면 합격 아니면 불합격
 * 
 * 
 */


import java.util.Scanner;
public class 선택조건문_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				System.out.println("정수 입력 : ");
		int num = scan.nextInt();
		
		if(num>=60)
			System.out.println(num+"는(은) 합격입니다");
		else
			System.out.println("불합격입니다");

	}

}

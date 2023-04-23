/*
 * 
 * 성적 계산
 * 
 */

import java.util.Scanner;
public class 선택문_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("세 개의 정수 입력 : ");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		int avg = (kor+eng+math)/3;
		
		// 학점 계산
		char score = 'A';
		switch(avg/10) {
		case 10:			// 10 이거나 9라면,	(avg/10) || (avg/10)==9
		case 9:				
			score = 'A';
			break;
		case 8:
			score = 'B';
			break;
		case 7:
			score = 'C';
			break;
		case 6:
			score = 'D';
			break;
		default:			// default는 생략 가능
			score = 'F';
			
		}
		
		System.out.println("학점 : "+score);
		
		// case 순서는 내가 맘대로 지정해도 된다
		
	}

}

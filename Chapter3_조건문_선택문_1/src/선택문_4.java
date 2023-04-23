/*
 * 중첩 switch
 * 
 * if문 중첩  > 특별한 경우가 아니면 거의 사용 안 함
 * 	if()	 {
 * 	case 값:
 * 			switch() {
 * 			}
 *	 }
 * 
 * 
 * 	가위바위보로 예시 작성
 * 		가위
 * 			가위
 * 			바위
 * 			보
 * 		바위
 * 			가위
 * 			바위
 * 			보
 * 		보
 * 			가위
 * 			바위
 * 			보
 * 
 * 
 */

import java.util.Scanner;
public class 선택문_4 {

	public static void main(String[] args) {
		
		// 컴퓨터가 먼저 가위바위보를 설정
		// 사용자 입력
		// 비교 후 결과 값 출력
		// 변수 설정 > 변수에 대한 처리 > 결과값을 출력
		
		
		int computer = (int)(Math.random()*3);  // 0 (가위) , 1(바위) , 2(보)
		Scanner scan = new Scanner(System.in);

		
		System.out.println("가위 (0), 바위(1), 보(2)");
		int user = scan.nextInt();
		System.out.println("사용자 입력 : "+user);
		System.out.println("컴퓨터 입력 : "+computer);
		
		switch(computer) {
		case 0 :
			System.out.println("computer : 가위");
			break;
		case 1 :
			System.out.println("computer : 바위");
			break;
		case 2 :
			System.out.println("computer : 보");

		}
		switch(user) {
		case 0 :
			System.out.println("user : 가위");
			break;
		case 1 :
			System.out.println("user : 바위");
			break;
		case 2 :
			System.out.println("user : 보");

		}
		
		// 비교 처리 결과값 출력
		
		switch(computer) {
		case 0 :		// 가위
			switch(user) {
			case 0 :	// 가위
				System.out.println("same");
				break;
			case 1 :	// 바위
				System.out.println("user win");
				break;
			case 2 :	//보
				System.out.println("computer win");
			}
			break;
		case 1 :		// 바위
			switch(user) {
			case 0 :	// 가위
				System.out.println("computer win");
				break;
			case 1 :	// 바위
				System.out.println("same");
				break;
			case 2 :	//보
				System.out.println("user win");
			}
			break;
		case 2 :		// 보
			switch(user) {
			case 0 :	// 가위
				System.out.println("user win");
				break;
			case 1 :	// 바위
				System.out.println("computer win");
				break;
			case 2 :	//보
				System.out.println("same");
			}
			
			break;
			
		}
		


	}

}

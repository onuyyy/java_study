/*
 * 
 * switch ~ case
 * : 범위를 지정하는 것이 아니라 특정값으로 설정
 * 	> 사용 가능한 특정값은 (char, int, String)
 * 	> 많이 사용되는 위치는 : 게임(키보드별 처리), 메누, 네트워크 기능별 처리 등
 * 		웹 ==> 화면 전환
 * 	> 형식
 * 		switch(문자, 문자열, 정수) {
 * 			case 'A':
 * 				문장 1 수행
 * 				Break;			>> A 입력시 A값만 받고 나오고 싶을 때 쓰는 기능
 * 			case 'B':
 * 				문장 2 수행
 * 			case 'C';
 * 				문장 3 수행
 * 			default:		>> A, B, C가 아닌 경우에 처리하는 문장 (생략 가능)
 * 				문장 4
 * 		}
 * 
 * 			>> B를 입력하면  B,C,D가 출력 됨
 * 			>> B만 출력하고 싶다면 문장 다음에 Break; 처리
 * 
 * 
 * 
 */

import java.util.Scanner;
public class 선택문_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("=====메뉴=====");
//		System.out.println("1. 로그인");
//		System.out.println("2. 회원가입");
//		System.out.println("3. 로그아웃");
//		System.out.println("4. 맛집 추천");
//		System.out.println("5. 레시피 만들기");
//		System.out.println("6. 프로그램 종료");
//		System.out.println("=============");
//		
//		System.out.println("메뉴 클릭 (1~6) :");
//		int menu =scan.nextInt();
//		switch(menu) {
//		case 1 :
//			System.out.println("로그인을 요청하셨습니다.");
//			break;
//		case 2 :
//			System.out.println("회원가입을 요청하셨습니다.");
//			break;
//		case 3 :
//			System.out.println("로그아웃을 요청하셨습니다.");
//			break;
//		case 4 :
//			System.out.println("맛집 추천을 요청하셨습니다.");
//			break;
//		case 5 :
//			System.out.println("레시피 만들기를 요청하셨습니다.");
//			break;
//		case 6 :
//			System.exit(0);;	// 프로그램 완전 종료할 때 쓰는 기능
//								// 0이면 정상 종료, 다른 번호면 비정상 종료
//			break;
//		default :		// 없는 메뉴 선택했을 때 else와 같은 역할
//			System.out.println("메뉴에 없는 번호입니다.");
			

		
		// 범위가 많이 없을 떄 스위치문 써야 함
		// case가 100인 경우 100을 다 입력해야 하기 때문에

	}

}

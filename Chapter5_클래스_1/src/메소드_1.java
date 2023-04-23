/*
 * 
 * 메소드
 * 	1) 구조화된 프로그램 (문장을 기능별로 나눠서 작업)
 * 	2) 반복 제거
 * 	3) 메소드는 한 개의 기능만 수행
 * 
 *	리턴형 : 처리 후 결과 값 >> 1개만 설정이 가능
 * 	매개변수 : 사용자가 요청하는 값 >> 여러 개 보낼 수 있다
 * 				=> 요청하는 값이 3개 이상이면 [], class
 * 
 * 		** 사용자가 요청한 값(매개변수)을 받아서 처리 후에 결과값을 보내주거나,
 * 			화면에 출력하는 것 = 메소드
 * 			>> 화면에 출력만 하는 것은 결과값이 없는 상태(void)
 * 
 * 			ex) 매개변수는 입력, 마우스 클릭, 버튼 클릭 등,...
 * 
 * 	형식) 
 * 		리턴형    메소드명 (매개변수)
 * 						------ 개수와 상관이 없음 (사용자 요청값)
 * 		----	----- 한 자바 파일 안에 모든 메소드명이 달라야 한다 (X)
 * 					  같은 메소드명이 있을 수도 있다 (매개변수가 틀리면 된다)
 *		요청 결과값 (한 개) >> 여러 개 : int[], class
 * 
 * 
 * 
 * 정수 두 개를 보내고 더한 값을 받는다
 * 	=> return a+b
 * 	=> sout("a+b = " +(a+b))	>> 매개변수 없이 출력 void
 * 
 * static >> 전체에서 같이 공유할 수 있다
 * main 메소드에서는 가급적이면 => 연결만 시킴 (변수 선언 X)
 * 
 * 
 * void 사용
 * 구구단 = > 단을 입력을 받아서 자체에서 출력을 하게끔 만들기
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;
public class 메소드_1 {

	static void gugudan(int dan) {
		for(int i = 1; i <=9; i++) {
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
	}
	
	static void process() {
		Scanner scan = new Scanner(System.in);
		System.out.println("단을 입력 : ");
		int dan = scan.nextInt();
		
		gugudan(dan);
	}
	
	
	public static void main(String[] args) {		// main은 연결만 해주는 역할
		
		
		gugudan(6);
		
		process();
		
		
		
		
		
		
	}

}

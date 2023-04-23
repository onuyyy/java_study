/*
 * 
 * 자바에서 지원하는 반복문
 * 1. for : 반복 횟수가 지정된 경우에 주로 사용
 * 	- 일반 for
 * 	- for-each : 출력용 (웹에서 많이 등장 = 향상된 for문)
 * 	- 형식)
 * 		for문
 * 		for (int i=1; i<=10; 1++) {  		>> 10번 수행하라
 * 			반복실행문장
 *			 }
 * 		for (초기값; 조건식; 증감식) {
 * 			반복 실행 문장
 * 			}
 * 
 * 			초기값 : 시작점 (1번만 수행한다)
 * 			조건식 : 종료점 (수행을 중단할 때)
 * 			증감식 : 초기값부터 조건식이 false가 날 때까지 수행한다 (감소도 가능)
 * 			
 * 			ex) for(int i=1; i<<=10; i+=2) 2씩 증가
 * 				for(int i=1; i>=1; i--)	-1씩 감소
 * 
 * 	- 실행 순서 (프로그램에서 가장 많이 사용되는 제어문 : for, if)
 * 		> for문은 한 문장만 수행이 가능
 * 			여러문장 사용시에는 {}을 이용해서 처리한다
 * 				
 * 		> for(초기값; 조건식; 증감식) {	  		
 * 				①	  ↓		④
 * 					② true 면 계속 / false 면 종료
 * 					③ 반복 실행 문장
 * 			}
 * 				1) 초기값 => 2) 조건식에 대입 => false => 종료(for)
 * 								   => true => 3) 반복 수행 문장 실행 => 4) 초기값 증감
 * 									( 2 - 3 - 4 반복) or false면 종료
 * 			 
 * 
 * 
 * 2. while : 반복 횟수를 모르는 경우 (선 조건) > 선조건이기 때문에 1번도 실행이 안될 수도 있다
 * 
 * 3. do ~ while : 반복 횟수를 모르는 경우 (후조건) > 무조건 1번 이상 실행된다
 * 
 * 	> 유사한 내용을 여러 번 출력하고 싶을 때
 * 		: 합계 구하기, 통계 등
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class 반복문_1 {

	public static void main(String[] args) {
		
		//Hello java! 를 10번 출력하기
		
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		
		System.out.println("============for문 이용");
		// 반복문 이용
		for(int i=1; i<=10; i++) {
			System.out.println(i+". Hello Java~");
		}
		
		System.out.println("============for문 이용");
		// 반복문 이용
		for(int i=1; i<10; i++) {
			System.out.println("Hello Java~");
		}
			
		
	}

}

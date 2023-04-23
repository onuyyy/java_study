/*
 * 
 *	이항연산자 (피연산자가 2개일 때)
 *		1) 산술연산자 (*중요)			+, -, /, *, %
 *		2) 쉬프트연산자 (비트이동연산자)	<<, >>
 *		3) 비트연산자					&, ㅣ, ^
 *		4) 비교연산자 (*중요)			==, !=, <, >, <=, >=
 *		5) 논리연산자 (*중요)			&&(직렬), ㅣㅣ(병렬)	: 효율적인 연산
 *			&& 둘 다 true :  조건 && 조건 > 앞에가 false면 뒤에 볼 필요가 없기때문에 앞에서 끝남 (효율적인 연산)
 *			ㅣㅣ true가 하나만 있으면 됨 : 조건 ㅣㅣ 조건 > 앞에가 true면 뒤에 볼 필요가 없이 때문에 끝남(효율적인 연산)
 *		6) 대입연산자 (*중요)			=, +=, -=, op=
 * 
 * 
 *	38page 산술연산자
 *		+, -, * > 형변환	: 자바에서 모든 연산은 같은 데이터형끼리만 가능
 *						  데이터형이 다르면 자도으로 콘 데이터형으로 바꿔준 후에 연산을한다
 *						  char는 모든 연산자를 이용해서 연산처리하면 > 자동으로 int로 바뀜
 *						  int 이하 (byte, short, char) 데이터형 연산시에 결과값은 int이다
 *							ex) int + long = long
 *								int + double = double
 *								byte + int = int
 *								char + char = int
 *		/ > 정수/정수 = 정수	ex) 5/2 = 2
 *					평균 구하려면 정수/실수
 *					0으로 나누면 에러 발생
 *					프로그램의 기본
 *
 *		% : 결과값이 왼쪽편 부호가 남는다
 *			5 % 2 = 1
 * 			-15 % 2 = -1
 * 			5 % -2 = 1
 * 
 * 		사용자가 정수 두 개를 입력 > 결과값 ( 1.총점 2.평균)
 * 	import 
 * 
 * 
 * 
 */

import java.util.Scanner;		// 외부에서 클래스를 불러온다
// 키보드로부터 입력된 값을 얻어오는 클래스 : Scanner(scanf())
// BufferedReader > 예외처리
public class 산술연산자 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	// 클래스 선언
						// 동적 메모리 할당
		System.out.println("국어점수 입력 : ");
		int kor = scan.nextInt();
		System.out.println("kor="+kor);

		System.out.println("수학점수 입력 : ");
		int ma = scan.nextInt();
		System.out.println("ma="+ma);
		
		System.out.println("영어점수 입력 : ");
		int eng = scan.nextInt();
		System.out.println("eng="+ma);
		
		int total = kor + ma + eng;
		double avg = total/ 3.0;
        System.out.println("총점:"+total);
        //System.out.println("평균:"+avg);
        System.out.printf("평균:%.2f",avg);

	}

}

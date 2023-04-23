
/*
 * 피연산자 / 연산자
 * 			연산대상
 * 
 * 피연산자 1개 : 단항연산자 ex) a++
 * 피연산자 2개 : 이항연산자 ex) 10+20 > 둘 다 피연산자
 * 피연산자 3개 : 삼항연산자
 * 
 * 	1.단항연산자
 *		1) 증감연산자 ( ++ , --)	한 개 증가/한 개 감소 > 반복문에서 자주 등장
 *			ex) int a = 10;
 *				a++;
 *				> 11
 *
 *		2) 부정연산자 (boolean만 사용 가능)
 *			bollean b = true;
 *			!b;					> 값을 반대로 출력할 때 ( ! ) '턴'이라고 한다
 *			> false
 *
 *		3) 형변환연산자 (데이터형) : 원하는 데이터로 바꿔서 처리
 *			(int)10.2; > 값 10  /int로 바꿔라, 소수점을 아예 제거
 *			(int)'A'; > 65     
 *			(char)65; > 'A'
 *			(double)10; > 10.0
 *		데이터형을 int에서 double로 바꾸면 데이터형이 커진다  > 업캐스팅 (자동형변환)
 *		반대로 큰 거에서 작은 걸로 바꾸면 > 다운캐스팅 (강제형변환)
 *
 *		10.5 + 10 = 20.5 > java는 데이터형 다른 것들을 계산 못한다
 *			java가 알아서 형변환하여 20.5 출력 (업캐스팅, 자동형변환)
 *
 *		int 이하의 데이터형은 연산시에 결과 값이 int
 *			ex) byte/short/char  >  결과 값 int
 *
 *			int + double = double
 *			char + long = long
 *			int + long = long
 *			long + double = double
 *			byte + char = int 		> int 이하의 연산자는 값 int
 *
 *		4) 반전연산자 ( 양수 > 음수 ) 음수표현 ~
 *			
 *			
 *			+
 * 		단항연산자
 * 			-전치연산자 : 먼저 증가/감소
 * 				++a 증가 후에 대입
 * 			-후치연산자 : 나중에 증가/감소
 * 				a++ 대입 후에 증가
 * 
 * 			int a = 10;
 * 			int b = ++a;
 * 
 * 			int a = 10;
 * 			int b = a++;
 * 		
 * 			+
 * 		부정연산자
 * 			!true > false
 * 			!false > true
 * 			
 * 			+
 * 		형변환연산자
 * 		10.5 + 10.5 > 21.0
 * 		(int)10.5 + (int)10.5 > 20 
 * 
 * 		(int)(10.5+10.5) > 21	
 * 			괄호가 쳐져 있으면 최우선 연산자
 * 
 * 		double d = 10 ; > 10.0 (자동형변환 업캐스팅)
 * 		int a = 'A' > 65
 * 		> 다운캐스팅할 땐 강제형변환 필수
 * 		> int 이하 데이터형끼리 연산시 > int
 * 				-byte, short, char 
 * 				char + char = int
 * 				byte + short = int
 * 		> char은 연산이 되면 정수로 변경된다
 * 
 * 
 * 	2. 이항연산자
 * 		- 산술연산자 + - / * %
 * 		+ : 산술 연산, 문자열 결합
 * 		/ : 정수/정수 = 정수  ex) 10/3 = 3 
 * 			정수/실수 = 실수  ex) 10/3.0 = 3.333333
 * 			0으로 나누면 오류 발생
 * 		% : 나누고 나머지 값을 가져온다
 * 			11%2 > 1
 * 			10%2 > 0
 * 			-5%2 > -1
 * 			5%-2 > 1
 * 				부호는 왼쪽 편을 따라 간다
 * 		+ : 7 + 7 + "7" > 147
 * 			"77" + 7 > 777
 * 			"14" + 7 > 147
 * 			7+"7"+7+7 > 7777
 * 
 * 
 * 
 * 
 */





public class 연산자의종류 {

	public static void main(String[] args) {
		
		byte b = 10;
		char c = 'A';
		int a = b+c;
		System.out.println(a);
		
		byte f = 10;
		byte g = 20;
		// byte h = f+g; > 오류 int 이하의 데이터형은 int이기 때문에
		int n = f+g;
		System.out.println(n);
		
		System.out.println(~10); // -11
		System.out.println(~15); // -16

		int t = 10;
		int y = ++t;
		System.out.println("t = " +t);
		System.out.println("y = " +y);
		
		int aa = 10;
		int bb = aa++ + ++aa;
				System.out.println(bb);
				
				
		boolean check = false;
		System.out.println(check);
		System.out.println(!check); // > true
		
		
		int aaa =(int)(Math.random()*100)+1;
	//					0.0~0.99				1~100까지 숫자 중 랜덤으로 추출
		System.out.println(aaa);
		
		
		System.out.println(10/3);
		System.out.println(10/3.0);
		System.out.println(-5%2);
		System.out.println(7+"7"+7+7);
		
	}

}

/*
 * 연산자
 * 38page > 산술연산자
 * 41page > 증감연산자
 * 44page > 비교연산자
 * 45page > 논리연산자
 * 48page > 조건연산자 (삼항연산자)
 * => 대입연산자
 * 
 * -----------------------------------
 * 자바에서 지원하는 연산자
 * 1. 단항연산자
 * 		증감연산자  ++ , -- > 1의 증가 감소	/	반복문에서 자주 사용
 *			1) 전치연산자 : 먼저 증가한 후에 다른 연산자를 수행
 *				ex) int a = 10;
 *					int b = ++a;
 *						> 1 증가 : a = 11
 *						> b에 11을 대입
 *			2) 후치연산자 : 다른 연산자를 먼저 수행하고 나중에 수행
 * 				ex) int a = 10;
 * 					int b = a++;
 * 						> b에 증가 안 된 a 값을 대입
 * 						> a를 한 개 증가
 * 				ex2) char c = 'A'
 * 					sout.(c++);		 > 출력을 먼저 하고 나중에 +1 > 출력값 'A'
 * 
 * 				ex3) int a = 10;
 * 					int b = a--;
 * 					a = 9; , b = 10;
 * 
 * 				ex4) int a = 10;
 * 					int b = --a;
 * 					a = 9, b = 9
 * 
 * 					a++, ++a, a=a+1, a+=1
 * 					a--, --a, a=a-1, a-=1
 * 
 * 		부정연산자 (!) > boolean만 사용 가능
 *			true > !true = false
 *			false > !false = true
 *
 * 			ex) int a = 10;
 * 				!(a%2==0) > false
 * 				a%2!=0		
 * 
 * 		형변화연산자 (데이터형)
 * 			1) 자동형변환
 * 				작은데이터가 큰데이터로 들어갈 때
 * 					int a = 'A' > 65가 a로 들어감
 * 					long a = 10L > 10이 a로 들어감
 * 					double d = 10 > 10.0
 * 			2) 강제형변환
 * 				큰데이터를 작은데이터로 바꿔줄 때
 *				int a = 10.5 >  오류
 *  				-> int a = (int) 10.5; > 강제로 형변환 시켜줘야 함
 *  
 *  		데이터의 크기
 *  			byte char int long double
 *  
 *  2. 이항연산자
 *  	산술연산자 ( + , - , * , / , % )
 *  
 *  	비교연산자 ( == , != , < , > , <= , >=)
 *  
 *  	논라연산자 ( && , || )
 *  
 *  	대입연산자	( = , += , -= )
 * 		
 * 
 * 3. 삼항연산자
 * 		= 조건? 값: 값;
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class 연산자정리 {

	public static void main(String[] args) {
		
		char c ='A';
		System.out.println(c++); // 출력하고 증가
		System.out.println(++c); // 출력하기 전에 증가
		
		
		double d = 10.0;
		d++;
		System.out.println(d);
		
		
		
		

		

	}

}


/*
 *  	단항연산자는 (++, --)
 *		왼쪽에서 오른쪽으로
 *		
 *		산술연산자 (쉬프트, 비트)
 *		→ 계산방향
 *
 *		대입연산자, 삼항연산자
 * 		← 계산방향
 * 		ex) int a = 10;
 * 
 * 		괄호연산자 ()는 최우선 순위 연산자
 * 
 * 
 * 
 *	비교연산자 : 결과값 (boolean) true or false
 *		== 같다
 *		!= 같지않다
 *		< 작다 (왼쪽이 기준)
 *		> 크다
 *		<= 작거나 같다
 *		>= 크거나 같다
 *
 *		ex) 7 == 6 flase
 *			7 != 6	true
 *				byte int short long float double boolean char
 *		문자열은 비교연산자로 계산하면 안 되고, 따로 연산자가있다 equals() 등
 *
 *		'A' < 'B' (65 < 6) true
 *		10 > 5 true
 *		10 <= 10 true
 *

 *
 * 
 * 
 * 
 * 
 * 
 * 
 */



public class 비교연산자 {

	public static void main(String[] args) {
		
		int a = (int)(Math.random()*100)+1;
		/*연산순서	
		 * 					1 (0.0~0.99)
		 * 							2 (0.0~99.0)	
		 * 		 3 (0~99)	
		 * 								4 (1~100)
		 */
		int b = (int)(Math.random()*100)+1;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		//1. == 
		boolean b1 = a==b;
		System.out.println("a==b ? "+b1);
		boolean b2 = a!=b;
		System.out.println("a!=b ? "+b2);
		
		b1 = a<b;
		System.out.println("a<b = "+b1);
		b1 = a>b;
		System.out.println("a>b = "+b1);
		
		
		

	}

}

/*
 *	대입연산자
 *	일반 연산자들은 연산순서 (좌 > 우)
 *	대입연산자의 연산순서는 (우 > 좌)
 *
 *	ex) a = 10+20
 *			----- 계산 먼저 하고 a에다가 넣는 것
 * 
 * 	= 대입연산자
 * --------------- 복합대입연산자
 * +=	누적, 총합 쓸 때 많이 씀
 * -=
 * *=
 * /= 
 * %=
 * 
 * 
 * 		+-
 * int a = 10;
 * a+ = 10; > a = a+10 > 20
 * a+ = 1; a = a+1	a++ ++a
 * 
 * a+=20	a=a+20
 * a-=20	a=a-20
 * a*=10	a=a*10
 * a/=10	a=a/10
 * a%=2		A=A%2
 * 
 * 
 */
public class 대입연산자 {

	public static void main(String[] args) {
		
		int a = 10;
		a++;
		a++;
		a++;
		System.out.println(a);
		// 각각 +1 더해지는 거라 번거로움
		
		int b = 10;
		b+=3;
		System.out.println(b);

	}

}

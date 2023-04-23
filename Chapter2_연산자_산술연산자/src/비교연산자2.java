/*
 *	조건문 (if)에서 많이 사용 됨
 *
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class 비교연산자2 {

	public static void main(String[] args) {
		char c1 = (char)((Math.random()*26)+65);
		// 알파벳 A 번호가 65라서 +65 해줌
		// char은 연산시에 정수로 변경 후에 처리한다
		
		char c2 = (char)((Math.random()*26)+65);
		
		System.out.println(c1);
		System.out.println(c2);
		
		boolean b1 = c1==c2;
		System.out.println(b1);
		
		b1 = c1!=c2;
		System.out.println(b1);
		
		b1 = c1<=c2;
		System.out.println(b1);
		
		b1 = c1>=c2;
		System.out.println(b1);
		
		b1 = c1>c2;
		System.out.println(b1);
		
		b1 = c1<c2;
		System.out.println(b1);
		
	}

}

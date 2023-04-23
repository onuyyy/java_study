

/*
 * 
 *		<< , >>
 *
 *		10 << 2		: 0을 뒤에 2개 채워라
 *		1010
 *		1010()()
 *			 0 0 	: 공백이 생기면 0으로 채움
 *			> 101000
 *
 *		7 << 3
 *	    111
 *		111000
 *			> 32+16+8 = 56
 *
 *		8 << 2 
 *		1000
 *		100000
 *
 *		x<<y > x*2^y
 *
 *		10>>2
 *		1010
 *			> 제거 : 2
 *	
 *		15>>>3 > 1
 *		1111
 *		
 *		27>>3
 *		
 *
 *
 * 
 * 
 * 
 * 
 * 
 */
public class 쉬프트연산자 {

	public static void main(String[] args) {

		System.out.println(10<<2);
		System.out.println(7<<3);
		System.out.println(8<<2);
		
		System.out.println(15>>3);
		System.out.println(27>>3);
	}

}

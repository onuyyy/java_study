/*
 *	&&	ㅣㅣ
 *
 *	(조건) && (조건)
 *	-----	 -----
 *	  ㅣ		   ㅣ
 *	  ----------
 *		   ㅣ
 *		  결과
 *
 *	&& : 범위나 기간에 포함
 * ---------------------------
 * true true	> true
 * ---------------------------
 * true false	> flase
 * ---------------------------
 * flase true	> false
 * ---------------------------
 * flase false	> false
 * ---------------------------
 * 
 * 
 * 	ㅣㅣ : 범위나 기간을 벗어난 경우
 * ---------------------------
 * true true	> true
 * ---------------------------
 * true false	> true
 * ---------------------------
 * flase true	> true
 * ---------------------------
 * flase false	> false
 * ---------------------------
 * 	
 * 효율적 연산
 * () && ()
 * 		 --		> 앞에 연산으로 뒤에 값을 판단하지 않아도 될 때 효율적연산이라고 한다, 속도가 더 빨라짐
 * () ㅣㅣ ()
 * 		  --
 * 
 * 
 * int a = 10;
 * int b = 9;
 * 
 * (a < b) && ++b == a
 * ------
 *  앞부분이 false이기 때문에 뒤에 ++b는 연산하지 않으므로 b = 9,
 *  a < b 가 맞지 않기 때문에 fasle
 *  
 *  
 *  int a = 10;
 *  int b = ;
 *  boolean bCheck = 
 * 
 * 
 * 
 */
public class 논리연산자 {

	public static void main(String[] args) {
		
//		 int a = 10;
//		 int b = 9;
//		 boolean bCheck = (a<b) && ++b==a;
//		 
//		 System.out.println(bCheck);
//		 System.out.println("b = "+b);
		
		 int a = 100;
		 int b = 9;
		 boolean bCheck = (a>b) && (b==a);
		 //				  true      false
		 // &&는 둘 다 true여야 함
		 System.out.println(bCheck);
		 
		 char c = (char)((Math.random()*26)+65);
		 boolean cCheck = c>='A' && c<= 'Z';
		 System.out.println(cCheck);
		 
		 char sex = 'M';
		 int score = 87;
		 
		 boolean sCheck = (sex=='M' && score>=80);
		 //					true		ture
		 System.out.println(sCheck);
		 
		 int q = 10;
		 boolean iCheck = q%2 == 0 && q>2;
		 System.out.println(iCheck);
		 
		 int year = 2023;
		 boolean yCheck = ((year%4==0 && year%100!=0)) || (year%400==0); 
	}

}

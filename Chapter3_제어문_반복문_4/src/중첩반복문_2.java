/*
 * 
 * 	2차 for문
 * 	> 정렬, 빈도구하기, 등수구하기
 * 
 * 
 *	 	★
 * 		★★
 * 		★★★
 * 		★★★★
 * 				줄수 i	별표 j
 * 				 1		 1
 * 				 2		 2
 * 				 3		 3
 * 				 4		 4		>> j는 i만큼만 가면 된다
 * 
 * 		★★★★
 * 		★★★
 * 		★★
 * 		★
 * 				줄수 i	별표 j	>> i + j = 5	/	j=5-i
 * 				 1		 4
 * 				 2		 3
 * 				 3		 2
 * 				 4		 1		>> 역순이면 더한다 (+)	
 */
public class 중첩반복문_2 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 5-i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}

		System.out.println("============================");
		
		/*
		 * a
		 * bc
		 * def
		 * ghij
		 * 
		 */
		
		char a = 'a';
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(a++);
			}
			System.out.println();
		}
		
		
		System.out.println("============================");
		
		/*
		 * A
		 * AB
		 * ABC
		 * ABCD
		 */
		
		char b = 'A';
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(b++);
			}
			System.out.println();
		}
		
		
		System.out.println("============================");
		
		/*
		 * #234
		 * 1#34
		 * 12#4
		 * 123#
		 * 
		 */
		
		char c = 'A';
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				if(i==j)
					System.out.print("#");
				else
					System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		/*
		 * 		★
		 * 	   ★★
		 * 	  ★★★
		 * 	 ★★★★
		 * 			>> 줄수 공백 별표	(i와k i와j의 관계를 따져보자)
		 * 			   (i) (k) (j)	i+k=4 > k=4-i	j=i
		 * 				1	3	1
		 * 	 			2	2	2
		 *				3	1	3
		 *				4	0	4
		 *
		 */				
		 
		for(int i =1; i<=4; i++) {
			for( int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
				System.out.print("★");
		}
			System.out.println();
	}

}

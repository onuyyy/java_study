/*
 * 
 * 3의 배수, 5의 배수, 7의 배수의 합과, 총 갯수
 * 
 */
public class 반복문_3 {

	public static void main(String[] args) {
		
		int a3 = 0, a5 = 0, a7 = 0;	// 합 변수
		int c3 = 0, c5 = 0, c7 = 0; // 갯수
		
		int i = 1;	// 초기값
		while(i <= 100)	{	// 조건식
			if(i%3==0 ) {
				a3+=i;
				c3++;
			}
			if(i%5==0) {
				a5+=i;
				c5++;
			}
			if(i%7==0){
				a7+=i;
				c7++;
			}
			i++;	// 증가식
		}
		
		System.out.println("================결과값");
		
		System.out.println("3의 배수 합 :"+a3+"  개수 : "+c3);
		System.out.println("5의 배수 합 :"+a5+"  개수 : "+c5);
		System.out.println("7의 배수 합 :"+a7+"  개수 : "+c7);
		
		// 중복이 있을 경우 >> 단일 조건문 , 중복이 없는 경우 >> 다중 조건문
		// 위의 문제는 단일 조건문으로
		
		int max = c3;
		if(max < c5) 
			max = c5;
		if(max < c7)
			max = c7;
		System.out.println("가장 많은 갯수 : "+max);
		
		
		int min = c3;
		if(min > c5) 
			min = c5;
		if(min > c7)
			min = c7;
		System.out.println("가장 많은 갯수 : "+min);
		
		
			
			

		
	}

}

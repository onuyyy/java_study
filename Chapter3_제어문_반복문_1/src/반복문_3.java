/*
 * 3의 배수의 합과 배수의 개수가 몇 개?
 * 
 */
public class 반복문_3 {

	public static void main(String[] args) {
		
		int sum = 0, count = 0;
		
		for(int i = 1; i<100; i++) {
			if(i%3==0 ) {
				sum+=i; // 합계
				count++; // 개수
			}
		}
		System.out.println("===============결과");
		System.out.println("1~100까지 3의 배수 합 : "+sum);
		System.out.println("1~100까지 3의 배수 합 : "+count);
		
		int sum1 = 0, count1 = 0, sum2 = 0, count2 = 0;
		
		for(int i = 1; i<100; i++) {
			if(i%5==0 ) {
				sum1+=i; // 합계
				count1++; // 개수
			}
		}
			
		for(int n = 1; n<100; n++) {
			if(n%7==0 ) {
				sum2+=n; // 합계
				count2++; // 개수
			}	
		}
		System.out.println("===============결과");
		System.out.println("1~100까지 5의 배수 합 : "+sum1);
		System.out.println("1~100까지 5의 배수 합 : "+count1);
		System.out.println("===============결과");
		System.out.println("1~100까지 7의 배수 합 : "+sum2);
		System.out.println("1~100까지 7의 배수 합 : "+count2);
	}

}

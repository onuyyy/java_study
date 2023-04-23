/*
 * 1~100까지의 합
 * 
 */
public class 반복문_2 {

	public static void main(String[] args) {
		
		int sum = 0;
			
		for(int i = 1; i <= 100; i++) {
			sum = sum+i; // sum+ = i;
			System.out.println("sum = "+sum+" , i = "+1);
		}
		System.out.println("================결과");
		System.out.println("1~100까지의 합 : "+sum);
		
		
		sum = 0;	// 앞에 sum 값을 초기화 시킴, 초기화 안 시키면 누적되어 큰 값이 나옴
		for(int i = 0; i <= 100; i+=2) {		// 2, 4, 6, 8, ...
			sum+=i;
			System.out.println("sum : "+ sum);
		}
		
		
		for(int i = 0; i <= 100; i+=2) {		// 2, 4, 6, 8, ...
			sum+=i;
	
		}
		System.out.println("sum : "+ sum);
	
		
		
		
		System.out.println("================결과");
		System.out.println("1~100까지의 짝수 합 : "+sum);
		
		sum = 0;	
		for(int i = 0; i <= 100; i+=3) {		
			sum+=i;
			System.out.println("sum : "+ sum);
			
			
		}
		System.out.println("================결과");
		System.out.println("3의 배수 합 : "+sum);
	}

}

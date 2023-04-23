import java.util.Arrays;
import java.util.Scanner;

public class 문제풀이_0404_집 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		// 1번. 1~100까지 3의 배수를 더하는 while 
		
//		int sum = 0, i = 1;
//		while(i < 100) {
//			if(i%3==0) {
//			sum+=i;	
//			++i;
//			}
//			++i;					// > while문을 종료시키기 위한 ++i;  break;를 쓰면 if문이 한 번 돌고 바로 끝나버린다 => 출력값 0
//			
//		}
//		System.out.println(sum);
		
									// while : 조건식으로 돌아감  // for : 증가식으로 이동
				

//		int sum = 0, i =1 ;
//		while(i < 100) {
//			if(i%3 != 0) {
//				i++;
//				continue; 	// 제외할 때 continue
//			}
//			else
//				sum+=i;
//			i++;
//		}
//		System.out.println(sum);
		
		
		// 2. 1~50까지 합을 더하는 while
		
//		int sum = 0, i = 1;
//		while(i<50) {
//			sum+=i;
//			i++;
//		}
//		System.out.println(sum);
		
		
	
//		int sum = 0, i = 1;
//		while(true) {
//			if(i > 50)
//				break;		// if문은 괄호로 묶이지 않을 경우 바로 아래 한 줄만 실행
//			sum+=i;
//			i++;
//		}
//		System.out.println(sum);
		
		
		// 6. 정수 10개를 입력 받아 배열에 저장하고, 정수 중에서 3의 배수만 출력하라 (**다시 봐)
		
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*100)+1;
//			if(arr[i]%3==0)
//				System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//		System.out.println(Arrays.toString(arr));
//		System.out.println();
//		
//		for(int a:arr) {
//			if(a%3==0)
//			System.out.print(a+" ");
//		}

		
		// 7. 정수 10개 저장하는 배열을 만들고, 1~10까지의 범위의 정수를 랜덤으로 생성하여 배열에 저장, 그 안에 숫자들과 평균 
	
//		int[] arr = new int[10];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*10)+1;
//		}
//		
//		for(int a:arr) {
//			System.out.print(a+" ");
//		}
//		
//		int sum = 0;
//		for(int i:arr) {
//			sum+=i;
//		}
//		System.out.println();
//		System.out.println(sum);
		
		
		
		// 8-4.10개의 정수를 입력 받아 제일 큰 수 출력 (**모름
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		
		System.out.println(Arrays.toString(arr));
		
		int max = arr[0];
		for(int a:arr) {
			if(max<a)
				max = a;
		}
		System.out.println("최대값 : "+max);
		
		
		
	}

}

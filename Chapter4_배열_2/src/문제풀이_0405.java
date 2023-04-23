import java.util.Arrays;
import java.util.Scanner;
public class 문제풀이_0405 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		// 1번. 1~100까지 3의 배수를 더하는 while (**몰라)
		
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
			
														// 반복 제어문 
														// 특정 부분을 제외하고 반복 수행 continue
														// while : 조건식으로 돌아감  // for : 증가식으로 이동
														// 반복 종료 break
		
		
		// 2. 1~50까지 합을 더하는 while (**몰라)
		
//		int sum = 0, i = 1;
//		while(true) {
//			if(i > 50) break;
//				sum+=i;
//				i++;
//		}
//		System.out.println(sum);
		
//		while(true) {
//		if(i <= 50) 
//			sum+=i;
//			i++;
//		}
//		System.out.println(sum);
		
		
		
		
		// 2-1. 추가 문제 
		
//		for(int i = 1; i <= 3; i++) {
//			for(int j = 1; j <= 3; j++) {
//				if(j==2)
//					continue;
//				System.out.println("i="+i+",j="+j);
//			}
//		}
		
		
		
//		for(int i = 1; i <= 3; i++) {
//			for(int j = 1; j <= 3; j++) {
//				if(j==2)
//					break;
//				System.out.println("i="+i+",j="+j);
//			}
//		}

		
		
		
		
		
		// 3. 배열 선언이 잘못된 것은?
		// 4
		
		// int n[] = new int[];	> 권장사항은 아님
		// > []는 변수명 뒤에 붙여도 된다, 선언할 때 [] 안에는 아무것도 넣으면 안 된다
		
		
		
		
		
		// 4-1. 10개의 문자를 가지는 배열 c를 한 줄의 코딩으로 작성
		
//		char[] c = new char[10];
//		System.out.println(Arrays.toString(c));
		
		
		
		
		// 4-2. 0~5까지 정수값으로 초기화된 정수 배열 n을 선언
	
//		int[] n = {0,1,2,3,4,5};
//		System.out.println(Arrays.toString(n));		
		
		
		
		
		// 4-3. 일~토요일로 초기화된 배열 day 선언
		
//		char[] day = {'일','월','화','수','목','금','토'};
//		System.out.println(Arrays.toString(day));
		
		
		
		
		// 4-4. 4개의 논리값을 가진 boolean을 선언하고 true, false, true, false로 선언하라
		
//		boolean[] bool = {true, false, true, false};
//		System.out.println(Arrays.toString(bool));
		

		
		
		
		// 5. alpha 모두 출력  
		
//		char[] alpha = {'a', 'b', 'c', 'd'};		>> 실제 값을 가져오는 것
//		for(char a:alpha) {
//			System.out.print(a+" ");
//		}
		
		
//		char[] alpha = {'a', 'b', 'c', 'd'};		>> 인덱스 번호를 가져오는 것
//		for(int i = 0; i <alpha.length; i++) {
//		}
//		System.out.println(alpha);

		
		
		
		
		// 6. 정수 10개를 입력 받아 배열에 저장하고, 정수 중에서 3의 배수만 출력하라 (**다시 봐)
		
//		int[] arr = new int[10];
//		
//		for(int i =0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		for(int i:arr) {
//			if(i%3==0)
//				System.out.print(i+" ");
//		}
//		

		
		
		
		
		// 7. 정수 10개 저장하는 배열을 만들고, 1~10까지의 범위의 정수를 랜덤으로 생성하여 배열에 저장, 그 안에 숫자들과 평균 (**몰라)
		

//		int[] arr = new int[10];		
//		
//		for(int i = 0; i < arr.length; i++) {
//	
//		}
//	
//		for(int i:arr) {		
//			System.out.print(i+" ");
//		}
//		
//		System.out.println();
//		
//		int total = 0;
//		for(int i : arr) {
//			total+=i;
//		}
		
//		System.out.println(total);
//		
//		System.out.printf("평균:%.2f",(total/10.0));
		
		
		
		
		
		// 8-1. 5개의 정수 입력 받은 후 차례로 출력
		
//		System.out.println("정수 입력 : (5개)");
//		
//		int[] arr = {5,10,9,3,2};
//		
//		for(int i:arr) {
//			System.out.print(i+" ");
//		}
		
		
		
		
//		int[] arr = new int[5];
//		
//		arr[0] = scan.nextInt();
//		arr[1] = scan.nextInt();
//		arr[2] = scan.nextInt();
//		arr[3] = scan.nextInt();
//		arr[4] = scan.nextInt();
//		
//		for(int a:arr) {
//			System.out.print(a+" ");
//		}
		
		
		
		
		
		// 8-2. 문자 10개 저장 가능한 배열 선언하고 10개의 문자를 입력 받은 후 출력 
		
//		int[] arr = new int[10];		
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*10)+1;
//		}
//	                        
//		for(int i:arr) {
//		System.out.print(i+" ");
//		}
//		
		
		
		
		
		
		// 8-3. 정수 10개를 입력받은 후 3, 5번째와 마지막 정수를 차례로 출력
		
		
//		int[] arr = new int[10];
//		//초기화
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*10)+1;		
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		System.out.println("세번째 숫자 : "+arr[2]);
//		System.out.println("디삿번째 숫자 : "+arr[4]);
//		System.out.println("디삿번째 숫자 : "+arr[9]);
		
		
		
		
		
		// 8-4.10개의 정수를 입력 받아 제일 큰 수 출력 (**모름)
		
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*100)+1;	
//		}
//		
//		System.out.println(Arrays.toString(arr));
//		
//		int max = arr[0];
//		for(int i:arr) {
//			if(max<i)
//				max = i;
//		}
//		System.out.println("최대 값 : "+max);
		
		
		
		// 9. 10개의 컴퓨터 정수를 입력 받아 배열에 저장하고, 총점과 평균을 구하라
		
		int[] arr = new int[10];
		for(int i =0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		int total = 0;
		for(int i:arr) {
			total+=i;
		}
		System.out.println("총점 : "+total);
		System.out.printf("평균 : %.2f\n",total/10.0);
		System.out.printf("%.3f",89.3985);			// >> 반올림
		
		
		
		

	}

}

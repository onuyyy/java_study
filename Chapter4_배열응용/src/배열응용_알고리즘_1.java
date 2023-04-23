import java.util.Arrays;

/*
 * 
 * 정렬 : ASC(올림차순) / DESC(내림차순)
 * 
 * 선택정렬 / 버블정렬
 * 선택정렬 (select sort) : 하나를 선태갛고 비교해서 정렬하는 것
 * 
 * 10 30 50 20 40	 => 	10 20 30 40 50 (오름차순) / 50 40 30 20 10  (내림차순) 
 * 30 10
 * 50    30
 * 50        20
 * 50           40
 *  
 *  => 10과 30을 비교한다 > 30과 10의 자리 바꿈 30 10 50 20 40
 *  => 30과 50 비교한다 > 자리 바꿈 50 10 30 20 40 
 * 					>> 첫번째 자리랑 2 3 4 5 자리랑 계쏙 바꿔가면서 비교한 후 제일 큰 수를 앞으로 가져 옴
 * 					----- 1round 끝 50이 제일 앞으로 오고 고정된다
 * 							>> 이런 식으로 정렬 될 때까지  round를 늘려간다
 * 
 * a=b;
 * b=a; >> 이렇게 바꾸고 싶으면
 * 			임시변수를 하나 만들어서 숫자 하나 빼고 대입
 * 
 * int temp = a; // temp = 10
 * a=b; // a = 20
 * 
 * 	
 * 
 */
public class 배열응용_알고리즘_1 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;		
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("================== 정렬 전");
		
		for(int i = 0; i < arr.length-1; i++) { 		// 선택정렬일 떄 맨 마지막 바퀴는 어차피 제일 작은 수가 마지막에 가있으니까 할 필요 없음 그래서 -1
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;  // temp를 j에 대입, 오른쪽에서 왼쪽으로
				}
			}
		}
				System.out.println(Arrays.toString(arr));
		
		
		
		System.out.println("================== 정렬 후(DESC)");
		
		for(int i = 0; i < arr.length-1; i++) { 		// 선택정렬일 떄 맨 마지막 바퀴는 어차피 제일 작은 수가 마지막에 가있으니까 할 필요 없음 그래서 -1
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;  // temp를 j에 대입, 오른쪽에서 왼쪽으로
				}
			}
			System.out.println("=== for "+(i+1)+"회차 ===");
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("==================");
		System.out.println(Arrays.toString(arr));
		
		
		
		System.out.println("================== 정렬 후(ASC)");
		
		
		
		
		
	}

}

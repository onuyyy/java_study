import java.util.Arrays;

/*
 * 
 * 버블정렬 : 인접한 데이터끼리 비교
 * 			>> 선택정렬 : 앞에서부터 정렬
 * 			>> 버블정렬 : 뒤에서부터 정렬
 * 
 * 40 30 10 50 20	>> ASC
 *  -  - 
 * 30 40 
 *    -  -
 *    10 40
 *       -  -
 *       40 50  
 * 	         - -
 *          20 50 (고정) 0 = 4바퀴
 * --------------
 * 30 10 40 20 50
 *  - -
 * 10 30
 *     - -
 *    30 40
 *        - -
 *        20 40   (고정) 1 = 3바퀴
 * ---------------
 * 10 30 20 40 50
 *  - -
 * 10 30
 *     - -
 *    20 30		  (고정) 2 = 2바퀴
 * ---------------
 * 10 20 30 40 50 (고정)
 *  -  -		                    
 * 10 20          (고정) 3 = 1바퀴
 * 
 * i = 0 j = 4
 * i = 1 j = 3
 * 1 = 2 j = 2
 * i = 3 j = 1 
 * -------------- i + j = 4 >> j = 4(length-1)-i
 * 
 * 
 * 
 */
public class 배열응용_알고리즘_3 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
			
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("========================정렬 전");
		
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-1-i; j++) {
				// i = 0, j는 4바퀴 돈다
				// i = 1, j는 3바퀴 돈다
				// i = 2, j는 2바퀴 돈다
				// i = 3, j는 1바퀴 돈다
				
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
				
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("========================정렬 후");
		
		
		
		
		
		
		
		
		
	}

}

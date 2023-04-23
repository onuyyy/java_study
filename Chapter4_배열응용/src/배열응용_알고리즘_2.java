import java.util.Arrays;

/*
 * 
 * 선택정렬 > 문자
 * 
 * B C A E D  >>  ASC (ABCDE) / DESC (EDCBA)
 * - -
 * B C
 * -   -
 * A   B
 * -     -
 * A     E
 * -       -
 * A       D
 * ----------
 * i = 1
 * A C B E D 
 *   - -
 *   B C
 *   -   -
 *   B   E
 *   -     -
 *   B     D
 * ----------
 * i =2
 * A B C E D
 *     - -
 *     C E
 *     -   -
 *     C   D
 * ----------
 * i = 3
 * A B C E D 
 *       - -
 *       D E
 * ----------
 * i = 4
 * A B C D E 		> 수행하지 않는다
 *         -		> 마지막 한 바퀴는 바꿀 게 없기 때문에 length-1 하는 것이다
 * 
 * 
 */
public class 배열응용_알고리즘_2 {

	public static void main(String[] args) {
		
		char[] arr = new char[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (char)((int)(Math.random()*26)+65);	// 대문자 랜덤 출력
			
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("=============================== 정렬 전");
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("=============================== 정렬 후 (ASC)");
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("=============================== 정렬 후 (DESC)");
		
	}

}

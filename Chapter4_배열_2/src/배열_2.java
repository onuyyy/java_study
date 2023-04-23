import java.util.Arrays;

/*
 * 
 * 알파벳 10개를 저장하는 공간을 만들어라
 * 	char[] alph = new char[10];
 * 
 * 알파벳 100000개를 저장하는 공간을 만들어라
 * 	char[] alph = new char[100000];
 * 		> 가장 큰 알파벳을 출력해라
 * 		
 * 
 * 	배열은 변수가 3개 이상이면 잡는다
 * 
 * 
 * 
 */
public class 배열_2 {

	public static void main(String[] args) {
		
		// 1. 배열 선언
		int[] arr = new int[5];		// new > 동적 메모리 할당
		
		// 2. 초기값
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		// 3. 출력
		for(int i:arr) {		// 여기 i는 실제 값 가져오기
			System.out.print(i+" ");
		}
		// 4. 제어
		// 정렬
		// 5. 결과값 출력
		

	}

}

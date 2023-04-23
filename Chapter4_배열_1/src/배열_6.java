import java.util.Arrays;

public class 배열_6 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		
		// 1. 배열의 크기를 출력
		// 2. 3번째 값을 300으로 바꿈
		// 3. 5번째를 출력
		
		System.out.println("배열의 크기: "+arr.length);
		
		arr[2] = 300;
		
		System.out.println(Arrays.toString(arr));
		System.out.println("3번째 값 변경 : "+arr[2]);
		
		System.out.println("5번째 출력 : "+arr[4]);

	}

}

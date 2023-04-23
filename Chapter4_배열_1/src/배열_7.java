import java.util.Arrays;

public class 배열_7 {

	public static void main(String[] args) {
		
		int[] arr1 = {10, 'A', 'B', 100}; 				// 여기에 double 데이터 들어가면 오류가 남
		System.out.println(arr1); 						// 배열의 주소값 출력
		System.out.println(Arrays.toString(arr1));
		
		double[] arr2 = {10, 'A', 'B', 100, 15.7};		// double형으로 전부 바뀜
		System.out.println(Arrays.toString(arr2));

		char[] arr3 = {'A', 66, 'C', 78, 97};			// char형으로 전부 바뀜 : char은 int를 포함할 수 있다
		System.out.println(Arrays.toString(arr3));
		
		boolean[] arr4 = new boolean[5];				// boolean 초기값은 false
		System.out.println(Arrays.toString(arr4));
		
		byte[] arr5 = new byte[5];
		System.out.println(Arrays.toString(arr5));		// byte 초기값은 0
		
		// int[] arr; >> 값은 null : 주소가 없을 때
		
		
	}

}

import java.util.Arrays;

public class 메소드_3 {
	
	static int[] rand() {
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		
		}
		return arr;
	}
	
	static void rand2(int[] arr) {

		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		
		}

	}
	
	

	public static void main(String[] args) {
		
		
		int[] arr1 = rand();	// 리턴형으로 값을 채움
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = new int[5];
		rand2(arr2);			// 매개변수를 이용하여 값을 채움 >> 활용도 더 높음
		System.out.println(Arrays.toString(arr2));
		
		
	}

}

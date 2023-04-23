import java.util.Arrays;

public class 배열응용_알고리즘_4 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("===================== 정렬 전");
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));	 // 오름차순만 가능
		System.out.println("===================== 정렬 후");
		
		
		for(int i = arr.length-1; i >= 0;i-- ) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println(); 
		System.out.println("===================== 정렬 후");
		

		
		
		
	}

}

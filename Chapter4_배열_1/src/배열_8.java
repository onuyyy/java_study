import java.util.Arrays;

public class 배열_8 {

	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = arr1.clone();					// 클론을 이용하면 새로운 메모리를 만들되, 값까지 다 복사 해준다
		
		System.out.println("arr1 :"+Arrays.toString(arr1));
		System.out.println("arr2 :"+Arrays.toString(arr2));
		
		System.out.println("===========================");
		
		arr2[0]=100;
		arr2[1]=200;
		arr2[2]=300;
		arr2[3]=400;
		arr2[4]=500;	// arr2를 바꿔도 같은 메모리를 제어하기 때문에 arr1도 같이 변경된다
		
		System.out.println("arr2 :"+Arrays.toString(arr2));
		System.out.println("arr2 :"+Arrays.toString(arr1));
		
		System.out.println(arr2);
		System.out.println(arr1); 	// arr1, arr2의 주소 값이 같음 > 같은 메모리를 제어한다 > 지금은 clone을 줘서 다른 값 나옴
		
		
		int[] arr3 = new int[10];
		for(int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		
		System.out.println(Arrays.toString(arr3));

		
		
		
	}

}

/*
 * 
 * 매개변수 전송법
 * 	1. Call By Value : 일반 기본형 데이터 전송 (String)
 * 
 * 	2. Call By Reference : 주소값을 넘겨주는 방식 (배열, 클래스)
 * 							>> 원본을 넘겨주는 거라 데이터도 같이 바뀜
 * 
 * 
 */
public class 메소드_2 {

	static void swap(int x, int y) {
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("교환 후");
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		
	}
	
	
	static void swap2(int[] arr2) {
		
		System.out.println("arr2 = "+arr2);
		System.out.println("교환 전 : arr2[0]"+arr2[0]+" , arr2[1] = "+arr2[1]);
		int temp = arr2[0];
		arr2[0] = arr2[1];
		arr2[1] = temp;
		System.out.println("교환 후 : arr2[0]"+arr2[0]+" , arr2[1] = "+arr2[1]);
	}
	
	
	static void swap3(String id, String pwd) {
		System.out.println("교환 전 : id"+id+"pwd : "+pwd);
		String temp = id;
		id = pwd;
		pwd = temp;
		System.out.println("교환 후 : id"+id+"pwd : "+pwd);		// 메소드 영역 내에서는 바뀜
	}
	
	
	
	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 20;
		swap(a,b);
		System.out.println("종료 : a "+a+" , b = : "+b);
		// 값만 전송 > Call By Value > 기본형
		
		
		int[] arr = {10,20};
		System.out.println("arr = "+arr);
		swap2(arr);	// int[] arr2=arr
		System.out.println("교환 후 : arr[0]"+arr[0]+" , arr[1] = "+arr[1]);
		// 배열, 클래스 > 메소드 자체에서 변경이 가능
		// call by reference
		
		
		String id = "admin";
		String pwd = "1234";
		swap3(id,pwd);
		System.out.println("종료 후 : id"+id+"pwd : "+pwd);	// 실제 데이터는 안 바뀜, 메소드 영역 내에서는 바뀜	
		
		
	}

}

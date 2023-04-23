import java.util.Arrays;

/*
 * 
 * 	- 메소드 유형
 * 		리턴형			  매개변수
 * 1.	 o					o
 * 2.    o					x
 * 3. 	 x					o
 * 4. 	 x					x
 * 
 * 
 * 1) 2단 ~ 9단까지 구구단을 출력 => 4번 유형 void
 * 		static void gugudan()
 * 2) id, pw 받아서 로그인이면 true, false => 1번 유형 boolean
 * 		static boolean login(String id, String pw)
 * 3) 검색어를 입력 받아서 검색된 내용을 출력 => 3번 유형 void   
 * 		static void find(String fd)
 * 			=> 검색어를 입력 받아서 검색된 내용을 받아서 출력
 * 				static String find(String fd)
 * 4) 5개의 정수를 넘겨주고 정렬된 정수를 받는다
 * 		static (int[]) sort(int a, int b, int c, int d, int e)	
 * 						=> return형이 배열, 배열로 넘겨서 한 번에 작업
 * 		static (int[]) sort(int[] arr)
 * 		-> 결과값이 여러개일 경우에는 배열을 이용한다
 * 
 */

// 6개의 난수를 발생시켜서 전송을 받은 다음 => 총합
public class 메소드_4 {
	
	// 6개 난수 발생
	static int[] rand() {
		int[] arr = new int[6];
		for(int i = 0; i <6; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		return arr;
	}
	
	// 최대값, 최소값
	static int max(int[] arr) {
		int m = arr[0];
		for(int a:arr) {
			if(m < a)
				m = a;
		}
		return m;
	}
	
	static int min(int[] arr) {
		int m = arr[0];
		for(int a:arr) {
			if(m > a)
				m = a;
		}
		return m;
	}
	
	
	
	
	static void process() {
		int[] arr = rand();
		int total = 0;
		for(int a:arr) {
			total+=a;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("총합 : "+total);
		System.out.printf("평균 : %.2f\n",total/(double)arr.length);
		System.out.println("최대값 : "+max(arr));
		System.out.println("최소값 : "+min(arr));			// 메소드 안에 메소드 호출 가능
		
	}

	public static void main(String[] args) {
		
	
		process();
	

	}

}

/*
 * 
 * 	배열 : 관련된 데이터를 모아서 한 개의 이름으로 관리한다
 * 			> 데이터형이 동일해야 한다
 * 			> 데이터를 배열로 모아서 관리 > 연속적인 메모리 공간을 만든다
 * 			> 고정적이다 : 한 번 지정하면 추가, 삭제가 불가능하다
 * 						> 가변형 (컬렉션 프레임워크 제공)
 * 			> 한 개의 이름으로 사용 (구분자:인덱스) > 0, 1
 * 						ex)	int a = 10, b = 20, c = 30, d = 40, e = 50
 * 
 * 									RAM (일회성)
 * 							 0------
 * 								이클립스에서 사용 중
 *  						 4------
 *  							10 > a
 *   					 	 8------
 * 								이클립스에서 사용 중
 *    						12------
 *    							20 > b
 *     						16------
 * 								이클립스에서 사용 중
 *      					20------
 *      						30 > c
 *        					24------
 *        						
 *    						28------
 *       			
 *       						배열 : 데이터를 5개를 만들어 달라 > arr
 *       					------------------------------
 *       				    	10 ㅣ 20	ㅣ 30 ㅣ 40 ㅣ 50	ㅣ
 *       					------------------------------ 
 * 							 100  104  108  112  116 	
 * 							arr  arr+1 arr+2 arr+3 arr+4
 * 							=> 100+0*4	arr[0]
 * 							=> 100+1*4	arr[1]
 * 							=> 100+2*4	arr[2]
 * 							=> 100+3*4	arr[3]
 * 							=> 100+4*4	arr[4] > 안에 있는 숫자는 인덱스 번호라고 함, 0부터 시작
 * 											   > 갯수 확인 하는 방법 : length
 * 
 * 			1. 배열 선언
 * 				1) 데이터형[] 배열명; > 권장사항
 * 				2) 데이터명 배열명;
 * 			2. 배열 초기화
 * 				1) 선언과 동시에 초기화
 * 					> 데이터형 [] 배열명 = {1,2,3,4,5} > 5개 저장 가능한 공간 만들어줌
 * 					> 데이터형 [] 배열명 = new 데이터형 [10]; > 데이터 몇 개 만들지 설정
 * 							--- 여기엔 숫자 쓰는 거 아님
 * 										> new를 사용하면 자동으로 기본값으로 채운다
 * 										> byte, short, int = 0 (new를 쓰면)
 * 										> long = 0L
 * 										> char = '\0'
 * 										> float = 0.0F
 * 										> double = 0.0
 * 										> boolean = false
 * 								arr[0] > int a 와 같다
 * 			3. 데이터 읽기
 * 				int a = 10;
 * 				sout(a) 		> 10 출력
 * 
 * 				int [] arr = {10,20,30,40,50}
 * 				sout(arr[1])	> 20 출력
 * 
 * 			4. 변경
 * 				int a = 10;
 * 				a = 20;			> 일반적인 변수값 바꿀 때
 * 
 * 				int[] arr = {10,20,30,40,50};
 * 				arr[3] = 200;
 * 						> arr = [10,20,30,200,50}	
 * 								> 40을 200으로 바꿈
 * 
 * 
 * 
 * 
 * 
 */
public class 배열_1 {

	public static void main(String[] args) {
		

		/*
		 * 
		 * 배열은 같은 데이터형의 변수가 3개 이상이면 배열을 잡는다 
		 * 
		 * 
		 */
		
		
		
		
		// 정수 5개 연속적으로 배치 
		
//		int [] arr = new int[5];	// [0,0,0,0,0] > new를 썼기 때문에 기본값이 0으로 배치
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println("arr["+i+"]="+arr[i]);
//		}
		
		
		// 배열을 안 쓴다면 엄청난 양의 코딩을 해야 한다
		
//		int a1=(int)(Math.random()*100)+1;
//		int a2=(int)(Math.random()*100)+1;
//		int a3=(int)(Math.random()*100)+1;
//		int a4=(int)(Math.random()*100)+1;
//		int a5=(int)(Math.random()*100)+1;
//		int a6=(int)(Math.random()*100)+1;
//		int a7=(int)(Math.random()*100)+1;
//		int a8=(int)(Math.random()*100)+1;
//		int a9=(int)(Math.random()*100)+1;
//		int a10=(int)(Math.random()*100)+1;
//		
//		System.out.println("a1="+a1);
//		System.out.println("a2="+a2);
//		System.out.println("a3="+a3);
//		System.out.println("a4="+a4);
//		System.out.println("a5="+a5);
//		System.out.println("a6="+a6);
//		System.out.println("a7="+a7);
//		System.out.println("a8="+a8);
//		System.out.println("a9="+a9);
//		System.out.println("a10="+a10);
//		
//		int max = a1;
//		if(max<a2)
//			max=a2;
//		if(max<a3)
//			max=a3;
//		if(max<a4)
//			max=a4;
//		if(max<a5)
//			max=a5;
//		if(max<a6)
//			max=a6;
//		if(max<a7)
//			max=a7;
//		if(max<a8)
//			max=a8;
//		if(max<a9)
//			max=a9;
//		if(max<a10)
//			max=a10;
//		
//		System.out.println(max);
		
		// 위 코딩을 배열을 한다면?
//		
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*100)+1;
//			System.out.printf("arr[%d]=%d\n",i,arr[i]);
//		}
//		
//		int max=0;
//		for(int i = 0; i < arr.length; i++) {
//			if(max<arr[i])
//				max = arr[i];
//		}
//
//		System.out.println(max);
//		
		
		
		

	}

}

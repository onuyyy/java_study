import javax.sql.rowset.serial.SQLOutputImpl;

/*
 * 
 * 연산자, 제어문 => 형식, 용도
 * 1) 형식
 * 			  1 	2	  3
 * 		for(초기값; 조건식; 증감식;) {
 * 			반복수행문장 4
 * 		}
 * 			>> 초기값은 한 번만 수행
 * 			>> 2-3-4 반복
 * 			>> 2번에서 false면 종료
 * 
 * 	** while문		>> 읽기 할 때 많이 사용된다
 * 	초기값			1
 * 	while(조건) {		2
 * 		반복실행문장	3
 * 		증감식		4	=> true면 2번으로 이동
 * }					=> false면 종료
 * 		
 * 필요에 의해 반복문을 제어할 때,
 * 		1) break;
 * 			반복문을 종료, 반복문이나 switch에서만 사용된다
 * 		2) continue;
 * 			종료하는 것이 아니라 이동, 반복문에서만 사용이 가능하다
 * 			특정 부분을 제외할 때 주로 사용한다
 * 			for => continue가 있을 때 증가식으로 이동시킴
 * 			while = > 조건식으로 이동시킴
 * 
 * 		- 주의점
 * 		1) break, continue 사용할 때
 * 		  밑에서 소스 코딩을 할 수 없다
 * 			ex) for() {
 * 		
 * 				} if() {
 * 					continue;
 * 					sout();		=> 오류! continue 밑은 작동하지 않는다
 *	 				}
 *		2) 자신 소속 반복문만 제어한다
 *			for -> if 안에 존재한다면 if문에서만 작동한다
 *
 *		3) else
 *		if()
 *		if()
 *		if()
 *		else	> 바로 위의 if문과만 관련있다
 *
 *		else > 다중 if의 else는 전체에 관련한 else이고
 *			 > 단일 if의 else는 바로 위의 if와만 관련있다
 * 			
 * 
 * 
 * 
 */
public class 제어문_2 {

	public static void main(String[] args) {
		
//		int i= 1;
//		while(i<=10) {
//			if(i%2==0) {
//				i++;		// 증가를 안 시키면 무한루프로 돈다
//				continue;
//			}
//			System.out.println(i);
//			i++;
//		}
		
		// ** 배열
		
		int[] arr = {1,2,3,4,5};
		System.out.println(arr);
		int[] arr2 = arr;
		System.out.println(arr2);
		arr[1]=10;
		System.out.println(arr[1]);  // > arr, arr2 주소값 같아서 값 바꾸면 같이 바뀜
		
		
		int[] arr3 = arr.clone();  // 새로운 arr 크기의 새로운 배열을 만들어줘! > 주소값 다름
		System.out.println(arr3);  // 주소에 의한 참조 => 메모리 주소를 이용해서 실제 데이터를 관리
	

		
		

	}

}

import java.util.Arrays;

/*
 * 
 * 배열 : 같은 데이터를 모아서 관리
 * 		연속적으로 메모리 배치 > 인덱스번호를 이용한다
 * 		
 *     arr	[ 1 2 3 4 5 ]	
 * 	   		  0 1 2 3 4 	> 인덱스 번호
 * 
 * 
 * 자바의 메모리 구조
 * method area > method, static
 * stack > 메모리 관리 (지역변수, 매개변수) : 블록을 벗어나면 사라지는 변수. 괄호 안에서만 사용
 * heap > 동적 메모리 할당 (new) : 배열 / 클래스
 * 
 * 1. 배열 선언
 * 		데이터형[] 배열명; > 권장사항
 * 		데이터형 배열명[];
 * 
 * 2. 배열 할당 (연속적으로 몇 개를 만들 거냐)
 * 		데이터형[] 배열명 = new 데이터형[크기];
 * 						> new의 역할 : 메모리를 만들어주고 다음에 만든 메모리의 주소값을 넘겨준다
 * 										> 실제 저장된 데이터의 메모리 주소를 이용해서 데어티 관리 (참조 변수)
 * 										> 배열 / 클래스
 * ex)
 * 	int[] arr = new int[5];
 * 	
 *
 * 	**변수 (변수, 배열, 클래스) > 초기화 후에 사용해야 한다 
 * 1. 인덱스를 이용하여 초기화
 * 		int[] arr= new int[3];
 * 		arr[0] = 10;
 * 		arr[1] = 20;
 * 		arr[2] = 30;
 * 		
 * 		 0    1	   2
 * 	    [10] [20] [30] > 0 0 0 이었다가 초기화 후 10 20 30으로 바뀜
 * 
 * 2. for문을 이용하여 초기화 > 인덱스 번호가 필요하기 때문에 일반 for문 사용 / for- each 구문은 출력용임
 * 		for(int i = 0; i < arr.length; i++) {
 * 			arr[i] = (i+1) * 10;
 * 
 * 3. 선언과 동시에 초기화
 * 		영화 / 뮤직 ... (파일, 오라클, 크롤링)
 * 		int[] arr = {1,2,3,4,5}
 * 		char[] c = {'a','b','c'}
 * 		String[] s = {"","","",""}
 * 
 * 4. 배열 > 고정
 * 		배열 혹장 > 새로운 배열을 만든다
 * 		배열 복사 > 
 * 				- 얕은 복사 : 주소를 동일하게 만든다
 * 					int[] arr = {];
 * 					int[] arr1 = arr;
 * 				- 깊은 복사 : 새로운 주소를 만든다
 * 					int[] arr = {};
 * 					int[] arr1 = arr.clone();
 * 						> arraycopy()
 * 						> for를 이용해서 데이터 값만 복사
 * 
 * 
 * new를 이용하는 경우 기본 디폴트값이 설정
 * int[]		: 0
 * char[]		: '\u0000'
 * String[]		: null
 * 					> 모든 클래스의 기본 디폴트 null
 * 					> 메모리 주소가 없는 경우 / NullPointerExceptioon
 * double[]		: 0.0
 * boolean[]	: false
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class 배열응용_1 {

	public static void main(String[] args) {
		
		// char 배열 선언 > 26 > 초기값 > A~Z
		char[] alpha = new char[26];
		
		// 초기화
		char c = 'A';
		for(int i = 0; i < alpha.length; i++) {
			alpha[i] = c++;
		}
		
		//출력
		for(char cc : alpha) {
			System.out.print(cc+" ");
		}
		System.out.println(Arrays.toString(alpha));
	}

}

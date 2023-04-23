import java.util.Arrays;

import javax.sound.midi.spi.SoundbankReader;

/*
 * 
* 정수 10개 저장 공간 > 임의로 초기화 (1~100)
* 최대값 / 최소값 > 위치
* 
*	 1 2 3 4 5 6 7 8 10 9
*	max = 10 > 8번 위치에 있음
*	min = 1	 > 0번 위치에 있음
* 					> 위치(인덱스 번호)를 찾을 줄 알아야 함
* 
*/

public class 배열응용_2 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));

		
		// 최대값, 최소값
		int max = arr[0];
		int min = arr[0];
		
		for(int i:arr) {
			if(max < i)	
				max = i;
			if(min > i)
				min = i;
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min); 
	}

}
 
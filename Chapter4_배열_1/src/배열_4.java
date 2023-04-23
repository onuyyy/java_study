/*
 * 
 * 임의의 정수 10개를 받아서 최대값과 최소값을 구하라
 * 
 */

import java.util.*;
public class 배열_4 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];		// 변수를 10개 잡은 것과 동일
		// 초기화
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		
		// 출력 3가지 방법으로 해본다
		// 1. 일반 for문 이용
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		System.out.println(); // 한 줄 내리기
		System.out.println(Arrays.toString(arr));	// 배열 안에 있는 것을 문자열로 출력하는 기능 쓰기
		
		
		// 2. for-each > 배열이나 컬렉션이 있을 때 사용 (데이터가 모아져있을 때)
		// 		출력할 때만 사용 > 웹에서 많이 사용
		//		Vue, React 에서 많이 사용
		for(int a:arr)	{    // : 배열명 > 실제 데이터를 가져온다 (0부터 실제 데이터 가져옴) 
			System.out.print(a+" ");
		}
			
		System.out.println();
		// 최대값과 최소값
		int max = arr[0], min = arr[0];
		for(int a:arr) {
			if(max<a)
				max = a;
			if(min>a)
				min = a;
		}
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		
		
	}	

}

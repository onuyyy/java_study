
// 16비트 > 0, 1

import java.util.Scanner;
public class 배열_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int input = scan.nextInt();
		// 저장 공간 만들기 (0, 1)
		int [] binary = new int[16];	// 0이 16개 들어간 배열 생김
		int index = 15;
		
		// 횟수가 지정이 안 됐기 때문에 while문을 사용한다
		while(true) {
			binary[index] = input%2;
			input = input/2;
			if(input==0) 
				break;
			index--;		
		}
		
		for(int i = 0; i < binary.length; i++) {
			
			if(i%4==0 && i!=0) {
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
			
		
		
		
		
		
		
		

	}

}

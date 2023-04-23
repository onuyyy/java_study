

// 5 6 7 16번 생략

import java.util.Scanner;  // 라이브러리나 사용자 정의 > 클래스가 다른 폴더에 저장되어 있을 때
// import가 생략 가능한 라이브러리 : java.lang.* 
// 외부에서 만든 라이브러리는 >> org/com

public class 문제풀이_0403 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 1번) 한 개의 정수를 입력 받아 양수 or 음수 판별
		
//		System.out.println("한 개의 정수 입력 : "+input);
//		int input = scan.nextInt();
//		
//		if(input>0)
//			System.out.println(num+"은 양수입니다");
//		else
//			System.out.println(num+"은 음수입니다");
		
																	// >> if ~ else 를 줄여 쓸 수 있는 삼항연산자도 가능 (sum>0?"양수","음수")
		
		
		// 2번) 한개의 정수를 입력받아 3의 배수인지 확인
		
//		int input = scan.nextInt();
//		System.out.println("한 개의 정수 입력 : "+input);
//		
//		if(input%3==0)
//			System.out.println("3의 배수입니다");
//		else
//			System.out.println("3의 배수가 아닙니다");
		

		
		
		// 3번) (*몰라) 한개의 정수를 입력받아 정수의 절대값을 확인 (양수 출력)		
		
//		System.out.println("정수 입력 : ");
//		int input = scan.nextInt();
//		if(input<0)
//			System.out.println(-input);
//		else
//		 System.out.println(input);

		
		
		
		
		// 4번) 년도를 입력받아 윤년 판별 : 4년, 400년마다 한 번 / 100년 마다는 아님
		
//		System.out.println("연도 입력 : ");
//		int year = scan.nextInt();
//		
//		if((year%4==0 && year%100!=0) || (year%400==0))
//			System.out.println(year+"년은 윤년입니다");
//		else
//			System.out.println(year+"년은 윤년이 아닙니다");
		
	
		
		
		// 8번) 1~100까지의 짝수의 합을 구하고 출력
		
//		int sum = 0;
//		for(int i=2; i <= 100; i+=2) {
//			sum =sum+i;
//		}
//		System.out.println("총합 : "+sum);
		
			
																				//		1	   2	 4
																				// for(초기값, 조건식; 증가식) {
																				//		반복실행문장 3 }


		
		// 9번) 1~50까지 5의 배수를 출력하라
		
//		int i = 0, sum = 0;
//		for(i = 5; i <= 50; i+=5) {
//			if(i%5==0){
//			System.out.println(i);
//		}
		
		
		
		
		// 10번) (*몰라)  B D F H J L N 을 출력하는 for문 작성	 (짝수)
		
//		for(char c= 'B'; c <= 'N'; c+=2) {
//			System.out.print(c+" ");
//		}
		
																			// 정수형으로 변경할 필요 없이 char로 바로 출력
		
		
		
		// 11번) 한 개의 정수를 입력 받아 1부터 입력받은 정수까지의 합을 구하라 

//		System.out.println("한 개의 정수 입력 : ");
//		int input = scan.nextInt();
//		
//		int i = 0, sum = 0;
//		for(i = 0; i <= input; ++i) {
//			sum+=i;
//		
//		}
//		System.out.println("총합 : "+sum);
		
	
		
		
		// 12번) (*모름) 1~30까지 수에서 짝수만 한 줄에 3개씩 출력
		
		
	
//        for(int i=1;i<=30;i++)
//        {
//        	if(i%2==0)
//        	{
//        		System.out.printf("%2d\t",i);
//        		if(i%3==0)
//        			System.out.println();// 다음줄에 출력한다 
//        		
//        	}
//        }      
       
        															// \t : 띄어쓰기 (4칸 정도)
        															// \n : 줄 바꿈
        															// \" : '
        															// \' : '
        															// \\ : \
	
		
		
		// 13번) (*모름) 1-2+3-4+5-6+7-8+9-10 for문을 통해서 출력
		
		
//        int sum=0;
//        for(int i=1; i <= 10; i++)
//        {
//        	if(i%2==0)
//        		sum-=i;
//        	else
//        		sum+=i;
//        }
//        System.out.println("sum="+sum);
//        System.out.println(1-2+3-4+5-6+7-8+9-10);
	
		
		
		
		// 14번 ) 1~10까지 중 3의 배수 제외하고 출력
		
//		for(int i = 1; i <= 10; i++) {
//			if(i%3!=0)
//				System.out.print(i+"\t");
//		}
		
		
		
		
		
		// 15번) 2자리 정수를 입력 받고 일의 자리와 십의 자리가 같은 정수 출력
		
//		System.out.println("2자리가 같은 정수를 입력 : ");
//		int num = scan.nextInt();
//		
//		if(num >= 10 && num < 100) {
//			if(num%11==0)
//				System.out.println("십의 자리와 일의 자리가 같다");
//			else {
//				System.out.println("십의 자리와 일의 자리가 같지 않다");
//			}
//		}
//		else {
//			System.out.println("error");
//		}
//		
																		// 큰 틀에서의 if~else로 오류 처리 먼저 구분한다
		
		
		
		
		
		
		
		
		
	}

}

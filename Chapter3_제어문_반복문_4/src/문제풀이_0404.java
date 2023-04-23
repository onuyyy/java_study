

import java.util.Scanner;
public class 문제풀이_0404 {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		// 반복문 1번
		// x가 10보다 크고 20보다 작을 때 true인 조건식 작성 (조건문)
		
//		System.out.println("변수 입력 : ");
//		int x = scan.nextInt();
//		
//			if(x >= 10 && x <=20)
//				System.out.println("true");
//			else 
//				System.out.println("error");
			
		
		// 반복문 2번 (**다시 풀어)
		// 변수 ch가 공백이고 탭이 아닐 때 true인 조건식 작성
			
//			System.out.println("변수 입력 : ");
//			char ch = 'a';
//			ch = scan.next().charAt(0);
//			
//			if(ch==' ' && ch !='\t')
//				System.out.println("true");
//			else
//				System.out.println("error");
			
		
		
		
		// 반복문 3번
		// 변수 ch가 x 또는 X일 때 true인 조건식 작성
		
//		System.out.println("변수 입력 : ");
//		char ch = 'a';
//		ch = scan.next().charAt(0);	
//				
//		if(ch=='x' || ch=='X')
//			System.out.println("true");
			
		
		
		
		
		// 반복문 4번
		// ch가 숫자 0~9일 때 true인 조건식
		
//		System.out.println("변수 입력 : ");
//		int ch = 'a';
//		ch = scan.nextInt();
//		
//		if(ch >=0 && ch < 10)
//			System.out.println("true");
		
		
		
		
		
		
		// 반복문 5번 (** 모름)
		// 두 개의 주사위를 던졌을 때 합이 6이 되는 경우의 수를 출력
		
 // (1,5) (2,4) (3,3) (4,2) (5,1)
		
//		for(int i = 1; i <= 6; i++) {
//			for(int j=1; j <=6 ; j++) {
//				if(j+i==6) {
//					System.out.println("[%d,%d]\n",i,j);
//				}
//			}
//		}

		
		
		
		
		// 반복문 6번 (** 모름)
		// 사용자로부터 두 개의 정수를 입력 받아 처음부터 끝까지의 곱셈을 출력  (오류 처리하는 습관 기르기)
		
//		System.out.println("변수 입력1 : ");
//		int a = scan.nextInt();
//
//		int b = 0;
//		while(true) {
//			System.out.println("변수 입력2 :");
//			b= scan.nextInt();
//			if(b<a) {
//				System.out.println("첫번째보다 큰 수여야 합니다");
//				continue;
//			}
//			break;
//		}
//		int gop = 1;
//		for(int i = a; i <= b; i++) {
//			gop*=i;
//		}
//		System.out.println(a+"부터"+b+"까지의 합은 : "+gop);
	
		
		
		
		// 반복문 7번
		// 5~16까지의 합
//		int sum = '0';
//		for(int i = 5; i <= 16; i++) {
//			sum+=i;
//		}
//			System.out.println(sum);
			
			
		
		
		
		// 반복문 8번
		// 3이상 4462이하에서 짝수인 정수의 합을 구하라
		
//		int sum = 0;
//		for(int i = 3; i <= 4462; i++) {
//			if(i%2==0)
//				sum+=i;
//		}
//		System.out.println(" 정수의 합 : "+sum);
			


		
		
		// 반복문 9번
		// 0~12까지의 2의 배수, 3의 배수의 합을 구하라
		
//		int sum = 0, sum2 = 0;
//		for(int i = 0; i <= 12; i++) {
//			if(i%2==0)						
//				sum+=i;
//			if(i%3==0)
//			sum2+=i;
//		}
//		
//		System.out.println("2의 배수의 합 : "+ sum);
//		System.out.println("3의 배수의 합 : "+ sum2);

			
		
		
		
		
		// 반복문 10
		// 1~100까지의 정수 중 4의 배수의 합을 구하라
		
//		int sum = 0;
//		for(int i = 1; i <= 100; i++) {
//			if(i%4==0)
//				sum+=i;
//		}
//		System.out.println("4의 배수의 합: "+sum);
			
		
		
		
		
		
		// 반복문 11 (** 다시 풀어)
		// 10개의 정수를 입력 받아 짝수가 몇 개인지 출력
		
//		int count = 0;
//		for(int i =1; i <= 10; i++) {
//			int num =(int)(Math.random()*100)+1;
//			System.out.println("num = "+num);		// 10개 변수 출력
//			if(num%2==0)
//				count++;
//		}
//		System.out.println("결과 값 : "+count);
		
		
		
		
		
		// 반복문 12 (** 다시 풀어)
		// 10개의 정수를 입력 받아 3의 배수, 5의 배수 개수 출력

//		int count3 = 0, count5 = 0;
//		for(int i = 0; i <= 10; i++) {
//		int num =(int)(Math.random()*100)+1;
//		System.out.println("num = "+num);	
//		if(num%3==0) {
//			count3++;
//		if(num%5==0) {
//			count5++;
//			}
//		}
//		}
//		
//		System.out.println("3의 배수 : "+count3);
//		System.out.println("5의 배수 : "+count5);
		
		
		
		
		
		
		
		// 반복문 13
		// **********
		// **********
		// **********
		// **********
		// **********		> 5행 10열 출력
		
		
		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= 10; j++) {
//				System.out.print("*");
//			}
//			System.out.println();		// 다음 줄로 내리는 것
//		}	
		
		
		
		
		
		
		// 반복문 14
		// 11111
		// 22222
		// 33333
		// 44444
		// 55555			> 출력
		
			
//			for(int i = 1; i <=5; i++) {
//				for(int j =1; j <= 5; j++) {
//					System.out.print(i+" ");
//				}
//				System.out.println();
//			}
			
		
		
				
			// 반복문 15
			// 1 2 3 4 5 
			// 1 2 3 4 5 
			// 1 2 3 4 5 
			// 1 2 3 4 5 
			// 1 2 3 4 5 
		
		
//		for(int i = 1; i <=5; i++) {
//		for(int j =1; j <= 5; j++) {
//			System.out.print(j+" ");
//		}
//		System.out.println();
//	}
		
		
		
		
		// 반복문 16
		// A A A A A 
		// B B B B B 
		// C C C C C 
		// D D D D D 
		// E E E E E 

		
	
//		for(int i = 1; i <=5; i++) {
//			char c = 'A';
//		for(int j =1; j <= 5; j++) {
//			System.out.print(c+" ");
//		}
//		System.out.println();
//		c++;
//	}
			
		
		
		
		

			
			
			
		}

		
	}


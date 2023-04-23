

import java.util.Scanner;

public class 문제풀이_0331 {

	public static void main(String[] args) {
		
//문제1. 정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 
//        판단해보자.
		
		Scanner scan = new Scanner(System.in);
//		System.out.println(" 정수 입력 : ");
//		int num = scan.nextInt();
//		
//		if(num >= 50) {
//			System.out.println("50 이상의 수 입니다");
//		}
//		else {										// else는 false 일 때만 실행하는 문장, 조건다는 것 아님
//			System.out.println("50 이하의 수 입니다");
//		}
		
		
		
		int num = scan.nextInt();
		
		if(num>=50)
			System.out.println("50이상의 수");
		else
			System.out.println("50 이하의 수");
		
		
		
		
//문제2. 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.

//		Scanner scan = new Scanner(System.in);
//		System.out.println(" 정수 입력 : ");
//		int num = scan.nextInt();
//		
//		if (num%3==0 && num!=0) {
//
//			System.out.println("3의 배수입니다");
//
//		}
//		else {
//			System.out.println("3의 배수가 아닙니다");
//		}
		
		
		
		
//문제3. (**)1학년부터 4학년까지 중간고사 시험을 보았다. 
//      4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
//      이를 판단하는 프로그램을 작성해보자.
//      점수가 0미만 100초과이면 경고문구 출력!

//		Scanner scan = new Scanner(System.in);
//		System.out.println("학년 : ");
//		int grade = scan.nextInt();
//		System.out.println("점수 : ");
//		int score = scan.nextInt();
//		
//		if(score < 0 || score >100) { 				// if문의 큰 틀부터 생각해야 함 
//			System.out.println("경고");
//		}
//		else {
//			if(grade==4) { 
//				if (score>=70){
//						System.out.println("힙격입니다");
//					}
//					else {
//						System.out.println("불합격입니다");
//					}
//				} else {
//					if(score >= 60) {
//						System.out.println("합격");
//					} else {
//						System.out.println("불합격");
//					}
//						
//					
//			}
//		}}}
		

		
	
		
		
//문제4. 사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 
//        합계와 평균을 구해보자.
		
		
//		Scanner scan = new Scanner(System.in);
//		int a = (int)(Math.random()*100)+1;
//		int b = (int)(Math.random()*100)+1;
//		int c = (int)(Math.random()*100)+1;
//		
//		int total = a+b+c;
//		double avg = total/3.0;
//				
//		System.out.println("a : "+a);
//		System.out.println("b : "+b);
//		System.out.println("c : "+c);
//		System.out.println("total = "+total);
//		System.out.println("평균 : %2f\n",avg);
//		
//		int max =a;
//		if(max<b)
//			max=b;
//		if(max<c);
//			max=c;
//			System.out.println("최대값 : " +max);
//	
//	}}
//		
		
	//-------내가 푼 거

//		Scanner scan = new Scanner(System.in);
//		System.out.println("정수1 : ");
//		int num1 = scan.nextInt();
//		System.out.println("정수2 : ");
//		int num2 = scan.nextInt();
//		System.out.println("정수3 : ");
//		int num3 = scan.nextInt();
//		
//		if (num1 > num2 && num1 > num3) {
//			System.out.println("최대값 : "+num1);
//		}
//		
//		if (num2 > num1 && num2 > num3) {
//			System.out.println("최대값 : "+num2);
//		}
//		
//		if (num3 > num1 && num3 > num2) {
//			System.out.println("최대값 : "+num3);
//		}
//
//		
//		if (num1 < num2 && num1 < num3) {
//			System.out.println("최소값 : "+num1);
//		}
//		
//		if (num2 < num1 && num2 < num3) {
//			System.out.println("최소값 : "+num2);
//		}
//		
//		if (num3 < num1 && num3 < num2) {
//			System.out.println("최소값 : "+num3);
//		}
//
//		int total = num1 + num2 + num3;
//		double avg = (num1 + num2 + num3) / 3;
//		
//		System.out.println("합계 : "+total);
//		System.out.println("평균 : "+avg);


		
		
//문제5. 사용자로 부터 정수를 입력받아서 양수인지 음수인지 확인하는 
//        프로그램 작성

//		Scanner scan = new Scanner(System.in);
//		System.out.println("입력값 : "); 
//		int num = scan.nextInt();
//		
//		if(num>0) {
//			System.out.println(num+"는(은) 양수");
//		}
//		else {
//			System.out.println(num+"는(은) 음수");
//		
//		
//		}}}
		
		
		 
//문제6. 임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성
		
//		int no = (int)(Math.random()*2); // 0,1
//		char ch;
//		
//		if(no==0) 
//			ch = (char)((Math.random()*26)+65); // 대문자 출력 문자 번호
//		else 
//			ch = (char)((Math.random()*26)+97);	// 소문자 출력 문자 번호
//		
//		if(ch >= 'A' && ch <= 'Z')
//			System.out.println(ch+"는(은) 대문자입니다");
//		else
//			System.out.println(ch+"는(은) 소문자입니다");
//		
//	}}

// 
		

		
		
		
//문제7.(**) 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램
//       작성 ( 90이상이면 A,80이상이면 B, 70이상이면 C,60이상이면 D, 
//       나머지는 F)

		
		
//	int num1 = (int)((Math.random()*100)+1);
//	int num2 = (int)((Math.random()*100)+1);
//	int num3 = (int)((Math.random()*100)+1);
//	System.out.println("국어 : "+num1+" / 수학 : "+num2+" / 영어 : "+num3);
//
//	int total = num1 + num2 + num3;
//	double avg = (num1 + num2 + num3) / 3;
//	
//	System.out.println("총점 : "+total);
//	System.out.println("평균 : "+avg);
//	
//	int temp = avg;
//	if(temp >=90 && temp<=100)
//		temp = 'A';
//	if(temp >=80 && temp < 90);
//		temp = 'B';
//	if(temp >=70 && temp < 80);
//		temp = 'C';
//	if(temp >=60 && temp < 70);
//		temp = 'D';
//		
//		System.out.println("합점 : "+temp);
	

	

	}}
	
		
	

import java.util.Scanner;
public class 문제풀이_0330 {

	public static void main(String[] args) {
		
		   //1번 : 3,8
//		   int a;   
//		   int b;   
//		   a=3;   
//		   b=a+5;       
//		   System.out.printf("a의 값: %d \n", a);   
//		   System.out.printf("b의 값: %d \n", b);   \
		
		// 메모리 저장과, printf의 정체를 알아야 함
		
		
		
		
		// %d = 정수값
		// %f = 실수값
		// %c = 문자
		// %s = 문자열
//	
//	int a =10;
//	double d = 10.5;
//	char c = 'A';
//	System.out.println("a="+a+",d="+d+",c="+c);
//	System.out.printf("a=%d,b=%.1f,c=%c",a,d,c); // printf 출력할 때 서식을 만들어놓고 출력하는 것
//	System.out.printf("a=%3db,b=%4.1f,c=%2c",a,d,c);
		
		
		
		    
			//2번 : 8, 4, 12, 3, 0
//		    int a, b;  
//		    a = 6;  
//		    b = 2;   
//		    System.out.printf("덧셈 연산 결과: %d \n", a+b);  
//		    System.out.printf("뺄셈 연산 결과: %d \n", a-b);  
//		    System.out.printf("곱셈 연산 결과: %d \n", a*b);  
//		    System.out.printf("나누기 연산 결과: %d \n", a/b);
//		    System.out.printf("나머지 연산 결과: %d \n", a%b);

		
		
			//3번 : 3, 1
//			int num1, num2;   
//		     num1 = 10/3;
//		     // '몫' 출력   
//		    num2 = 10%3;
//		     // '나머지' 출력
//		   	System.out.printf(" 몫: %d \n", num1);   
//		  	 System.out.printf("나머지: %d \n", num2); 
		
		   
			//4번 : 3, 0, 6, 2, 1
//		  	 int num1=1, num2=2, num3=3, num4=4, num5=5;     
//		     num1 = num1 + num2;
//		     num2 = num2 - 2;     
//		     num3 = num3 * 2;     
//		     num4 = num4 / 2;     
//		     num5 = num5 % 2;     
//		     System.out.printf("%d, %d, %d, %d, %d \n",num1,num2,num3,num4,num5);   
		
		
			//5번 :  10, 11, 12, 11, 10
//			int num1=10;   
//		      System.out.printf("%d \n", num1);
//		      num1++;
//		      System.out.printf("%d \n", num1);
//		      ++num1;
//		      System.out.printf("%d \n", num1);
//		      --num1;
//		      System.out.printf("%d \n", num1);
//		      num1--;
//		      System.out.printf("%d \n", num1);

		
			//6번 : 10, 11
//	       int num1=10, num2=10;   
//	       int a, b;   
//	       a = ++num1;
//	       b = num2++;
//
//	       System.out.printf("%d, %d \n", b, num2);
		
		
			//7번 : 11, 11, 10, 11
//	        int num1=10, num2=10;   
//	        int a, b;   
//	        num1 = num1 + 1;
//	        a = num1;
//	        System.out.printf("%d, %d \n", a, num1);
//	        b = num2;
//	        num2 = num2 + 1;
//	        System.out.printf("%d, %d \n", b, num2);

		
			//8번 : 11, 11, 10, 11
//			int num1=10, num2=10;
//		    System.out.printf("%d \n", ++num1);
//		    System.out.printf("%d \n", num1);
//		    System.out.printf("%d \n", num2++);
//		    System.out.printf("%d \n", num2);
		
		
			//10번(*) : 2, 6
//		    int num1 = 2;
//		    int num2 = 7;
//		    int num3; 
//		    int num4; 
//		    num1++; 				//2+1
//		    num3 = --num1; 			// 2
//		    --num2; 				//	6
//		    num4 = num2++; 			//	7
//		    System.out.printf("%d\n", num3);
//		    System.out.printf("%d\n", num4); 
		
		
			//11번(*) : 4, 4, 4, 4
//		 	int i = 0;
//		 	int re = 0;
//		 	i = 3;
//		 	re = ++i; // 
//		 	System.out.println("re:"+re+",i:"+i);
//		 	i=3;
//		 	re = i++;
//		 	System.out.println("re:"+re + ",i:"+i);
		
			//12번
//			Scanner scan = new Scanner(System.in);  // system.in은 키보드 입력 값 받는 것
//			System.out.println("입력1 : ");
//			int result1 = scan.nextInt();
//			System.out.println("입력2 : ");
//			int result2 = scan.nextInt();
//			System.out.println("덧셈 :"+(result1+result2));
//			
//			System.out.println("입력3 : ");
//			int result3 = scan.nextInt();
//			System.out.println("입력4 : ");
//			int result4 = scan.nextInt();
//			System.out.println("곱셈 :"+(result3*result4));
		
		//해답
//	Scanner scan = new Scanner(System.in); 
//	System.out.println("정수 두 개를 입력하세요(20 30) : ");
//	int a = scan.nextInt();
//	int b = scan.nextInt();
//	System.out.println(a-b);
//	System.out.println(a*b);
		
		
				// 프로그래밍 순서
				// 1. 변수 : int a,b;
				// 2. 초기화: scanner
				// 3. 연산처리 a-b , a*b
				// 4. 결과 출력
		/*
		 * 			데이터 저장   		>>>		   데이터가공 (연산처리)		 >>>		 결과값 출력
		 * 			1) 직접 값 입력 int a =10;			연산자					println or printf	
		 * 			2) 사용자로부터 입력 받음
		 * 			3) 난수 Math.random
		 * 			4) 파일에 읽기
		 * 			5) 오라클에서 값 읽기	
		 * 
		 * 
		 * 
		 */
		
			
			
			//13번
//			Scanner scan = new Scanner(System.in);
//			System.out.println("입력1 : ");
//			int result1 = scan.nextInt();
//			System.out.println("입력2 : ");
//			int result2 = scan.nextInt();
//			System.out.println("입력3 : ");
//			int result3 = scan.nextInt();
//			System.out.println("입력1 * 입력2 + 입력3 : "+(result1*result2+result3));			
			
		//해답
//	Scanner scan = new Scanner(System.in);
//	int a,b,c;
//	System.out.print("세 개의 정수 입력 ( ) : ");
//	a = scan.nextInt();
//	b = scan.nextInt();
//	c = scan.nextInt();
//	
//	System.out.printf("%d*%d+%d=%d",a,b,c,a*b+c);
	
	
	
	
	
//			//14번
//			Scanner scan = new Scanner(System.in);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
//			System.out.println("입력1 : ");
//			int result1 = scan.nextInt();
//			System.out.println("입력2 : ");
//			int result2 = scan.nextInt();
//			System.out.println("입력1/입력2 :"+(result1/result2));
		
		//해답
		
		Scanner scan = new Scanner(System.in);
		
		int a,b;
		a = (int)(Math.random()*100)+1;
		b = (int)(Math.random()*100)+1;
		System.out.printf("a=%d,b=%d,a%%b=%d",a,b,a%b); // 서식 안에 나머지는 %% 두 번 표시로 해
		
		
		
		
		
		
		
		
		
		
		
		
	}




	}


/*
 * 
 * 자바 형식
 * package 클래스의 위치	>> 한 번 사용
 * import 외부 라이브러리 불러오기		>> 여러 번 사용이 가능
 * public class ClassName {		>> 하나의 자바 파일
 * 	멤버변수
 * 		> 인스턴스 변수 : new를 사용할 때마다 메모리가 따로 생성
 * 		> 정적변수 (공유변수) : 메모리가 한 개만 생성
 * 	생성자 : 메모리 할당시 호출되는 메소드
 * 		> 멤버변수에 대한 초기화
 *	메소드 : 특정 작업을 수행하는 명령문의 집합
 *	main 메소드 : 프로그램의 시작점
 * }
 * 		==> OOP답게 변환 (OOP : 객체지향프로그램)
 * 			1) 데이터 보호 (캡슐화)
 * 			2) 재사용 (상속/포함)
 * 			3) 수정, 추가 (다형성) => 오버라이딩/오버로딩
 * 
 * 	클래스의 종류 => (추상클래스, 인터페이스)
 *  예외처리
 *  --------------------------------------------------자바의 기초
 *  >> 이 다음에 라이브러리
 *  	1) 사용자 정의
 *  	2) 자바에서 지원
 *  	3) 외부 업체에서 지원 (Jsoup)
 *  
 *  --------------------------------------------------
 *  
 *  
 *  ** 메소드 기초
 *  메소드 : 한 개의 기능을 수행할 목적
 *  	1. 메소드 제작 목적
 *  		- 재사용 (다른 클래스에서 사용하기 위해 만든다)
 *  		- 반복 : 중복된 코드를 제거
 *  			ex) 데이터베이스 연결
 *  				------------- 목록
 *  				오라클 연결
 *  				목록에 출력할 데이터를 읽기
 *  				오라클 닫기
 *  				------------- 데이터 추가
 *  				오라클 연결
 *  				데이터 추가
 *  				오라클 닫기
 *  				------------- 데이터 수정
 *  				오라클 연결
 *  				데이터 수정
 *  				오라클 닫기
 *  				------------- 데이터 삭제
 * 					오라클 연결
 *  				데이터 삭제
 *  				오라클 닫기
 * 								>> 오라클 연결, 닫기의 반복을 메소드를 사용하여 중복 코드 제거할 수 있음
 * 			- 구조화된 프로그램 짜기 >> 단락을 나눠서 처리
 * 
 * 		2. 메소드의 형식
 * 			- 선언부
 * 			public static void main(String[] args)
 * 			- 구현부
 * 			{		>> 괄호 열고 닫는 것
 * 			}
 * 	
 * 		3. 메소드의 구성 요소
 * 			결과값 메소드명(매개변수)
 * 				    1개		매개변수는 여러 개 사용이 가능
 * 			= 사용자의 요청값 받아서 처리 결과값을 넘겨준다
 * 			 -----------------매개변수 -----------리턴형
 * 			ex)  로그인
 * 				사용자의 요청값 : id, pw
 * 				결과값 : 로그인 여부 (boolean)
 * 				boolean isLogin (String id, String pw)
 * 
 * 			ex) +
 * 				사용자의 요청값 (매개변수) : 정수 2개
 * 				결과값 : 정수 두 개의 합
 * 
 * 			리턴형		매개변수
 * 			------------------
 * 			 o				o
 * 			 레턴형 메소드명(매개변수..)	
 * 			 String substring(int s, int e)
 * 			------------------
 * 			 o				x
 * 			 리턴형 메소드명()
 * 			 String trim()
 * 			 double random()
 * 			------------------
 * 			 x				o
 * 			 void 메소드명(매개변수..) : 그 자리에서 출력만 함, 결과값 없음 ex) main
 * 			 void main(String[] arg)
 * 			 void println(String a)
 *	 		------------------
 *			 x				x
 *			 void 메소드명()
 *			 void println()
 *			------------------
 * 				결과값(처리) => 리턴형
 * 				리턴형 : 기본형, 배열, 클래스
 * 				메소드명 : 알파벳이나 한글 사용 가능 (알파벳은 대소문자 구분)
 * 						 숫자 사용 가능 (맨 앞에는 사용 금지)
 * 						 특수 문자 사용이 가능 ( _, $ )
 * 						 키워드는 사용할 수 없다
 * 						 공백이 있으면 안 된다 
 * 					 	 약속사항 > 소문자로 시작한다
 * 						 	    > 두 개의 단어가 연결일 때, 두번째 시작은 대문자, _   fileName file_name
 * 				매개변수 : 사용자가 요청한 값 > 3개 이상이면 배열이나 클래스를 사용
 * 
 * 			형식) ex 두 개 정수 보내주고 더한 값을 받는다
 * 				int add(int a, int b) {		>> 선언부
 * 					
 * 					int c = a+b;
 * 					return c;			
 * 							>> 구현부
 * 				}						>> int와 return 데이터형 동일해야 한다, int 자리의 데이터형은 클 수도 있다 웬만하면 맞춰줘야 한다 
 * 
 * 				ex void gugudan () {
 * 						>> 결과값이 없이 자체에서 출력
 * 					구구단을 출력
 * 					return;		>> 메소드는 종료시점이 return에서 종료한다
 * 								>> void일 때는 생략이 가능 > 생략하게 되면 컴파일러가 자동으로 return을 추가한다
 * 				}
 * 
 * 					변수 (20%) / 메소드 (80%) 의 비율 
 * 
 * 		4. 메소드 사용하는 방법
 * 			= 프로그램
 * 			1) 재사용
 * 			2) 가독성 : 보기 편하다 (유지보수)
 * 			3) 반복 제거 : 소스양 줄이기
 * 			= 모든 프로그램 >> 메소드 제작
 * 			1) 사용자 입력값
 * 			2) 사용자 요청 처리 >> 세분화
 * 			3) 결과값 출력
 * 
 * 		5. 메소드 호출
 * 			리턴형이 있는 경우 ==> 데이터형 변수명 = 메소드명()
 * 				ex)	int add(int a, int b) {
 * 					return a+b;
 * 				}
 * 
 * 				int c = add(1,20)	>> int c = 30
 * 			
 * 				ex)	boolean isLogin(String id, String pw) {
 * 					return true;
 * 				}
 * 
 * 				boolean bCheck = isLgin("admin","1234");
 * 
 * 
 * 			리턴형이 없는 경우 (void) ==> 메소드명()
 * 				ex)	void gugudan() {
 * 					 ==구구단 출력
 * 				}
 * 
 * 				gugudan();
 * 					=> 메소드를 호출하면 메소드 전체를 수행하고 => 호출된 위치로 다시 돌아온다
 * 
 * 				ex) mian() {
 * 						1
 * 						2
 * 						3				--- 수행
 * 						gugudan()		--- 7, 8, 9, 10, 11 > 불러오기
 * 						4				--- 수행 시작
 *  					gugudan()       --- 7, 8, 9, 10, 11 > 불러오기
 * 						5
 * 						6
 * 					}
 * 
 * 					void gugudan() {
 * 						7
 * 						8
 * 						9
 * 						10
 * 						11
 * 					}
 * 
 * 				** return은 항상 마지막에 있다 / 중간에 있는 경우도 있음 ( 중간에서 메소드 종료된다 )
 * 					>> return이 있는 곳이 메소드 종료 시점이다
 * 
 * 					void find(String fd) {
 * 						if(fd==null) 
 * 							return; > 여기서 종료된다
 * 							--
 * 							--
 * 							return;
 * 					}
 * 
 * 
 * 
 */


// 		3개의 정수를 받아서 총점, 평균, 학점을 구해서 출력
import java.util.Scanner;
public class 클래스구성요소 {
	/*
	 * 
	 * 메소드
	 * 1) 인스턴스 메소드 => 객체 생성시마다 따로 저장
	 * 		class a {
	 * 			void display() {}
	 * 		}
	 * 			A a = new A() => display()
	 * 			A b = new A() => display()
	 *			A c = new A() => display()
	 *
	 * 2) 정적 메소드	=> 한개의 공간에만 저장 (JVM에 의해 메모리에 자동 저장)
	 * 		static 
	 * 3) 추상 메소드 : 선언만 하는 메소드 (추상클래스, 인터페이스)
	 * 4) 종단 메소드 : 수정이 불가능한 메소드
	 * 		final
	 * 
	 */

	
	static int input(String subject) {
		System.out.print(subject+" 점수 입력 : ");
		
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();	
		
		return value;
	}
	
	static int totalGesan(int kor,int math, int eng, int his, int phy) {
		return kor+eng+math+his+phy;
	}
	
	static double avgGesan(int total) {
		return total/5.0;
	}
	
	static int scoreGesan(double avg) {
		char score = 'a';
		switch((int)(avg/10)) {
		case 10: case 9:
			score = 'A';
			break;
		case 8 : 
			score = 'B';
			break;
		case 7 :
			score = 'C';
			break;
		case 6 :
			score = 'D';
			break;
		default :
			score = 'F';
		}
		return score;
	}
	
	public static void main(String[] args) {
	
		
//		System.out.print("국어 점수 입력 : ");
//		int kor = scan.nextInt();
//		System.out.print("영어 점수 입력 : ");
//		int eng = scan.nextInt();
//		System.out.print("수학 점수 입력 : ");
//		int math = scan.nextInt();
//		System.out.print("국사 점수 입력 : ");
//		int his = scan.nextInt();
//		System.out.print("물리 점수 입력 : ");
//		int phy = scan.nextInt();				//	5개 반복 구간이다 > 메소드 활용하여 반복 제거
		
		
		int kor = input("국어");
		int eng = input("영어");
		int math = input("수학");
		int his = input("국사");
		int phy = input("물리");
		
		System.out.println("국어 : "+kor); 
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("국사 : "+his);
		System.out.println("물리 : "+phy);
		
		// 총점 평균 학점 계산 프로그램 만들기
		
//		int total = kor+eng+math+his+phy;
//		System.out.println("총점 : "+total);
		
		int total = totalGesan(kor,math,eng,phy,his);
		System.out.println("총점 : "+total);
		
//		double avg = total/5.0;
//		System.out.printf("평균 : %.2f\n",+avg);
		
		double avg = avgGesan(total);
		System.out.println("평균 : "+avg);
		
//		char score = 'a';
//		switch((int)(avg/10)) {
//		case 10: case 9:
//			score = 'A';
//			break;
//		case 8 : 
//			score = 'B';
//			break;
//		case 7 :
//			score = 'C';
//			break;
//		case 6 :
//			score = 'D';
//			break;
//		default :
//			score = 'F';
//		}
//		
//		System.out.println("학점 : "+score);
		
		double score = scoreGesan(avg);
		System.out.println("학점 : "+score);
		
		

	}

}

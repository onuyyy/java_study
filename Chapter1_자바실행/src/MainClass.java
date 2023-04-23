
// 한 줄 주석
/*
 * 여러줄 주석  : ctrl + shift + /  , ctrl + /
 * 주석 푸는 법 : crtl + shift + \
 * 괄호 열고 들여쓰기 : 괄호 열고 엔터 치면 자동 들여쓰기
 * 
 * 기본 문법 사항 19pg
 * 	1. 파일명과 클래스명은 동일해야 한다
 * 		Class name = name.java
 *  2. 클래스 안에는 반드시 main() 포함해야 한다
 *  	실행 시에 시작점이라고 보면 된다
 *  3. 클래스명은 첫자를 대문자로 해야 한다 (문법 X , 약속 O)
 *  	한글로도 가능하다 
 *  4. 표현법
 *  	- 문자열 : 문자 여러개 "Hello"
 *  	- 문자 : 문자 한 개 'H', '홍'
 *  	- 숫자 : 정수 / 실수
 *  		정수 1) 10진법 100,90,80,...
 *  			2) 8진법  012,015,048,... (0~7)
 *  			3) 16진법 0x13 = 19  (0~9)
 *  			4) 2진법  0b   (0~1) (*중요)
 *  		실수 1) 10.11   (double) - 8byte
 *  			2) 10.11F  (float) - 4byte
 *  	- 논리 : true / false 만 가능
 *  	- 특수문자 
 *  			1) \t : 일정 간격 띄우기
 *  			2) \n : new line 다음 줄에 출력 (*중요)
 *  			3) \" : 따옴표 출력
 *  			4) \\ : \\ > \ 두 개를 하나로 출력 (*중요) 
 *  
 *  메소드 : 기능 수행할 때 쓰는 것
 *  함수 : C언어나 Python 에서는 메소드를 함수라 부른다 (기능은 같음)
 *   > 차이점? class 안에 있는지 여부
 *   5. 샐행과정
 *   	A.java > 원시소스 : 프로그래머만 아는 언어
 *      컴퓨터가 인식하는 언어로 변경 (컴파일 > javac) > A.class > 실행 (인터프리터)
 *   
 *   컴파일 방식 : c언어, c++
 *   인터프리터 방식 : html, xml, java ...
 *   
 */		

public class MainClass {

	public static void main(String[] args) {
		
		
		  System.out.println("Hello \tJava");
		  System.out.println("Hello\nWorld");
		  System.out.println("Java");
		  System.out.println("\"홍길동\"");
		  System.out.println("\\");
		  System.out.println('A');
		  System.out.println(true);
		  System.out.print(0);
		 

		
		// 같은 기능을 갖고 여러 개의 메소드를 만드는 것을 오버로딩
		 
	}

}

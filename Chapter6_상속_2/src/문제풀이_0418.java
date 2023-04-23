/*
 * 
 * 1. 캡슐화
 * = 데이터 보호
 * = 데이터를 은닉화 (private) : 메소드를 통해서 접근이 가능 (다른 클래스 연결 => put)
 * 
 * 사용자 정의 데이터형 = 필요에 의해서 데이터를 묶어서 관리할 목적으로 만든다
 * 사용자 정의 데이터형 ~VO (value object : 변수의 값만 가지고 있는 변수)
 * 
 * 
 * 
 * 
 * 
 */
class SutdaCard {
	
	private int num;
	private boolean isKwang;
	
	// getter 읽기 , setter 저장
	public boolean isKwang() {
		return isKwang;
	}
	public void setKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}


	
}

class Student {
	
	private String name;
	private int bam;
	private int no;
	private int kor;
	private int eng;
	private int math;		// 클래스에 멤버변수는 private / 메소드,생성자는 public
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBam() {
		return bam;
	}
	public void setBam(int bam) {
		this.bam = bam;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
}

/* 3번
 * 인스턴스 : 데이터를 각각 저장할 때 사용 			>>	kind, num
 * 정적변수(공유변수) : static 메모리가 한 개만 생성  >> width, height
 * 지역변수 : 메소드에서 선언되는 변수(지역변수,매개변수) >> k, n
 * 			=> 메소드 안에서만 사용되는 변수
 * 			=> 블록을 벗어나면 종료하는 변수
 * 			=> 반드시 초기화 필요 
 * 
 * 생성자에 대한 문제
 * b, e
 * 생성자
 * 1) 모든 생성자의 이름은 클래스명과 동일하다
 * 2) 생성자는 객체를 생성하기 위한 것이다 (x) > new 
 * 3) 클래스에는 생성자를 반드시 하나 이상 있어야 된다 (x) > 존재하지 않아도 된다
 * 4) 생성자는 오버로딩을 지원한다	(같은 이름의 메소드를 여러 개 만들어 처리)
 * 
 *		** 오버로딩의 조건
 *		= 한 개의 클래스나 상속 관계의 클래스가 있어야 한다
 *		= 메소드명이 동일해야 한다
 *		= 매개변수가 개수가 다르거나 데이터형이 달라야 한다
 *		= 리턴형은 관계가 없다
 *
 * 		class A {
 * 			public void display() {}
 * 			public int display(int a) {}	>> 다른 클래스이다
 * 		}
 * 		class B extends A {
 * 			public int display(int a, int b) {}	>> 상속받아서 오버로딩 할 수도 있다
 * 		}
 * 
 *
 *
 * this 문제
 * b, d
 * 1) 모든 클래스는 this를 가지고 있다
 * 2) 객체 자신을 가르키는 참조변수 (static Object this) => new
 * 		=> this는 생성자나 인스턴스메소드에서 사용이 가능
 * 			class A {
 * 				public A() {
 * 				}
 * 				public void display() {
 * 				}
 * 				public static void aaa() {
 * 				}
 * 			}
 * 3) 클래스 내에서는 어디든지 사용이 불가하다 > static에선 사용 불가
 * 4) 지역변수와 인스턴스 변수를 구분할 때 사용한다 
 * 		class A {
 * 			private String name;
 * 			public void display(String name) {		=> stack
 * 				this.name = name;
 * 				---------	----- > 매개변수
 * 				A클래스에서 설정된 변수
 * 			}
 * 		}
 * 5) 클래스 메소드(static) 내에서는 사용할 수 없다
 * 		인스턴스메소드, 객체메소드
 * 			객체명.메소드
 * 		정적메소드, 공유메솓, 믈래스메소드
 * 			클래스명.메소드

 * 
 * 
 * 오버로딩 문제
 * c, d
 * 
 * 
 * 오버로딩의 조건
 * 메소드
 * 매개변수
 * 메소드명
 * 
 * 
 * add 메소드
 * b,c,d
 * 
 * 
 * 초기화에 대한 설명?
 * 1) 멤버변수는 자동으로 초기화 되므로 초기화하지 않고도 값을 참고할 수 있다
 * 2) 지역변수는 사용하기 전에 반드시 초기화 후에 사용해야 한다
 * 3) 초기화 블록보다 생성자가 먼저 수행된다 (x)
 * 		=> 명시적 초기화 > 초기화 블록 > 생성자			(명시적 초기화를 제일 먼저 고려해야 한다)
 * 						------- 클래스변수가 먼저 그 다음 인스턴스변수
 * 								------- 컴파일시,		-------- new 사용시
 * 
 * 인스번스 변수의 초기화 순서
 * 기본값 - 명시적초기화 - 초기화블럭 - 생성자
 * 
 * 
 * 지역변수에 관한 설명
 * a, d, e
 * 1) 지역변수는 초기화가 필요하다
 * 2) 지역변수가 선언된 메서드가 종료되면 지역변수도 소멸된다
 * 3) 메서의 매개변수로 선언된 변수도 지역변수이다
 * 4) 클래스변수나 인스턴스변수보다 메모리 부담이 크다
 *
 * 
 * 접근제어자
 * 
 * public - protected - default - private
 * 
 * 접근제어자 사용처
 * 
 * 
 * 마지막문제
 * c번
 * 
 * 
 * 지역변수는 static 접근지정어 abxtract는 사용이 불가
 */

class A {
	
	int a = 10;
	static int b = 20;
	{
		a = 100;
		System.out.println("a : "+a);
	}
	static {
		b = 200;
		System.out.println("b : "+b);
	}
	A() {
			a = 1000;
			b = 2000;
			System.out.println("a : "+a+", b : "+b);
	}
}






public class 문제풀이_0418 {

	public static void main(String[] args) {
		
		A a = new A();

	}

}

import java.util.Scanner;

class Sawon {
	
	// ** 인스턴스 변수 (클래스가 메모리에 저장이 되는 것)
	int sabun;		// 구분자
	String name;
	String dept;	// 부서
	String job;		// 직위
	String loc;		// 근무지
	long pay;		// 연봉
	// --------------------------------------
	static String company;		// 메모리 공간이 한 개만 설정, new 없어도 사용이 가능
	// -------------------------------------
}

public class 사용자정의_데이터형_5 {

	public static void main(String[] args) {
		
		Sawon.company = "kkk";		// new 안 쓰고 바로 쓸 수 있음 static
		/*
		 * 클래스변수명.변수명 >> hong.company
		 * 클래스명.변수명 >> Sawon.company
		 * 공유변수, 클래스변수 (클래스명으로 접근이 가능)
		 * 인스턴스 변수 >> 인스턴스명.변수
		 */
		
		Sawon hong = new Sawon();		//	5개를 저장하는 공간을 생성
		hong.sabun = 1;
		hong.name = "홍길동";
		hong.dept = "개발부";
		hong.job = "대리급";
		hong.loc = "서울";
		hong.pay = 4500;
		hong.company = "ABC";
		
		Sawon shim = new Sawon();		//	5개를 저장하는 공간을 생성
		shim.sabun = 2;
		shim.name = "심청이";
		shim.dept = "개발부";
		shim.job = "사원급";
		shim.loc = "서울";
		shim.pay = 3300;
		shim.company = "ABC";
		
		Sawon park = new Sawon();		//	5개를 저장하는 공간을 생성
		park.sabun = 3;
		park.name = "박문수";
		park.dept = "개발부";
		park.job = "과장급";
		park.loc = "서울";
		park.pay = 6200;
		park.company = "ABC";
		 
		hong.company = "BCD";			// static company라 전체가 다 바뀜	>>	저장 공간이 하나이기 때문에
		shim.company = "CDE";
		park.company = "DEF";			// static은 공간이 하나라 마지막 초기화한 값이 전체 값이 된다 
		
		System.out.println("회사명 hong : "+hong.company);
		System.out.println("회사명 shim : "+shim.company);
		System.out.println("회사명 park : "+park.company);

		hong.loc = "부산";
		
		System.out.println("근무지 hong : "+hong.loc);
		System.out.println("근무지 shim : "+shim.loc);
		System.out.println("근무지 park : "+park.loc);
		
		// ABC 회사가 망했다 > 회사명 변경 > BCD
		
		
	}

}

/*
 * 
 * 같은 문자열인지 확인
 * => 기본형 (==, !=)
 * => 문자열 비교 : equals(), !equals()
 * => login : id와 pw 비교
 * 
 */


import java.util.Scanner;
public class 문자열_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final String ID = "hong";
		final String PW = "H1234";
		
		System.out.println("ID 입력 : ");
		String id = scan.next();
		System.out.println("PW 입력 : ");
		String pw = scan.next();
		
		// String => 문자열이 아니고 메모리 주소를 저장하는 것
		// equals => 메모리에 저장된 실제 문자열 비교	ex) 로그인, 아이디/비밀번호 찾기, 아이디 중복체크
		// equalsIgnoreCase => 대소문자를 구분하지 않는 기능	ex) 검색
		
		// 로그인
		if(id.equalsIgnoreCase(ID) && pw.equals(PW)) {						// 문자열은 ==으로 비교 불가능, equals 이용
			System.out.println(id+"님 로그인되었습니다");
		} else {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다");
		}
		

	}

}

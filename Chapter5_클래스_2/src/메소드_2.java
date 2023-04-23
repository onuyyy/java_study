/*
 * 
 * id/pw 받아서 로그인 처리
 * 
 * 
 * 
 */

import java.util.Scanner;

/* 
 * 리턴형은 경우의 수
 * 	두 개의 경우의 수가 있을 때 => boolean
 * 	세 개의 경우의 수가 있을 때 => int, string
 * 								id가 없는 경우	 (1), noID
 * 								id는 존재 pw가 틀릴 경우 - id는 존재	(2), noPw
 * 								id, pw	(3)	login
 * 								>> 유지보수가 어려우니 string으로 한다 : 다른 사람이 봤을 때 숫자가 뭘 의미하는지 모름
 * 								---------------------------------------------------------------------
 * 								1) 재사용
 * 								2) 견고
 * 								3) 가독성
 * 
 * 
 * 
 */


public class 메소드_2 {

	
	
	static String isLogin(String id, String pw) {
		String[] ids = {"hong", "park", "shim", "lee","kang"};
		String[] pws = {"1234", "3456", "4567", "5678","6789"};
		String[] names = {"홍길동","박문수","심청이","이순신","강감찬"};
		
		int index = 0;
		boolean bCheck = false;
		for(int i = 0; i < ids.length; i++) {
			if(id.equals(ids[i])) {
				bCheck = true;	// id가 존재한다
				index = i;
				break;
			}
		}
		
		
		String result = "";
		
		if(bCheck==true) {
			// id가 있는 상태
			// pw 검색
			if(pw.equals(pws[index])) {
				result=names[index];	// id가 존재한다
			}
			else {
				result="NOPW";
			}
		} else {
			// id가 없는 상태
			result="NOID";
		}
		return result;	
	}
	
	
	static void process() {
		Scanner scan= new Scanner(System.in);
		System.out.println("ID 입력 : ");
		String id = scan.next();
		
		System.out.println("PW 입력 : ");
		String pw = scan.next();
		
		// 검증 (로그인 처리)
		
		String result = isLogin(id, pw);
		
		if(result.equals("NOID"))  {		// id가 없는상태
			System.out.println("ID가 존재하지 않습니다");
		} else if (result.equals("NOPW")) {		//	비밀번호 오류
			System.out.println("비밀번호가 틀립니다");
		} else {		//	로그인 된 상태
			System.out.println(result+"님 로그인되었습니다");
		}
	}
	
	

	
	public static void main(String[] args) {
		
		process();

	}

}

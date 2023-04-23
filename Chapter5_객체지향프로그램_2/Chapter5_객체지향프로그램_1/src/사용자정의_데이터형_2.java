/*
 *  **클래스 조건
 * 데이터와 기능이 있어야 한다
 * ----	  ---
 * 명사형	  동사형
 * 
 * 
 * 번호 작성자 내용 제목 작성일 비밀번호 조회수	>> 변수 (명사형)
 * 글쓰기 내용보기 수정하기					>> 메소드 (동사형)
 * 
 * 
 * 학생 => 유형
 * 게시판 => 무형
 * -------------- 모든 것을 단순화 => 객체지향 프로그램
 * 시계 초침, 분침, 시침
 * 
 * 
 * 클래스
 * 	= 변수 여러 개 저장하는 공간 > 사용자정의 데이터형 (데이터형 클래스)
 * 		~VO(Spring), ~DTO(MyBatis), ~Bean(JSP)
 * 		(value object) (data transfor object) 
 * 	= 기능만 설정하는 클래스 : ~DAO, ~Service, ~Manager
 * 		오라클로 데이터베이스 연결할때 (DAO)
 * 		브라우저 전송 (Service)
 * 		Jsoup (Manager) 
 * 	= 변수와 메소드를 혼합한 것 : 극히 드물다, 
 * 
 * 
 * 
 * 
 * 
 */


// 커뮤니티 CURD
/*
 * int[] no
 * String[] name
 * 
 * 
 * 
 */


class Board {
	
	int no;
	String name;
	String subject;
	String content;
	String pwd;			// 본인여부 확인
	String regdate;		
	int hit;			// >> 데이터형이 달라서 배열로는 묶을 수 없음
	
}
public class 사용자정의_데이터형_2 {

	public static void main(String[] args) {
		
		//첫번째 게시물
		Board b1 = new Board();
		System.out.println("b1 = : "+b1);	// 7개를 저장할 수 있는 메모리 생성
		
		
		b1.no = 1;
		b1.name = "홍길동";
		b1.subject = "메모리 공간 만들기(사용자 정의)";
		b1.content = "class를 이용해서 데이터를 모아서 관리";
		b1.regdate = "2023-04-12";
		b1.pwd = "1234";
		b1.hit = 0;		// 0값이면 안 써도 된다, new를 이용하여 만들면 자동으로 초기화가 되기 때문에
		
		System.out.println("게시물 번호 : "+b1.no);
		System.out.println("작성자 : "+b1.name);
		System.out.println("제목 : "+b1.subject);
		System.out.println("내용 : "+b1.content);
		System.out.println("작성일 : "+b1.regdate);
		System.out.println("조회수 : "+b1.hit);

		
		
		
		
		
		
	}

}

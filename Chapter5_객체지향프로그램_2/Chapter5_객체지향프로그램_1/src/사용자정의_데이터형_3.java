/*
 * 
 * 1. 같은 자바 파일에 클래스 여러 개 만들 수 있다
 * 	  ------------------
 * 		public은 1개의 class에서만 사용이 가능	 >> 프로젝트 내 한 번만 사용 가능
 * 2. 권장사항 => 파일을 따로 만든다
 * 
 * 
 * 
 * ** 멤버면수 (인스턴스변수)
 * 1. 기본형
 * 2. 배열
 * 3. 클래스
 * 
 * 
 * 
 * 
 */
class Category {
	
	int no;
	String poster;
	String title;
	String subject;
	
}


class FoodHouse {
	
	int no;		// 구분자는 항상 중복이 안 되는 숫자로 만든다 : primary key > 상세보기
	int cno;	// 카테고리 번호, 참조키 : foreign key
	String[] poster = new String[5];
	String name;
	double score;
	String address1, address2;
	String tel;
	String type;
	String price;
	String parking;
	String stime, etime;
    String hol;
    String menu;
	
}






public class 사용자정의_데이터형_3 {

	public static void main(String[] args) {
		
		

	}

}

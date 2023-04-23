package com.sist.music;
/*
 * 재사용 하는 법
 * 	= 상속 : is-a
 * 		> 기존의 클래스를 확장해서 사용하는 것
 * 					  --- extends
 * 		> 자바는 단일 상속만 가능하다
 * 		class A 
 * 		class B extends A ( A 클래스를 확장하여 B에서 사용하겠다 )
 * 		class C extends JFrame ( 윈도우에 있는 것을 확장하여 사용하겠다 ) => 라이브러리
 * 		---------------------------------------------------------------------
 * 		class A
 * 		class B
 * 		class C extends A, B > 이건 오류! 단일 상속만 가능
 * 		C = A + B + 알파
 * 
 * 		class A
 * 		class B extends A
 * 		class C extends B	> 이건 가능, 상속은 단일로 따로따로
 * 		---------------------------------------------------------------------
 * 		class A (int a,b,c,d) 16byte		// 데이터가 많다고 해서 크지 않음
 * 		class B (int a,b) 8byte
 * 		-------- A와 B는 다른 클래스 => 크기를 가지지 않는다
 * 		class A (int a,b)
 * 		class B(int c) extends A
 * 					   ---------- int a,b,c
 * 		크기는 늘 상속을 내린 쪽이 더 크다
 * 
 * 			동물
 * 			 ㅣ
 * 		-----------
 * 		ㅣ    ㅣ    ㅣ 
 * 	  포유류	양서류  조류
 *      ㅣ
 *    -----
 *    ㅣ   ㅣ
 *   남자  여자
 *   
 *   		남자 m = (남자)인간;		>> 인간 중 남자만 데려와라 >> 형번환을 통하여 가져 옴, 형변환 하지 않으면 여자까지 따라 옴
 *   									** 모든 클래스는 Object를 상속 받고 있다 (최상의 클래스 Object)
 *   									** 상속의 예외 조건
 *   										- 생성자, static, private, 초기화 블록 상속 불가
 *  
 * 	= 포함 : has-a
 * 
 */
public class Music {
	
	private int rank;
	private String state;
	private String title;
	private String singer;
	private String album;
	private int idcrement;		// // 숫자에 콤마가 있으면 문자형이다 String
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getIdcrement() {
		return idcrement;
	}
	public void setIdcrement(int idcrement) {
		this.idcrement = idcrement;
	}
	
	
	
	// 데이터형이 틀리기 때문에 배열을 못 잡아서 사용자정의데이터형 클래스로 잡음
	// 한 번에 저장했다가 한 번에 사용함
	
}

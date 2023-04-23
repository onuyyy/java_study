package com.sist.main3;

import org.w3c.dom.Document;
import org.jsoup.*;
import org.jsoup.select.Elements;

public class GenieMusicSystem {

	protected static Music[] musics = new Music[50];	//	이 데이터를 한 개만 갖고 사용하기 때문에 static을 잡아야 함 공유변수
	
	/* 1. 초기화
	 * 	1) 인스턴스 블록
	 * 	2) static 블록
	 * --------------- 자동 호출
	 * 	3) 생성자		>> 생성자는 직접 호출해야 한다
	 * 
	 * 
	 * ** 예외처리
	 * 		1) 에러 : 소스상에서 처리할 수 없는 심각한 에러
	 * 				=> 메모리 공간 부족
	 * 		2) 예외 : 수정이 가능한 에러
	 * 				=> 예외 복구 / 예외 회피
	 * 				=> 비정상 종료를 방지하고 정상 수행이 가능하게
	 * 				=> io, net, thread, web
	 * 					- io : 파일 경로명, 파일명	=>	사용자 입력 오류, 프로그래머의 실수
	 * 						 --------
	 * 						 IP / URL
	 * 					- thread : 충돌
	 * 					- web : 404, 500, 403, 412, 400, ...
	 * 
	 */

	static {
		

		Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
//		System.out.println(doc.toString());
		
		/*
		 * Html => tag 형식	==> Markup language
		 * Element => tag
		 * Elements => 같은 태그 여러 개를 모아준 것
		 */
		
		// 노래명	<table class = "list-wrap">
		// 구분자 => 모든 태그의 구분자는 class(증복 있음)or id(중복 없음)
		// class => .	id => #
		Elements title = doc.select("table.list-wrap td.info a.title");
		
		// 가수명
		Elements singer = doc.select("table.list-wrap td.info a.artist");

		// 앨범명
		Elements album = doc.select("table.list-wrap td.info a.albumtitle");	
		System.out.println(album);
		
		// 상태
		Elements etc = doc.select("table.list-wrap td.info a.number span");
		System.out.println(etc);
		
		
		for(int i = 0; i < title.size(); i++) {
			
//			System.out.println("순위 : "+(i+1));
//			System.out.println("노래명 : "+title.get(i).text());
//			System.out.println("가수명 : "+singer.get(i).text());
//			System.out.println("앨범명 : "+album.get(i).text());
			String s = etc.get(i).text(i);
			String state = "";
			String value = "";
			if(s.equals("유지")) {
				state = "유지";
			    value = "0";
			} else {
				state = s.replaceAll("[0-9]", "");		// 숫자 전체를 공백으로 바꿔라
				value = s.replaceAll("[^가-힣]", "");		// 한글 전체를 공백으로 바꿔라
			}
			
			/*
			 *split
			 *replaceAll
			 *----------- 정규식 (한글형태, 숫자형태 => 패턴)
			 *[0-9] : 숫자 전체
			 *[가-힣] : 한글 전체
			 *[A-Za-z] : 알파벳 전체 
			 */
			
//			System.out.println("상채 : "+state);
//			System.out.println("등폭 : "+value);
//			System.out.println("========================================");
			
			musics[i] = new Music();
			musics[i].setRank(i+1);
			musics[i].setTitle(title.get(i).text());
			musics[i].setSinger(singer.get(i).text());
			musics[i].setAlbum(album.get(i).text());
			musics[i].setState(state);
			musics[i].setIdcrment(value);
			

		}
		
		
		
		// 등폭
		
		try {
			
		} catch(Exception ex) {}
	}
	

	// 2. 어떤 기능을 만들 거야? ==> 메소드
		public Music[] musicALLdata() {
			return musics;
		}

	
	// 2-1. 목록 출력 : 결과 값 전송? = 리턴형  or  자체 출력? = void
	
	public Music[] musicTitleFind(String fd, int type) {
		
		int i = 0; 
		
		for(Music m:musics) {
			boolean bCheck = false;
			if(type==1) {
				bCheck = m.getTitle().contains(fd);
				i++;
			} else {
				bCheck = m.getSinger().contains(fd);
				i++;
			}
		}
		
		Music[] mm = new Music[i];
		/*
		 * A a = new A();
		 * A b = a;
		 */
		
		for(Music m:musics) {
			boolean bCheck = false;
			if(type==1) {
				bCheck = m.getTitle().contains(fd);
				
			} else {
				bCheck = m.getSinger().contains(fd);
				
			}
			
			if(bCheck==true) {
				mm[i] = m;			// new를 안 준 이유는 for-each문으로 주소를 이미 할당했기 때문에
				i++;
			}
		}
		
		return mm;
	}
	public Music[] musicSingerFind(String fd) {
		
	}
	
	
	
	// 2-2. 검색
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		GenieMusicSystem g = new GenieMusicSystem();
//		Music[] aa = g.misucFind("사",1);
//		for(Music a:aa) {
//			System.out.println(a.getTitle());
		}
	}
	
	
	
	



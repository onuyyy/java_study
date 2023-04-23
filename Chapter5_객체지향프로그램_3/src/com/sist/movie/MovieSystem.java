package com.sist.movie;
import java.util.Scanner;

import javax.swing.text.Document;

import org.json.simple.JSONArray;


/*
 * searchMainDailyBoxOffice.do : 일별 박스오피스
 * searchMainRealTicket.do : 실시간 예매율
 * searchMainDailySeatTicket.do : 좌석 점유율
 * 
 * https://www.kobis.or.kr/kobis/business/main/ : 메일 사이트 주소
 * 
 */
public class MovieSystem {

	Movie[] movie = new Movie[10];
	int menu() {	// 매개변수없이 리턴형인 메소드
		Scanner scan = new Scanner(System.in);
		System.out.println("===================== 메뉴");
		System.out.println("1. 일별 박스오피스");
		System.out.println("2. 실시간 예매율");
		System.out.println("3. 좌석 점유율");
		System.out.println("==========================");
		System.out.println("메뉴 선택 : ");
		
		return scan.nextInt();
		
	}
	
	// 목록 츌력
	Movie[] movieListData(int no) {
		
		String[] strUrl = {
				"",
				"searchMainDailyBoxOffice.do",
				"searchMainRealTicket.do",
				"searchMainDailySeatTicket.do"};
	
		
		String url = "https://www.kobis.or.kr/kobis/business/main/"+strUrl[no];
		
		try {
			
			Document doc =  Jsoup.connect(url).get();
//			System.out.println(doc.toString());
			String msg = doc.toString();
			msg = msg.substring(msg.indexOf("["),msg.lastIndexOf("]")+1);
			System.out.println(msg);
			
			JSONParser jp = new JSONParser();
			JSONArray arr = (JSONArray)jp,parse(msg;)
			for(int i = 0; i < arr.size(); i++)		 {
				JSONObject obj = (JSONObject)arr.get(i);
			}
					
			
		}catch(Exception ex) {}
		
		return movie;
	}

	public static void main(String[] args) {
		MovieSystem ms = new MovieSystem();
		ms.movieListData(1);
	}
	
	
}

	


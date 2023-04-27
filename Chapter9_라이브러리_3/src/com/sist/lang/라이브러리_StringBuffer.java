package com.sist.lang;
/*
 * StringBuffer
 * 
 * 1. String은 고정형 => 변경이 되면 새로운 메모리를 생성한다
 * 					   원본은 그대로 유지
 * 			ex) 
 * 				String s  = "Hello Java";
 * 				String ss = s.substring(0,5) => Hello
 * 					==> 새로운메모리에 저장된다
 * 					==> 변경시에 리턴형이 String
 * 					==> 변경해서 저장
 * 						s = s.substring(0,5) => 기존 s가 사라지고 새로운 걸 덮어씌움
 * 2. String을 보완 => 가변형 : StringBuffer (비동기) / StringBuilder (동기)
 * 		** 프로그램에서 동기 (한 개의 일 수행) / 비동기 (동시에 여러 개의 일 수행)
 * 
 * 		네트워크 : 클라이언트(요정) / 서버(응답)
 * 				==> 오라클 (자바(요청 => sql)/오라클 서버)
 * 				==> 웹 (클라이언트 / 서버) : JSP, Spring
 * 3. 데이터가 많은 경우 => 문자열 결합할 때 (append) 
 * 4. 문자열 처리할 때 사용하는 클래스
 * 5. 처리 속도가 빠르다 (최적화)
 * 6. 주요메소드
 * 		length() : 문자 개수 확인
 * 		toString() : 객체를 문자열로 변환
 * 						- (String), Srting.valueOf()
 * 		delete() : 삭제
 * 			** append : 문자열 결합
 * 
 * 
 */

import java.io.*;
import java.net.*;
// 클래스가 CheckedException이다

public class 라이브러리_StringBuffer {

	public static void main(String[] args) {
		
		try {
			
			StringBuffer sb = new StringBuffer();
			// Buffer : 임시 기억 장소
			
			URL url = new URL("https://www.10000recipe.com");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			// 서버에 연결
			
			if(conn!=null) {		// 연결되었다면
				
				while(true) {
					BufferedReader br =  new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
					String msg = br.readLine();
					if(msg==null)
						break;
					sb.append(msg+"\n");
					
					
				}
				
				conn.disconnect();		// 서버 연결 해제
				
			}
			
			
		} catch (Exception e){
			e.printStackTrace();
			}
		
		
	}

}

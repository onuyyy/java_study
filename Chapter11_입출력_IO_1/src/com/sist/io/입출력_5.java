package com.sist.io;
/*
 * 
 * URLConnection => url.openConnection()
 * 	ㅣ
 * -----------------------------------
 * ㅣ								 ㅣ
 * HttpURLConnection		HttpsURLConnection
 * 
 * class A
 * class B extends A
 * 
 * B b = new A(); => 오류
 * B b = (B) new A(); => 형변환 해야 함
 * 
 * 
 */

import java.io.*;
import java.net.*;
public class 입출력_5 {

	public static void main(String[] args) throws Exception {
		
		URL url = new URL("https://www.10000recipe.com/recipe/list.html");	//  url 주소를 주면 연결한다
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		
		// 연결이 되었다면
		if(conn!=null) {
			
			// 브라우저는 1byte씩 전송한다
			// 1byte => 2byte로 변환
			// inputStringReader
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));	>> 한글이 깨진다면 UTF-8 추가해야 함
			
			while(true) {
				
				String data = in.readLine();
				if(data==null) break;
				System.out.println(data);
				
			}
			
			in.close();
			conn.disconnect();
			
		}
		
	}

}

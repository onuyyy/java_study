package com.sist.text;
/*
 * java.text => 출력 형태를 만들어서 사용 (변경)
 * 		SimpleDateFormat : 날짜 변경
 * 		DecimalFormat : 숫자 변환
 * 		MessageFormat : 데이터베이스 => INSERT, UPDATE
 * 
 * 		String name = "", sex = "", addr = "", tel = "";
 * 		int age = 10;
 * 
 * 		String sql = "INSER INTO member VALUES("+"'"name+"','"+sex+"','"+addr+"','"tel"'+"+age+")"
 * 
 * 		String sql = "INSERT INTO member VALUES('{1}','{2}','{3}','{4}',{5});
 * 
 * 		
 * 
 * 
 * 
 */


import java.util.Date;		// Date가 두 개이기 때문에 쓸 클래스 뒤에 Date라고 지정해줘야 함
import java.text.*;
import java.sql.*;

public class 라이브러리_SimpleDateFormat {

	public static void main(String[] args) {
		
		Date date = new Date();		// 오류 나는 코드 => 임포트한 클래스에서 Date가 두 개라서
//		java.util.Date date = new java.util.Date();		>> 이것도 된다	

		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(date));		// 위 형식으로 바꿔줘라 sdf.format()
		
		/*
		 * yyyy 년도
		 * MM 월
		 * dd 일
		 * hh 시간
		 * mm 분
		 * ss 초
		 */
		
	}

}

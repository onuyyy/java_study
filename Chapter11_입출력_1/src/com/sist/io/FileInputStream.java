package com.sist.io;
/*
 * FileInputStream : 단위 byte (1byte씩 읽어온다)
 * 	=> 한글 포함된 데이터는 읽을 수 있는데 한글이 깨진다
 * 	   -------------- FileReader
 * 		.zip , .ppt , .png , ....
 * 
 * 	=> 주요 메소드
 * 		read() => 1byte => 리턴형 => int
 * 		close() 닫기
 * 	=> 생성자
 * 		new FileInputStream(File file)
 * 		new FileInputStream(String path)
 * 
 */

import java.util.*;
import java.io.*;
public class FileInputStream {



	public static void main(String[] args) {
		
		try {
			
			// 파일 읽기
			// System.in / System.out
			// 표준 입출력
			// 파일 읽기
		FileInputStream fis = new FileInputStream("C:\\javaDev\\javaStudy\\Chapter11_입출력_1\\src\\com\\sist\\io\\FileInputStream.java");
		int i = 0; // 1개의 문자를 읽어 온다 => 문자 번호로 넘어온다
		// 문자번호를 받는 변수
		// -1은 더이상 읽을 데이터가 없을 때까지 => EOF End Of File
		while((i=fis.read())!=-1) {
			System.out.print((char)i);	//	'A' = 65
		}
		} catch(Exception e) {
		}
	

	}


	}



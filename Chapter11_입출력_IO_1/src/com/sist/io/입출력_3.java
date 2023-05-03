package com.sist.io;
/*
 * 
 * 파일 쓰기
 * FileWriter
 * 
 */

import java.util.*;
import java.io.*;
public class 입출력_3 {

	public static void main(String[] args) {
		
		FileWriter out = null;
			// 더 빠른 속도는 BufferedWriter
		FileReader in = null;
			// 더 빠른 속도 BufferedReader
		
		
		try {
			
			// 1. 파일 만들기
			File file = new File("c:\\java_datas\\movie.txt");
			if(!file.exists()) {		// 파일이 없다면
				
				// 파일을 생성해라
				file.createNewFile();
				
				// 파일 잃기
				in = new FileReader("c:\\javaDev\\movie.txt");
				out = new FileWriter(file);
				
				// 생성된 파일 쓰기
				int i = 0;
				while((i=in.read())!=-1) {
					
					out.write(i);
					
				}
				
				System.out.println("파일 읽기/쓰기 완료");
				
			}
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				
				in.close();
				out.close();
					
			} catch(Exception e) {
				
			}
			
		}

	}

}

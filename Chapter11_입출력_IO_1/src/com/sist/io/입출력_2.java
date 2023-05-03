package com.sist.io;
import java.util.*;
import java.io.*;

/*
 * 
 * 파일 읽기
 * FileReader (2byte) / FileInputStream (1byte)
 * ==> 한글이 있으면 FileReader
 * 
 * 
 * BufferedReader 한줄씩 읽을 수 있음 > 더 빠름
 * 
 * 
 */



public class 입출력_2 {

	public static void main(String[] args) {
		
		FileReader reader = null;
		
		try {
			
			reader = new FileReader("c:\\javaDev\\movie.txt");
			BufferedReader in = new BufferedReader(reader);
			int i = 0;	// 한 글자씩 읽기 => int read() : 글자의 ASC 코드값을 읽어온다 (쩡수)
						// A = read() => 65		=> char로 변환해야만 문자열로 출력 가능
						// int read(byte[],int,int) => 읽은 바이트수를 가져온다
			long start = System.currentTimeMillis();	// 시간을 재고 얼마나 걸렸는지 확인
			
			while(true) {
				
				String data = in.readLine();
				if(data==null) break;
				System.out.println(data);
				
			}
			
			long end = System.currentTimeMillis();
			System.out.println("읽은 시간 : "+(end-start));
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		} finally {	 // close가 포함되어 있어야 한다
			
			try {
				
				reader.close();
				
			} catch(Exception e) {
				
			}
			
		}

	}

}

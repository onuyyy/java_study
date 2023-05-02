package com.sist.io;
import java.util.*;
import java.io.*;
/*
 * 
 */
public class FileOutputStream_1 {

	public static void main(String[] args) {
		
		try {
			
			// 파일 지정 = 파일 연결 파일아웃풋스트림
			File file = new File("c:\\java_datas\\school.txt");
			
			// 파일 존재 여부 먼저 확인해야 함
			if(!file.exists()) {
				file.createNewFile();
			}
			
			FileOutputStream fos = new FileOutputStream(file);
			// 파일이 존재할 때 사용
//			FileOutputStream fos = new FileOutputStream(file,true);		append라 텍스트 밑에 저장할 때마다 같은 내용이 더 붙음
			String msg = "안녕하세요 지금은 파일 입출력을 배우는 중입니다\r\n";
			System.out.println((int)'안');
			
			// 50504
			fos.write(msg.getBytes());
			//getBytes : String을 byte[]로 변경
			
			fos.close();
			System.out.println("저장 완료");
			
			
		} catch(Exception e) {}

	}

}

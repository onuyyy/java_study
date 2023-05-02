package com.sist.io;
import java.io.*;

public class FileMain {

	public static void main(String[] args) {
		
//		try {
//		// 파일 설정
//		File file = new File("c:\\javaDev\\school.txt");
//		// 파일 존재여부 확인
//		
//		if(!file.exists()) {
//			file.createNewFile();
//		} System.out.println("파일 만들기 성공");
//		} catch(Exception e) {
//			
//		}
		
		
		
//		File dir = new File("C:\\java_datas");
//		if(!dir.exists()) {
//			dir.mkdir();
//			System.out.println("폴더 만들기 완료");
//		}
//		
		
		
		try {
		File dir = new File("c:\\javaDev");
		File[] files = dir.listFiles();
		
		for(File f :files) {
			if(f.isFile() ) {
				System.out.println(f.getName()+" "+f.length());
			} else if(f.isDirectory()) {
				System.out.println(f.getName()+" DIR");
			}
		}
		
		} catch (Exception e) {
			
		}
		
		
	}

}

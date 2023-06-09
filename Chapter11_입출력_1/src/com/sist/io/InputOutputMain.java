package com.sist.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

/*
 * 
 * IO : Input Output
 * 		 읽기    쓰기
 * 
 * 	1) 자바에서 IO는 Stream을 사용하고 있다
 * 				  ------- 데이터 이동하는 통로(FIFO => Queue)
 * 		=> IO 사용하는 곳
 * 			메모리 입출력
 * 			파일 입출력
 * 			네트워크 입출력
 * 		=> 특징
 * 			단방향 통신 => 빨대
 * 2) 읽기/ 쓰기 (1byte, 2byte)
 * 		=> 1byte : ~InputStream, ~OutputStream
 * 					한글자당 1byte 읽기/쓰기 => 한글은 깨진다
 * 					업로드, 다운로드
 * 		=> 2byte : ~Reader, ~Writer (한글)
 * 					=> 한글제어
 * 
 * 			메모리 (데이터저장) ===== 자바응용프로그램 ===== 모니터 출력
 * 							  ㅣ					ㅣ 
 * 						 InputStream	   OutputStream
 * 
 * Stream :데이터가 이동하는 통로 (단방향)
 * 			읽기 통로 : 데이터가 저장된 위치로부터 프로그램에서 데이터를 읽어 들이기 위하 연결
 * 					InputStream (바이트 스트립 : 1byte씩 이동) / Reader (문자 스트림 : 2byte)	
 * 					메모리에 있는 데이터
 * 					파일에 있는 데이터
 * 					소켓에 있는 데이터 (네트워크)
 * 			쓰기 통로 : 출력 위치로 프로그램에 전송하는 통로
 * 					OutputStream (바이트 스트림 : 1byte) / Writer (문자 스트림: 2byte)
 * 
 * IO 관련 클래스
 * 						Object
 * 						  ㅣ
 * 				바이트스트림(1byte)									문자스트림(2byte)
 * 				--------------------------------------------------------------
 * 				ㅣ															 ㅣ 파일입출력
 * 		-------------------------------							    ---------------------
 * 		ㅣ							  ㅣ							    ㅣ					ㅣ
 * 	InputStream					 OutputStream					  Reader			  Writer
 * 		ㅣ				 			  ㅣ								ㅣ					ㅣ
 * 	FileInputStream 			FileOutputStream	   			 FileReader			FileWriter
 * 	FilterInpitStream 		   FilterOutputStream					ㅣ					ㅣ
 * 		ㅣ							  ㅣ						  BufferedReader	  BufferedWriter
 * BufferedInpurStream		 BufferedOutputStream
 * --------------------------------------------------
 * ObjectInputStream      /     ObjectOuptStream
 * 
 * *** 모드 (mode) => r, w, a
 * 					read, write, append
 * 				   Reader Writer
 * 				  => new FileWriter("파일명",true) => append	: 한 파일에 계쏙 덮여쓰며 쓰ㄴ는것
 * 				  => new FileWriter("파일명") => create : 지우고 쓰는 것
 * 
 * 
 * 
 * File : 독립 클래스
 * 		==> 1) 파일
 * 			2) 디렉토리 (폴더)
 * 
 * 			File 사용 방법
 * 				- File file - new File("c:\\javaDev\\back.png")
 * 					파일 정보 읽기
 * 				- File file - new File("c:\\javaDev")
 * 					디렉토리 정보 읽기
 * 			File의 주요 기능 (메소드)
 * 				- 파일정보 
 * 					getNmae() : 파일명 **
 * 					getPath() : 경로명, 파일명 읽을 때 **
 * 					getParent() : 경로명
 * 				- 파일 특성
 * 					canRead() : 읽기 전용
 * 					canWrite() : 쓰기 전용
 * 					isHidden() : 숨긴 파일
 * 				- 파일 여부 확인
 * 					boolean isFile() **
 * 					boolean isDirectory()
 * 				- 파일 조작
 * 					createNewFile() : 파일 만들기 **
 * 					mkdir() : 디렉토리 만들기 **
 * 				- 파일 삭제
 * 					delete => 오로지 파일만 삭제할 수 있다 **
 * 						   => 파일이 있는 파일은 디렉토리 삭제가 안된다
 * 				- 파일이나 디렉토리에 존재 여부
 * 					boolean exists()
 * 				- 수정날짜
 * 					long lastModified()
 * 				- 파일 크기
 * 					long length() **
 * 				- 디렉토리에 있는 목록 읽기
 * 					listFiles() **
 * 		read(), write(), close()
 * 
 * 		FileInpitStream
 * 			int read() write(byte)
 * 		FileReader
 * 			char read() write(String)
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.io.*;
//CheckedException => 반드시 예외처리 필요
public class InputOutputMain {

	public static void main(String[] args) {
		
		// 파일 선언
		File file = new File("c:\\javaDev\\back.jpg");
		long size = file.length();
		String res = "";
		if(size/1024==0) {
			res = size+"Bytes";
		} else {
			size = size/1024;
			res = size+"KB";
		}
		
		System.out.println("파일 크기 : "+res);
		System.out.println("읽기 전용 : "+file.canRead());
		System.out.println("쓰기 전용 : "+file.canWrite());
		System.out.println("숨긴 파일 : "+file.isHidden());
		System.out.println("수정 날짜 : "+new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초").format(new Date(file.lastModified())));
		
		System.out.println("경로명 : "+file.getParent());
		System.out.println("파일명 : "+file.getName());
		System.out.println("경로명+파일명 : "+file.getPath());

	}

}

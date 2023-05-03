package com.sist.io;
/*
 * 
 * IO = InputStream / OutputStream
 * 			입력			   출력
 * 		=> 입출력시 사용하는 라이브러리
 * 			1) 메모리 입출력 : 표준 입출력
 * 							- System.in / System.out
 * 			2) 파일 입출력 : 웹 (업로드, 다운로드)
 * 							- XML, JSON, Properties
 * 							- 외부에서 데이터 읽기 임시 저장용 (txt)
 * 							- CSV => 오라클 데이터 백엄
 * 							- MySQL => 오라클 => CSV
 * 			3) 네트워크 입출력 : 웹서버 이미 구현 (톰캣)\
 * 				=> 저장 읽기 수정 삭제 : CURD
 * 					자바 => 입출력을 하기 위한 장치 : Stream (데이터 이동 총로)
 * 					데이터 이동 방법
 * 						1bye씩 이동 : ~InputStream, ~ OuPutStream	==> 바이트 스트림 (byte형식) -> 메소드(read(),write())
 * 									- checkedException (예외처리 필수)
 * 						2byte 이동 : ~Reader, ~Writer		==> 문자 스트림 (char형식) -> 메소드(read(),write())
 * 					IO 라이브러리 사용시 반드시 닫기 : close()
 * 					지원하는 라이브러리
 * 						FileInputStream FileOutputStream
 * 						FileReader 		FileWriter
 * 					---------------------------------------
 * 						ObjectInputStream ObjectOutputSteadm : 객체 단위로 저장하기 때문에 속도가 느리다
 * 																==> 속도를 빠르게 보완 Buffer
 * 
 * 					Buffer => 한 번에 데이터를 모아서 전송, 속도가 빠르다
 * 							- BufferedReaader
 * 							- Bufferedwrtier
 * 				
 * 
 * 
 * 
 * 
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.util.*;
import java.io.*;

public class 입출력_1 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			long start = System.currentTimeMillis();
			fis = new FileInputStream("C:\\유틸\\eclipse-jee-2023-03-R-win32-x86_64\\eclipse");
			fos = new FileOutputStream("c:\\jaca_datas\\eclipse.zip");
			
			int i = 0;
			byte[] buffer = new byte[1024];	// 파일 복사
			while((i=fis.read(buffer,0,1024))!=-1) {
				fos.write(buffer, 0 ,1);
			}
			
			// 파일 복사 ==> 업로드
			long end = System.currentTimeMillis();
			System.out.println("파일 복사  : "+(end-start));
			
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			
		} catch(Exception e) {
			
			// 오류 확인
			e.printStackTrace();
			
			
		} finally {
			fis.close();
			fos.close();

		}

	}

}

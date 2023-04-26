package com.sist.string;
import java.io.*;

public class 라이브러리_String_2 {

	public static void main(String[] args) {
		

		try {
			
			long start = System.currentTimeMillis();
			FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
			int i = 0;	// 문자 읽기
			StringBuffer data = new StringBuffer();				

			while((i=fr.read())!=-1)	{		// -1 문장의 끝이란 뜻 EOF End Of File
				data.append((char)i);
			}
			long end = System.currentTimeMillis();
				fr.close();
				System.out.println(data);
				System.out.println("걸린 시간 : "+(end-start));
				
		} catch (Exception ex) {
			
			ex.printStackTrace();		// 에러 메세지 확인
										// getMessage
			
		}

	}

}

package com.sist.io;
/*
 * 
 * BufferedReader / BufferedWriter
 * 
 */

import java.util.*;
import java.io.*;
public class 입출력_4 {

	public static void main(String[] args) throws Exception {
		
		FileWriter out = new FileWriter("c:\\java_datas\\movie_1.txt");
		FileReader in = new FileReader("c:\\javaDev\\movie.txt"); 
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		while(true) {
			
			String data = br.readLine();	// 한줄씩 읽는다
			if(data==null) break;
			bw.write(data+"\n");
			
		}
		
		System.out.println("읽기/쓰기 완료");
		in.close();
		out.close();
		
	}

}

/*
 * filewriter 자동으로 지정된 파일을 생성
 * 	: 없으면 만들고, 있으면 덮어쓴다
 * ==> true라고 주게되면 덮어쓰지 않고 밑으로 한 번 떠 쓴다
 * 
 * 		FileWriter out = new FileWriter("c:\\java_datas\\movie_1.txt", true);
 * 
 */



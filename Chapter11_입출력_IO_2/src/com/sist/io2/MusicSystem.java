package com.sist.io2;

import java.io.*;
import java.util.*;
public class MusicSystem {
	
	// 데이터 읽기
	private static List<GenieMusicVO> list = new ArrayList<GenieMusicVO>();
	static {
		
		// 초기화 블럭 >> 시작과 동시에 값을 채워넣기 위함
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;		// finally에서 닫기 위하여 여기서 선언
		
		try {
			
			fis = new FileInputStream("c:\\java_datas\\genie_music.txt");
			ois = new ObjectInputStream(fis);
			list = (List<GenieMusicVO>)ois.readObject();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				
			fis.close();
			ois.close();
			
			} catch (Exception e) {}
			
		}
		
	}
	
	public void musicCategoryData(int cno) {
		
		for(GenieMusicVO vo:list) {
			
			if(vo.getCno()==cno) {
				
				System.out.println(vo.getCno()+"."+vo.getTitle());
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		MusicSystem ms = new MusicSystem();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("가요(1), POP(2), OST(3), 트로트(4), 재즈(5), 클래식(6) : ");
			String cno = in.readLine();
			ms.musicCategoryData(Integer.parseInt(cno));
			
		} catch (Exception e) {
			
		}
	}
	

}

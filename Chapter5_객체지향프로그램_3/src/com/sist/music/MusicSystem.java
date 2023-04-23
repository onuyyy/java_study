	
	/*
	 * 인스턴스 : 객체 생성 => 객체명.변수, 배열
	 * static : 객체 생성할 필요 없음 => 클래스명.배열명
	 * 
	 */



package com.sist.music;
import java.util.Scanner;

public class MusicSystem {			// 클래스 영역에선 선언만 할 수 있음
	
	Music[] music = new Music[50];
	Scanner scan = new Scanner(System.in);
	// 1. 메소드를 이용해서 처리한다 >> 생성자
	
	void init() {
		for(int i = 1; i <= MusicData.title.length; i++) {		// musicdata는 다른 클래스에 있기 때문에 musicdata.title.length
			
//			System.out.println("메모리 할당 전 : music["+i+"]="+music[i]);
			
			music[i] = new Music();	// Music 크기의 메모리 공간 50개 만듦
			
			/* int[] arr = new int[10]
			 * for(int i = 0; i < 10; i++) {
			 * arr[i] = (int)(Math.random()*100)+1
			 * 와 같은 코드이다
			 */
			
			music[i].title = MusicData.title[i];
			music[i].singer = MusicData.title[i];
			music[i].album = MusicData.title[i];
			music[i].state = MusicData.title[i];
			music[i].modify = MusicData.title[i];
			
			
//			System.out.println("메모리 할당 후 :music["+i+"]="+music[i]);
		}
		
		
	}
	

	int menu() {
		
		System.out.println("================== Menu ==================");
		System.out.println("1. 목록 보기");
		System.out.println("2. 검색");
		System.out.println("3. 상세보기");
		System.out.println("9. 프로그램 종료");
		System.out.println("==========================================");
		

		System.out.println("메뉴 선택 : ");
		
		return scan.nextInt();
		
	}
	
	
	Music[] musicListData() {
		return music;
	}
	
	Music musicDetailData(int no) {
		return music[no-1];
	}
	
	Music[] musicFindData(String title) {
		
		int count = 0;
		for(Music mm:music ) {
			if(mm.title.contains(title)) {
				count++;
			}
		}
		
		Music[] m = new Music[count];
		
		int i =0;
		for(Music mm:music ) {
			if(mm.title.contains(title)) {
				m[i] = mm;
				i++;
			}
		

			
		}
		
		return m;
	}
	
	
	
	public static void main(String[] args) {
		
		MusicSystem ms = new MusicSystem();
		ms.init();
		Scanner scan = new Scanner(System.in);
		System.out.println("검색어 입력 : ");
		String title = scan.next();
		Music[] data = ms.musicFindData(title);
		
		int i = 0; 
		for(Music m:data) {
			System.out.println(i+"."+m.title);
			i++;
		}

		
		System.out.println("==============================");
		System.out.println("상세보기(1~50) : ");
		int no = scan.nextInt();
		Music mm = ms.musicDetailData(no);
		System.out.println("곡명 : ");
		System.out.println("가수명 : ");
		System.out.println("앨범명 : ");
		System.out.println("상태 : ");
		System.out.println("변동품 : ");
	}

}

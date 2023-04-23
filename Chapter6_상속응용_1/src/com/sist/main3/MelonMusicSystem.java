package com.sist.main3;

import javax.lang.model.util.Elements;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class MelonMusicSystem extends GenieMusicSystem {
	
	{
		
		try {
			
			Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title = doc.select("div.wrap_song_info div.rank01");
			Elements singer = doc.select("div.wrap_song_info div.rank02");
			Elements album = doc.select("div.wrap_song_info div.rank03");
			
			for(int i = 0; i < 50; i++) {
				System.out.println(i+1);
				System.out.println(title.get(i).text());
				System.out.println(singer.get(i).text());
				System.out.println(album.get(i).text());
				System.out.println("====================================");
				
				musics[i] = new Msuic();
				musics[i].setRank(i+1);
				musics[i].setSinger(singer.get(i).text());
				musics[i].setAlbum(album.get(i).text());

				
				
			}
			
		} catch (Exception ex) {}
		
		public atatic void main(String[] args) {
			MelonMusicSystem
		}
	}
	
}

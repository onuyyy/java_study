package com.sist.main3;

public class Music {

	private int rank;
	private String title;
	private String singer;
	private String album;
	private String state;
	private String idcrment;
	private String like;
	
	// 읽기 쓰기 => getter setter : 다른 클래스와 연결시켜 주기 위함 9데이터 저장, 데이터 읽기) => 데이터형
	
	public String getIdcrment() {
		return idcrment;
	}
	public void setIdcrment(String idcrment) {
		this.idcrment = idcrment;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}
	
	
}

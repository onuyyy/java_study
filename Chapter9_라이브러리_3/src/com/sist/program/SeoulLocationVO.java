package com.sist.program;
/*
 * 서울 명소의 데이터형 : 읽기 쓰기만 가능하게끔
 */
public class SeoulLocationVO {
	
	private int no;
	private String name;
	private String content;
	private String address;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}

package com.sist.main;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

class Sawon {
	
	private int sabun;
	private String name;
	private String dept;
	private String loc;
	private int pay;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
}

/*
 * 객체지향의 3대 특성은 문법사항이 아니다
 */



public class 접근지정어_2 {

	public static void main(String[] args) {
		
			Sawon sa = new Sawon();
			sa.setSabun(1);
			sa.setName("홍길동");
			sa.setDept("개발부");
			sa.setLoc("서울");
			sa.setPay(3000);
			
			System.out.println(sa.getSabun()+" "+sa.getName()+sa.getDept()+" "+sa.getLoc()+" "+sa.getPay());
		}

	}


package com.sist.lib;

class Card {
	
	private int number;
	private String type;
	
	public Card() {
		number = 7;
		type = "♥";
	}
	
	public void print() {
		System.out.println("번호 : "+number+" ,type : "+type);
	}
	
}



public class 라이브러리_Object_4_1 {

	public static void main(String[] args) {
		
		Card c = new Card();
		c.print();
		System.out.println(c.getClass());
		
		
		try {
			
			Class clsName = Class.forName("com.sist.lib.Card");
			Object obj = clsName.getDeclaredConstructor().newInstance();
			// 객체 생성
			((Card)obj).print();
			// . 이 우선순위라 괄호열고 형변환이 우선이 되게 만들어야 함
			
		} catch(Exception e) {}
		
	}

}

package com.sist.main4;

public class MainClass {

	public static void main(String[] args) {
		
		Human man = new Human();
		man.setData("심청이");
		System.out.println(man.getData());
		Student s = new Student();
		s.setData("박문수");
		System.out.println(s.getData());
		System.out.println(man.getData());	// name이 static이 아니라서 이름이 다시 심청이로 바뀜, 
											// name이 static이었다면 man은 심청이 박문수로 바뀜 

	}

}

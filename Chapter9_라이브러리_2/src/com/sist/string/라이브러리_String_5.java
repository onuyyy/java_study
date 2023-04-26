package com.sist.string;

import javax.sound.midi.spi.SoundbankReader;

/*
 * concat : 문자열 결합 +
 * 
 * String s1 = "Hello"
 * String s2 = "Java";
 * s1.concat(s2) ==> "Hello Java";
 * 
 * 
 * endsWith : 끝나는 문자열이 같은 경우에 사용
 * boolean endsWith(String s)
 * String concat(String s)
 * 
 * 
 * 
 * ** String에서 자주 나오는 기능
 * 
 * charAt()
 * equals() : 대소문자 구분 
 * equalsIgnorecase() : 대소문자 구분없이 비교
 * indexOf() : 문자나 문자열의 위치 확인 (앞에서부터 찾아줌)
 * lastIndexOf() : 문자나 문자열의 위치 확인 (뒤에서부터 찾아줌)
 * length() : 문자의 개수
 * startsWith() : 시작 문자열이 같은 경우 => 서제스트
 * substring() : 원하는 문자열을 자르는 경우
 * trim() : 공백 제거
 * split() : 특정 문자로 자르는 경우
 * contains() : 포함 문자열인지 확인
 * valueOf() : 모든 데이터형을 문자열로 변환
 * 
 */





public class 라이브러리_String_5 {

	public static void main(String[] args) {
		
//		String s1 = "Hello ";
//		String s2 = "Java!!";
//		System.out.println(s1.concat(s2));
//		System.out.println(s1+s2);
//		
//		
//		// 공백도 문자다
//		if(s1.endsWith(" "))
//			System.out.println("공백으로 끝났다");
//		else
//			System.out.println("공백으로 끝나지 않았다");
//		
//		if(s2.endsWith("!"))
//			System.out.println("! 자로 끝났다");
//		else
//			System.out.println("! 자로 끝나지 않았다");
		
		
		
		
//		String[] data = {"JAVA","java","Java","JAva","JAVa","jaVA","javA"};
//		
//		
//		for(String s:data) {
//			if(s.equals("java")) {
//				System.out.println(s);
//			}
//		}
//		
//		// equals는 대소문자를 구분해서 비교한다
//		// 원형 : boolean equals(String s)	/ 리턴형 라이브러리(매개변수)
//		
//		System.out.println("============================equalsIgnorecaser()");
//		
//		for(String s:data) {
//			if(s.equalsIgnoreCase("JAVA")) {
//				System.out.println(s);
//			}
//		}
//		
//		// equalsIgnoreCase는 대소문자를 구분하지 않고 비교한다
//		// 원형 : boolean equalsIgnoreCase(String s)	/ 리턴형 라이브러리(매개변수)
//	
//		
//		
//		System.out.println("=============================length()");
		
		String[] data2 = {"apple",
				  "avocado",
				  "banana",
				 "blackberry",
				  "blueberry",
				  "cherry tomato",
				  "cherry", 
				  "coconut", 
				  "grape",
				  "kiwi", 
				  "lemon",
				  "lime",
				  "mango",
				  "melon",
				  "orange",
				  "papaya", 
				  "peach",
				  "pear",
				  "persimmon",
				  "pineapple ",
				  "plum",
				  "strawberry",
				  "tangerine",
				  "tomato",
				  "watermelon"};
	
		
		
		// 1. 각 과일명의 문자 길이를 출력
//		
//		for(String s:data2) {
//			System.out.println(s+" : "+s.length());	
//		}
//		
//		
//		// 2. 가장 긴 이름의 과일명을 출력
//		
//		int max=0;
//		for(String s2:data2) {
//			if(max < s2.length())
//				max = s2.length();
//		} for(String s2:data2) {
//			if(s2.length()==max ) {
//				System.out.println(s2);
//			
//			}
//				
//		}
//		
		
		// 3. startsWith : 시작 문자열이 같은 경우
		// 원형 : boolean startsWith(String s)
		// 사용처 : 자동 완성기 (검색기), 쿠키 검색
		
		
//		for(String s5:data2) {
//			if(s5.startsWith("p")) {
//				System.out.println(s5);
//				try {
//					Thread.sleep(1000);
//				} catch(Exception e) {}
//			}
//		}
		
		
//		System.out.println("=============================trim()");
//		// 좌우 공백 제거
//		// 원형 : String trim()
//		
//		String id = "admin";
//		if(id.equalsIgnoreCase("   admin".trim())) {		// 공백 지우고 검색
//			System.out.println("같은 ID입니다");
//		} else {
//			System.out.println("다른 ID입니다");
//		}
		
		
//		System.out.println("=============================contains()");
//		
//		// 포함된 문자열 있는지 검색
//		// 원형 : boolean contains(String s)
//		
//		for(String s:data2) {
//			if(s.contains("app")) {
//				System.out.println(s);
//			}
//		}
		
		
//		System.out.println("============================= valueOf()");
//		
//		// String에서 유일한 static 메소드
//		// 모든 데이터형을 문자열로 변환
//		// 원형 : static String valueOf((type)) => 오버로딩이 되어있다
//
//		System.out.println(String.valueOf(10)+String.valueOf(45));
		
		// "10" + "45" = "1045" >> 문자열로 출력
		
		
		
//		System.out.println("============================= substring()");
//		// substring은 indexOf, lastIndexOf와 함께 다닌다
//		
//		String ss = "http:\\localhost:8080/JSPProject/main/main.do";
//		
//		String res = ss.substring(ss.lastIndexOf("/")+1);
//		System.out.println(res);
//		
//		res = ss.substring(ss.indexOf("\\")+1,ss.indexOf("/"));
//		System.out.println(res);
//		
//		ss= "서울특별시 용산구 소월로2길 27 지번 서울시 용산구 후암동 445-8";
//		
//		// substring : 문자열을 자를 때, indexOf : 앞에서부터 문자를 찾는다, lastIndexOf :뒤에서부터 문자를 찾는다
//		// substring(int s) => s번째부터 마지막까지 잘라온다
//		// substring(int s, int e) => s부터 e-1까지 잘라온다
//		// 원형 : String substring(int s) or String substring (int s, int e)
//		
//		res = ss.substring(0,ss.indexOf("지"));
//		System.out.println(res.trim());				// 공백 제거 trim
//		
//		res = ss.substring(ss.lastIndexOf("용산구")-1,ss.length());
//		System.out.println(res.trim());
		
		
//		String ss = "홍길동,이순신,강감찬,박문수,을지문덕,심청이,춘향이";
//		String[] names = ss.split(",");
//		// 특수문자별로 잘라서 배열에 저장
//		// 원형 : String[] split (String regexp)
//		
//		
//		
//		for(String name:names) {
//			System.out.println(name);
//		}
//		
//		ss =	
//				"김치찐만두 (10개)"+
//				"7,000원"+
//				"새우찐만두 (10개)"+
//				"10,000원"+
//				"부추고기군만두 (10개)"+
//				"7,000원"+
//				"새우군만두 (8개)"+
//				"8,000원"+
//				"철판양고기"+
//				"12,000원";
//		
//		String[] menu = ss.split("원");
//		for(String m:menu) {
//			System.out.println(m+"원");
//		}
//		
//		
//		ss = "red|blue|green|black|white|yellow";
//		
//		String[] menu2 =  ss.split("\\|");		// | 정규식에서 사용하는 기호
//		for(String m2 : menu2) {
//			System.out.println(m2+"|");
//		}
//		
//		// | ? . + * ^ => 기호로 쓰이는 것들은 앞에 \\ 이거 같이 붙여야 인식한다
		
		
		
		System.out.println("============================= replace()");
		// 문자나 문자열을 변경
		// 원형 : String replace(char old, char new)	> old를 new로 바꾼다	
		//		
		
		String ss = "https://mp-seoul-image-production-s3.mangoplate.com/756210_1667892732041968.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80";
		
		
		String res = ss.replace("&", "^");
		System.out.println(res);
		
		
		
	}

}

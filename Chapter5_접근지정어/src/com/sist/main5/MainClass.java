package com.sist.main5;

import com.sist.main3.*;
import com.sist.main4.*;

public class MainClass {

	public static void main(String[] args) {
		
		StudentSystem ss = new StudentSystem();
		ss.init();
		ss.stdTotal();
		ss.stdAvg();
		ss.stdScore();
		ss.stdRank();
		ss.display();
		
		/*
		 * 1. 변수 : 개인마다 가지고 있는 속성 => 함부로 접근할 수 없다
		 * 			private : 은닉화
		 * 2. 요청 : 개인정보를 공개 (접근이 가능하게 만든다)
		 * 			---------- getter, setter
		 * 					   --------------
		 * 						name => setName(), gerName() => 읽기,쓰기
		 * 								setXxx(), getXxx()
		 * 3. 메소드를 이용하여 접근 => public이 기본
		 * 4. 다른 클래스에서 메모리 할당 : 생성자 (public)
		 * 
		 */
		
		
	}

}

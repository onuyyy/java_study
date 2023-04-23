package com.sist.main2;
import java.util.*;

// interface가 나오면 여러 개 클래스를 묶어서 관리하고 있구나 생각하면 된다\
// Spring도 클래스 관리자 >> 기반이 interface이다

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("해당 클래스 번호 : ");
		
		int no = scan.nextInt();
		
		Container cc = new Container();
		
		Exec a = (Exec)cc.getBean(no);
		a.execute();
		
		
//		if(no==1) {
//			A a = (A)cc.getBean(no);		// getBean이 object라 A로 형변환 시켜줌
//			a.execute();
//		}
//		if(no==2) {
//			B a = (B)cc.getBean(no);		
//			a.execute();
//		}
//		if(no==1) {
//			C a = (C)cc.getBean(no);		
//			a.execute();
//		}
//		if(no==1) {
//			D a = (D)cc.getBean(no);		
//			a.execute();
//		}
//		if(no==5) {
//			E a = (E)cc.getBean(no);		
//			a.execute();
//		}
		

	}

}

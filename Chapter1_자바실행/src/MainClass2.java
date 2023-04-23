
public class MainClass2 {
	public static void main(String[] args) {
		// 프로그램의 시작점 / 끝점 > main
		/*
		 * 	정수
		 * 	2진법
		 * 	8진법
		 * 	16진법
		 * 
		 * 	29 > 2진법 : 0 아니면 1
		 * 	64 32 16 8 4 2 0
		 * 	      1  1 1 0 1	> 11101
		 * 	76 > 
		 * 	64 32 16 8 4 2 0
		 * 	1  0  0  1 1 0 0    > 1001100 
		 */
		
		 System.out.println(0b11101);
		 System.out.println(0b1001100);
		 System.out.println(Integer.toBinaryString(29));
		 // 11101
		 // 8진법으로 바꾸기
		 // 뒤에서 세 개 자르기 : 
		 System.out.println(Integer.toOctalString(29));
		 System.out.println(Integer.toHexString(29));
		 System.out.println(1d);
		 System.out.println("c:\\dev");
		 System.out.print("Hello");  // print는 끝나고 다음 줄로 내리지 않고, println은 다음 줄로 내림
		 System.out.println("Hello");
		
		 // 10+20=30 > 이렇게 출력하고 싶다면		 
		 System.out.println(10+"+"+20+"="+30);
		 System.out.printf("%d+%d=%d",10,20,30); // %d 안에 정수를 넣으라는 뜻


	}
}


public class 산술연산자_2 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		
		System.out.println(a+"%"+b+"="+(a%b));
		System.out.println(a+"%"+b+"="+(-a%b)); // 나머지 % 값만 왼쪽 편 부호 따라간다 
		System.out.println(a+"%"+b+"="+(a%-b));
		System.out.println(a+"%"+b+"="+(-a%-b));
		System.out.println(-a+"*"+-b+"="+(-a/-b));
	}

}

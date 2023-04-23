/*
 * 1~100까지 사이의 반복문을 수행
 * 11, 22, 33, 44, 55, ...
 * 두 개는 같은 정수입니다 / 두 개는 다른 정수입니다 => 출력하기
 * 
 */
public class 반복문_7 {

	public static void main(String[] args) {
		
		for(int i =10; i <=99; i++) {
			if(i%11 == 0)
				System.out.println(i+" 두 개는(은) 같은 정수입니다");
			else
				System.out.println(i+" 두 개는(은) 다른 정수입니다");
		}
		
	}

}

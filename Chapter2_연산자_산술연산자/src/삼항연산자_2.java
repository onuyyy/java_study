/*
 *	컴퓨터 / 사용자 > 가위바위보
 *	> 가정 : 0-가위, 1-바위, 2-보
 *
 * 	-발생 순서
 *	1) 컴퓨터 난수 발생 (0~2)
 *	2) 사용자 입력
 *	3) 컴퓨터와 사용자 확인
 *	4) 결과 확인 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;
public class 삼항연산자_2 {

	public static void main(String[] args) {
		
		int com = (int)(Math.random()*3);  // int로 하면 소수점 지워지니까 0~2까지 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(0),바위(1),보(2) 입력:");
		int user = scan.nextInt();
		
		// 확인
		System.out.println(com==0?"컴퓨터:가위":"");
		System.out.println(com==1?"컴퓨터:바위":"");
		System.out.println(com==2?"컴퓨터:보":"");
		
		System.out.println(user==0?"플레이어:가위":"");
		System.out.println(user==1?"플레이어:바위":"");
		System.out.println(user==2?"플레이어:보":"");
		
		System.out.println("=====결과=====");
		System.out.println(com==0 && user==0?"same":"");
		System.out.println(com==0 && user==1?"user win":"");
		System.out.println(com==0 && user==2?"com win":"");
		
		System.out.println(com==1 && user==0?"com win":"");
		System.out.println(com==1 && user==1?"same":"");
		System.out.println(com==1 && user==2?"user win":"");
		
		System.out.println(com==2 && user==0?"user win":"");
		System.out.println(com==2 && user==1?"com win":"");
		System.out.println(com==2 && user==2?"same":"");
		
		
		
		int res = com-user;
		
		System.out.println(res==0?"same":"");
		System.out.println(res==-1 || res==2?"user win":"");
		System.out.println(res==1 || res==-2?"com win":"");
		
		/*
		 * com			user
		 *  0 (가위)		 0 (가위)		> same		0
		 *  			 1 (바위)		> user Win	-1
		 *  			 2 (보)		> com win	-2
		 *  
		 *  1 (바위)		 0 (가위)		> com win	1
		 *  			 1 (바위)		> same		0
		 *  			 2 (보)		> user win	-1
		 *  
		 *  2 (보)		 0 (가위)		> user win	2
		 *  			 1 (바위)		> com win	1
		 *  			 2 (보)		> same		0
		 *  
		 *  
		 * 
		 */
	}

}
